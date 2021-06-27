package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtEmail;
	private JTextField txtPassword;
	static JTable table;
	static JFrame Register;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(245, 255, 250));
		panel1.setBounds(0, 0, 916, 514);
		contentPane.add(panel1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.CYAN));
		panel.setBounds(419, 88, 447, 318);
		panel1.add(panel);
		panel.setLayout(null);
		
		JLabel RegisterLabel = new JLabel("Register Form");
		RegisterLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 35));
		RegisterLabel.setBounds(293, 27, 322, 43);
		panel1.add(RegisterLabel);
		
		JLabel UsernameLabel = new JLabel("User Name");
		UsernameLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		UsernameLabel.setBounds(24, 140, 178, 33);
		panel1.add(UsernameLabel);
		
		JLabel EmailLabel = new JLabel("Email");
		EmailLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		EmailLabel.setBounds(24, 303, 178, 33);
		panel1.add(EmailLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		PasswordLabel.setBounds(24, 223, 178, 33);
		panel1.add(PasswordLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(212, 138, 178, 43);
		panel1.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(212, 221, 178, 43);
		panel1.add(txtPassword);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(212, 301, 178, 43);
		panel1.add(txtEmail);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 427, 298);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Password", "Email"
			}
		));
		scrollPane.setViewportView(table);
		
//Register Button		
		JButton RegisterButton = new JButton("Register");
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						
						txtUsername.getText(),
						txtPassword.getText(),
						txtEmail.getText(),
					
			});
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Register Successful", "",
									JOptionPane.OK_OPTION);
						}	
					}
			}
		});
		RegisterButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		RegisterButton.setBounds(96, 435, 140, 33);
		panel1.add(RegisterButton);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");
				txtEmail.setText("");
			}
		});
		ResetButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		ResetButton.setBounds(287, 435, 145, 33);
		panel1.add(ResetButton);
		
//Back Button		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		BackButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		BackButton.setBounds(670, 435, 145, 33);
		panel1.add(BackButton);
		
//Delete button
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Register System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Register System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		DeleteButton.setBounds(477, 435, 140, 33);
		panel1.add(DeleteButton);
		
		
		
		
	}
}
