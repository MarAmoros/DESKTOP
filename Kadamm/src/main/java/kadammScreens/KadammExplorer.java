package kadammScreens;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.example.kadamm.TestServer;

import exceptions.ErrorHandler;

import javax.swing.JList;

public class KadammExplorer extends JFrame {

	private JPanel contentPane;
	private String [] kadamms = {"Kadamm 1", "Kadamm 2", "Kadamm 3"};
	JList kadammsList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KadammExplorer frame = new KadammExplorer();
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
	public KadammExplorer() {
		setResizable(false);
		setTitle("Kahoot explorer");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(836, 645);
		setLocationRelativeTo(null);
		Image img = new ImageIcon(this.getClass().getResource("/icon_login.png")).getImage();
		setIconImage(img);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton showDetailsButton = new JButton("Show Details");
		showDetailsButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		showDetailsButton.setForeground(new Color(255, 255, 255));
		showDetailsButton.setBackground(new Color(102, 0, 204));

		JButton playButton = new JButton("PLAY");
		playButton.setBackground(new Color(102, 0, 204));
		playButton.setForeground(new Color(255, 255, 255));
		playButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		playButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				play();
				
			}
		});

		JButton createKahootButton = new JButton("Create Kahoot");
		createKahootButton.setBackground(new Color(102, 0, 204));
		createKahootButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		createKahootButton.setForeground(new Color(255, 255, 255));
		createKahootButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				createNewKadmm();
			}
		});


		JButton btnNewButton_2_1 = new JButton("Filter topics");
		btnNewButton_2_1.setBackground(new Color(102, 0, 204));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));

		JButton btnNewButton_2_2 = new JButton("Edit filter topics");
		btnNewButton_2_2.setBackground(new Color(102, 0, 204));
		btnNewButton_2_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));

		JScrollPane scrollPane = new JScrollPane();

		JScrollPane scrollPane_1 = new JScrollPane();

		JScrollPane scrollPane_1_1 = new JScrollPane();

		JLabel kahootsLabel = new JLabel("Kahoots");
		kahootsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel topicsLabel = new JLabel("Topics");
		topicsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel selectedTopicsLabel = new JLabel("Selected topics");
		selectedTopicsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(56)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(kahootsLabel, GroupLayout.DEFAULT_SIZE, 198,
														Short.MAX_VALUE)
												.addGap(180))
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 371,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(showDetailsButton, GroupLayout.DEFAULT_SIZE, 136,
														Short.MAX_VALUE)
												.addGap(101).addComponent(createKahootButton, GroupLayout.DEFAULT_SIZE,
														141, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(182)
								.addComponent(playButton, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE).addGap(121)))
				.addGap(110)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(selectedTopicsLabel, GroupLayout.PREFERRED_SIZE, 209,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_1_1, GroupLayout.PREFERRED_SIZE, 209,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(54).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_2_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNewButton_2_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(59))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(topicsLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addContainerGap()))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(33)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(kahootsLabel,
										GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
								.addComponent(topicsLabel, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
						.addGap(10)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
								.createSequentialGroup()
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addGap(22)
								.addComponent(selectedTopicsLabel, GroupLayout.PREFERRED_SIZE, 36,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(scrollPane_1_1,
										GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
						.addGap(46)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(showDetailsButton, GroupLayout.PREFERRED_SIZE, 41,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(createKahootButton, GroupLayout.PREFERRED_SIZE, 41,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(playButton,
												GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(18)
										.addComponent(btnNewButton_2_2, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
						.addGap(39)));
		
		kadammsList = new JList(kadamms);
		kadammsList.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		scrollPane.setViewportView(kadammsList);

		JTextArea selectedTopicsTextArea = new JTextArea();
		selectedTopicsTextArea.setEditable(false);
		scrollPane_1_1.setViewportView(selectedTopicsTextArea);

		JTextArea topicsTextArea = new JTextArea();
		topicsTextArea.setEditable(false);
		scrollPane_1.setViewportView(topicsTextArea);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void createNewKadmm() {
		dispose();
		CreateNewKadamm createNewKadammFrame = new CreateNewKadamm();
		createNewKadammFrame.setVisible(true);
	}
	
	private void play() {
		Object kadamm = kadammsList.getSelectedValue();
		
		if (kadamm==null) {
			
			new ErrorHandler("Kahoot Not Selected", "You have to select one of kahoots to play it!").setVisible(true);
			
		}else {
			dispose();
			TestServer testServer = new TestServer(kadamm.toString());
		}
			
		
		
	}
}
