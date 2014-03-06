import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.DropMode;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Insets;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class Fitnesscenter extends JFrame {

	private JPanel contentPane;
	private JMenu mnHjlp;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fitnesscenter frame = new Fitnesscenter();
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
	public Fitnesscenter() {
		setFont(new Font("Calibri", Font.BOLD, 16));
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 284);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Calibri", Font.BOLD, 16));
		menuBar.setBorder(UIManager.getBorder("Table.cellNoFocusBorder"));
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		mnArkiv.setMargin(new Insets(0, 5, 0, 0));
		mnArkiv.setFont(new Font("Calibri", Font.BOLD, 16));
		menuBar.add(mnArkiv);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Skriv ut");
		mntmNewMenuItem.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnArkiv.add(mntmNewMenuItem);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mntmAvsluta.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		mnMedlem.setFont(new Font("Calibri", Font.BOLD, 16));
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mntmNyMedlem.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mntmHittaMedlem.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnMedlem.add(mntmHittaMedlem);
		
		mnHjlp = new JMenu("Hj\u00E4lp");
		mnHjlp.setFont(new Font("Calibri", Font.BOLD, 16));
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mntmHjlp.setAlignmentY(Component.TOP_ALIGNMENT);
		mntmHjlp.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmHjlp.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mntmOmProgrammet.setFont(new Font("Calibri", Font.PLAIN, 16));
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Annika", "Andersson", "19900628 - 5220", "Annika_90@gmail.com", "0768-658569"},
				{"Bella", "Bengtsson", "19850706 - 6842", "B.Bengtsson@gmail.com", "0763-587469"},
				{"Carl", "Crane", "19890525 - 2036", "Crane@hotmail.com", "0768-544265"},
				{"Daenarys", "Targaryen", "19950806 - 2340", "MotherOfdragons@gmail.com", "0769-548695"},
				{"Elton", "John", "19600804 - 0654", "Elton.John@gmail.com", "0707-685472"},
				{"Farrah", "Flow", "19760524 - 6523", "Farrah.Flow@hotmail.com", "0739-054603"},
				{"Gunnar", "Nilsson", "19560630 - 6554", "Ingen epost", "0768-746985"},
				{"Henrik", "Hansson", "19921223 - 5610", "Henrik_hansson@gmail.com", "0767-694582"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"F\u00F6rnamn", "Efternamn", "Personnummer", "E-post", "Telefonnummer"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(97);
		table.getColumnModel().getColumn(1).setPreferredWidth(103);
		table.getColumnModel().getColumn(2).setPreferredWidth(122);
		table.getColumnModel().getColumn(3).setPreferredWidth(198);
		table.getColumnModel().getColumn(4).setPreferredWidth(101);
		scrollPane.setViewportView(table);
	}

}
