package thuNghiem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class SuaKH extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuaKH frame = new SuaKH();
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
	public SuaKH() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sondu\\Downloads\\pig.png"));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(186, 0, 139, 211);
		contentPane.add(lblNewLabel);
		
		JLabel txtAdNameDK = new JLabel("Tên đăng nhập :");
		txtAdNameDK.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtAdNameDK.setBounds(62, 194, 200, 50);
		contentPane.add(txtAdNameDK);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(169, 169, 169)));
		textField.setBounds(222, 198, 250, 45);
		contentPane.add(textField);
		
		JLabel lblTenDK_1 = new JLabel("Mật khẩu :");
		lblTenDK_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTenDK_1.setBounds(105, 260, 200, 50);
		contentPane.add(lblTenDK_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(169, 169, 169)));
		passwordField.setBounds(222, 266, 250, 45);
		contentPane.add(passwordField);
		
		JLabel lblTenDK_2 = new JLabel("Xác nhận mật khẩu :");
		lblTenDK_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTenDK_2.setBounds(32, 324, 200, 50);
		contentPane.add(lblTenDK_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new LineBorder(new Color(169, 169, 169)));
		passwordField_1.setBounds(222, 329, 250, 45);
		contentPane.add(passwordField_1);
		
		JButton btnSingup = new JButton("Đăng ký");
		btnSingup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSingup.setBorder(new LineBorder(new Color(95, 158, 160), 4));
		btnSingup.setBackground(new Color(32, 178, 170));
		btnSingup.setBounds(211, 411, 120, 40);
		contentPane.add(btnSingup);
		
		JButton btnExit = new JButton("Thoát");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(375, 411, 110, 40);
		contentPane.add(btnExit);
	}
}
