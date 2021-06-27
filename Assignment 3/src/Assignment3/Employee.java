package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtEmployeeName;
	private JTextField txtEmployeeID;
	private JTextField txtSalary;
	private JTextField txtPhone;
	private JTextField txtAddress;
	private JTable tableEmployee;
	private JTextField txtTotalSalary;
	protected static String salary,purchase;
	static double totalSalary;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
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
		panel1.setBounds(47, 63, 910, 655);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBackground(new Color(255, 255, 255));
		panel2_1.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		panel2_1.setBounds(189, 10, 144, 50);
		panel1.add(panel2_1);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel2_2.setBackground(Color.WHITE);
		panel2_2.setBounds(378, 10, 144, 50);
		panel1.add(panel2_2);
		
		JPanel panel2_3 = new JPanel();
		panel2_3.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel2_3.setBackground(Color.WHITE);
		panel2_3.setBounds(558, 10, 144, 50);
		panel1.add(panel2_3);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 255, 255));
		panel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(112, 128, 144)));
		panel3.setBounds(31, 327, 850, 212);
		panel1.add(panel3);
		panel3.setLayout(null);
		
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

//Employee Info
		JLabel EmployeeNameLabel = new JLabel("Employee Name");
		EmployeeNameLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		EmployeeNameLabel.setBounds(68, 96, 156, 33);
		panel1.add(EmployeeNameLabel);
		
		JLabel EmployeeIdLabel = new JLabel("Employee ID");
		EmployeeIdLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		EmployeeIdLabel.setBounds(503, 96, 118, 33);
		panel1.add(EmployeeIdLabel);
		
		JLabel PhoneLabel = new JLabel("Phone");
		PhoneLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		PhoneLabel.setBounds(68, 149, 118, 33);
		panel1.add(PhoneLabel);
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		AddressLabel.setBounds(503, 149, 118, 33);
		panel1.add(AddressLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		GenderLabel.setBounds(68, 206, 118, 33);
		panel1.add(GenderLabel);
		
		JLabel PositionLabel = new JLabel("Position");
		PositionLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		PositionLabel.setBounds(68, 264, 118, 33);
		panel1.add(PositionLabel);
		
		JComboBox Gender = new JComboBox();
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Male", "Female"}));
		Gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Gender.setBounds(252, 207, 175, 33);
		panel1.add(Gender);
		
		JComboBox Position = new JComboBox();
		Position.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Manager", "Cashier", "Stock Controller", "Sales Promoter ", "Security Guard", "Cleaner"}));
		Position.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Position.setBounds(252, 265, 175, 33);
		panel1.add(Position);
		
		JLabel SalaryLabel = new JLabel("Salary");
		SalaryLabel.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		SalaryLabel.setBounds(503, 206, 118, 33);
		panel1.add(SalaryLabel);
		
		txtEmployeeName = new JTextField();
		txtEmployeeName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEmployeeName.setBounds(252, 99, 175, 33);
		panel1.add(txtEmployeeName);
		txtEmployeeName.setColumns(10);
		
		txtEmployeeID = new JTextField();
		txtEmployeeID.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtEmployeeID.setColumns(10);
		txtEmployeeID.setBounds(634, 98, 175, 33);
		panel1.add(txtEmployeeID);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPhone.setColumns(10);
		txtPhone.setBounds(252, 151, 175, 33);
		panel1.add(txtPhone);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtAddress.setColumns(10);
		txtAddress.setBounds(634, 151, 175, 33);
		panel1.add(txtAddress);
		
		txtSalary = new JTextField();
		txtSalary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSalary.setColumns(10);
		txtSalary.setBounds(634, 209, 175, 33);
		panel1.add(txtSalary);
		
		txtTotalSalary = new JTextField();
		txtTotalSalary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTotalSalary.setColumns(10);
		txtTotalSalary.setBounds(677, 264, 132, 33);
		panel1.add(txtTotalSalary);
		
//Table Employee
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 830, 196);
		panel3.add(scrollPane);
		
		tableEmployee = new JTable();
		tableEmployee.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(211, 211, 211)));
		tableEmployee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tableEmployee.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Employee ID", "Phone", "Address", "Gender", "Position", "Salary"
			}
		));
		scrollPane.setViewportView(tableEmployee);

//Add button	
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
				model.addRow(new Object[]{
						txtEmployeeName.getText(),
						txtEmployeeID.getText(),
						txtPhone.getText(),
						txtAddress.getText(),
						Gender.getSelectedItem(),
						Position.getSelectedItem(),
						txtSalary.getText(),
				});
				
				if (tableEmployee.getSelectedRow() == -1) {
					if (tableEmployee.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
		});
		AddButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Save1.png"));
		AddButton.setBounds(31, 568, 118, 33);
		panel1.add(AddButton);
		AddButton.setForeground(new Color(0, 0, 0));
		AddButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		AddButton.setBackground(UIManager.getColor("Button.background"));

//Edit button
		JButton EditButton = new JButton("EDIT");
		EditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableEmployee.getModel();
				int i = tableEmployee.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(txtEmployeeName.getText(),i,0);
			    	model.setValueAt(txtEmployeeID.getText(),i,1);
			    	model.setValueAt(txtPhone.getText(),i,2);
			    	model.setValueAt(txtAddress.getText(),i,3);
			    	model.setValueAt(Gender.getSelectedItem(),i,4);
			    	model.setValueAt(Position.getSelectedItem(),i,5);
			    	model.setValueAt(txtSalary.getText(),i,6);
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
		EditButton.setBounds(172, 568, 118, 33);
		panel1.add(EditButton);

		
//Reset button
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmployeeName.setText("");
				txtEmployeeID.setText("");
				txtPhone.setText("");
				txtAddress.setText("");
				Gender.setSelectedItem("Make a Selection");
				Position.setSelectedItem("Make a Selection");
				txtSalary.setText("");
				txtTotalSalary.setText("");
			}
		});
		ResetButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Reset1.png"));
		ResetButton.setForeground(Color.BLACK);
		ResetButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		ResetButton.setBackground(UIManager.getColor("Button.background"));
		ResetButton.setBounds(317, 568, 118, 33);
		panel1.add(ResetButton);

//Delete button
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableEmployee.getModel();
				if(tableEmployee.getSelectedRow()==-1) {
					if(tableEmployee.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableEmployee.getSelectedRow());
				}
			}
		});
		DeleteButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Delete1.jpg"));
		DeleteButton.setForeground(Color.BLACK);
		DeleteButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		DeleteButton.setBackground(UIManager.getColor("Button.background"));
		DeleteButton.setBounds(462, 568, 132, 33);
		panel1.add(DeleteButton);
		
//Print button	
		JButton PrintButton = new JButton("PRINT");
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableEmployee.print();
				} catch (java.awt.print.PrinterException e1) {
							System.err.format("No printer found", e1.getMessage());
				}
			}
		});
				PrintButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Print1.png"));
				PrintButton.setForeground(Color.BLACK);
				PrintButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
				PrintButton.setBackground(UIManager.getColor("Button.background"));
				PrintButton.setBounds(619, 568, 113, 33);
				panel1.add(PrintButton);	
				
				
//Upload button
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\LEGION\\OneDrive\\Desktop\\Assignment 3\\Employee\\EmployeeData.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableEmployee.getRowCount(); i++) {
						for (int j=0; j<tableEmployee.getColumnCount(); j++) {
							bw.write(tableEmployee.getModel().getValueAt(i, j) + "  ");
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
		UploadButton.setBounds(755, 568, 132, 33);
		panel1.add(UploadButton);

//Total Salary Button
		JButton TotalSalaryButton = new JButton("Total Salary");
		TotalSalaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
				for(int i = 0; i < model.getRowCount();i++) {
					String ts = String.valueOf(model.getValueAt(i, 6));
					totalSalary += Double.parseDouble(ts);
				}
				salary = String.valueOf(totalSalary);
				txtTotalSalary.setText(salary);
			}
		});
		TotalSalaryButton.setForeground(Color.BLACK);
		TotalSalaryButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		TotalSalaryButton.setBackground(SystemColor.menu);
		TotalSalaryButton.setBounds(499, 264, 144, 33);
		panel1.add(TotalSalaryButton);
		
//Inventory Button	
		JButton FinanceButton = new JButton("Inventory");
		FinanceButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				salary = txtTotalSalary.getText();
				Inventory frame = new Inventory(salary);
				Finance F = new Finance(salary,purchase);
				F.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();

			}
		});
		FinanceButton.setForeground(Color.BLACK);
		FinanceButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		FinanceButton.setBackground(SystemColor.menu);
		FinanceButton.setBounds(317, 612, 277, 33);
		panel1.add(FinanceButton);
		
//Back button
				JButton btnBack = new JButton("Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						salary = txtTotalSalary.getText();
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
