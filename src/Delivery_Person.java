import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delivery_Person extends JFrame implements java.io.Serializable{

	private JPanel contentPane;
	private JTextField mid;
	private JTextField mpass;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delivery_Person frame = new Delivery_Person();
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
	public Delivery_Person() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginId = new JLabel("Login ID");
		lblLoginId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLoginId.setBounds(125, 377, 96, 47);
		contentPane.add(lblLoginId);
		
		mid = new JTextField();
		mid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mid.setBounds(270, 377, 230, 47);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(125, 466, 103, 40);
		contentPane.add(lblPassword);
		
		mpass = new JTextField();
		mpass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mpass.setBounds(270, 463, 230, 47);
		contentPane.add(mpass);
		mpass.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dp_Main dp=new Dp_Main();
				dispose();
				dp.setVisible(true);
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnter.setBounds(206, 551, 190, 55);
		contentPane.add(btnEnter);
		
		label = new JLabel("");
		label.setBounds(125, 29, 375, 323);
		Image t= new ImageIcon(this.getClass().getResource("/dp.jpg")).getImage();
		Image s=t.getScaledInstance(375,323, Image.SCALE_DEFAULT);
		label.setIcon(new ImageIcon(s));
		contentPane.add(label);
	}
}
