package chatting.application;
import javax.swing.*;
import java.awt.*;
public class server extends JFrame{
	JPanel p1;
	server(){
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting//application//icons//room509.jpg"));
		Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		
		l1.setBounds(5,5,30,30);
		add(l1);
		
		getContentPane().setBackground(Color.BLUE);
		setLayout(null);
		setSize(500,600);
		setLocation(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new server().setVisible(true);
	}
}