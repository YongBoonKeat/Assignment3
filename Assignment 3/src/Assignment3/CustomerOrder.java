package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import javax.swing.DropMode;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import Assignment3.Product;
import java.awt.print.*;


public class CustomerOrder extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField CustomerNametextField;
	private JTextField PhonetextField;	
	private JTextField AdresstextField;
	private JTextField EmailtextField;
	private JTextField txtIceCreamVanilla;
	private JTextField txtIceCreamChocolate;
	private JTextField txtIceCreamNeapolitan;
	private JTextField txtOriginalPancake;
	private JTextField txtButtermilkPancakeMix;
	private JTextField txtMarbleButterCakeMix;
	private JTextField txtChickenMushroomPizza;
	private JTextField txtFourCheesePizza;
	private JTextField txtHawaiianChickenPizza;
	private JTextField txtMushroomChickenSausages;
	private JTextField txtBlackPepperChickenSausages;
	private JTextField TaxtextField;
	private JTextField TotaltextField;
	private JTextField SubtotaltextField;
	private JTextArea txtReceipt;
	private JTextField PaymenttextField;
	private JTextField BalancetextField;
	private JTextField DiscounttextField;
	static String iTax,iSubtotal,iTotal,iDiscount,salary;
	private double payment;
	private double [] itemcost = new double[20];
	String balance;
	public static String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,tableProduct;
	static String d1,d2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerOrder frame = new CustomerOrder(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
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
	//public CustomerOrder() {}
	public CustomerOrder(String pp1,String pp2,String pp3,String pp4,String pp5,String pp6,String pp7,String pp8,String pp9,String pp10,String pp11) {
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
		setBounds(100, 100, 1358, 869);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//JPANEL	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1350, 822);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(135, 206, 235));
		panel1.setBounds(40, 51, 1254, 739);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel1_3 = new JPanel();
		panel1_3.setBackground(new Color(135, 206, 235));
		panel1_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		panel1_3.setBounds(565, 10, 144, 50);
		panel1.add(panel1_3);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(135, 206, 250));
		panel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 205)));
		panel2.setBounds(10, 70, 300, 426);
		panel1.add(panel2);
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 205)));
		panel3.setBackground(new Color(135, 206, 250));
		panel3.setBounds(320, 70, 492, 426);
		panel1.add(panel3);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 205)));
		panel4.setBackground(new Color(135, 206, 250));
		panel4.setBounds(822, 70, 422, 659);
		panel1.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(10, 506, 359, 223);
		panel1.add(panel5);
		panel5.setLayout(null);
		panel5.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 255, 255)));
		panel5.setBackground(new Color(135, 206, 250));
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(379, 506, 433, 223);
		panel1.add(panel6);
		panel6.setLayout(null);
		panel6.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 255, 255)));
		panel6.setBackground(new Color(135, 206, 250));
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(10, 571, 402, 78);
		panel7.setLayout(null);
		panel7.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 255, 255)));
		panel7.setBackground(new Color(135, 206, 250));
		panel4.add(panel7);
//JLabel Top
		JLabel YBKGroceryStoreLabel = new JLabel("YBK Grocery Store");
		YBKGroceryStoreLabel.setForeground(new Color(255, 255, 255));
		YBKGroceryStoreLabel.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 25));
		YBKGroceryStoreLabel.setBounds(574, 10, 253, 44);
		panel.add(YBKGroceryStoreLabel);
		
		JLabel OrderLabel = new JLabel("Order");
		panel1_3.add(OrderLabel);
		OrderLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\PB\\B2.png"));
		OrderLabel.setForeground(new Color(0, 0, 128));
		OrderLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		
//Jlabel Customer Info
		JLabel CustomerInfoLabel = new JLabel("CUSTOMER INFO");
		CustomerInfoLabel.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 20));
		CustomerInfoLabel.setBounds(78, 10, 155, 33);
		panel2.add(CustomerInfoLabel);
		
		JLabel CustomerNameLabel = new JLabel("Name");
		CustomerNameLabel.setBounds(21, 53, 114, 33);
		panel2.add(CustomerNameLabel);
		CustomerNameLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel PhoneLabel = new JLabel("Phone");
		PhoneLabel.setBounds(21, 124, 114, 33);
		panel2.add(PhoneLabel);
		PhoneLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setBounds(21, 191, 114, 32);
		panel2.add(AddressLabel);
		AddressLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel EmailLabel = new JLabel("Email");
		EmailLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		EmailLabel.setBounds(21, 267, 114, 26);
		panel2.add(EmailLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		GenderLabel.setBounds(21, 334, 114, 26);
		panel2.add(GenderLabel);
		
		CustomerNametextField = new JTextField();
		CustomerNametextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CustomerNametextField.setBounds(21, 81, 242, 33);
		panel2.add(CustomerNametextField);
		CustomerNametextField.setColumns(10);
		
		PhonetextField = new JTextField();
		PhonetextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		PhonetextField.setBounds(21, 155, 242, 33);
		panel2.add(PhonetextField);
		PhonetextField.setColumns(10);
		
		AdresstextField = new JTextField();
		AdresstextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AdresstextField.setBounds(21, 221, 242, 33);
		panel2.add(AdresstextField);
		AdresstextField.setColumns(10);
		
		EmailtextField = new JTextField();
		EmailtextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		EmailtextField.setColumns(10);
		EmailtextField.setBounds(21, 291, 242, 33);
		panel2.add(EmailtextField);
		
		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Male", "Female"}));
		Gender.setBounds(21, 359, 242, 33);
		panel2.add(Gender);
		
//Item List		
		JCheckBox IceCreamVanilla = new JCheckBox("Ice Cream Vanilla");
		IceCreamVanilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IceCreamVanilla.isSelected()) {
					txtIceCreamVanilla.setEnabled(true);
					txtIceCreamVanilla.setText("");
					txtIceCreamVanilla.requestFocus();
				}
				else {
					txtIceCreamVanilla.setEnabled(false);
					txtIceCreamVanilla.setText("0");
				}
			}
		});
		IceCreamVanilla.setBackground(new Color(135, 206, 250));
		IceCreamVanilla.setFont(new Font("Times New Roman", Font.BOLD, 18));
		IceCreamVanilla.setBounds(18, 18, 208, 34);
		panel3.add(IceCreamVanilla);
		
		JCheckBox IceCreamChocolate = new JCheckBox("Ice Cream Chocolate");
		IceCreamChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IceCreamChocolate.isSelected()) {
					txtIceCreamChocolate.setEnabled(true);
					txtIceCreamChocolate.setText("");
					txtIceCreamChocolate.requestFocus();
				}
				else {
					txtIceCreamChocolate.setEnabled(false);
					txtIceCreamChocolate.setText("0");
				}
			}
		});
		IceCreamChocolate.setBackground(new Color(135, 206, 250));
		IceCreamChocolate.setFont(new Font("Times New Roman", Font.BOLD, 18));
		IceCreamChocolate.setBounds(18, 54, 208, 34);
		panel3.add(IceCreamChocolate);
		
		JCheckBox IceCreamNeapolitan = new JCheckBox("Ice Cream Neapolitan");
		IceCreamNeapolitan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IceCreamNeapolitan.isSelected()) {
					txtIceCreamNeapolitan.setEnabled(true);
					txtIceCreamNeapolitan.setText("");
					txtIceCreamNeapolitan.requestFocus();
				}
				else {
					txtIceCreamNeapolitan.setEnabled(false);
					txtIceCreamNeapolitan.setText("0");
				}
			}
		});
		IceCreamNeapolitan.setBackground(new Color(135, 206, 250));
		IceCreamNeapolitan.setFont(new Font("Times New Roman", Font.BOLD, 18));
		IceCreamNeapolitan.setBounds(18, 90, 208, 34);
		panel3.add(IceCreamNeapolitan);
		
		JCheckBox OriginalPancake = new JCheckBox("Original Pancake");
		OriginalPancake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(OriginalPancake.isSelected()) {
					txtOriginalPancake.setEnabled(true);
					txtOriginalPancake.setText("");
					txtOriginalPancake.requestFocus();
				}
				else {
					txtOriginalPancake.setEnabled(false);
					txtOriginalPancake.setText("0");
				}
			}
		});
		OriginalPancake.setBackground(new Color(135, 206, 250));
		OriginalPancake.setFont(new Font("Times New Roman", Font.BOLD, 18));
		OriginalPancake.setBounds(18, 126, 239, 34);
		panel3.add(OriginalPancake);
		
		JCheckBox ButtermilkPancakeMix = new JCheckBox("Buttermilk Pancake Mix");
		ButtermilkPancakeMix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ButtermilkPancakeMix.isSelected()) {
					txtButtermilkPancakeMix.setEnabled(true);
					txtButtermilkPancakeMix.setText("");
					txtButtermilkPancakeMix.requestFocus();
				}
				else {
					txtButtermilkPancakeMix.setEnabled(false);
					txtButtermilkPancakeMix.setText("0");
				}
			}
		});
		ButtermilkPancakeMix.setBackground(new Color(135, 206, 250));
		ButtermilkPancakeMix.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ButtermilkPancakeMix.setBounds(18, 162, 239, 34);
		panel3.add(ButtermilkPancakeMix);
		
		JCheckBox MarbleButterCakeMix = new JCheckBox("Marble Butter Cake Mix");
		MarbleButterCakeMix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MarbleButterCakeMix.isSelected()) {
					txtMarbleButterCakeMix.setEnabled(true);
					txtMarbleButterCakeMix.setText("");
					txtMarbleButterCakeMix.requestFocus();
				}
				else {
					txtMarbleButterCakeMix.setEnabled(false);
					txtMarbleButterCakeMix.setText("0");
				}
			}
		});
		MarbleButterCakeMix.setBackground(new Color(135, 206, 250));
		MarbleButterCakeMix.setFont(new Font("Times New Roman", Font.BOLD, 18));
		MarbleButterCakeMix.setBounds(18, 198, 239, 34);
		panel3.add(MarbleButterCakeMix);
		
		JCheckBox ChickenMushroomPizza = new JCheckBox("Chicken Mushroom Pizza");
		ChickenMushroomPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ChickenMushroomPizza.isSelected()) {
					txtChickenMushroomPizza.setEnabled(true);
					txtChickenMushroomPizza.setText("");
					txtChickenMushroomPizza.requestFocus();
				}
				else {
					txtChickenMushroomPizza.setEnabled(false);
					txtChickenMushroomPizza.setText("0");
				}
			}
		});
		ChickenMushroomPizza.setBackground(new Color(135, 206, 250));
		ChickenMushroomPizza.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ChickenMushroomPizza.setBounds(18, 234, 252, 34);
		panel3.add(ChickenMushroomPizza);
		
		JCheckBox FourCheesePizza = new JCheckBox("Four Cheese Pizza");
		FourCheesePizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(FourCheesePizza.isSelected()) {
					txtFourCheesePizza.setEnabled(true);
					txtFourCheesePizza.setText("");
					txtFourCheesePizza.requestFocus();
				}
				else {
					txtFourCheesePizza.setEnabled(false);
					txtFourCheesePizza.setText("0");
				}
			}
		});
		FourCheesePizza.setBackground(new Color(135, 206, 250));
		FourCheesePizza.setFont(new Font("Times New Roman", Font.BOLD, 18));
		FourCheesePizza.setBounds(18, 270, 252, 34);
		panel3.add(FourCheesePizza);
		
		JCheckBox HawaiianChickenPizza = new JCheckBox("Hawaiian Chicken Pizza");
		HawaiianChickenPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HawaiianChickenPizza.isSelected()) {
					txtHawaiianChickenPizza.setEnabled(true);
					txtHawaiianChickenPizza.setText("");
					txtHawaiianChickenPizza.requestFocus();
				}
				else {
					txtHawaiianChickenPizza.setEnabled(false);
					txtHawaiianChickenPizza.setText("0");
				}
			}
		});
		HawaiianChickenPizza.setBackground(new Color(135, 206, 250));
		HawaiianChickenPizza.setFont(new Font("Times New Roman", Font.BOLD, 18));
		HawaiianChickenPizza.setBounds(18, 306, 252, 34);
		panel3.add(HawaiianChickenPizza);
		
		JCheckBox MushroomChickenSausages = new JCheckBox("Mushroom Chicken Sausages");
		MushroomChickenSausages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MushroomChickenSausages.isSelected()) {
					txtMushroomChickenSausages.setEnabled(true);
					txtMushroomChickenSausages.setText("");
					txtMushroomChickenSausages.requestFocus();
				}
				else {
					txtMushroomChickenSausages.setEnabled(false);
					txtMushroomChickenSausages.setText("0");
				}
			}
		});
		MushroomChickenSausages.setBackground(new Color(135, 206, 250));
		MushroomChickenSausages.setFont(new Font("Times New Roman", Font.BOLD, 18));
		MushroomChickenSausages.setBounds(18, 342, 281, 34);
		panel3.add(MushroomChickenSausages);
		
		JCheckBox BlackPepperChickenSausages = new JCheckBox("Black Pepper Chicken Sausages");
		BlackPepperChickenSausages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BlackPepperChickenSausages.isSelected()) {
					txtBlackPepperChickenSausages.setEnabled(true);
					txtBlackPepperChickenSausages.setText("");
					txtBlackPepperChickenSausages.requestFocus();
				}
				else {
					txtBlackPepperChickenSausages.setEnabled(false);
					txtBlackPepperChickenSausages.setText("0");
				}
			}
		});
		BlackPepperChickenSausages.setBackground(new Color(135, 206, 250));
		BlackPepperChickenSausages.setFont(new Font("Times New Roman", Font.BOLD, 18));
		BlackPepperChickenSausages.setBounds(18, 378, 281, 34);
		panel3.add(BlackPepperChickenSausages);
		
		txtIceCreamVanilla = new JTextField();
		txtIceCreamVanilla.setEnabled(false);
		txtIceCreamVanilla.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtIceCreamVanilla.setHorizontalAlignment(SwingConstants.CENTER);
		txtIceCreamVanilla.setText("0");
		txtIceCreamVanilla.setColumns(10);
		txtIceCreamVanilla.setBounds(386, 18, 89, 33);
		panel3.add(txtIceCreamVanilla);
		
		txtIceCreamChocolate = new JTextField();
		txtIceCreamChocolate.setEnabled(false);
		txtIceCreamChocolate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtIceCreamChocolate.setHorizontalAlignment(SwingConstants.CENTER);
		txtIceCreamChocolate.setText("0");
		txtIceCreamChocolate.setColumns(10);
		txtIceCreamChocolate.setBounds(386, 54, 89, 33);
		panel3.add(txtIceCreamChocolate);
		
		txtIceCreamNeapolitan = new JTextField();
		txtIceCreamNeapolitan.setEnabled(false);
		txtIceCreamNeapolitan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtIceCreamNeapolitan.setHorizontalAlignment(SwingConstants.CENTER);
		txtIceCreamNeapolitan.setText("0");
		txtIceCreamNeapolitan.setColumns(10);
		txtIceCreamNeapolitan.setBounds(386, 90, 89, 33);
		panel3.add(txtIceCreamNeapolitan);
		
		txtOriginalPancake = new JTextField();
		txtOriginalPancake.setEnabled(false);
		txtOriginalPancake.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtOriginalPancake.setHorizontalAlignment(SwingConstants.CENTER);
		txtOriginalPancake.setText("0");
		txtOriginalPancake.setColumns(10);
		txtOriginalPancake.setBounds(386, 126, 89, 33);
		panel3.add(txtOriginalPancake);
		
		txtButtermilkPancakeMix = new JTextField();
		txtButtermilkPancakeMix.setEnabled(false);
		txtButtermilkPancakeMix.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtButtermilkPancakeMix.setHorizontalAlignment(SwingConstants.CENTER);
		txtButtermilkPancakeMix.setText("0");
		txtButtermilkPancakeMix.setColumns(10);
		txtButtermilkPancakeMix.setBounds(386, 162, 89, 33);
		panel3.add(txtButtermilkPancakeMix);
		
		txtMarbleButterCakeMix = new JTextField();
		txtMarbleButterCakeMix.setEnabled(false);
		txtMarbleButterCakeMix.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtMarbleButterCakeMix.setHorizontalAlignment(SwingConstants.CENTER);
		txtMarbleButterCakeMix.setText("0");
		txtMarbleButterCakeMix.setColumns(10);
		txtMarbleButterCakeMix.setBounds(386, 198, 89, 33);
		panel3.add(txtMarbleButterCakeMix);
		
		txtChickenMushroomPizza = new JTextField();
		txtChickenMushroomPizza.setEnabled(false);
		txtChickenMushroomPizza.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtChickenMushroomPizza.setHorizontalAlignment(SwingConstants.CENTER);
		txtChickenMushroomPizza.setText("0");
		txtChickenMushroomPizza.setColumns(10);
		txtChickenMushroomPizza.setBounds(386, 234, 89, 33);
		panel3.add(txtChickenMushroomPizza);
		
		txtFourCheesePizza = new JTextField();
		txtFourCheesePizza.setEnabled(false);
		txtFourCheesePizza.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFourCheesePizza.setHorizontalAlignment(SwingConstants.CENTER);
		txtFourCheesePizza.setText("0");
		txtFourCheesePizza.setColumns(10);
		txtFourCheesePizza.setBounds(386, 270, 89, 33);
		panel3.add(txtFourCheesePizza);
		
		txtHawaiianChickenPizza = new JTextField();
		txtHawaiianChickenPizza.setEnabled(false);
		txtHawaiianChickenPizza.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtHawaiianChickenPizza.setHorizontalAlignment(SwingConstants.CENTER);
		txtHawaiianChickenPizza.setText("0");
		txtHawaiianChickenPizza.setColumns(10);
		txtHawaiianChickenPizza.setBounds(386, 306, 89, 33);
		panel3.add(txtHawaiianChickenPizza);
		
		txtMushroomChickenSausages = new JTextField();
		txtMushroomChickenSausages.setEnabled(false);
		txtMushroomChickenSausages.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtMushroomChickenSausages.setHorizontalAlignment(SwingConstants.CENTER);
		txtMushroomChickenSausages.setText("0");
		txtMushroomChickenSausages.setColumns(10);
		txtMushroomChickenSausages.setBounds(386, 342, 89, 33);
		panel3.add(txtMushroomChickenSausages);
		
		txtBlackPepperChickenSausages = new JTextField();
		txtBlackPepperChickenSausages.setEnabled(false);
		txtBlackPepperChickenSausages.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtBlackPepperChickenSausages.setHorizontalAlignment(SwingConstants.CENTER);
		txtBlackPepperChickenSausages.setText("0");
		txtBlackPepperChickenSausages.setColumns(10);
		txtBlackPepperChickenSausages.setBounds(386, 378, 89, 33);
		panel3.add(txtBlackPepperChickenSausages); 
		
//Jlabel Cost for Customer	
		JLabel SubtotalLabel = new JLabel("Subtotal");
		SubtotalLabel.setBounds(21, 16, 114, 33);
		panel5.add(SubtotalLabel);
		SubtotalLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel DiscountLabel = new JLabel("Discount");
		DiscountLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		DiscountLabel.setBounds(21, 59, 114, 33);
		panel5.add(DiscountLabel);
		
		JLabel TaxLabel = new JLabel("Tax");
		TaxLabel.setBounds(21, 96, 114, 33);
		panel5.add(TaxLabel);
		TaxLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel Total = new JLabel("Total");
		Total.setBounds(21, 139, 114, 33);
		panel5.add(Total);
		Total.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		SubtotaltextField = new JTextField();
		SubtotaltextField.setBounds(161, 13, 178, 33);
		panel5.add(SubtotaltextField);
		SubtotaltextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		SubtotaltextField.setColumns(10);
		
		DiscounttextField = new JTextField();
		DiscounttextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DiscounttextField.setColumns(10);
		DiscounttextField.setBounds(161, 53, 178, 33);
		panel5.add(DiscounttextField);
		
		TaxtextField = new JTextField();
		TaxtextField.setBounds(161, 93, 178, 33);
		panel5.add(TaxtextField);
		TaxtextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		TaxtextField.setColumns(10);
		
		TotaltextField = new JTextField();
		TotaltextField.setBounds(161, 136, 178, 33);
		panel5.add(TotaltextField);
		TotaltextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		TotaltextField.setColumns(10);
		
//Jlabel Payment		
		JLabel Payment = new JLabel("Payment");
		Payment.setHorizontalAlignment(SwingConstants.CENTER);
		Payment.setFont(new Font("Serif", Font.BOLD, 25));
		Payment.setBounds(162, 10, 104, 33);
		panel6.add(Payment);
		
		JLabel PaymentAmmount = new JLabel("Payment Ammount");
		PaymentAmmount.setBounds(20, 77, 169, 33);
		panel6.add(PaymentAmmount);
		PaymentAmmount.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel Balance = new JLabel("Balance");
		Balance.setBounds(20, 120, 155, 33);
		panel6.add(Balance);
		Balance.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		PaymenttextField = new JTextField();
		PaymenttextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		PaymenttextField.setColumns(10);
		PaymenttextField.setBounds(250, 74, 155, 33);
		panel6.add(PaymenttextField);
		
		BalancetextField = new JTextField();
		BalancetextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		BalancetextField.setColumns(10);
		BalancetextField.setBounds(250, 117, 155, 33);
		panel6.add(BalancetextField);
		
//Receipt		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setBounds(10, 10, 402, 551);
		panel4.add(txtReceipt);
		
//Reset Button		
				JButton ResetButton = new JButton("Reset");
				ResetButton.setBounds(186, 179, 114, 35);
				panel5.add(ResetButton);
				ResetButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							CustomerNametextField.setText("");
							PhonetextField.setText("");
							AdresstextField.setText("");
							EmailtextField.setText("");
							Gender.setSelectedItem("Make a Selection");			
									
							txtIceCreamVanilla.setEnabled(false);
							txtIceCreamChocolate.setEnabled(false);
							txtIceCreamNeapolitan.setEnabled(false);
							txtOriginalPancake.setEnabled(false);
							txtButtermilkPancakeMix.setEnabled(false);
							txtMarbleButterCakeMix.setEnabled(false);
							txtChickenMushroomPizza.setEnabled(false);
							txtFourCheesePizza.setEnabled(false);
							txtHawaiianChickenPizza.setEnabled(false);
							txtMushroomChickenSausages.setEnabled(false);
							txtBlackPepperChickenSausages.setEnabled(false);
							
							txtIceCreamVanilla.setText("0");
							txtIceCreamChocolate.setText("0");
							txtIceCreamNeapolitan.setText("0");
							txtOriginalPancake.setText("0");
							txtButtermilkPancakeMix.setText("0");
							txtMarbleButterCakeMix.setText("0");
							txtChickenMushroomPizza.setText("0");
							txtFourCheesePizza.setText("0");
							txtHawaiianChickenPizza.setText("0");
							txtMushroomChickenSausages.setText("0");
							txtBlackPepperChickenSausages.setText("0");
									
							IceCreamVanilla.setSelected(false);
							IceCreamChocolate.setSelected(false);
							IceCreamNeapolitan.setSelected(false);
							OriginalPancake.setSelected(false);
							ButtermilkPancakeMix.setSelected(false);
							MarbleButterCakeMix.setSelected(false);
							ChickenMushroomPizza.setSelected(false);
							FourCheesePizza.setSelected(false);
							HawaiianChickenPizza.setSelected(false);
							MushroomChickenSausages.setSelected(false);
							BlackPepperChickenSausages.setSelected(false);
						
							SubtotaltextField.setText("");
							DiscounttextField.setText("");
							TaxtextField.setText("");
							TotaltextField.setText("");	
							PaymenttextField.setText("");
							BalancetextField.setText("");
						}
					});
				ResetButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
					
//Total Button		
				
				JButton TotalButton = new JButton("Total");
				TotalButton.setBounds(48, 180, 114, 33);
				panel5.add(TotalButton);
				TotalButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
			//	DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
			//	for(int i = 0; i < model.getRowCount();i++) {
						double dis1 = Double.parseDouble(AdvertisementCustomer.d1)/100;
						double dis2 = Double.parseDouble(AdvertisementCustomer.d2)/100;
						itemcost [0] = Double.parseDouble(txtIceCreamVanilla.getText())* Double.parseDouble(p1);
						itemcost [1] = Double.parseDouble(txtIceCreamChocolate.getText())* Double.parseDouble(p2);
						itemcost [2] = Double.parseDouble(txtIceCreamNeapolitan.getText())* Double.parseDouble(p3);
						itemcost [3] = Double.parseDouble(txtOriginalPancake.getText())* Double.parseDouble(p4);
						itemcost [4] = Double.parseDouble(txtButtermilkPancakeMix.getText())* Double.parseDouble(p5);
						itemcost [5] = Double.parseDouble(txtMarbleButterCakeMix.getText())* Double.parseDouble(p6);
						itemcost [6] = Double.parseDouble(txtChickenMushroomPizza.getText())* Double.parseDouble(p7);
						itemcost [7] = Double.parseDouble(txtFourCheesePizza.getText())* Double.parseDouble(p8);
						itemcost [8] = Double.parseDouble(txtHawaiianChickenPizza.getText())* Double.parseDouble(p9);
						itemcost [9] = Double.parseDouble(txtMushroomChickenSausages.getText())* Double.parseDouble(p10);
						itemcost [10] = Double.parseDouble(txtBlackPepperChickenSausages.getText())* Double.parseDouble(p11);
							
						itemcost [11] = itemcost [0] + itemcost [1] + itemcost [2] + itemcost [3] + itemcost [4];
						itemcost [12] = itemcost [5] + itemcost [6] + itemcost [7] + itemcost [8] + itemcost [9] + itemcost [10];
									
						itemcost [13] = itemcost [11] + itemcost [12];
						if(itemcost [13] <= 100) {
							iSubtotal = String.format("RM %.2f", itemcost [13]);
							iTax = String.format("RM %.2f", itemcost [13]/100);
							iDiscount = String.format("RM %.2f", itemcost [13]*(0));
							iTotal = String.format("RM %.2f", (itemcost [13] + (itemcost [13]/100)));
						}
						else if(itemcost [13] > 100 && itemcost [13]<= 250) {
							iSubtotal = String.format("RM %.2f", itemcost [13]);
							iTax = String.format("RM %.2f", itemcost [13]/100);
							iDiscount = String.format("RM %.2f", itemcost [13] * dis1);//(0.03)
							iTotal = String.format("RM %.2f", (itemcost [13] -(itemcost [13] *dis1))+itemcost [13]/100);
						}
						else {
							iSubtotal = String.format("RM %.2f", itemcost [13]);
							iTax = String.format("RM %.2f", itemcost [13]/100);
							iDiscount = String.format("RM %.2f", itemcost [13] * dis2);//0.05
							iTotal = String.format("RM %.2f", (itemcost [13] -(itemcost [13] *dis2))+itemcost [13]/100);
						}					
						SubtotaltextField.setText(iSubtotal);
						DiscounttextField.setText(iDiscount);
						TaxtextField.setText(iTax);
						TotaltextField.setText(iTotal);	
				}
			});
				TotalButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
				
					
//Payment button
					JButton PaymentButton = new JButton("Payment");
					PaymentButton.setBounds(77, 169, 126, 33);
					panel6.add(PaymentButton);
					PaymentButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								AdvertisementCustomer frame = new AdvertisementCustomer(d1,d2);
								double dis1 = Double.parseDouble(AdvertisementCustomer.d1)/100;
								double dis2 = Double.parseDouble(AdvertisementCustomer.d2)/100;
								payment = Double.parseDouble(PaymenttextField.getText());
								if(itemcost [13] <= 100) {
									iSubtotal = String.format("RM %.2f", itemcost [13]);
									iTax = String.format("RM %.2f", itemcost [13]/100);
									iDiscount = String.format("RM %.2f", itemcost [13]*(0));
									iTotal = String.format("RM %.2f", (itemcost [13] + (itemcost [13]/100)));
									balance = String.format("RM %.2f", (payment -(itemcost [13] + (itemcost [13]/100))));
								}
								else if(itemcost [13] > 100 && itemcost [13]<= 250) {
									iSubtotal = String.format("RM %.2f", itemcost [13]);
									iTax = String.format("RM %.2f", itemcost [13]/100);
									iDiscount = String.format("RM %.2f", itemcost [13]* dis1);//(0.03)
									iTotal = String.format("RM %.2f", (itemcost [13] *(itemcost [13] *dis1))+itemcost [13]/100);
									balance = String.format("RM %.2f", (payment -(itemcost [13] -(itemcost [13] *dis1)+itemcost [13]/100)));
								}
								else {
									iSubtotal = String.format("RM %.2f", itemcost [13]);
									iTax = String.format("RM %.2f", itemcost [13]/100);
									iDiscount = String.format("RM %.2f", itemcost [13]* 0.05);//(0.05)
									iTotal = String.format("RM %.2f", (itemcost [13] *(itemcost [13] *dis2))+itemcost [13]/100);
									balance = String.format("RM %.2f", (payment -(itemcost [13] -(itemcost [13] *dis2)+itemcost [13]/100)));
								}	
								BalancetextField.setText(balance);
							}catch(Exception e1) {
							JOptionPane.showMessageDialog(null, "Please enter payment ammount!");
							}
						}
					});
					PaymentButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
					

//Receipt Button			
				JButton Receipt = new JButton("Receipt");
				Receipt.setBounds(224, 169, 114, 33);
				panel6.add(Receipt);
				Receipt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//================================================================
				txtReceipt.setEnabled(true);
				//================================================================
								txtReceipt.append("\t\t Receipt\n" + 
								"============================================================\t"+
								"\n============================================================\t" + 
								"\nCustomer Name      " + CustomerNametextField.getText() +
								"\nPhone Number       " + PhonetextField.getText() +
								"\nAddress            " + AdresstextField.getText() +
								"\n============================================================\t" +
								"\n\t\tItem List" +
								"\n============================================================\t" +
								"\nIce Cream Vanilla            \t\tRM" +p1+ " \t"+ txtIceCreamVanilla.getText()+
								"\nIce Cream Chocolate          \t\tRM" +p2+ " \t"+txtIceCreamChocolate.getText()+ 
								"\nIce Cream Neapolitan         \t\tRM" +p3+ " \t"+txtIceCreamNeapolitan.getText()+
								"\nOriginal Pancake             \t\tRM" +p4+ " \t"+txtOriginalPancake.getText()+
								"\nButtermilkPancakeMix         \t\tRM" +p5+ " \t"+txtButtermilkPancakeMix.getText()+
								"\nMarbleButterCakeMix          \t\tRM" +p6+ " \t"+txtMarbleButterCakeMix.getText()+
								"\nChickenMushroomPizza         \t\tRM" +p7+ " \t"+txtChickenMushroomPizza.getText()+
								"\nFourCheesePizza              \t\tRM" +p8+ " \t"+txtFourCheesePizza.getText()+
								"\nHawaiianChickenPizza         \t\tRM" +p9+ " \t"+txtHawaiianChickenPizza.getText()+
								"\nMushroomChickenSausages      \tRM" +p10+ " \t"+txtMushroomChickenSausages.getText()+
								"\nBlackPepperChickenSausages   \tRM" +p11+ " \t"+txtBlackPepperChickenSausages.getText()+
										
								"\n============================================================\t" +
								"\nSubtotal:              \t\t\t" + iSubtotal +
								"\n(-)Discount:           \t\t\t" + iDiscount +
								"\n(+)Service Tax:        \t\t\t" + iTax +
								"\n____________________________________________________________\t" +
								"\nTotal:               \t\t\t\t" + iTotal +
								"\n============================================================\t" +
								"\nPayment:            \t\t\tRM " + payment +
								"\nBalance:               \t\t\t" + balance +
								"\n============================================================\t" +
								"\n\n\t Thank you for Shpping at YBK Grocey Store " );
									}
								});
								Receipt.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
										
//Print Button		
					JButton PrintButton = new JButton("Print");
					PrintButton.setBounds(147, 21, 114, 43);
					panel7.add(PrintButton);
					PrintButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								txtReceipt.print();
							} catch (java.awt.print.PrinterException e1) {
										System.err.format("No printer found", e1.getMessage());
							}
						}
					});
					PrintButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
					
//Upload Button	
					JButton UploadButton = new JButton("Upload");
					UploadButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								File file = new File("C:\\Users\\LEGION\\OneDrive\\Desktop\\Assignment 3\\Customer\\CustomerReceipt.txt");
								if(!file.exists()) {
									file.createNewFile();
									}
								FileWriter fw = new FileWriter(file.getAbsoluteFile());
								BufferedWriter bw = new BufferedWriter(fw);
								
									bw.write(txtReceipt.getText());
									bw.close();
									fw.close();
									JOptionPane.showMessageDialog(null, "Data Exported");
								}
								catch(Exception ex) {
									ex.printStackTrace();
						}
						}
					});
					UploadButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
					UploadButton.setBounds(271, 21, 114, 43);
					panel7.add(UploadButton);
					
//Clear Button
					JButton Clear = new JButton("Clear");
					Clear.setBounds(23, 21, 114, 43);
					panel7.add(Clear);
					Clear.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							txtReceipt.setText("");
						}
					});
					Clear.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
					
//Back Button			
						JButton BackButton = new JButton("Back");
						BackButton.setBackground(new Color(135, 206, 235));
						BackButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Back1.png"));
						BackButton.setBounds(1126, 0, 128, 40);
						panel1.add(BackButton);
						BackButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								ProductCustomer frame = new ProductCustomer(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
								frame.setVisible(true);
								dispose();
							}
						});
						BackButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 18));
				
	}
}
