import java.awt.*;
import javax.swing.*;
public class menu extends JFrame{

    private JPanel panel;
    public menu() 
    {
        JFrame f= new JFrame("Experiment 14");  
        f.setBackground(Color.decode("#1c0052"));
      JMenuBar bar = new JMenuBar();
      bar.setBackground(Color.decode("#1c0052"));
JMenu m = new JMenu("Info");
m.setForeground(Color.WHITE);
JMenuItem file = new JMenuItem("File");
JMenuItem setting = new JMenuItem("Setting");
JMenuItem rate = new JMenuItem("Rate");
JMenuItem help = new JMenuItem("Help");
m.add(file);
m.add(setting);
m.add(rate);
m.add(help);
bar.add(m);
f.setJMenuBar(bar);
 panel = new JPanel();
 JLabel name = new JLabel("Heylu , I am Khushi."); 
 name.setFont(new Font("Raleway",Font.BOLD,38)); 
 name.setForeground(Color.decode("#1c0052"));
 name.setBounds(250, 145, 375, 200);
panel.setLayout(null);
panel.setPreferredSize(new Dimension(1000, 1500));
panel.setBackground(Color.decode("#dcc5f1"));
panel.add(name);

JScrollPane s = new JScrollPane(panel);
 f.add(s); 
 f.setSize(500,500);        
 f.setVisible(true);
 f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
        public static void main(String[]args){
        new menu();
        }
}
