package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextField txtSpecialSales2;
	private JTextField txtSpecialSales1;
	private JTextField discount1,discount2;
	public static String d1,d2,salary,purchase;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement(d1,d2);
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
	public Advertisement(String dis1,String dis2) {
		this.d1 = dis1;
		this.d2 = dis2;
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(273, 457, 219, 97);
		panel1.add(panel);
		panel.setLayout(null);
		
		JLabel FollowLabel = new JLabel("Follow Us");
		FollowLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 15));
		FollowLabel.setBounds(73, 10, 84, 27);
		panel.add(FollowLabel);
		
		JLabel SocialMediaLabel = new JLabel("");
		SocialMediaLabel.setBounds(10, 33, 200, 58);
		panel.add(SocialMediaLabel);
		SocialMediaLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Advertising\\SocialMedia2.png"));
		SocialMediaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel PromotionLabel = new JLabel("Promotion");
		PromotionLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		PromotionLabel.setBounds(287, 33, 214, 43);
		panel1.add(PromotionLabel);
		
		JLabel PromotionImagesLabel = new JLabel("");
		PromotionImagesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PromotionImagesLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Advertising\\Advertising.png"));
		PromotionImagesLabel.setBounds(22, 76, 772, 245);
		panel1.add(PromotionImagesLabel);
		
		txtSpecialSales1 = new JTextField();
		txtSpecialSales1.setBackground(new Color(255, 240, 245));
		txtSpecialSales1.setForeground(new Color(220, 20, 60));
		txtSpecialSales1.setBounds(102, 331, 415, 43);
		panel1.add(txtSpecialSales1);
		txtSpecialSales1.setText("% discount, if spend more than RM100 ");
		txtSpecialSales1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialSales1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		txtSpecialSales1.setColumns(10);
		
		txtSpecialSales2 = new JTextField();
		txtSpecialSales2.setEditable(false);
		txtSpecialSales2.setBackground(new Color(255, 245, 238));
		txtSpecialSales2.setForeground(new Color(220, 20, 60));
		txtSpecialSales2.setBounds(354, 366, 415, 44);
		panel1.add(txtSpecialSales2);
		txtSpecialSales2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialSales2.setText("% discount, if spend more than RM250");
		txtSpecialSales2.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		txtSpecialSales2.setColumns(10);
		
		discount1 = new JTextField();
		discount1.setForeground(Color.RED);
		discount1.setHorizontalAlignment(SwingConstants.CENTER);
		discount1.setText("");
		discount1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		discount1.setBounds(63, 336, 41, 33);
		panel1.add(discount1);
		discount1.setColumns(10);
		
		discount2 = new JTextField();
		discount2.setText("");
		discount2.setHorizontalAlignment(SwingConstants.CENTER);
		discount2.setForeground(Color.RED);
		discount2.setFont(new Font("Sitka Small", Font.BOLD, 16));
		discount2.setColumns(10);
		discount2.setBounds(313, 376, 41, 33);
		panel1.add(discount2);
		
		d1 = discount1.getText();
		d2 = discount2.getText();
		
		
//Reset button
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				discount1.setText("");
				discount2.setText("");
			}
		});
		ResetButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Reset1.png"));
		ResetButton.setForeground(Color.BLACK);
		ResetButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		ResetButton.setBackground(UIManager.getColor("Button.background"));
		ResetButton.setBounds(419, 420, 118, 33);
		panel1.add(ResetButton);

//Edit button
				JButton EditButton = new JButton("EDIT");
				EditButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						d1 = discount1.getText();
						d2 = discount2.getText();
						JOptionPane.showMessageDialog(null, "Edit Successfully");
						AdvertisementCustomer frame = new AdvertisementCustomer(d1,d2);
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose();//close windows
						
					}
				});
				EditButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Edit1.png"));
				EditButton.setForeground(Color.BLACK);
				EditButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
				EditButton.setBackground(UIManager.getColor("Button.background"));
				EditButton.setBounds(222, 420, 118, 33);
				panel1.add(EditButton);
		
//Back Button			
		JButton BackButton = new JButton("Back");
		BackButton.setBackground(new Color(240, 255, 255));
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage frame = new AdminPage(salary,purchase);
				frame.setVisible(true);
				dispose();
			}
		});
		BackButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Back1.png"));
		BackButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 15));
		BackButton.setBounds(699, 10, 106, 27);
		panel1.add(BackButton);
		
		
	}
}
