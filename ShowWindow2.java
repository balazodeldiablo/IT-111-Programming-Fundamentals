import javax.swing. *;
import java.awt. *;
public class ShowWindow2 {
    public static void main (String[] args) {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        JFrame window = new JFrame ();

        window.setTitle("A simple window <3");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.RED);
        window.setLocation(350, 350);

        JTextField text1, text2;
        
        text1 = new JTextField();  
        text1.setBounds(50,75, 200,30);  

        text2 = new JTextField();  
        text2.setBounds(50,150, 200,30); 

        window.add(text1);
        window.add(text2);
  

        JLabel myLabel = new JLabel("My first BIG label!!");
        myLabel.setBounds(50,40, 200,30);  
        myLabel.setFont(new Font("Serif", Font.PLAIN, 14));

        JLabel myLabel2 = new JLabel("My second BIG label");
        myLabel2.setBounds(50,120, 200,30);  
        myLabel2.setFont(new Font("Serif", Font.BOLD, 16));

        window.add(myLabel);
        window.add(myLabel2);

        window.setLayout(null);  
        window.setVisible(true);  

    }
}
