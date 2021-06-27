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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerReg extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField NametextField;
	private JTextField PhonetextField;
	private JTextField AddresstextField;
	private JTextField EmailtextField;
	private JTextField ICNumbertextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerReg frame = new CustomerReg();
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
	public CustomerReg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1104, 795);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1089, 762);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(135, 206, 235));
		panel1.setBounds(34, 66, 1008, 671);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel1_1 = new JPanel();
		panel1_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel1_1.setBackground(new Color(135, 206, 235));
		panel1_1.setBounds(444, 10, 144, 50);
		panel1.add(panel1_1);

		JPanel panel1_2 = new JPanel();
		panel1_2.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel1_2.setBackground(new Color(135, 206, 235));
		panel1_2.setBounds(632, 10, 144, 50);
		panel1.add(panel1_2);
		
		JPanel panel1_3 = new JPanel();
		panel1_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		panel1_3.setBackground(new Color(135, 206, 235));
		panel1_3.setBounds(245, 10, 144, 50);
		panel1.add(panel1_3);
				
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 205)));
		panel2.setBackground(new Color(135, 206, 250));
		panel2.setBounds(31, 93, 477, 436);
		panel1.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 205)));
		panel3.setBackground(new Color(135, 206, 250));
		panel3.setBounds(541, 93, 443, 436);
		panel1.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(31, 571, 953, 69);
		panel1.add(panel4);
		panel4.setLayout(null);
		panel4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 255, 255)));
		panel4.setBackground(new Color(135, 206, 250));
		
		
//JLabel Top
		JLabel YBKGroceryStoreLabel = new JLabel("YBK Grocery Store");
		YBKGroceryStoreLabel.setForeground(new Color(255, 255, 255));
		YBKGroceryStoreLabel.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 25));
		YBKGroceryStoreLabel.setBounds(442, 10, 253, 44);
		panel.add(YBKGroceryStoreLabel);
				
		JLabel RegisterLabel = new JLabel("Register");
		RegisterLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\PB\\Register2.png"));
		RegisterLabel.setForeground(new Color(0, 0, 128));
		RegisterLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		panel1_3.add(RegisterLabel);
		
		JLabel ProductLabel = new JLabel("Product");
		ProductLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\PB\\P2.png"));
		ProductLabel.setForeground(new Color(0, 0, 128));
		ProductLabel.setFont(new Font("Georgia", Font.BOLD, 19));
		panel1_1.add(ProductLabel);
		
		JLabel OrderLabel = new JLabel("Order");
		panel1_2.add(OrderLabel);
		OrderLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\PB\\B2.png"));
		OrderLabel.setForeground(new Color(0, 0, 128));
		OrderLabel.setFont(new Font("Georgia", Font.BOLD, 19));

//Customer Info	
		JLabel CustomerInfoLabel = new JLabel("CUSTOMER INFO");
		CustomerInfoLabel.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 20));
		CustomerInfoLabel.setBounds(190, 10, 155, 33);
		panel2.add(CustomerInfoLabel);
		
		JLabel CustomerNameLabel = new JLabel("Name");
		CustomerNameLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		CustomerNameLabel.setBounds(46, 69, 114, 33);
		panel2.add(CustomerNameLabel);
		
		JLabel PhoneLabel = new JLabel("Phone");
		PhoneLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		PhoneLabel.setBounds(46, 124, 114, 33);
		panel2.add(PhoneLabel);
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		AddressLabel.setBounds(46, 182, 114, 32);
		panel2.add(AddressLabel);
		
		JLabel EmailLabel = new JLabel("Email");
		EmailLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		EmailLabel.setBounds(46, 245, 114, 26);
		panel2.add(EmailLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		GenderLabel.setBounds(46, 368, 114, 26);
		panel2.add(GenderLabel);
		
		NametextField = new JTextField();
		NametextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		NametextField.setColumns(10);
		NametextField.setBounds(190, 66, 242, 33);
		panel2.add(NametextField);
		
		PhonetextField = new JTextField();
		PhonetextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		PhonetextField.setColumns(10);
		PhonetextField.setBounds(190, 121, 242, 33);
		panel2.add(PhonetextField);
		
		AddresstextField = new JTextField();
		AddresstextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AddresstextField.setColumns(10);
		AddresstextField.setBounds(190, 179, 242, 33);
		panel2.add(AddresstextField);
		
		EmailtextField = new JTextField();
		EmailtextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		EmailtextField.setColumns(10);
		EmailtextField.setBounds(190, 239, 242, 33);
		panel2.add(EmailtextField);
		
		JComboBox Gender = new JComboBox();
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Male", "Female"}));
		Gender.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Gender.setBounds(190, 362, 242, 33);
		panel2.add(Gender);
		
		ICNumbertextField = new JTextField();
		ICNumbertextField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ICNumbertextField.setColumns(10);
		ICNumbertextField.setBounds(190, 302, 242, 33);
		panel2.add(ICNumbertextField);
		
		JLabel ICNumberLabel = new JLabel("IC Number");
		ICNumberLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		ICNumberLabel.setBounds(46, 308, 114, 26);
		panel2.add(ICNumberLabel);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 415, 416);
		panel3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Phone", "Address", "Email", "IC Number", "Gender"
			}
		));
		table.setFont(new Font("Times New Roman", Font.BOLD, 15));
		scrollPane.setViewportView(table);

//Save button	
		JButton SaveButton = new JButton("SAVE");
		SaveButton.setBounds(26, 10, 123, 49);
		panel4.add(SaveButton);
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						NametextField.getText(),
						PhonetextField.getText(),
						AddresstextField.getText(),
						EmailtextField.getText(),
						ICNumbertextField.getText(),
						Gender.getSelectedItem(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer Update confirmed", "Customer Register System",
								JOptionPane.OK_OPTION);
					}
				}
				}
		});
		SaveButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Save1.png"));
		SaveButton.setForeground(new Color(0, 0, 0));
		SaveButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		SaveButton.setBackground(UIManager.getColor("Button.background"));
		
//Edit button
		JButton EditButton = new JButton("EDIT");
		EditButton.setBounds(178, 10, 118, 49);
		panel4.add(EditButton);
		EditButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int i = table.getSelectedRow();
					if(i>=0) //if single row is selected than update
					 {
					model.setValueAt(NametextField.getText(),i,0);
					model.setValueAt(PhonetextField.getText(),i,1);
					model.setValueAt(AddresstextField.getText(),i,2);	
					model.setValueAt(EmailtextField.getText(),i,3);
					model.setValueAt(ICNumbertextField.getText(),i,4);
					model.setValueAt(Gender.getSelectedItem(),i,5);
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
						
										
//Reset button
		JButton ResetButton = new JButton("RESET");
		ResetButton.setBounds(327, 10, 118, 49);
		panel4.add(ResetButton);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NametextField.setText("");
				PhonetextField.setText("");
				AddresstextField.setText("");
				EmailtextField.setText("");
				ICNumbertextField.setText("");
				Gender.setSelectedItem("Make a Selection");
		}
});
		ResetButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Reset1.png"));
		ResetButton.setForeground(Color.BLACK);
		ResetButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		ResetButton.setBackground(UIManager.getColor("Button.background"));
										
//Delete button
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.setBounds(481, 10, 132, 49);
		panel4.add(DeleteButton);
		DeleteButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
				JOptionPane.showMessageDialog(null,"No data to delete","Customer Register System", JOptionPane.OK_OPTION);
					}
					else {
				JOptionPane.showMessageDialog(null,"Select a row to delete","Customer Register System", JOptionPane.OK_OPTION);
					}
				}else 
				{
				model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Delete1.jpg"));
		DeleteButton.setForeground(Color.BLACK);
		DeleteButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		DeleteButton.setBackground(UIManager.getColor("Button.background"));
														
//Print button	
		JButton PrintButton = new JButton("PRINT");
		PrintButton.setBounds(641, 9, 123, 50);
		panel4.add(PrintButton);
		PrintButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							try {
								table.print();
							} catch (java.awt.print.PrinterException e1) {
								System.err.format("No printer found", e1.getMessage());
						}
					}
			});
		PrintButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Print1.png"));
		PrintButton.setForeground(Color.BLACK);
		PrintButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		PrintButton.setBackground(UIManager.getColor("Button.background"));
														
														
//Upload button
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.setBounds(795, 10, 132, 50);
		panel4.add(UploadButton);
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\LEGION\\OneDrive\\Desktop\\Assignment 3\\Customer\\CustomerInfo.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
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
		UploadButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
		UploadButton.setBackground(UIManager.getColor("Button.background"));
				
//Exit button
						JButton Backbtn = new JButton("Back");
						Backbtn.setBounds(893, 0, 115, 29);
						panel1.add(Backbtn);
						Backbtn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CustomerPage frame = new CustomerPage();
								frame.setVisible(true);
								dispose();
							}
						});
						Backbtn.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Back1.png"));
						Backbtn.setForeground(new Color(0, 0, 0));
						Backbtn.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 18));
						Backbtn.setBackground(UIManager.getColor("CheckBox.highlight"));
			}
		}
