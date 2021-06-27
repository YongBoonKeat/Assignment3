package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	static String salary,purchase;
	public static String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,d1,d2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage(salary,purchase);
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
	public AdminPage(String Salary,String Inventory) {
		this.salary = Salary;
		this.purchase = Inventory;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(245, 255, 250));
		panel1.setBounds(0, 0, 897, 548);
		contentPane.add(panel1);
		
		JLabel GroceryStoreLabel = new JLabel("Admin Management");
		GroceryStoreLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		GroceryStoreLabel.setBounds(274, 21, 380, 43);
		panel1.add(GroceryStoreLabel);
		
		JLabel AdminPageLabel = new JLabel("");
		AdminPageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AdminPageLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\AdminPage.jpg"));
		AdminPageLabel.setBounds(103, 60, 696, 384);
		panel1.add(AdminPageLabel);
		
//Product button					
		JButton ProductButton = new JButton("Product");
		ProductButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product frame = new Product();
				frame.setVisible(true);
				dispose();
			}
		});
		ProductButton.setForeground(new Color(30, 144, 255));
		ProductButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		ProductButton.setBackground(Color.WHITE);
		ProductButton.setBounds(21, 472, 132, 43);
		panel1.add(ProductButton);
		
//Promotion button
		JButton PromotionButton = new JButton("Promotion");
		PromotionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement(d1,d2);
				frame.setVisible(true);
				dispose();
			}
		});
		PromotionButton.setForeground(new Color(30, 144, 255));
		PromotionButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
		PromotionButton.setBackground(Color.WHITE);
		PromotionButton.setBounds(169, 472, 132, 43);
		panel1.add(PromotionButton);	
		
//Employee button		
				JButton EmployeeButton = new JButton("Employee");
				EmployeeButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Employee frame = new Employee();
						frame.setVisible(true);
						dispose();
					}
				});
				EmployeeButton.setForeground(new Color(30, 144, 255));
				EmployeeButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
				EmployeeButton.setBackground(Color.WHITE);
				EmployeeButton.setBounds(311, 472, 143, 43);
				panel1.add(EmployeeButton);
				
//Inventory button		
				JButton InventoryButton = new JButton("Inventory");
				InventoryButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Inventory frame = new Inventory(salary);
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose();
					}
				});
				InventoryButton.setForeground(new Color(30, 144, 255));
				InventoryButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
				InventoryButton.setBackground(Color.WHITE);
				InventoryButton.setBounds(464, 472, 132, 43);
				panel1.add(InventoryButton);

//Finance button
				JButton OrderButton = new JButton("Finance");
				OrderButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Finance frame = new Finance(salary,purchase);
						frame.setModalExclusionType(null);
						frame.setVisible(true);
			            dispose();
					}
				});
				OrderButton.setForeground(new Color(30, 144, 255));
				OrderButton.setFont(new Font("STZhongsong", Font.BOLD | Font.ITALIC, 18));
				OrderButton.setBackground(Color.WHITE);
				OrderButton.setBounds(606, 472, 135, 43);
				panel1.add(OrderButton);
				
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
				ExitButton.setBounds(751, 471, 120, 45);
				panel1.add(ExitButton);
			
				

	}
}
