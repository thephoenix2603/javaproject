import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame{
	JFrame frame = new JFrame("Quiz by Khushi & Aayush");
	
	int pno = 1;
	JPanel panelCont = new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();
	JPanel panelThird = new JPanel();
	JButton buttonOne = new JButton("Save");
	JButton buttonSecond = new JButton("Next");
	JButton buttonThird = new JButton("Previous");
	JButton buttonFourth = new JButton("Submit");
	
	
	CardLayout cl = new CardLayout();
	

	JLabel name = new JLabel("Enter your name : "); 
	JTextField tf1 = new JTextField(25);
	JLabel roll = new JLabel("Enter your roll no. : ") ;
	JTextField tf2 = new JTextField(25);

	JLabel Q1 = new JLabel("Question 1.. 4 - 2 ? ") ;
	JRadioButton Two = new JRadioButton("2");
	JRadioButton Three = new JRadioButton("3");
	JRadioButton Four = new JRadioButton("4");
	JRadioButton Five = new JRadioButton("5");

	JLabel Q2 = new JLabel("Question 2.. 99 + 1 ? ") ;
	JRadioButton hundred = new JRadioButton("100");
	JRadioButton thundred = new JRadioButton("200");
	JRadioButton fifty = new JRadioButton("50");
	JRadioButton nine = new JRadioButton("9");

	JLabel Q3 = new JLabel("Question 3.. 2 - 2 ? ") ;
	JRadioButton One = new JRadioButton("1");
	JRadioButton Zero = new JRadioButton("0");
	JRadioButton mOne = new JRadioButton("-1");
	JRadioButton mTwo = new JRadioButton("-2");
	


	public Quiz() {
		
		panelCont.setLayout(cl); 

		name.setFont(new Font("Raleway",Font.BOLD,38)); 
		roll.setFont(new Font("Raleway",Font.BOLD,38));
		name.setForeground(Color.decode("#1c0052"));
		name.setBounds(250, 145, 375, 200);
		roll.setBounds(250, 225, 375, 200);
		roll.setForeground(Color.decode("#1c0052"));
		tf1.setFont(new Font("Raleway",Font.BOLD,14));
		tf1.setBounds(400,235,230,30);
		tf2.setFont(new Font("Raleway",Font.BOLD,14));
		tf2.setBounds(400,310,230,30);

		
		panelFirst.add(name);
		panelFirst.add(tf1);
		panelFirst.add(roll);
		
		panelFirst.add(tf2);
		panelFirst.add(buttonOne);

		Q1.setFont(new Font("Raleway",Font.BOLD,38));
		Q1.setForeground(Color.decode("#1c0052"));
		Two.setFont(new Font("Raleway",Font.BOLD,38));
		Two.setForeground(Color.decode("#1c0052"));
		Three.setFont(new Font("Raleway",Font.BOLD,38));
		Three.setForeground(Color.decode("#1c0052"));
		Four.setFont(new Font("Raleway",Font.BOLD,38));
		Four.setForeground(Color.decode("#1c0052"));
		Five.setFont(new Font("Raleway",Font.BOLD,38));
		Five.setForeground(Color.decode("#1c0052"));
		panelSecond.add(Q1);
		panelSecond.add(Two);
		panelSecond.add(Three);
		panelSecond.add(Four);
		panelSecond.add(Five);
		
		ButtonGroup groop1 = new ButtonGroup();
    	groop1.add(Two);
    	groop1.add(Three);
    	groop1.add(Four);
    	groop1.add(Five);

		Q2.setFont(new Font("Raleway",Font.BOLD,38));
		Q2.setForeground(Color.decode("#1c0052"));
		hundred.setFont(new Font("Raleway",Font.BOLD,38));
		hundred.setForeground(Color.decode("#1c0052"));
		thundred.setFont(new Font("Raleway",Font.BOLD,38));
		thundred.setForeground(Color.decode("#1c0052"));
		fifty.setFont(new Font("Raleway",Font.BOLD,38));
		fifty.setForeground(Color.decode("#1c0052"));
		nine.setFont(new Font("Raleway",Font.BOLD,38));
		nine.setForeground(Color.decode("#1c0052"));

		panelSecond.add(Q2);
		panelSecond.add(hundred);
		panelSecond.add(thundred);
		panelSecond.add(fifty);
		panelSecond.add(nine);

		ButtonGroup groop2 = new ButtonGroup();
    	groop2.add(hundred);
    	groop2.add(thundred);
    	groop2.add(fifty);
    	groop2.add(nine);

		Q3.setFont(new Font("Raleway",Font.BOLD,45));
		Q3.setForeground(Color.decode("#1c0052"));
		One.setFont(new Font("Raleway",Font.BOLD,38));
		One.setForeground(Color.decode("#1c0052"));
		Zero.setFont(new Font("Raleway",Font.BOLD,38));
		Zero.setForeground(Color.decode("#1c0052"));
		mOne.setFont(new Font("Raleway",Font.BOLD,38));
		mOne.setForeground(Color.decode("#1c0052"));
		mTwo.setFont(new Font("Raleway",Font.BOLD,38));
		mTwo.setForeground(Color.decode("#1c0052"));

		panelSecond.add(buttonSecond);
		panelThird.add(Q3);
		panelThird.add(One);
		panelThird.add(Zero);
		panelThird.add(mOne);
		panelThird.add(mTwo);

		ButtonGroup groop3 = new ButtonGroup();
    	groop3.add(One);
    	groop3.add(Zero);
    	groop3.add(mOne);
    	groop3.add(mTwo);

		panelThird.add(buttonThird);
		panelThird.add(buttonFourth);

		panelFirst.setBackground(Color.decode("#dcc5f1"));
		panelSecond.setBackground(Color.decode("#f1d0c5"));
		panelThird.setBackground(Color.decode("#c5f1ee"));
		panelCont.add(panelFirst, "1");
		panelCont.add(panelSecond, "2");
		panelCont.add(panelThird, "3");
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
				cl.show(panelCont, "3");
			}
		});

		buttonThird.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "2");
			}
		});

		buttonFourth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int marks=0;
				if(Two.isSelected() == true) marks++;
				if(hundred.isSelected() == true) marks++;
				if(Zero.isSelected() == true) marks++;
				
 			UIManager.put("OptionPane.background",Color.decode("#cdecb6"));
			UIManager.put("Panel.background",Color.decode("#cdecb6"));
			//UIManager.put("Panel.title", toString() );
				JOptionPane.showMessageDialog(tf1, tf1.getText()+ "'s ( " + tf2.getText() + " ) Score : "+ marks, "Result", JOptionPane.INFORMATION_MESSAGE); 
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