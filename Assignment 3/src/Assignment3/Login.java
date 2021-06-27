package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField UsernametextField;
	private JPasswordField PasswordtextField;
	static String salary,purchase,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();//Create new object(Login)
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
	public Login() {//constructor with no argument
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(245, 255, 250));
		panel1.setBounds(0, 0, 922, 446);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(135, 206, 250)));
		panel2.setBackground(new Color(224, 255, 255));
		panel2.setBounds(468, 10, 444, 426);
		panel1.add(panel2);
		panel2.setLayout(null);
		
		JLabel GroceryStoreLabel = new JLabel("YBK Grocery Store");
		GroceryStoreLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		GroceryStoreLabel.setBounds(84, 23, 324, 43);
		panel1.add(GroceryStoreLabel);
		
		JLabel GroceryImageLabel = new JLabel("");
		GroceryImageLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Login\\9.png"));
		GroceryImageLabel.setBackground(Color.WHITE);
		GroceryImageLabel.setBounds(21, 76, 444, 333);
		panel1.add(GroceryImageLabel);
		
		JLabel LoginIconLabel = new JLabel("");
		LoginIconLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\OneDrive\\Desktop\\ICON\\Login\\L.png"));
		LoginIconLabel.setBounds(145, 10, 180, 166);
		panel2.add(LoginIconLabel);
		
		JLabel UsernameLabel = new JLabel("Username");
		UsernameLabel.setBounds(64, 236, 102, 25);
		UsernameLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel2.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(64, 271, 97, 25);
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel2.add(PasswordLabel);
	
		UsernametextField = new JTextField();
		UsernametextField.setBackground(new Color(255, 255, 255));
		UsernametextField.setForeground(new Color(0, 0, 0));
		UsernametextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UsernametextField.setBounds(222, 232, 189, 30);
		panel2.add(UsernametextField);
		UsernametextField.setColumns(10);
		
		PasswordtextField = new JPasswordField();
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PasswordtextField.setBounds(222, 267, 189, 30);
		panel2.add(PasswordtextField);
		
		JComboBox Role = new JComboBox();
		Role.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Role.setModel(new DefaultComboBoxModel(new String[] {"Select Role", "Admin", "Customer"}));
		Role.setBounds(69, 186, 342, 30);
		panel2.add(Role);
		
		JCheckBox show = new JCheckBox("show password");
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(show.isSelected()) {
					PasswordtextField.setEchoChar((char)0);
				}
				else {
					PasswordtextField.setEchoChar('*');
				}
			}
		});
		show.setFont(new Font("Tahoma", Font.ITALIC, 15));
		show.setBounds(222, 303, 189, 25);
		panel2.add(show);
		
//Login Button		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setForeground(Color.BLACK);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(Role.getSelectedItem().equals("Admin")&&UsernametextField.getText().equals("Admin") && PasswordtextField.getText().equals("123456")){
						JOptionPane.showMessageDialog(null, "Login Sucessful");
						AdminPage frame = new AdminPage(salary,purchase);
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						//dispose();//close windows
					}
				
					for(int i = 0; i < Register.table.getRowCount();i++) {
						if(Role.getSelectedItem().equals("Customer")
						&&UsernametextField.getText().equals(Register.table.getValueAt(i,0)) 
						&&PasswordtextField.getText().equals(Register.table.getValueAt(i,1))) {
							JOptionPane.showMessageDialog(null, "Login Sucessful");
							CustomerPage frame = new CustomerPage();
							frame.setVisible(true);
							//dispose();//close windows
						}
						}	
					if(Role.getSelectedItem().equals("Select Role")){
						JOptionPane.showMessageDialog(null, "Please Select Role");
					}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}	
			}
		});
		LoginButton.setBackground(new Color(224, 255, 255));
		LoginButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		LoginButton.setBounds(79, 345, 128, 30);
		panel2.add(LoginButton);
		
//Reset Button		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		ResetButton.setForeground(Color.BLACK);
		ResetButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		ResetButton.setBackground(new Color(224, 255, 255));
		ResetButton.setBounds(246, 345, 128, 30);
		panel2.add(ResetButton);
		
		JButton RegisterButton = new JButton("Register Now!");
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register frame = new Register();
				frame.setVisible(true);
				dispose();
			}
		});
		RegisterButton.setForeground(Color.BLACK);
		RegisterButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 20));
		RegisterButton.setBackground(new Color(224, 255, 255));
		RegisterButton.setBounds(145, 391, 166, 25);
		panel2.add(RegisterButton);
		
//About us Button		
		JButton BackgroudButton = new JButton("About us");
		BackgroudButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackgroud C= new CompanyBackgroud(); //calling another frame/window
				C.setModalExclusionType(null);
	            C.setVisible(true);
	            dispose();
			}
		});
		BackgroudButton.setBackground(Color.WHITE);
		BackgroudButton.setFont(new Font("Tahoma", Font.ITALIC, 15));
		BackgroudButton.setBounds(190, 415, 106, 21);
		panel1.add(BackgroudButton);
	}
}
