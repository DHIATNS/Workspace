package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.mainMVC;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class View_CreationAdherent {

	private JFrame frame;
	private JTextField txtNumroAdherent;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_CreationAdherent window = new View_CreationAdherent();
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
	public View_CreationAdherent() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInscription = new JLabel("INSCRIPTION");
		lblInscription.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscription.setBounds(170, 38, 98, 14);
		frame.getContentPane().add(lblInscription);
		
		txtNumroAdherent = new JTextField();
		txtNumroAdherent.setText("Numéro Adherent");
		txtNumroAdherent.setBounds(10, 65, 86, 20);
		frame.getContentPane().add(txtNumroAdherent);
		txtNumroAdherent.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setText("Nom");
		txtNom.setColumns(10);
		txtNom.setBounds(10, 96, 86, 20);
		frame.getContentPane().add(txtNom);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("Prenom");
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(10, 127, 86, 20);
		frame.getContentPane().add(txtPrenom);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 158, 86, 20);
		frame.getContentPane().add(txtEmail);
		
		JButton btnNewButton = new JButton("S'INSCRIRE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().Creation_Adherent(txtNumroAdherent.getText(), txtNom.getText(), txtPrenom.getText() , txtEmail.getText());
					
				} catch (ClassNotFoundException e1) {
					
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
						
				
			
			}
		});
		btnNewButton.setBounds(297, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
