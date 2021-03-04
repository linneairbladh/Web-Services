package assignment3;

import java.io.File;
import java.rmi.RemoteException;

import org.tempuri.WebService1Soap;
import org.tempuri.WebService1SoapProxy;


public class Application3 {
	
	//main assignment 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client3Frame3 frame = new Client3Frame3();
		Controller3 controller = new Controller3(frame);
		frame.setVisible(true);
	}

}
