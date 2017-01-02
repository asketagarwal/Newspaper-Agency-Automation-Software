import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JList;

public class Cus_Main extends JFrame implements java.io.Serializable{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cus_Main frame = new Cus_Main();
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
	public Cus_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1307, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel main = new JPanel();
		contentPane.add(main, "name_106940705007525");
		main.setLayout(null);
		main.setVisible(true);
		
		JLabel lblNotifications = new JLabel("Notifications");
		lblNotifications.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNotifications.setBounds(979, 49, 189, 55);
		main.add(lblNotifications);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblWelcome.setBounds(428, 13, 158, 43);
		main.add(lblWelcome);
		
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSubscribe.setBounds(505, 135, 252, 55);
		main.add(btnSubscribe);
		
		JButton btnChangeSubscription = new JButton("Change Subscription");
		btnChangeSubscription.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnChangeSubscription.setBounds(505, 231, 252, 55);
		main.add(btnChangeSubscription);
		
		JButton btnPauseSubscription = new JButton("Pause Subscription");
		btnPauseSubscription.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnPauseSubscription.setBounds(505, 327, 252, 55);
		main.add(btnPauseSubscription);
		
		JButton btnStopSubscription = new JButton("Stop Subscription");
		btnStopSubscription.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnStopSubscription.setBounds(505, 428, 252, 55);
		main.add(btnStopSubscription);
		
		JButton btnViewMyInfo = new JButton("View My Info.");
		btnViewMyInfo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnViewMyInfo.setBounds(505, 522, 252, 43);
		main.add(btnViewMyInfo);
		
		JButton btnEditMyInfo = new JButton("Edit My Info");
		btnEditMyInfo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnEditMyInfo.setBounds(505, 605, 252, 56);
		main.add(btnEditMyInfo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(873, 125, 394, 538);
		main.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		

	}

}
