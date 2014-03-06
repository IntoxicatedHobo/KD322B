import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Font;


public class AnimalsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
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
	public AnimalsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(16, 48, 409, 208);
		contentPane.add(textArea);
		
		ArrayList<Animal> dumbFacts = new ArrayList<Animal>();
		
		Cat Animal1 = new Cat("Fat",5,9);
		Snake Animal2 = new Snake("Snakey", true);
		Dog Animal3 = new Dog("Totte",4,true);
		Snake Animal4 = new Snake("Mr.Snake", false);
		Dog Animal5 = new Dog("Gaylord", 3, false);
		
		dumbFacts.add(Animal1);
		dumbFacts.add(Animal2);
		dumbFacts.add(Animal3);
		dumbFacts.add(Animal4);
		dumbFacts.add(new Cat("Cookie",2,2));
		
		
		String nothing = "";
		for(int i = 0; i < dumbFacts.size(); i++){
			Animal currentAnimal = dumbFacts.get(i);
			nothing = nothing + currentAnimal.getInfo() + "\n";
			
		}
		
		textArea.setText(nothing); 
		
		
		
		
		
		JLabel lblDumbFacts = new JLabel("Dumb facts:");
		lblDumbFacts.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDumbFacts.setBounds(16, 20, 116, 16);
		contentPane.add(lblDumbFacts);
	}

	}


