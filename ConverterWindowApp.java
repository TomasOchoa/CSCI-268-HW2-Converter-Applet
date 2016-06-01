import java.awt.*;		//For frame class and other class like label
import java.awt.event.*;	//For WindowAdapter...
import java.awt.Toolkit;

public class ConverterWindowApp implements ActionListener
{

	public void actionPerformed(ActionEvent e)
	{
		Toolkit.getDefaultToolkit().beep();
	}	
		
	public static void main(String [] agrs)
	{
		Frame window = new Frame("Centimeter Conversion");

		Label Feet        = new Label("Feet: ", Label.CENTER);
		Label Inches      = new Label("Inches: ", Label.CENTER);
		Label Centemeters = new Label("Centemeters= ", Label.CENTER);

		final TextField Tf = new TextField();
		final TextField Ti = new TextField();
		final TextField Tc = new TextField();
		
		//Button for calculate
		Button b1 = new Button("Calculate");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				Toolkit.getDefaultToolkit().beep();
				int feet, inches;
				double  centemeters;
					
				feet        = Integer.parseInt(Tf.getText());
				inches      = Integer.parseInt(Ti.getText());
				centemeters = ((feet * 12) + inches) * 2.54;

				Tc.setText(Double.toString(centemeters));
			}
		});

		window.setLayout(new GridLayout(4,2));
		window.add(Feet);
		window.add(Tf);
		window.add(Inches);
		window.add(Ti);
		window.add(Centemeters);
		window.add(Tc);
		window.add(b1);
		window.pack();
		window.setSize(300,300);
		window.show();
		WindowAdapter wa = new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		};
		window.addWindowListener(wa);
			
	}
}