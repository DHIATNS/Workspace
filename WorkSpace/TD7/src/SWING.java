import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Color;

public class SWING {

	private JFrame frame;
	private JTextField nb1;
	private JTextField nb2;
	private JTextField resultat;
	private int operation;
	private int total;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SWING window = new SWING();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SWING() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	


		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		nb1 = new JTextField();
		nb1.setBounds(12, 65, 72, 61);
		frame.getContentPane().add(nb1);
		nb1.setColumns(10);

		nb2 = new JTextField();
		nb2.setBounds(165, 65, 72, 61);
		frame.getContentPane().add(nb2);
		nb2.setColumns(10);

		resultat = new JTextField();
		resultat.setBounds(361, 61, 72, 69);
		frame.getContentPane().add(resultat);
		resultat.setColumns(10);

		JButton button_1 = new JButton("+");
		
		button_1.setBounds(109, 83, 44, 25);
		frame.getContentPane().add(button_1);

		JButton button_3 = new JButton("/");
		

		button_3.setBounds(109, 157, 44, 25);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("*");
		
		
		button_4.setBounds(109, 194, 44, 25);
		frame.getContentPane().add(button_4);

		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operation=2;
				button_1.setBackground(Color.GRAY);
				button_2.setBackground(Color.GREEN);
				button_3.setBackground(Color.GRAY);
				button_4.setBackground(Color.GRAY);



			}
		});
		button_2.setBounds(109, 120, 44, 25);
		frame.getContentPane().add(button_2);

		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total=0;
				switch (operation) {
				case 1:
				{
					total=Integer.parseInt(nb1.getText())+Integer.parseInt(nb2.getText());

					break;
				}

				case 2:
				{
					total=Integer.parseInt(nb1.getText())-Integer.parseInt(nb2.getText());

					break;
				}

				case 3:
				{
					total=Integer.parseInt(nb1.getText())/Integer.parseInt(nb2.getText());

					break;
				}

				case 4:
				{
					total=Integer.parseInt(nb1.getText())*Integer.parseInt(nb2.getText());

					break;
				}

				}
				
				resultat.setText(String.valueOf(total));
			}
		});
		button.setBounds(263, 83, 86, 25);
		frame.getContentPane().add(button);
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operation=4;
				button_1.setBackground(Color.GRAY);
				button_2.setBackground(Color.GRAY);
				button_3.setBackground(Color.GRAY);
				button_4.setBackground(Color.GREEN);
			

			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operation=3;
				button_1.setBackground(Color.GRAY);
				button_2.setBackground(Color.GRAY);
				button_3.setBackground(Color.GREEN);
				button_4.setBackground(Color.GRAY);




			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				operation=1;
				button_1.setBackground(Color.GREEN);
				button_2.setBackground(Color.GRAY);
				button_3.setBackground(Color.GRAY);
				button_4.setBackground(Color.GRAY);






			}
		});
		
	}
}
