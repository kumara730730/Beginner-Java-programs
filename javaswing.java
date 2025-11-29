package gui;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();  //Creates a frame
		frame.setTitle("JFrame title goes here.");//sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
		frame.setResizable(false);//prevent frame from being resized
		frame.setSize(420,420);//sets the x dimension and y dimension of frame
		frame.setVisible(true);//make frame visible
		
		ImageIcon image = new ImageIcon("logo.jpg");//create an ImageIcon
		frame.setIconImage(image.getImage());//Change icon of frame
		
		//Method 1, we get color set in system
		//frame.getContentPane().setBackground(Color.green); //Change color of background
		
		//Method 2, Custom color using r,g,b from 0 to 255
		frame.getContentPane().setBackground(new Color(123,50,250));
		
		//Method 3, Custom color using hexadecimal where 0x followed by six hexadecimal digits
		//000000 - Black to FFFFFF - White
		//frame.getContentPane().setBackground(new Color(0x123456));
		
	}

}
