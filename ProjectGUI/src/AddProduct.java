import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddProduct extends JFrame {

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
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setBounds(171, 11, 83, 14);
		contentPane.add(lblAddproduct);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setBounds(43, 60, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(112, 57, 142, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("PNAME");
		lblPname.setBounds(43, 122, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 119, 142, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPprice = new JLabel("PPRICE");
		lblPprice.setBounds(43, 191, 46, 14);
		contentPane.add(lblPprice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 188, 142, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.setBounds(43, 285, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnViewproduct = new JButton("ViewProduct");
		btnViewproduct.setBounds(171, 285, 102, 23);
		contentPane.add(btnViewproduct);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(303, 285, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(303, 208, 89, 23);
		contentPane.add(btnDelete);
	}

}
