import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame{
	JFrame frame = new JFrame("Quiz by Khushi & Aayush");
	
	JPanel panelCont = new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();
	JButton buttonOne = new JButton("Next");
	JButton buttonSecond = new JButton("Previous");
	
	CardLayout cl = new CardLayout();
	

	JLabel name = new JLabel("Enter your name : "); 
	JTextField tf1 = new JTextField(25);
	JLabel roll = new JLabel("Enter your roll no. : ") ;
	JTextField tf2 = new JTextField(25);

	public Quiz() {
		
		panelCont.setLayout(cl); 

		
		name.setFont(new Font("Osward",Font.BOLD,38)); 
		roll.setFont(new Font("Osward",Font.BOLD,38));
		
		name.setBounds(45, 145, 375, 200);
		//add(name);
		roll.setBounds(45, 225, 375, 200);
		//add(roll);
		tf1.setFont(new Font("Arial",Font.BOLD,14));
		tf1.setBounds(400,235,230,30);
		add(tf1);
		tf2.setFont(new Font("Arial",Font.BOLD,14));
		tf2.setBounds(400,310,230,30);
		add(tf2);

		
		panelFirst.add(name);
		panelFirst.add(tf1);
		panelFirst.add(roll);
		
		panelFirst.add(tf2);
		panelFirst.add(buttonOne);
		panelSecond.add(buttonSecond);
		panelFirst.setBackground(Color.BLACK);
		panelSecond.setBackground(Color.pink);

		panelCont.add(panelFirst, "1");
		panelCont.add(panelSecond, "2");
		cl.show(panelCont, "1");
		
		buttonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "2");
			}
		});
		
		buttonSecond.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "1");
			}
		});
		
		frame.add(panelCont);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setSize(750,550);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Quiz();
			}
		});
	}

}