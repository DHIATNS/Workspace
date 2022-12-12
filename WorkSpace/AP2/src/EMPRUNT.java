import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EMPRUNT {

	JFrame frame;
	private JTextField isbn;
	private JTextField numerocarte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMPRUNT window = new EMPRUNT();
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
	public EMPRUNT() {
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
		
		isbn = new JTextField();
		isbn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ((isbn.getText()==null) && (emprunter.getActionCommand==null))
						{
					System.out.println("EREUUR, l'ISBN n'est pas reconnu");
				}
			}
		});
		
		isbn.setText("ISBN");
		isbn.setBounds(52, 96, 114, 19);
		frame.getContentPane().add(isbn);
		isbn.setColumns(10);
		
		numerocarte = new JTextField();
		numerocarte.setText("Numéro de carte");
		numerocarte.setBounds(52, 175, 114, 19);
		frame.getContentPane().add(numerocarte);
		numerocarte.setColumns(10);
		
		JButton emprunter = new JButton("EMPRUNTER");
		emprunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((isbn.getText()!=null) && (numerocarte.getText()!=null)){
					//emprunter.getAction()
				
				}
					
						
				System.out.println("Le livre a bien été emprunter"); 
			}
		});
		emprunter.setBounds(282, 210, 117, 25);
		frame.getContentPane().add(emprunter);
	}

}
