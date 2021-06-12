import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

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
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String price=textField_2.getText();
					
					String str1="insert into addproduct values('"+pid+"','"+pname+"','"+price+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch7","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnAddproduct,"Inserted,...");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAddproduct.setBounds(43, 285, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnViewproduct = new JButton("ViewProduct");
		btnViewproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					
					String str1="select * from addproduct where productid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch7","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str1);
					rs.next();
					//String pname=rs.getString(2);
					//String price=rs.getString(3);
					
					textField_1.setText(rs.getString(2));
					textField_2.setText(rs.getString(3));
					
					JOptionPane.showMessageDialog(btnViewproduct,"Searching..");
					
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnViewproduct.setBounds(171, 285, 102, 23);
		contentPane.add(btnViewproduct);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String price=textField_2.getText();
					
					String str2="update addproduct set productname='"+pname+"',productprices='"+price+"' where productid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch7","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str2);
					
					JOptionPane.showMessageDialog(btnUpdate,"Updated..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(303, 285, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					String str1="delete from addproduct where productid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch7","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnDelete,"Deleted..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(303, 208, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnReset.setBounds(303, 141, 89, 23);
		contentPane.add(btnReset);
	}
}
