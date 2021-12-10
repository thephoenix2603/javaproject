import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;  
  
public class form extends JFrame   
{  
  
// Initializing the value of  
// currCard to 1 .  
private int currCard = 1;   
private CardLayout cObjl;  
JTextField tf1,tf2;
JButton b1;  
// constructor of the class  
public form()  
{  
  
// Method to set the Title of the JFrame  
setTitle("Quiz by Khushi & Aayush");  
  
// Method to set the visibility of the JFrame  
setSize(750,550);

  
// Creating an Object of the "Jpanel" class  
JPanel cPanel = new JPanel();  
  
// Initializing of the object "cObjl"  
// of the CardLayout class.  
cObjl = new CardLayout();  
  
// setting the layout  
cPanel.setLayout(cObjl);  
  
// Initializing the object  
// "jPanel1" of the JPanel class.  
JPanel jPanel1 = new JPanel();  
  
// Initializing the object  
// "jPanel2" of the CardLayout class.  
JPanel jPanel2 = new JPanel();  
  
// Initializing the object  
// "jPanel3" of the CardLayout class.  
JPanel jPanel3 = new JPanel();  
  
// Initializing the object  
// "jPanel4" of the form class.  
JPanel jPanel4 = new JPanel();  
  
// Initializing the object  
// "jl1" of the JLabel class.  
JLabel jLabel1 = new JLabel("Enter your details : ");  
jLabel1.setFont(new Font("Osward",Font.BOLD,38));
JLabel name = new JLabel("Enter your name : "); 
name.setFont(new Font("Osward",Font.BOLD,38)); 
JLabel roll = new JLabel("Enter your roll no. : ");  
roll.setFont(new Font("Osward",Font.BOLD,38));
tf1 = new JTextField(25);
tf2 = new JTextField(25);
//jLabel1.setLocation(250, 260);
//name.setLocation(270,280);
//roll.setLocation(290,300);

b1=new JButton("NEXT");
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
setLayout(null);
jLabel1.setBounds(175, 50, 375, 200);
add(jLabel1);
name.setBounds(45, 145, 375, 200);
add(name);
roll.setBounds(45, 220, 375, 200);
add(roll);tf1.setFont(new Font("Arial",Font.BOLD,14));
tf1.setBounds(400,235,230,30);add(tf1);
tf2.setFont(new Font("Arial",Font.BOLD,14));
tf2.setBounds(400,310,230,30);add(tf2);
b1.setFont(new Font("Arial",Font.BOLD,14));
b1.setBounds(300,400,100,30);add(b1);
//b1.addActionListener(this);
b1.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
// using the first cObjl CardLayout  
cObjl.first(cPanel);  
  
// value of currCard is 1  
currCard = 2;  
}  
});  
setLocation(500,500);
setVisible(true);

//jPanel1.setLayout(null);

// Initializing the object  
// "jLabel2" of the JLabel class.  
JLabel jLabel2 = new JLabel("What is 6+4 ?");  
  
// Initializing the object  
// "jLabel3" of the JLabel class.  
JLabel jLabel3 = new JLabel("C3");  
  
// Initializing the object  
// "jLabel4" of the JLabel class.  
JLabel jLabel4 = new JLabel("C4");  
  
// Adding JLabel "jLabel1" to the JPanel "jPanel1".  
//jPanel1.add(jLabel1);  
//jPanel1.add(name);  
//jPanel1.add(roll);  
  
// Adding JLabel "jLabel2" to the JPanel "jPanel2".  
jPanel2.add(jLabel2);  
  
// Adding JLabel "jLabel3" to the JPanel "jPanel3".  
jPanel3.add(jLabel3);  
  
// Adding JLabel "jLabel4" to the JPanel "jPanel4".  
jPanel4.add(jLabel4);  
  
// Add the "jPanel1" on cPanel  
cPanel.add(jPanel1, "1");  
  
// Add the "jPanel2" on cPanel  
cPanel.add(jPanel2, "2");  
  
// Add the "jPanel3" on cPanel  
cPanel.add(jPanel3, "3");  
  
// Add the "jPanel4" on cPanel  
cPanel.add(jPanel4, "4");  
  
// Creating an Object of the "JPanel" class  
JPanel btnPanel = new JPanel();  
  
// Initializing the object  
// "firstButton" of the JButton class.  
JButton firstButton = new JButton("First");  
  
// Initializing the object  
// "nextButton" of the JButton class.  
JButton nextButton = new JButton("Next");  
  
// Initializing the object  
// "previousbtn" of JButton class.  
JButton previousButton = new JButton("Previous");  
  
// Initializing the object  
// "lastButton" of the JButton class.  
JButton lastButton = new JButton("Last");  
  
// Adding the JButton "firstbutton" on the JPanel.  
btnPanel.add(firstButton);  
  
// Adding the JButton "nextButton" on the JPanel.  
btnPanel.add(nextButton);  
  
// Adding the JButton "previousButton" on the JPanel.  
btnPanel.add(previousButton);  
  
// Adding the JButton "lastButton" on the JPanel.  
btnPanel.add(lastButton);  
  
// adding firstButton in the ActionListener  
firstButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
// using the first cObjl CardLayout  
cObjl.first(cPanel);  
  
// value of currCard is 1  
currCard = 1;  
}  
});  
  
// add lastButton in ActionListener  
lastButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
// using the last cObjl CardLayout  
cObjl.last(cPanel);  
  
// value of currCard is 4  
currCard = 4;  
}  
});  
  
// add nextButton in ActionListener  
nextButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard < 4)  
{  
  
// increase the value of currCard by 1  
currCard = currCard + 1;  
  
// show the value of currCard  
cObjl.show(cPanel, "" + (currCard));  
}  
}  
});  
  
// add previousButton in ActionListener  
previousButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard > 1)   
{  
  
// decrease the value  
// of currCard by 1  
currCard = currCard - 1;  
  
// show the value of currCard  
cObjl.show(cPanel, "" + (currCard));  
}  
}  
});  
  
// using to get the content pane  
getContentPane().add(cPanel, BorderLayout.NORTH);  
  
// using to get the content pane  
getContentPane().add(btnPanel, BorderLayout.SOUTH);  
}  
  
// main method  
public static void main(String argvs[])  
{  
  
// Creating an object of the CardLayoutExample3 class.  
form cll = new form();  
  
// method to set the default operation of the JFrame.  
cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
// aethod to set the visibility of the JFrame.  
cll.setVisible(true);  
}  
}  
