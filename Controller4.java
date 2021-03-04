package assignment4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Proxy;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.text.html.ListView;

import org.tempuri.User;
import org.tempuri.WebService4;
import org.tempuri.WebService4Soap;
import org.tempuri.WebService4SoapProxy;
import org.tempuri.Workout;

public class Controller4 {

	private Client3Frame4 frame;
	private WebService4Soap proxy;

	public Controller4(Client3Frame4 frame) {
		
	this.frame = frame;
	proxy = new WebService4SoapProxy();
	initialize();
	}
	
	
	private void initialize() {
		
		
		//Get all Workouts from DB
		frame.getBtnWorkouts().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = "";
				try {
					for(Workout w : proxy.readWorkout()) {
						tmp += "User email: " + w.getEmail() + "\nWorkout ID: " + w.getWorkoutID() + " \nWorkout type: " + w.getWorkoutType() 
						+ "\nReps:" + w.getReps()+ "\nSets: " + w.getSets() + "\n";
					}
					
					frame.getTextAreaTraining().setText(tmp);
					
					} catch (RemoteException e1) {
										e1.printStackTrace();
						}
					}
				
				});
				
		//Get all users from DB
		frame.getBtnUsers().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = "";
				try {
					for(User u : proxy.readUsers()) {
						tmp += "Email: " + u.getEmail() + " \nAge: " + u.getAge() + " \nFirst name: " + u.getFirstName() +" \nLast name: " + u.getLastName() 
								+ " \nWeight: " + u.getWeight() + "\n";
					}
				
					frame.getTextAreaTraining().setText(tmp);
					
					} catch (RemoteException e1) {
										e1.printStackTrace();
						}
					}
				
				});
	
		//end of method
	}
	
 //end of class
}
