package assignment5;

import assignment5.ClientFrame5;
import assignment5.Controller5;

public class Application5 {

	//main for assignment 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ClientFrame5 frame = new ClientFrame5();
		Controller5 controller = new Controller5(frame);
		frame.setVisible(true);
		
		
	}
}
