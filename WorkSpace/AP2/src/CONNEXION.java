import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CONNEXION {

	JFrame frame;
	private JTextField txtIdentifiant;
	private JTextField txtMotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CONNEXION window = new CONNEXION();
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
	public CONNEXION() {
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
		
		txtIdentifiant = new JTextField();
		txtIdentifiant.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdentifiant.setText("Identifiant");
		txtIdentifiant.setBounds(176, 57, 100, 25);
		frame.getContentPane().add(txtIdentifiant);
		txtIdentifiant.setColumns(10);
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtMotDePasse.setText("Mot de passe");
		txtMotDePasse.setBounds(176, 94, 100, 25);
		frame.getContentPane().add(txtMotDePasse);
		txtMotDePasse.setColumns(10);
		
		JButton btnNewButton = new JButton("SE CONNECTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(148, 143, 165, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
