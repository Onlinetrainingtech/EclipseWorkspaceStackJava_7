import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrMappingSystem = new JLabel("HR MAPPING SYSTEM");
		lblHrMappingSystem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHrMappingSystem.setBounds(151, 22, 158, 14);
		contentPane.add(lblHrMappingSystem);
		
		JButton btnUserlogin = new JButton("UserLogin");
		btnUserlogin.setBounds(162, 83, 110, 23);
		contentPane.add(btnUserlogin);
		
		JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.setBounds(162, 147, 110, 23);
		contentPane.add(btnAdminlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(162, 222, 110, 23);
		contentPane.add(btnRegister);
	}
}
