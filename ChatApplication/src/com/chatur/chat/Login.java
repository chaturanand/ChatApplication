package com.chatur.chat;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame {

	/**
	 * @author Chaturanand Yadav
	 * @since 2019-10-21
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtIpAdress;
	private JLabel lblIpAddress;
	private JTextField txtPort;
	private JLabel lblPort;
	private JLabel lblIpDesc;
	private JLabel lblPortDesc;

	// private LoginButton handle = new LoginButton();

	public Login() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 300, 380);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUserName = new JTextField();
		txtUserName.setBounds(64, 50, 165, 28);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(124, 34, 45, 16);
		contentPane.add(lblName);

		txtIpAdress = new JTextField();
		txtIpAdress.setBounds(64, 114, 165, 28);
		contentPane.add(txtIpAdress);
		txtIpAdress.setColumns(10);

		JLabel lblIpAddress = new JLabel("IP Address");
		lblIpAddress.setBounds(116, 97, 61, 16);
		contentPane.add(lblIpAddress);

		JLabel lblPort = new JLabel("Port");
		lblPort.setBounds(124, 170, 45, 16);
		contentPane.add(lblPort);

		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(64, 186, 165, 28);
		contentPane.add(txtPort);

		JLabel lblIpDesc = new JLabel("(e.g. 192.168.0.1)");
		lblIpDesc.setBounds(85, 143, 124, 16);
		contentPane.add(lblIpDesc);

		JLabel lblPortDesc = new JLabel("(e.g. 8192)");
		lblPortDesc.setBounds(107, 213, 79, 16);
		contentPane.add(lblPortDesc);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String name=txtUserName.getText();
				String address=txtIpAdress.getText();
				int port=Integer.parseInt(txtPort.getText());
				login(name,address,port);
			}

		});
		btnLogin.setBounds(107, 281, 79, 28);
		contentPane.add(btnLogin);
	}

	/**
	 * Login Stuff Here
	 */
	private void login(String name,String address,int port) {
		dispose();
		new Client(name,address,port);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
