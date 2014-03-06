package uppgift_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumansAndDogsGUI extends JFrame {

	private JTextArea info;
	private JTextArea error;
	private JPanel contentPane;
	private JTextField humanname;
	private JTextField dogname;
	
	Human humans;
	Dog dog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogsGUI frame = new HumansAndDogsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HumansAndDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblHumansAndDogs.setBounds(126, 19, 161, 20);
		contentPane.add(lblHumansAndDogs);
		
		humanname = new JTextField();
		humanname.setBounds(46, 51, 134, 28);
		contentPane.add(humanname);
		humanname.setColumns(10);
		
		dogname = new JTextField();
		dogname.setBounds(46, 80, 134, 28);
		contentPane.add(dogname);
		dogname.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (humanname.getText().length()>=3){
					humans = new Human (humanname.getText());
					error.setText("");
					
				}
				
				else{
					error.setText("Invalid name for human");
			
				}
			}
		});
		btnNewHuman.setBounds(218, 51, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (humans!=null){
					dog = new Dog(); 
					dog.setName(dogname.getText());
					humans.buyDog(dog); 
					error.setText("");
		      } else {
		    	  error.setText("Dog needs to have a human");
				
			}
			}
		}
		);
		btnBuyDog.setBounds(218, 81, 117, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				info.setText(humans.getInfo());
				
				
			}
		});
		btnPrintInfo.setBounds(218, 111, 117, 29);
		contentPane.add(btnPrintInfo);
		
		info = new JTextArea();
		info.setBounds(46, 173, 326, 34);
		contentPane.add(info);
		
		error = new JTextArea();
		error.setBounds(46, 229, 326, 32);
		contentPane.add(error);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(46, 155, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setBounds(46, 208, 103, 16);
		contentPane.add(lblErrormessage);
		
		
	}
}
