import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class TD3_exo1 {

	private JFrame frame;
	private JTextField devine;
	private JTextField resultat;
	private JTextField tentative;
	private int min = 1;
	private int max = 100;
	int nbtentative;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TD3_exo1 window = new TD3_exo1();
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
	public TD3_exo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDe = new JLabel("Deviner le nombre ?");
		lblDe.setBounds(12, 0, 154, 15);
		frame.getContentPane().add(lblDe);
		
		devine = new JTextField();
		devine.setBounds(208, 86, 57, 19);
		frame.getContentPane().add(devine);
		devine.setColumns(10);
		
		resultat = new JTextField();
		resultat.setBounds(208, 405, 230, 19);
		frame.getContentPane().add(resultat);
		resultat.setColumns(10);
		
		tentative = new JTextField();
		tentative.setBounds(554, 114, 71, 19);
		frame.getContentPane().add(tentative);
		tentative.setColumns(10);
		
		JLabel lblDevineLeNombre = new JLabel("Devine le nombre :");
		lblDevineLeNombre.setBounds(38, 88, 168, 15);
		frame.getContentPane().add(lblDevineLeNombre);
		
		JLabel lblNewLabel = new JLabel("Nombre tentative :");
		lblNewLabel.setBounds(408, 111, 154, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton tente = new JButton("JE TENTE");
		tente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				Random random = new Random();
				int value = random.nextInt(max - min) + min;
				nbtentative= nbtentative+1;
				
					if (value == Integer.parseInt(devine.getText()))
					{
					System.out.println("TROUVÉ");
				}
				
					if (value<Integer.parseInt(devine.getText()))  {
						resultat.setText(String.valueOf("RATE, le nombre a deviner est plus petit"));
				}
				 
					if  (value>Integer.parseInt(devine.getText())) {
						resultat.setText(String.valueOf("RATE, le nombre a deviner est plus grand"));
						
					}
				String resultat=String.valueOf(nbtentative);
				tentative.setText(resultat);
			
			
				
					
			}
		});
		tente.setBounds(240, 185, 154, 145);
		frame.getContentPane().add(tente);
	}
}
