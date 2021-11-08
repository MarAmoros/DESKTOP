package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setResizable(false);
		setTitle("Kadamm");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 600);
		setLocationRelativeTo(null);
		Image img = new ImageIcon(this.getClass().getResource("/icon_login.png")).getImage();
		setIconImage(img);
		// setBounds(100, 100, 429, 325);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Label with image
		JLabel loginImgLabel = new JLabel("");
		loginImgLabel.setBackground(Color.WHITE);

		loginImgLabel.setIcon(new ImageIcon(img.getScaledInstance(228, 211, DO_NOTHING_ON_CLOSE)));

		JLabel loginLabel = new JLabel("KADAMM LOGIN");
		loginLabel.setFont(new Font("Verdana", Font.BOLD, 22));

		txtUsername = new JTextField();
		txtUsername.setColumns(10);

		passwordField = new JPasswordField();

		JCheckBox rememberMeCheckBox = new JCheckBox("Remember me");
		rememberMeCheckBox.setBackground(Color.WHITE);
		rememberMeCheckBox.setFont(new Font("Verdana", Font.PLAIN, 10));
		rememberMeCheckBox.setForeground(Color.BLACK);

		JButton buttonLogin = new JButton("LOGIN");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLogin.setBackground(new Color(102, 0, 204));
		buttonLogin.setForeground(Color.WHITE);
		buttonLogin.setFont(new Font("Verdana", Font.BOLD, 15));

		JLabel lblNewLabel = new JLabel("Username");

		JLabel lblNewLabel_1 = new JLabel("Password");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_contentPane.createSequentialGroup().addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(
								rememberMeCheckBox, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(261).addComponent(buttonLogin,
										GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(212).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 96,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 96,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(loginImgLabel, GroupLayout.PREFERRED_SIZE, 228,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(
												loginLabel, GroupLayout.PREFERRED_SIZE, 228,
												GroupLayout.PREFERRED_SIZE))))))
						.addGap(221)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(29, Short.MAX_VALUE)
						.addComponent(loginImgLabel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
						.addGap(1).addComponent(loginLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGap(13).addComponent(lblNewLabel_1).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rememberMeCheckBox).addGap(30)
						.addComponent(buttonLogin, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(44)));
		contentPane.setLayout(gl_contentPane);
	}
}
