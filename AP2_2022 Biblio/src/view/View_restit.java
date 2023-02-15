package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.sql.SQLException;

import javax.swing.JTextField;

import controller.mainMVC;
import model.ADHERENT;
import model.LIVRE;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class View_restit {

	private JFrame frame;
	private JTextField textField_ISBN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_restit window = new View_restit();
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
	public View_restit() {                              
		
		try {
			mainMVC.getM().getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		Label ISBN = new Label("ISBN");
		ISBN.setBounds(72, 68, 62, 22);
		frame.getContentPane().add(ISBN);
		
		textField_ISBN = new JTextField();
		textField_ISBN.setBounds(178, 70, 86, 20);
		frame.getContentPane().add(textField_ISBN);
		textField_ISBN.setColumns(10);
		
		JButton btn_valider = new JButton("VALIDER");
		btn_valider.setBounds(312, 69, 89, 23);
		frame.getContentPane().add(btn_valider);
		
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton btn_retourner = new JButton("FERMER");
		btn_retourner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
					frame.setVisible(false);
			
			}
		});
		btn_retourner.setBounds(178, 227, 89, 23);
		frame.getContentPane().add(btn_retourner);
		
		JLabel lbl_info = new JLabel("Veuillez entrer le ISBN du livre");
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setBounds(106, 118, 209, 14);
		frame.getContentPane().add(lbl_info);
		
		JButton btn_restituer = new JButton("RESTITUER");
		btn_restituer.setBounds(161, 162, 109, 23);
		frame.getContentPane().add(btn_restituer);
		
		JLabel info_fin = new JLabel("");
		info_fin.setHorizontalAlignment(SwingConstants.CENTER);
		info_fin.setBounds(124, 202, 225, 14);
		frame.getContentPane().add(info_fin);
		btn_valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LIVRE is;
				is=mainMVC.getM().findlivre(textField_ISBN.getText());          
				if(is==null)
				{
					lbl_info.setText("ISBN non trouvé");
				}
				else
				{
					if(is.getEmprunteur()!=null)
					{
						lbl_info.setText(is.getTitre());
						btn_valider.setEnabled(false);
						textField_ISBN.setEnabled(false);
					}
					else
					{
						lbl_info.setText("Le Livre est déja disponible à la bibliothèque");
					}
				
				} 
				
				
			}	
		});
		
		
		btn_restituer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().restituer_livre(textField_ISBN.getText());
					btn_restituer.setEnabled(false);
					info_fin.setText("Le livre a bien été restituer");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		
		
		
		
		
		
		});
		
	}
}
