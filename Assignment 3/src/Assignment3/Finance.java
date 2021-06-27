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
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotalIncome;
	JTextField txtTotalSalaryEmployee;
	private JTextField txtTPPI;
	private JTextField txtIncidentalCharges;
	private JTextField txtTotalProfit;
	private double totalIncome,totalSalaryEmployee,TPPI,IncidentalCharges; 
	private String totalProfit;
	private JTextArea txtReportFinance;
	private JTextField txtDate;
	static String salary,purchase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance(salary,purchase);
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
	public Finance(String Salary, String Inventory) {
		this.salary = Salary;
		this.purchase = Inventory;
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
		panel1.setBounds(48, 63, 910, 655);
		panel.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(323, 75, 553, 322);
		panel1.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		panel2.setBounds(24, 75, 277, 570);
		panel1.add(panel2);
		panel2.setLayout(null);
			
		JPanel panel2_3 = new JPanel();
		panel2_3.setBackground(new Color(255, 255, 255));
		panel2_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 128)));
		panel2_3.setBounds(558, 10, 144, 50);
		panel1.add(panel2_3);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel2_2.setBackground(Color.WHITE);
		panel2_2.setBounds(378, 10, 144, 50);
		panel1.add(panel2_2);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel2_1.setBackground(Color.WHITE);
		panel2_1.setBounds(189, 10, 144, 50);
		panel1.add(panel2_1);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(323, 420, 553, 225);
		panel1.add(panel4);
		panel4.setBackground(new Color(255, 255, 255));
		panel4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(24, 124, 507, 91);
		panel4.add(panel5);
		panel5.setLayout(null);
		panel5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		panel5.setBackground(Color.WHITE);
		
//Text Area	ReportFinance	
		JTextArea txtReportFinance = new JTextArea();
		txtReportFinance.setBounds(10, 10, 533, 302);
		panel3.add(txtReportFinance);
		
//Label Grocery		
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
		panel2_3.add(FinanceLabel);
		FinanceLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Login\\F1.png"));
		FinanceLabel.setForeground(new Color(0, 0, 128));
		FinanceLabel.setFont(new Font("Georgia", Font.BOLD, 19));
//Finance
		JLabel DateLabel = new JLabel("Date");
		DateLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DateLabel.setBounds(10, 24, 110, 43);
		panel2.add(DateLabel);
		
		JLabel TotalIncomeLabel = new JLabel("Total Income");
		TotalIncomeLabel.setBounds(10, 112, 144, 43);
		panel2.add(TotalIncomeLabel);
		TotalIncomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel TotalSalaryEmployeeLabel = new JLabel("Total Salary Employee");
		TotalSalaryEmployeeLabel.setBounds(10, 210, 197, 43);
		panel2.add(TotalSalaryEmployeeLabel);
		TotalSalaryEmployeeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel TPPILabel = new JLabel("Total Price Purchase Inventory");
		TPPILabel.setBounds(10, 308, 251, 43);
		panel2.add(TPPILabel);
		TPPILabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel IncidentalChargesLabel = new JLabel("Incidental Charges");
		IncidentalChargesLabel.setBounds(10, 412, 197, 43);
		panel2.add(IncidentalChargesLabel);
		IncidentalChargesLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel TotalProfitLabel = new JLabel("Total Profit");
		TotalProfitLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		TotalProfitLabel.setBounds(112, 16, 144, 43);
		panel4.add(TotalProfitLabel);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(10, 67, 169, 35);
		panel2.add(txtDate);
		
		txtTotalIncome = new JTextField();
		txtTotalIncome.setBounds(10, 165, 169, 35);
		panel2.add(txtTotalIncome);
		txtTotalIncome.setColumns(10);
		
		txtTotalSalaryEmployee = new JTextField();
		txtTotalSalaryEmployee.setText(salary);
		txtTotalSalaryEmployee.setColumns(10);
		txtTotalSalaryEmployee.setBounds(10, 263, 169, 35);
		panel2.add(txtTotalSalaryEmployee);
		
		txtTPPI = new JTextField();
		txtTPPI.setText(purchase);
		txtTPPI.setColumns(10);
		txtTPPI.setBounds(10, 361, 169, 35);
		panel2.add(txtTPPI);
		
		txtIncidentalCharges = new JTextField();
		txtIncidentalCharges.setColumns(10);
		txtIncidentalCharges.setBounds(10, 465, 169, 35);
		panel2.add(txtIncidentalCharges);
		
		txtTotalProfit = new JTextField();
		txtTotalProfit.setColumns(10);
		txtTotalProfit.setBounds(266, 22, 183, 35);
		panel4.add(txtTotalProfit);
				
				
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
						
//Reset button
				JButton ResetButton = new JButton("RESET");
				ResetButton.setBounds(287, 81, 136, 33);
				panel4.add(ResetButton);
				ResetButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						txtTotalIncome.setText("");
						txtTotalSalaryEmployee.setText("");
						txtTPPI.setText("");
						txtIncidentalCharges.setText("");
						txtTotalProfit.setText("");
				}
			});
				ResetButton.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Reset1.png"));
				ResetButton.setForeground(Color.BLACK);
				ResetButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
				ResetButton.setBackground(UIManager.getColor("Button.background"));
										
//Total Button	
				JButton TotalButton = new JButton("TOTAL");
				TotalButton.setBounds(125, 81, 136, 33);
				panel4.add(TotalButton);
				TotalButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
												
					totalIncome = Double.parseDouble(txtTotalIncome.getText());
					totalSalaryEmployee = Double.parseDouble(txtTotalSalaryEmployee.getText());
					TPPI = Double.parseDouble(txtTPPI.getText());
					IncidentalCharges = Double.parseDouble(txtIncidentalCharges.getText());
					totalProfit = String.format("RM %.2f",totalIncome-(totalSalaryEmployee+TPPI+IncidentalCharges));
					txtTotalProfit.setText(totalProfit);
				}
			});
				TotalButton.setForeground(Color.BLACK);
				TotalButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
				TotalButton.setBackground(UIManager.getColor("Button.background"));
										
																		
//Print button	
				JButton PrintButton = new JButton("PRINT");
				PrintButton.setBounds(262, 10, 202, 33);
				panel5.add(PrintButton);
				PrintButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				try {
				txtReportFinance.print();
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
			UploadButton.setBounds(262, 53, 202, 33);
			panel5.add(UploadButton);
			UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\LEGION\\OneDrive\\Desktop\\Assignment 3\\Finance\\ReportFinance.txt");
					if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
					
				bw.write(txtReportFinance.getText());
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
			
//Report Button			
				JButton ReportButton = new JButton("REPORT");
				ReportButton.setBounds(36, 10, 202, 33);
				panel5.add(ReportButton);
				ReportButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//================================================================
						txtReportFinance.setEnabled(true);
						//================================================================
						txtReportFinance.append("\t\t\t Report Finance" + 
						"\n======================================================================="+
						"\nDate \t" + txtDate.getText() +
						"\n======================================================================="+
						"\nTotal Income                             \t\t\t\tRM "+ totalIncome +
						"\n(-)Total Salary Employee                 \t\t\tRM "+ totalSalaryEmployee+
						"\n(-)Total Price Purchase Inventory        \t\t\tRM "+ TPPI+
						"\n(-)Incidental Charges                    \t\t\tRM "+ IncidentalCharges+
						"\n_______________________________________________________________________________"+
						"\nTotal Profit                             \t\t\t\t" +  totalProfit+
						"\n======================================================================="		
							);
					}
				});
				ReportButton.setForeground(Color.BLACK);
				ReportButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
				ReportButton.setBackground(UIManager.getColor("Button.background"));
				
				JButton ClearButton = new JButton("CLEAR");
				ClearButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtReportFinance.setText("");
					}
				});
				ClearButton.setForeground(Color.BLACK);
				ClearButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
				ClearButton.setBackground(UIManager.getColor("Button.background"));
				ClearButton.setBounds(36, 53, 202, 33);
				panel5.add(ClearButton);							
	}
}
