package exceptions;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ErrorHandler extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorHandler frame = new ErrorHandler("ERROR",
							"Oops, something went wrong. Please try again later");
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
	public ErrorHandler(String errorTitle, String errorMessage) {
		setResizable(false);
		setBackground(new Color(153, 0, 204));
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 232);
		setLocationRelativeTo(null);
		Image img = new ImageIcon(this.getClass().getResource("/icon_login.png")).getImage();
		setIconImage(img);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton okBtn = new JButton("OK");

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		okBtn.setForeground(new Color(255, 255, 255));
		okBtn.setFont(new Font("Verdana", Font.BOLD, 15));
		okBtn.setBackground(new Color(102, 0, 204));

		// error message
		JTextArea errorDescriptionTxt = new JTextArea();
		errorDescriptionTxt.setLineWrap(true);
		errorDescriptionTxt.setEditable(false);
		errorDescriptionTxt.setColumns(3);
		errorDescriptionTxt.setWrapStyleWord(true);
		errorDescriptionTxt.setRows(3);
		errorDescriptionTxt.setFont(new Font("Courier New", Font.PLAIN, 15));
		errorDescriptionTxt.setText(errorMessage);

		// error title
		JLabel errorLabel = new JLabel(errorTitle);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		errorLabel.setHorizontalAlignment(SwingConstants.LEFT);

		// Image
		JLabel imageLabel = new JLabel("");
		Image errorImg = new ImageIcon(this.getClass().getResource("/errorImg.png")).getImage();
		imageLabel.setIcon(new ImageIcon(errorImg.getScaledInstance(77, 77, DO_NOTHING_ON_CLOSE)));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(
										gl_contentPane.createSequentialGroup()
												.addComponent(okBtn, GroupLayout.PREFERRED_SIZE, 75,
														GroupLayout.PREFERRED_SIZE)
												.addGap(42))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(
												imageLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(errorLabel, GroupLayout.PREFERRED_SIZE, 383,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(errorDescriptionTxt, GroupLayout.PREFERRED_SIZE, 371,
														GroupLayout.PREFERRED_SIZE))
										.addGap(30)))
						.addGap(0, 0, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(44).addComponent(imageLabel,
								GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(errorLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(errorDescriptionTxt,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addGap(18).addComponent(okBtn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(25, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
