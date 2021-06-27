package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.event.AncestorListener;

import javax.swing.event.AncestorEvent;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import Assignment3.Product;

public class CustomerPage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	public static String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,d1,d2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerPage frame1 = new CustomerPage();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public CustomerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(245, 255, 250));
		panel1.setBounds(0, 0, 815, 564);
		contentPane.add(panel1);
		
		JLabel GroceryStoreLabel = new JLabel("Welcome to YBK Grocery Store");
		GroceryStoreLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		GroceryStoreLabel.setBounds(158, 14, 530, 43);
		panel1.add(GroceryStoreLabel);

//Product button		
		JButton ProductButton = new JButton("Product/Order");
		ProductButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductCustomer frame = new ProductCustomer(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
				frame.setVisible(true);
				dispose();
			}
		});
		ProductButton.setForeground(new Color(30, 144, 255));
		ProductButton.setBackground(new Color(255, 255, 255));
		ProductButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		ProductButton.setBounds(232, 506, 186, 43);
		panel1.add(ProductButton);
		
	
		
//Promotion button		
		JButton PromotionButton = new JButton("Promotion");
		PromotionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementCustomer frame = new AdvertisementCustomer(d1,d2);
				frame.setVisible(true);
				dispose();
			}
		});
		PromotionButton.setForeground(new Color(30, 144, 255));
		PromotionButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		PromotionButton.setBackground(Color.WHITE);
		PromotionButton.setBounds(446, 506, 154, 43);
		panel1.add(PromotionButton);


		
		JLabel CustomerPageLabel = new JLabel("");
		CustomerPageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CustomerPageLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\CustomerPage.jpg"));
		CustomerPageLabel.setBounds(45, 62, 715, 433);
		panel1.add(CustomerPageLabel);
		
//Exit button	
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Management System", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setForeground(new Color(30, 144, 255));
		ExitButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		ExitButton.setBackground(Color.WHITE);
		ExitButton.setBounds(623, 505, 161, 45);
		panel1.add(ExitButton);			
		
//Register button		
		JButton RegisterButton = new JButton("Register");
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerReg frame = new CustomerReg();
				frame.setVisible(true);
				dispose();
			}
		});
		RegisterButton.setForeground(new Color(30, 144, 255));
		RegisterButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		RegisterButton.setBackground(Color.WHITE);
		RegisterButton.setBounds(30, 506, 171, 43);
		panel1.add(RegisterButton);
	}
}
