package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class AdvertisementCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField txtSpecialSales2;
	private JTextField txtSpecialSales1;
	protected JTextField discount1,discount2;
	public static String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,d1,d2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementCustomer frame = new AdvertisementCustomer(d1,d2);
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
	public AdvertisementCustomer(String dis1,String dis2) {
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
			
		if(d1 == null || d2 == null) {
			d1 = "3";
			d2 = "5";
		}
		
		Advertisement frame = new Advertisement(d1,d2);
		discount1 = new JTextField();
		discount1.setForeground(Color.RED);
		discount1.setHorizontalAlignment(SwingConstants.CENTER);
		discount1.setText(d1);
		discount1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		discount1.setEditable(false);
		discount1.setBounds(63, 331, 41, 43);
		panel1.add(discount1);
		discount1.setColumns(10);
		
		discount2 = new JTextField();
		discount2.setText(d2);
		discount2.setHorizontalAlignment(SwingConstants.CENTER);
		discount2.setForeground(Color.RED);
		discount2.setFont(new Font("Sitka Small", Font.BOLD, 16));
		discount2.setEditable(false);
		discount2.setColumns(10);
		discount2.setBounds(313, 366, 41, 43);
		panel1.add(discount2);
		
		d1 = discount1.getText();
		d2 = discount2.getText();
			
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(272, 463, 219, 91);
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

//Product/Order button
				JButton ProductOrderButton = new JButton("Product/Order");
				ProductOrderButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Advertisement A = new Advertisement(d1,d2);
						//AdvertisementCustomer.d1 = d1;
						//AdvertisementCustomer.d2 = d2;
						ProductCustomer PC = new ProductCustomer(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
						PC.setVisible(true);
						dispose();
					}
				});
				ProductOrderButton.setForeground(Color.BLACK);
				ProductOrderButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
				ProductOrderButton.setBackground(UIManager.getColor("Button.background"));
				ProductOrderButton.setBounds(287, 420, 193, 33);
				panel1.add(ProductOrderButton);
				
//Back Button			
		JButton BackButton = new JButton("Back");
		BackButton.setBackground(new Color(240, 255, 255));
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerPage frame = new CustomerPage();
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
