package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controller.mainMVC;
import model.LIVRE;

import java.awt.List;
import java.sql.SQLException;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class View_Auteur {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Auteur window = new View_Auteur();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public View_Auteur() throws SQLException {
		mainMVC.getM().getAll();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		List list = new List();
		list.setBounds(64, 50, 274, 103);
		frame.getContentPane().add(list);
		
		
		
		Button button = new Button("FERMER");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
			
		});
		button.setBounds(354, 25, 70, 22);
		frame.getContentPane().add(button);
		
		
		System.out.println(mainMVC.getM().getListAuteur().size());
		
		for (int i=0;i!=mainMVC.getM().getListAuteur().size();i++)
		{
			
		list.add(mainMVC.getM().getListAuteur().get(i).Lignee());
		
		
		}
		
		
			

		
		
		
	}
}
