package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class View_Accueil {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Accueil window = new View_Accueil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public View_Accueil() {
		initialize();
		
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_Livre = new JButton("");
		btn_Livre.setIcon(new ImageIcon(View_Accueil.class.getResource("/image/button (8).png")));
		btn_Livre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				View_Livre vl;
				try {
					vl = new View_Livre();
					//vl.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btn_Livre.setBounds(77, 250, 216, 40);
		frame.getContentPane().add(btn_Livre);
		btn_Livre.setBackground(Color.BLACK);
		
		JButton btn_resa = new JButton("");
		btn_resa.setIcon(new ImageIcon(View_Accueil.class.getResource("/image/button (9).png")));
		btn_resa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				View_resa vr = new View_resa();
				
		
			}
		});
		btn_resa.setBounds(443, 122, 246, 40);
		frame.getContentPane().add(btn_resa);
		btn_resa.setBackground(Color.BLACK);
		
		
		
	
	
		
		
		JButton btn_restit = new JButton("");
		btn_restit.setIcon(new ImageIcon(View_Accueil.class.getResource("/image/button (10).png")));
		btn_restit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_restit vbr = new View_restit();
			}
			
			
		});
		btn_restit.setBounds(58, 127, 261, 35);
		frame.getContentPane().add(btn_restit);
		btn_restit.setBackground(Color.BLACK);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(View_Accueil.class.getResource("/image/Capture.PNG")));
		lblNewLabel_2.setBounds(-145, 0, 879, 111);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btn_crea = new JButton("");
		btn_crea.setBackground(Color.BLACK);
		btn_crea.setIcon(new ImageIcon(View_Accueil.class.getResource("/image/button (7).png")));
		btn_crea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_CreationAdherent vvb = new View_CreationAdherent();
			}
		});
		btn_crea.setBounds(225, 354, 295, 40);
		frame.getContentPane().add(btn_crea);
		
		JButton btn_Auteur = new JButton("Liste Auteurs");
		btn_Auteur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					View_Auteur cbr = new View_Auteur();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_Auteur.setBounds(491, 247, 143, 23);
		frame.getContentPane().add(btn_Auteur);
	}
}

