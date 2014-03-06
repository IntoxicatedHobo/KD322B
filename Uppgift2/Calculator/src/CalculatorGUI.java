import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private Calculator myCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		
		myCalculator = new Calculator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(76, 32, 311, 66);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(1);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton.setBounds(47, 128, 66, 29);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(2);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button.setBounds(125, 128, 66, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(3);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_1.setBounds(213, 128, 66, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(4);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBounds(47, 169, 66, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(5);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setBounds(125, 169, 66, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(6);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setBounds(213, 169, 66, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(7);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBounds(47, 210, 66, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(8);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_6.setBounds(125, 210, 66, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_7.setBounds(213, 210, 66, 29);
		contentPane.add(button_7);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.plus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_9.setBounds(291, 128, 117, 29);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.minus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_10.setBounds(291, 169, 117, 29);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.mult();
			    String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
				
				
			}
		});
		button_11.setBounds(294, 210, 117, 29);
		contentPane.add(button_11);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.equals();
			    int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		btnEnter.setBounds(294, 243, 117, 29);
		contentPane.add(btnEnter);
		
		JPanel numbers = new JPanel();
		numbers.setBounds(6, 6, 438, 266);
		contentPane.add(numbers);
		numbers.setLayout(null);
		
		JButton button_8 = new JButton("0");
		button_8.setBounds(90, 231, 117, 29);
		numbers.add(button_8);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.clear();
			    String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
				
			}
		});
		btnC.setBounds(40, 92, 66, 29);
		numbers.add(btnC);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.numberButtonPressed(0);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
	}

}
