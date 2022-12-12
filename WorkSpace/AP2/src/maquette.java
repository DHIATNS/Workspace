import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class maquette {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maquette window = new maquette();
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
	public maquette() {
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
		
		JButton restituer = new JButton("RESTITUER UN LIVRE");
		restituer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Restituer window = new Restituer();
					window.frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
			}
		});
		restituer.setBounds(12, 82, 183, 49);
		frame.getContentPane().add(restituer);
		
		JButton connexion = new JButton("CONNEXION");
		connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CONNEXION window = new CONNEXION();
					window.frame.setVisible(true);
				} catch (Exception b) {
					b.printStackTrace();
				}
				
			}
		});
		connexion.setBounds(12, 236, 117, 25);
		frame.getContentPane().add(connexion);
		
		JButton sinscrire = new JButton("S'INSCRIRE");
		sinscrire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SINSCRIRE window = new SINSCRIRE();
					window.frame.setVisible(true);
				} catch (Exception c) {
					c.printStackTrace();
				}
			}
		});
		sinscrire.setBounds(308, 236, 117, 25);
		frame.getContentPane().add(sinscrire);
		
		JButton emprunter = new JButton("EMPRUNTER UN LIVRE");
		emprunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EMPRUNT window = new EMPRUNT();
					window.frame.setVisible(true);
				} catch (Exception d) {
					d.printStackTrace();
				}
				 EMPRUNT a1 ;
				 a1 = new EMPRUNT ();
				
				
			}
		});
		emprunter.setBounds(238, 82, 187, 49);
		frame.getContentPane().add(emprunter);
		
		JButton btnNewButton_4 = new JButton("RECHERCHE");
		btnNewButton_4.setBounds(12, 12, 413, 25);
		frame.getContentPane().add(btnNewButton_4);
	}
}