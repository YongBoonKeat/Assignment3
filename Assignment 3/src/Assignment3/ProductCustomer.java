package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.SystemColor;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ProductCustomer extends JFrame{

	private JPanel contentPane;
	static JFrame Register;
	static JTable tableProduct;
	public static String salary,purchase,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;
	static String d1,d2;
	static JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductCustomer frame = new ProductCustomer(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
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
	public ProductCustomer(String pp1,String pp2,String pp3,String pp4,String pp5,String pp6,String pp7,String pp8,String pp9,String pp10,String pp11) {
			this.p1 = pp1;
			this.p2 = pp2;
			this.p3 = pp3;
			this.p4 = pp4;
			this.p5 = pp5;
			this.p6 = pp6;
			this.p7 = pp7;
			this.p8 = pp8;
			this.p9 = pp9;
			this.p10 = pp10;
			this.p11 = pp11;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//JPANEL	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1029, 489);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(224, 255, 255));
		panel1.setBounds(22, 51, 974, 359);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(173, 216, 230)));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(41, 73, 902, 222);
		panel1.add(panel_1_1_1);
		
		JPanel panel1_2 = new JPanel();
		panel1_2.setBounds(406, 10, 172, 50);
		panel1.add(panel1_2);
		panel1_2.setBackground(new Color(224, 255, 255));
		panel1_2.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		
		JLabel ProductLabel = new JLabel("Product");
		panel1_2.add(ProductLabel);
		ProductLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\PB\\P2.png"));
		ProductLabel.setForeground(new Color(0, 0, 128));
		ProductLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 882, 206);
		panel_1_1_1.add(scrollPane);
		
		if(p1==null||p2==null||p3==null||p4==null||p5==null||p6==null||p7==null||p8==null||p9==null||p10==null||p11==null) {
			p1 ="8";
			p2 ="8";
			p3 ="8";
			p4 ="9";
			p5 ="9";
			p6 ="9";
			p7 ="10";
			p8 ="10";
			p9 ="10";
			p10 ="11";
			p11 ="11";
					
		}
		tableProduct = new JTable();
		tableProduct.setForeground(Color.BLACK);
		tableProduct.setEnabled(false);
		tableProduct.setBorder(new LineBorder(new Color(0, 255, 255)));
		tableProduct.setColumnSelectionAllowed(true);
		tableProduct.setFont(new Font("STXihei", Font.BOLD, 16));
		tableProduct.setModel(new DefaultTableModel(
			new Object[][] {
				{"FF-864", "Ice Cream Vanilla", p1},
				{"FF-865", "Ice Cream Chocolate", p2},
				{"FF-864", "Ice Cream Neapolitan", p3},
				{"FF-874", "Original Pancake", p4},
				{"FF-875", "Buttermilk Pancake Mix", p5},
				{"FF-876", "Marble Butter Cake Mix", p6},
				{"FF-884", "Chicken Mushroom Pizza", p7},
				{"FF-885", "Four Cheese Pizza", p8},
				{"FF-886", "Hawaiian Chicken Pizza", p9},
				{"FF-894", "Mushroom Chicken Sausages", p10},
				{"FF-895", "Black Pepper Chicken Sausages", p11},
			},
			new String[] {
				"Item Code", "Item Name", "Item Price(RM)"
			}
		));
		scrollPane.setViewportView(tableProduct);
		
		JLabel YBKGroceryStoreLabel = new JLabel("YBK Grocery Store");
		YBKGroceryStoreLabel.setForeground(new Color(255, 255, 255));
		YBKGroceryStoreLabel.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 25));
		YBKGroceryStoreLabel.setBounds(416, 10, 253, 44);
		panel.add(YBKGroceryStoreLabel);
		
//Back Button	
		JButton BackButton = new JButton("Back");
		BackButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Back1.png"));
		BackButton.setBounds(855, 0, 119, 36);
		panel1.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerPage frame = new CustomerPage();
				frame.setVisible(true);
				dispose();
			}
		});
		BackButton.setForeground(new Color(0, 0, 0));
		BackButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 18));
		BackButton.setBackground(new Color(224, 255, 255));
		
//Order button	
				JButton OrderButton = new JButton("Order");
				OrderButton.setBounds(394, 305, 197, 33);
				panel1.add(OrderButton);
				OrderButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)tableProduct.getModel();
					int i = tableProduct.getSelectedRow();	
					for(int i1 = 0; i1 < model.getRowCount();i1++) {
						p1  = String.valueOf(model.getValueAt(0, 2));
						p2  = String.valueOf(model.getValueAt(1, 2));
						p3  = String.valueOf(model.getValueAt(2, 2));
						p4  = String.valueOf(model.getValueAt(3, 2));
						p5  = String.valueOf(model.getValueAt(4, 2));
						p6  = String.valueOf(model.getValueAt(5, 2));
						p7  = String.valueOf(model.getValueAt(6, 2));
						p8  = String.valueOf(model.getValueAt(7, 2));
						p9  = String.valueOf(model.getValueAt(8, 2));
						p10 = String.valueOf(model.getValueAt(9, 2));
						p11 = String.valueOf(model.getValueAt(10, 2));
						
					}
					CustomerOrder CO = new CustomerOrder(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
					try {
						if(AdvertisementCustomer.d1 == null || AdvertisementCustomer.d2 == null) {//ProductCustomer
							AdvertisementCustomer.d1= "3";
							AdvertisementCustomer.d2 = "5";
						}
						else {
							d1=AdvertisementCustomer.d1;
							d2=AdvertisementCustomer.d2 ;
						}
						Advertisement A = new Advertisement(d1,d2);
						CustomerOrder frame = new CustomerOrder(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
						frame.setModalExclusionType(null);
						frame.setVisible(true);		
					} catch (Exception ee) {
						ee.printStackTrace();
					}
				}
				});
				OrderButton.setForeground(Color.BLACK);
				OrderButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
				OrderButton.setBackground(UIManager.getColor("Button.background"));

	}
}
