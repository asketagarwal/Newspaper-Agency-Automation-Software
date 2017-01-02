import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dp_Main extends JFrame implements java.io.Serializable{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dp_Main frame = new Dp_Main();
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
	public Dp_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1307, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel dp = new JPanel();
		contentPane.add(dp, "name_168816670453005");
		dp.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblWelcome.setBounds(491, 24, 150, 62);
		dp.add(lblWelcome);
		
		JLabel lblNotifications = new JLabel("Notifications");
		lblNotifications.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNotifications.setBounds(1013, 70, 157, 42);
		dp.add(lblNotifications);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(910, 130, 357, 531);
		dp.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnGetSubscriptionList = new JButton("Get Subscription list");
		btnGetSubscriptionList.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnGetSubscriptionList.setBounds(575, 150, 247, 48);
		dp.add(btnGetSubscriptionList);
		
		JButton btnNewButton = new JButton("Get Customer's bill");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(575, 242, 247, 48);
		dp.add(btnNewButton);
	}
}
