package assignment5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.WebService5Soap;
import org.tempuri.WebService5SoapProxy;
import org.tempuri.Workout;

public class Controller5 {
	
	private ClientFrame5 frame;
	private WebService5Soap proxy;
	
	public Controller5(ClientFrame5 frame) {
		
		this.frame = frame;
		proxy = new WebService5SoapProxy();
		initialize();
	}
	
	private void initialize() {
		
		//Action listener for button "create"
		frame.getBtnCreate().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstName = frame.getTextFieldFirstName().getText();
				String lastName = frame.getTextFieldLastName().getText();
				String jobTitle = frame.getTextFieldJob().getText();
				String address = frame.getTextFieldAddress().getText();
				String email = frame.getTextFieldEmail().getText();
				
				if (firstName.isEmpty() || lastName.isEmpty() || jobTitle.isEmpty()|| address.isEmpty() || email.isEmpty()) {
					frame.getTextPaneEmployee().setText("Please insert in all fields to create."); 
					frame.getLblErrorMessage().setText(" ");
				} else {
				
				try {
					proxy.add(firstName, lastName, jobTitle, address, email);
					frame.getTextPaneEmployee().setText("Employee " + firstName + " was added");
						
				} catch (RemoteException e1) {
					frame.getTextPaneEmployee().setText("Employee already exists");
					frame.getLblErrorMessage().setText(" ");
				}
			
				}
			}	
		});
		
		//Action listener for button "delete"	
		frame.getBtnDelete().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String no = frame.getTextFieldNbr().getText().toUpperCase();
					
				if (no.isEmpty()) {
					frame.getTextPaneEmployee().setText("Please insert a employee number."); 
					frame.getLblErrorMessage().setText(" ");
				} else {
				
				try {
					proxy.delete(no);
					frame.getTextPaneEmployee().setText("Employee deleted");
					frame.getLblErrorMessage().setText("");
					
				} catch (RemoteException e4) {
					frame.getTextPaneEmployee().setText("Couldn't find employee");
					frame.getLblErrorMessage().setText("");
				}
				}

			}
		});
		
		//Action listener for button "update"
			frame.getBtnUpdate().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String no = frame.getTextFieldNbr().getText();
					String firstName = frame.getTextFieldFirstName().getText();
					String lastName = frame.getTextFieldLastName().getText();
					String jobTitle = frame.getTextFieldJob().getText();
					String address = frame.getTextFieldAddress().getText();
					String email = frame.getTextFieldEmail().getText();

					
						if (firstName.isEmpty() || no.isEmpty() || lastName.isEmpty() || jobTitle.isEmpty()|| address.isEmpty() || email.isEmpty()) {
							frame.getTextPaneEmployee().setText("Please insert in all fields to update."); 
							frame.getLblErrorMessage().setText(" ");
						} else {
					
							try {
						proxy.update(no, firstName, lastName, jobTitle, address, email);
						frame.getTextPaneEmployee().setText("Updated Employee! \nNumber: " + proxy.find(no).getNo_() + " \nFirst Name: " + proxy.find(no).getFirst_Name()
							+ " \nLast Name: " + proxy.find(no).getLast_Name() + " \nJob Title: " + proxy.find(no).getJob_Title()
							+ " \nAddress: " + proxy.find(no).getAddress() + " \nMail: " + proxy.find(no).getE_Mail()	);
						frame.getLblErrorMessage().setText("");
					} catch (RemoteException e3) {
						frame.getLblErrorMessage().setText("Employee number couldn't be found.");
						frame.getTextPaneEmployee().setText("");
					}
				}
				
				}	
					
			});
				
			/*frame.getBtnRead().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String no = frame.getTextFieldNbr().getText().toUpperCase();
				
				if (no.isEmpty()) {
					frame.getTextPaneEmployee().setText("Please insert in a emp number."); 
					frame.getLblErrorMessage().setText(" ");
				} else {
					try {
					frame.getTextPaneEmployee().setText("Found Employee! \nNumber: " + proxy.find(no).getNo_() + "\nFirstname: " + proxy.find(no).getFirst_Name()+ "\nLastname: " + proxy.find(no).getLast_Name()
							+ "\nJobtitle: " + proxy.find(no).getJob_Title() + "\nAddress:" + proxy.find(no).getAddress() + "\nEmail: " + proxy.find(no).getE_Mail());
					frame.getLblErrorMessage().setText("");
					} catch (RemoteException e2) {
					//e.printStackTrace();
					frame.getLblErrorMessage().setText("Wrong");
				}	
					
				}
				}
			});
			*/
			//Action listener for button "read employees" 
			frame.getBtnEmpNbr().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
			String tmp = "";
			
			try {
				for(CRONUS_Sverige_AB_Employee emp : proxy.read()) {
					tmp += "Number: " + emp.getNo_() + ", First name: " + emp.getLast_Name() +  ", Last name: " + emp.getFirst_Name() +  ", Job Title: " + emp.getJob_Title() + "  \n";
				}
				frame.getTextAreaEmpNbr().setText(tmp);
				frame.getLblErrorMessage().setText("");
				
				
				}	catch (RemoteException e1) {
					frame.getTextAreaEmpNbr().setText("Check your connection. ");
		
				}
				}
				
				});
			
			
	}
}
			
			
