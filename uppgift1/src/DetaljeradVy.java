import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class DetaljeradVy extends JFrame {

	private JPanel contentPane;
	private JTextField txtPersonnummer;
	private JTextField txtTelefonnummer;
	private JTextField txtEpostMotherofdragonsgmailcom;
	private JTextField txtMedlem;
	private JTextField txtNamnDaenarysTargaryen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetaljeradVy frame = new DetaljeradVy();
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
	public DetaljeradVy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPersonnummer = new JTextField();
		txtPersonnummer.setText("19950806 - 2340");
		txtPersonnummer.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtPersonnummer.setBounds(321, 92, 184, 29);
		contentPane.add(txtPersonnummer);
		txtPersonnummer.setColumns(10);
		
		txtTelefonnummer = new JTextField();
		txtTelefonnummer.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtTelefonnummer.setText("0769-548695");
		txtTelefonnummer.setBounds(321, 132, 184, 29);
		contentPane.add(txtTelefonnummer);
		txtTelefonnummer.setColumns(10);
		
		JButton btnNewButton = new JButton("Skriv Ut");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(469, 334, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DetaljeradVy.class.getResource("/Images/Jframe.jpg")));
		lblNewLabel.setBounds(10, 46, 145, 200);
		contentPane.add(lblNewLabel);
		
		txtEpostMotherofdragonsgmailcom = new JTextField();
		txtEpostMotherofdragonsgmailcom.setText("MotherOfDragons@Gmail.com");
		txtEpostMotherofdragonsgmailcom.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtEpostMotherofdragonsgmailcom.setBounds(321, 172, 247, 23);
		contentPane.add(txtEpostMotherofdragonsgmailcom);
		txtEpostMotherofdragonsgmailcom.setColumns(10);
		
		txtMedlem = new JTextField();
		txtMedlem.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtMedlem.setText("24-04-2011");
		txtMedlem.setBounds(321, 206, 184, 23);
		contentPane.add(txtMedlem);
		txtMedlem.setColumns(10);
		
		txtNamnDaenarysTargaryen = new JTextField();
		txtNamnDaenarysTargaryen.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtNamnDaenarysTargaryen.setText("Daenarys Targaryen");
		txtNamnDaenarysTargaryen.setBounds(321, 50, 184, 29);
		contentPane.add(txtNamnDaenarysTargaryen);
		txtNamnDaenarysTargaryen.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(370, 334, 89, 23);
		contentPane.add(btnSpara);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNamn.setBounds(177, 57, 46, 14);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPersonnummer.setBounds(177, 99, 119, 14);
		contentPane.add(lblPersonnummer);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTelefonnummer.setBounds(177, 139, 119, 14);
		contentPane.add(lblTelefonnummer);
		
		JLabel lblEpost = new JLabel("E-post");
		lblEpost.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblEpost.setBounds(177, 175, 98, 18);
		contentPane.add(lblEpost);
		
		JLabel lblMedlem = new JLabel("Medlem");
		lblMedlem.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblMedlem.setBounds(177, 211, 70, 14);
		contentPane.add(lblMedlem);
		
		JLabel lblMedlem_1 = new JLabel("Medlem");
		lblMedlem_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMedlem_1.setBounds(206, 11, 160, 29);
		contentPane.add(lblMedlem_1);
	}
}
