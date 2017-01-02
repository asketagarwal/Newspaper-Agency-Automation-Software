import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.io.*;
public class Main implements java.io.Serializable {

	private JFrame frame;

	
	
	
	public static void main(String[] args) {
		
		/**
		 * Launch the application.
		 */
		 /**
	     * 3306 is the default port for MySQL in XAMPP. Note both the 
	     * MySQL server and Apache must be running. 
	     */
	    String url = "jdbc:mysql://localhost:3306/";
	    
	    /**
	     * The MySQL user.
	     */
	    String user = "root";
	    
	    /**
	     * Password for the above MySQL user. If no password has been 
	     * set (as is the default for the root user in XAMPP's MySQL),
	     * an empty string can be used.
	     */
	    String password = "";

	    
	    try{
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        Connection con = DriverManager.getConnection(url, user, password);
	        
	        Statement stt = con.createStatement();
	        
	        
	        /**
	         * Create and select a database for use. 
	         */
	        stt.execute("CREATE DATABASE IF NOT EXISTS test");
	        stt.execute("USE test");
	        
	        /**
	         * Create an example table
	         */
	       // stt.execute("DROP TABLE IF EXISTS table");
	        stt.execute("CREATE TABLE table (" +
	                "id BIGINT NOT NULL AUTO_INCREMENT,"
	                + "fname VARCHAR(25),"
	                + "object_value BLOB,"
	                + "PRIMARY KEY(id)"
	                + ")");
	    
	    final String STR="INSERT INTO table(fname,object_value) VALUES (?,?) ";
        PreparedStatement ps=con.prepareStatement(STR);
        		ps.setString(2, "joe");
                ps.setObject(3, Magazine_List.getMag());
                ps.executeUpdate();
                
	    }
	    
	 
	   catch(Exception e)
	    {
	    	e.printStackTrace();
	   }
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Main() {
		initialize();
	}
       
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 1284, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewspaperAgencyAutomaton = new JLabel("Newspaper Agency Automaton Software");
		lblNewspaperAgencyAutomaton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewspaperAgencyAutomaton.setBounds(335, 23, 547, 61);
		frame.getContentPane().add(lblNewspaperAgencyAutomaton);
		
		JButton btnLoginAsA = new JButton("Login as a Manager");
		btnLoginAsA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manager man=new Manager();
				frame.setVisible(false);
				man.setVisible(true);
				
			}
		});
		btnLoginAsA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLoginAsA.setBounds(67, 481, 242, 61);
		frame.getContentPane().add(btnLoginAsA);
		
		JButton btnLoginAsDelivery = new JButton("Login as Delivery Person");
		btnLoginAsDelivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Delivery_Person del=new Delivery_Person();
				frame.setVisible(false);
				del.setVisible(true);
			}
		});
		btnLoginAsDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLoginAsDelivery.setBounds(459, 481, 290, 61);
		frame.getContentPane().add(btnLoginAsDelivery);
		
		JButton btnLoginAsCustomer = new JButton("Login as Customer");
		btnLoginAsCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer cus = new Customer();
				frame.setVisible(false);
				cus.setVisible(true);
			}
		});
		btnLoginAsCustomer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLoginAsCustomer.setBounds(935, 482, 217, 59);
		frame.getContentPane().add(btnLoginAsCustomer);
		
		JLabel man = new JLabel("");
		man.setBounds(43, 105, 296, 349);
		Image t= new ImageIcon(this.getClass().getResource("/manager.png")).getImage();
		Image s=t.getScaledInstance(296,349, Image.SCALE_DEFAULT);
		man.setIcon(new ImageIcon(s));
		frame.getContentPane().add(man);
		
		JLabel dp = new JLabel("");
		dp.setBounds(431, 106, 354, 348);
		Image T= new ImageIcon(this.getClass().getResource("/dp.jpg")).getImage();
		Image S=T.getScaledInstance(354,348, Image.SCALE_DEFAULT);
		dp.setIcon(new ImageIcon(S));
		frame.getContentPane().add(dp);
		
		JLabel label = new JLabel("");
		label.setBounds(872, 109, 336, 345);
		Image a= new ImageIcon(this.getClass().getResource("/customers.png")).getImage();
		Image b=a.getScaledInstance(336,345, Image.SCALE_DEFAULT);
		label.setIcon(new ImageIcon(b));
		frame.getContentPane().add(label);
		
		
	}
}
