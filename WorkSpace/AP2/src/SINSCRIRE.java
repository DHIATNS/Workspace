import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SINSCRIRE {

	JFrame frame;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtDateDeNaissance;
	private JTextField txtAdresseMail;
	private JTextField txtTel;
	private JTextField txtAdressePostale;
	private JTextPane txtpnInscription;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SINSCRIRE window = new SINSCRIRE();
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
	public SINSCRIRE() {
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
		
		txtNom = new JTextField();
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setText("Nom");
		txtNom.setToolTipText("");
		txtNom.setBounds(12, 90, 127, 19);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrenom.setText("Prenom");
		txtPrenom.setBounds(12, 121, 127, 19);
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtDateDeNaissance = new JTextField();
		txtDateDeNaissance.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateDeNaissance.setText("Date de naissance");
		txtDateDeNaissance.setBounds(12, 152, 127, 19);
		frame.getContentPane().add(txtDateDeNaissance);
		txtDateDeNaissance.setColumns(10);
		
		txtAdresseMail = new JTextField();
		txtAdresseMail.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdresseMail.setText("Adresse mail");
		txtAdresseMail.setBounds(12, 211, 127, 19);
		frame.getContentPane().add(txtAdresseMail);
		txtAdresseMail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTel.setText("Tel");
		txtTel.setBounds(12, 242, 127, 19);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Homme");
		rdbtnNewRadioButton.setBounds(355, 228, 149, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemme = new JRadioButton("Femme");
		rdbtnFemme.setBounds(268, 228, 149, 23);
		frame.getContentPane().add(rdbtnFemme);
		
		txtAdressePostale = new JTextField();
		txtAdressePostale.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdressePostale.setText("Adresse postale");
		txtAdressePostale.setBounds(12, 183, 127, 19);
		frame.getContentPane().add(txtAdressePostale);
		txtAdressePostale.setColumns(10);
		
		txtpnInscription = new JTextPane();
		txtpnInscription.setForeground(Color.BLACK);
		txtpnInscription.setText("                 INSCRIPTION");
		txtpnInscription.setBounds(124, 0, 234, 32);
		frame.getContentPane().add(txtpnInscription);
		
		btnNewButton = new JButton("S'INSCRIRE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(284, 180, 117, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
