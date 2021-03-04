package assignment3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Proxy;
import org.tempuri.WebService1Soap;
import org.tempuri.WebService1SoapProxy;

public class Controller3 {

	private Client3Frame3 frame;
	WebService1Soap proxy;
	
	public Controller3(Client3Frame3 frame) {
		
		this.frame = frame;
		proxy = new WebService1SoapProxy();
		initialize();
	}
	
	private void initialize() {
		
	//Action listner for button "Read File"
		frame.getBtnReadFile().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				String fileName = frame.getTextFieldFileName().getText();
				if (fileName.isEmpty()){
					frame.getTextFieldOutputFileName().setText("Insert at file path.");	
				
				}else {
					
					try {
			
					frame.getTextFieldOutputFileName().setText(proxy.read(fileName));
				}
				catch (Exception ex) {
					frame.getTextFieldOutputFileName().setText("Couldn't find file.");	
				}
			}
			}
		});
	}
}
