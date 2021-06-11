import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UserRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegister frame = new UserRegister();
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
	public UserRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(184, 31, 46, 14);
		contentPane.add(lblRegister);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(53, 85, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(148, 82, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(53, 155, 46, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 152, 143, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(53, 230, 46, 14);
		contentPane.add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 227, 143, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(81, 291, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(242, 291, 89, 23);
		contentPane.add(btnReset);
	}

}
