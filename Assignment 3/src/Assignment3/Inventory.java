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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField txtItemCode;
	private JTextField txtItemName;
	private JTextField txtItemQuantity;
	private JTextField txtItemPrice;
	private JTable tableInventory;
	private JTextField txtTotalPurchase;
	private JTextField txtSubtotalPurchase;
	private JTextField txtTotalSalaryEmployee;
	private double quantity,price;
	private String SubtotalPurchase;
	protected static String salary,purchase;
	static double totalPurchase;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory(salary);
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
	public Inventory(String Salary) {
		this.salary = Salary;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1011, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 996, 728);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(46, 63, 910, 655);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel2_1.setBackground(Color.WHITE);
		panel2_1.setBounds(189, 10, 144, 50);
		panel1.add(panel2_1);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBackground(new Color(255, 255, 255));
		panel2_2.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		panel2_2.setBounds(378, 10, 144, 50);
		panel1.add(panel2_2);
		
		JPanel panel2_3 = new JPanel();
		panel2_3.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel2_3.setBackground(Color.WHITE);
		panel2_3.setBounds(558, 10, 144, 50);
		panel1.add(panel2_3);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBounds(24, 96, 296, 550);
		panel1.add(panel2);
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(330, 96, 557, 365);
		panel1.add(panel3);
		
		JLabel YBKGroceryStoreLabel = new JLabel("YBK Grocery Store");
		YBKGroceryStoreLabel.setForeground(new Color(255, 255, 255));
		YBKGroceryStoreLabel.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 25));
		YBKGroceryStoreLabel.setBounds(390, 10, 253, 44);
		panel.add(YBKGroceryStoreLabel);
		
		JLabel EmployeeLabel = new JLabel("Employee");
		panel2_1.add(EmployeeLabel);
		EmployeeLabel.setForeground(new Color(0, 0, 128));
		EmployeeLabel.setFont(new Font("Georgia", Font.BOLD, 18));
		EmployeeLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Login\\E1.png"));
		
		JLabel InventoryLabel = new JLabel("Inventory");
		panel2_2.add(InventoryLabel);
		InventoryLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Login\\I1.png"));
		InventoryLabel.setForeground(new Color(0, 0, 128));
		InventoryLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		
		JLabel FinanceLabel = new JLabel("Finance");
		FinanceLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Login\\F1.png"));
		FinanceLabel.setForeground(new Color(0, 0, 128));
		FinanceLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		panel2_3.add(FinanceLabel);
		
//Inventory Info
		JLabel ItemCodeLabel = new JLabel("Item Code");
		ItemCodeLabel.setBounds(27, 24, 88, 26);
		panel2.add(ItemCodeLabel);
		ItemCodeLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel ItemNameLabel = new JLabel("Item Name");
		ItemNameLabel.setBounds(27, 103, 156, 33);
		panel2.add(ItemNameLabel);
		ItemNameLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel ItemQuantityLabel = new JLabel("Item Quantity");
		ItemQuantityLabel.setBounds(27, 189, 144, 33);
		panel2.add(ItemQuantityLabel);
		ItemQuantityLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		JLabel ItemPriceLabel = new JLabel("Item Price");
		ItemPriceLabel.setBounds(27, 292, 144, 33);
		panel2.add(ItemPriceLabel);
		ItemPriceLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		
		txtItemCode = new JTextField();
		txtItemCode.setBounds(27, 60, 218, 33);
		panel2.add(txtItemCode);
		txtItemCode.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtItemCode.setColumns(10);
		
		txtItemName = new JTextField();
		txtItemName.setBounds(27, 146, 218, 33);
		panel2.add(txtItemName);
		txtItemName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtItemName.setColumns(10);
	
		txtItemQuantity = new JTextField();
		txtItemQuantity.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtItemQuantity.setColumns(10);
		txtItemQuantity.setBounds(27, 237, 218, 33);
		panel2.add(txtItemQuantity);
		
		txtItemPrice = new JTextField();
		txtItemPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtItemPrice.setColumns(10);
		txtItemPrice.setBounds(27, 335, 218, 33);
		panel2.add(txtItemPrice);
		
		txtSubtotalPurchase = new JTextField();
		txtSubtotalPurchase.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtSubtotalPurchase.setColumns(10);
		txtSubtotalPurchase.setBounds(27, 421, 218, 33);
		panel2.add(txtSubtotalPurchase);
		
		txtTotalPurchase = new JTextField();
		txtTotalPurchase.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtTotalPurchase.setColumns(10);
		txtTotalPurchase.setBounds(27, 507, 218, 33);
		panel2.add(txtTotalPurchase);
/*	
		txtTotalSalaryEmployee = new JTextField();
		txtTotalSalaryEmployee.setText(salary);
		txtTotalSalaryEmployee.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtTotalSalaryEmployee.setColumns(10);
		txtTotalSalaryEmployee.setBounds(348, 598, 218, 33);
		panel1.add(txtTotalSalaryEmployee);
*/				
//Table		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 537, 342);
		panel3.add(scrollPane);
	
		tableInventory = new JTable();
		tableInventory.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item Code", "Item Name", "Item Quantity", "Item Price", "SubTotal Purchase"
			}
		));
		tableInventory.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tableInventory.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(tableInventory);
		
//Subtotal Purchase button
		JButton SubTotalPurchaseButton = new JButton("SubTotal Purchase");
		SubTotalPurchaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantity = Double.parseDouble(txtItemQuantity.getText());
				price = Double.parseDouble(txtItemPrice.getText());
				SubtotalPurchase = String.format("%.2f",quantity*price);
				
				txtSubtotalPurchase.setText(SubtotalPurchase);
			}
		});
		SubTotalPurchaseButton.setForeground(Color.BLACK);
		SubTotalPurchaseButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		SubTotalPurchaseButton.setBackground(SystemColor.menu);
		SubTotalPurchaseButton.setBounds(43, 378, 185, 33);
		panel2.add(SubTotalPurchaseButton);
		
//Add button	
		JButton ADDButton = new JButton("ADD");
		ADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableInventory.getModel();
				model.addRow(new Object[]{
						txtItemCode.getText(),
						txtItemName.getText(),
						txtItemQuantity.getText(),
						txtItemPrice.getText(),
						txtSubtotalPurchase.getText(),
				});
				
				if (tableInventory.getSelectedRow() == -1) {
					if (tableInventory.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventoty Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
		});
		ADDButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Save1.png"));
		ADDButton.setBounds(365, 486, 132, 33);
		panel1.add(ADDButton);
		ADDButton.setForeground(new Color(0, 0, 0));
		ADDButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		ADDButton.setBackground(UIManager.getColor("Button.background"));

//Edit button
		JButton EditButton = new JButton("EDIT");
		EditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableInventory.getModel();
				int i = tableInventory.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(txtItemCode.getText(),i,0);
			    	model.setValueAt(txtItemName.getText(),i,1);
			    	model.setValueAt(txtItemQuantity.getText(),i,2);
			    	model.setValueAt(txtItemPrice.getText(),i,3);
			    	model.setValueAt(txtSubtotalPurchase.getText(),i,4);
					JOptionPane.showMessageDialog(null, "Edit Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }	
			}
		});
		EditButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Edit1.png"));
		EditButton.setForeground(Color.BLACK);
		EditButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		EditButton.setBackground(UIManager.getColor("Button.background"));
		EditButton.setBounds(559, 486, 132, 33);
		panel1.add(EditButton);

		
//Reset button
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtItemCode.setText("");
				txtItemName.setText("");
				txtItemQuantity.setText("");
				txtItemPrice.setText("");
				txtSubtotalPurchase.setText("");
				txtTotalPurchase.setText("");
			}
		});
		ResetButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Reset1.png"));
		ResetButton.setForeground(Color.BLACK);
		ResetButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		ResetButton.setBackground(UIManager.getColor("Button.background"));
		ResetButton.setBounds(739, 486, 132, 33);
		panel1.add(ResetButton);

//Delete button
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableInventory.getModel();
				if(tableInventory.getSelectedRow()==-1) {
					if(tableInventory.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableInventory.getSelectedRow());
				}
			}
		});
		DeleteButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Delete1.jpg"));
		DeleteButton.setForeground(Color.BLACK);
		DeleteButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		DeleteButton.setBackground(UIManager.getColor("Button.background"));
		DeleteButton.setBounds(365, 544, 132, 33);
		panel1.add(DeleteButton);
		
//Print button	
		JButton PrintButton = new JButton("PRINT");
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableInventory.print();
				} catch (java.awt.print.PrinterException e1) {
							System.err.format("No printer found", e1.getMessage());
				}
			}
		});
				PrintButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Print1.png"));
				PrintButton.setForeground(Color.BLACK);
				PrintButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
				PrintButton.setBackground(UIManager.getColor("Button.background"));
				PrintButton.setBounds(559, 545, 132, 33);
				panel1.add(PrintButton);	
				
				
//Upload button
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\LEGION\\OneDrive\\Desktop\\Assignment 3\\Inventory\\InventoryData.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableInventory.getRowCount(); i++) {
						for (int j=0; j<tableInventory.getColumnCount(); j++) {
							bw.write(tableInventory.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
			}
			}
		});
		UploadButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Upload1.png"));
		UploadButton.setForeground(Color.BLACK);
		UploadButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
		UploadButton.setBackground(UIManager.getColor("Button.background"));
		UploadButton.setBounds(739, 545, 132, 33);
		panel1.add(UploadButton);
		
//Total Purchase button		
		JButton TotalPurchaseButton = new JButton("Total Purchase");
		TotalPurchaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableInventory.getModel();
				for(int i = 0; i < model.getRowCount();i++) {
					String tp = String.valueOf(model.getValueAt(i, 4));
					totalPurchase += Double.parseDouble(tp);
			}
				purchase = String.valueOf(totalPurchase);
				txtTotalPurchase.setText(purchase);
			}
			});
			TotalPurchaseButton.setForeground(Color.BLACK);
			TotalPurchaseButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
			TotalPurchaseButton.setBackground(SystemColor.menu);
			TotalPurchaseButton.setBounds(60, 464, 168, 33);
			panel2.add(TotalPurchaseButton);
			
//Finance Button
		JButton FinanceButton = new JButton("Finance");
		FinanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				purchase = txtTotalPurchase.getText();
				Finance F = new Finance(salary,purchase);
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		FinanceButton.setForeground(Color.BLACK);
		FinanceButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		FinanceButton.setBackground(SystemColor.menu);
		FinanceButton.setBounds(641, 597, 230, 33);
		panel1.add(FinanceButton);

//Back button
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				AdminPage frame = new AdminPage(salary,purchase);
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Back1.png"));
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 18));
		btnBack.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnBack.setBounds(797, 0, 113, 29);
		panel1.add(btnBack);

				
	}
}
