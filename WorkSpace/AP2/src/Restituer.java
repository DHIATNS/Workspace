import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Restituer {

	JFrame frame;
	private JTextField txtIsbn;
	private JTextField txtDateDemprunt;
	private JTextField txtDateRetour;
	private JTextField txtNumroDeCarte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restituer window = new Restituer();
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
	public Restituer() {
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
		
		txtIsbn = new JTextField();
		txtIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		txtIsbn.setText("ISBN");
		txtIsbn.setBounds(45, 117, 114, 19);
		frame.getContentPane().add(txtIsbn);
		txtIsbn.setColumns(10);
		
		txtDateDemprunt = new JTextField();
		txtDateDemprunt.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateDemprunt.setText("Date d'emprunt");
		txtDateDemprunt.setBounds(45, 164, 114, 19);
		frame.getContentPane().add(txtDateDemprunt);
		txtDateDemprunt.setColumns(10);
		
		txtDateRetour = new JTextField();
		txtDateRetour.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateRetour.setText("Date retour");
		txtDateRetour.setBounds(45, 210, 114, 19);
		frame.getContentPane().add(txtDateRetour);
		txtDateRetour.setColumns(10);
		
		txtNumroDeCarte = new JTextField();
		txtNumroDeCarte.setText("Numéro de carte");
		txtNumroDeCarte.setBounds(45, 67, 114, 19);
		frame.getContentPane().add(txtNumroDeCarte);
		txtNumroDeCarte.setColumns(10);
		
		JButton btnNewButton = new JButton("RETOURNER");
		btnNewButton.setBounds(277, 196, 117, 25);
		frame.getContentPane().add(btnNewButton);
	}

}
