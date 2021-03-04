package assignment4;

import java.rmi.RemoteException;
import javax.swing.JScrollPane;
import org.tempuri.User;
import org.tempuri.WebService4Soap;
import org.tempuri.WebService4SoapProxy;

import assignment4.Client3Frame4;
import assignment4.Controller4;

public class Application4 {

		//main for assignment 4
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Client3Frame4 frame = new Client3Frame4();
			Controller4 controller = new Controller4(frame);
			frame.setVisible(true);
			
		}
}
