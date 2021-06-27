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
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




import javax.swing.JTextField;

public class Product extends JFrame{

	private JPanel contentPane;
	static JFrame Register;
	static JTable tableProduct,tableProductC;
	public static String salary,purchase,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,d1,d2;
	static JTable table;
	private JTextField txtItemPrice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product frame = new Product();
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
	public Product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1068, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//JPANEL	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1052, 638);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(224, 255, 255));
		panel1.setBounds(39, 50, 974, 539);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(173, 216, 230)));
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(41, 73, 902, 230);
		panel1.add(panel2);
		
		JPanel panel1_2 = new JPanel();
		panel1_2.setBounds(406, 10, 172, 50);
		panel1.add(panel1_2);
		panel1_2.setBackground(new Color(224, 255, 255));
		panel1_2.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(173, 216, 230)));
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(41, 313, 902, 173);
		panel1.add(panel3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 882, 207);
		panel2.add(scrollPane);
		
		tableProduct = new JTable();
		tableProduct.setColumnSelectionAllowed(true);
		tableProduct.setFont(new Font("Times New Roman", Font.BOLD, 16));
		tableProduct.setModel(new DefaultTableModel(
			new Object[][] {
				{"FF-864", "Ice Cream Vanilla", "8"},
				{"FF-865", "Ice Cream Chocolate", "8"},
				{"FF-864", "Ice Cream Neapolitan", "8"},
				{"FF-874", "Original Pancake", "9"},
				{"FF-875", "Buttermilk Pancake Mix", "9"},
				{"FF-876", "Marble Butter Cake Mix", "9"},
				{"FF-884", "Chicken Mushroom Pizza", "10"},
				{"FF-885", "Four Cheese Pizza", "10"},
				{"FF-886", "Hawaiian Chicken Pizza", "10"},
				{"FF-894", "Mushroom Chicken Sausages", "11"},
				{"FF-895", "Black Pepper Chicken Sausages", "11"},
			},
			new String[] {
				"Item Code", "Item Name", "Item Price(RM)"
			}
		));
		scrollPane.setViewportView(tableProduct);
		
		JLabel YBKGroceryStoreLabel = new JLabel("YBK Grocery Store");
		YBKGroceryStoreLabel.setForeground(new Color(255, 255, 255));
		YBKGroceryStoreLabel.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 25));
		YBKGroceryStoreLabel.setBounds(425, 10, 226, 30);
		panel.add(YBKGroceryStoreLabel);
		
		JLabel ProductLabel = new JLabel("Product");
		panel1_2.add(ProductLabel);
		ProductLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\PB\\P2.png"));
		ProductLabel.setForeground(new Color(0, 0, 128));
		ProductLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		
		JLabel ItemPriceLabel = new JLabel("ItemPrice");
		ItemPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ItemPriceLabel.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
		ItemPriceLabel.setBounds(52, 49, 116, 31);
		panel3.add(ItemPriceLabel);
		
		txtItemPrice = new JTextField();
		txtItemPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtItemPrice.setColumns(10);
		txtItemPrice.setBounds(32, 102, 152, 31);
		panel3.add(txtItemPrice);
		
//Edit button
			JButton EditButton = new JButton("EDIT");
			EditButton.setBounds(241, 26, 159, 50);
			panel3.add(EditButton);
			EditButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableProduct.getModel();
				int i = tableProduct.getSelectedRow();
				int j = tableProduct.getSelectedColumn();
			if(i>=0&&j>=0) //if single row is selected than update
					{
					model.setValueAt(txtItemPrice.getText(),i,j);
					JOptionPane.showMessageDialog(null, "Edit Successfully");
					}
			else 
			 {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			}	
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
					ProductCustomer frame1 = new ProductCustomer(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
					CustomerOrder frame = new CustomerOrder(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
			        }
				}
			});
			EditButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Edit1.png"));
			EditButton.setForeground(Color.BLACK);
			EditButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
			EditButton.setBackground(UIManager.getColor("Button.background"));
			
//Delete button
			JButton DeleteButton = new JButton("DELETE");
			DeleteButton.setBounds(241, 103, 159, 50);
			panel3.add(DeleteButton);
			DeleteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)tableProduct.getModel();
					if(tableProduct.getSelectedRow()==-1) {
					if(tableProduct.getRowCount()==0) {
					JOptionPane.showMessageDialog(null,"No data to delete","Product Management System", JOptionPane.OK_OPTION);
					}else {
					JOptionPane.showMessageDialog(null,"Select a row to delete","Product Management System", JOptionPane.OK_OPTION);
														}
					}else {
						model.removeRow(tableProduct.getSelectedRow());
					}
					}
					});
			DeleteButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Delete1.jpg"));
			DeleteButton.setForeground(Color.BLACK);
			DeleteButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
			DeleteButton.setBackground(UIManager.getColor("Button.background"));
			
			
			
//Print button	
			JButton PrintButton = new JButton("PRINT");
			PrintButton.setBounds(464, 27, 152, 50);
			panel3.add(PrintButton);
			PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				tableProduct.print();
			} catch (java.awt.print.PrinterException e1) {
				System.err.format("No printer found", e1.getMessage());
			}
			}
			});
			PrintButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Print1.png"));
			PrintButton.setForeground(Color.BLACK);
			PrintButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
			PrintButton.setBackground(UIManager.getColor("Button.background"));
			
			
//Upload button
			JButton UploadButton = new JButton("UPLOAD");
			UploadButton.setBounds(464, 104, 152, 50);
			panel3.add(UploadButton);
			UploadButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						File file = new File("C:\\Users\\LEGION\\OneDrive\\Desktop\\Assignment 3\\Product\\ProductData.txt");
						if(!file.exists()) {
							file.createNewFile();
							}
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						
						for (int i=0; i<tableProduct.getRowCount(); i++) {
							for (int j=0; j<tableProduct.getColumnCount(); j++) {
								bw.write(tableProduct.getModel().getValueAt(i, j) + "  ");
								}
							bw.write("\n____________________________________________________________________\n");
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
			
			//Product Order Button
							JButton ProductButton = new JButton("Product/Order");
							ProductButton.setBounds(698, 61, 174, 50);
							panel3.add(ProductButton);
							ProductButton.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									//CustomerOrder frame = new CustomerOrder(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
									ProductCustomer frame = new ProductCustomer(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
										frame.setModalExclusionType(null);
										frame.setVisible(true);	
										dispose();
								}
							});
							ProductButton.setForeground(Color.BLACK);
							ProductButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
							ProductButton.setBackground(SystemColor.menu);
		
//Back Button	
		JButton BackButton = new JButton("Back");
		BackButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Back1.png"));
		BackButton.setBounds(855, 0, 119, 36);
		panel1.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage frame = new AdminPage(salary,purchase);
				frame.setVisible(true);
				dispose();
			}
		});
		BackButton.setForeground(new Color(0, 0, 0));
		BackButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 18));
		BackButton.setBackground(new Color(224, 255, 255));
				
				

	}
}
