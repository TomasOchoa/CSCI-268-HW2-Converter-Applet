import java.applet.*;
import java.awt.*; //for Frame class and other classes like Label
import java.awt.event.*; // for WindowAdapter ...
import java.awt.Toolkit;

public class ConverterApplet extends Applet implements ActionListener
{
	// Window variable declaration
	Frame window;	
	Label Feet;
	Label Centemeters;
	Label Inches;
	
	TextField Tf;
	TextField Ti;
	TextField Tc;
	
	//Button for calculate
	Button b1;
	
	public void actionPerformed(ActionEvent e)
	{
		int  feet, inches;
		double cm;
					
		feet        = Integer.parseInt(Tf.getText());
		inches      = Integer.parseInt(Ti.getText());
		cm = ((feet * 12) + inches) * 2.54;

		Tc.setText(String.valueOf(cm));
	}	
	
	//Iniit constructoir
	public void init()	
	{
		Feet   		= new Label("Feet", Label.CENTER);
		Inches 		= new Label("Inches", Label.CENTER);
		Centemeters = new Label("Centemeters", Label.CENTER);
		
		Tf = new TextField();
		Ti = new TextField();
		Tc = new TextField();
		b1 = new Button("Calculate");
		
		b1.addActionListener(this);
		
		//Set the layout of the applet
		setLayout(new GridLayout (4,2));
		//For feet input
		add(Feet);
		add(Tf);
		// For Inches input
		add(Inches);
		add(Ti);
		//For conversion
		add(Centemeters);
		add(Tc);
		//Button for calculate
		add(b1);
		//Set the size
		setSize(300,300);
		
	}
}