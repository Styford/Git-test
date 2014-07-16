import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Reader extends JFrame {
	
	JButton Button1;
	JLabel Label1,Label2,Label3,Label4;
	JTextField TextField1,TextField2,TextField3;
	float procent,procent_buf;
	int timeOfCredit;
	int Sum;
	float everyMonth;
	String a;
	eHandler handler = new eHandler();
	
	public Reader (String s){
		super (s);
		setLayout(new FlowLayout());
		Button1 = new JButton ("Calculate");
		Label1  = new JLabel ("Enter sum");
		Label2  = new JLabel ("Enter term");
		Label3  = new JLabel ("Enter perc");
		Label4  = new JLabel ("");
		TextField1 = new JTextField(10);
		TextField2 = new JTextField(10);
		TextField3 = new JTextField(10);
		
		add(Label1);
		add(TextField1);
		add(Label2);
		add(TextField2);
		add(Label3);
		add(TextField3);
		add(Button1);
		add(Label4);
		
		Button1.addActionListener(handler);
	}
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==Button1){
				Sum = Integer.parseInt(TextField1.getText());
				timeOfCredit = Integer.parseInt(TextField2.getText());
				procent = Integer.parseInt(TextField3.getText());
				procent = procent/100;
				everyMonth = (Sum+Sum*procent*timeOfCredit)/(timeOfCredit*12);
				a = "every"+everyMonth;
				Label4.setText(a);
			}
		}
		
	}
}
