package kadammScreens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exceptions.ErrorHandler;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;

public class CreateNewKadamm extends JFrame {

	private JPanel contentPane;
	private JTextField newTitle;
	private JTextField newAnswerOne;
	private JTextField newAnswerTwo;
	private JTextField newAnswerFour;
	private JTextField newAnswerThree;
	private JTextArea newQuestion;
	private Map<JTextField, JCheckBox> answers = new HashMap<JTextField, JCheckBox>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewKadamm frame = new CreateNewKadamm();
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
	public CreateNewKadamm() {
		setBackground(Color.WHITE);
		setTitle("Create Kadamm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(836, 645);
		setLocationRelativeTo(null);
		Image img = new ImageIcon(this.getClass().getResource("/icon_login.png")).getImage();
		setIconImage(img);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblTitol = new JLabel("Title");
		lblTitol.setBackground(Color.WHITE);
		lblTitol.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		newTitle = new JTextField();
		newTitle.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Questions");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("New question");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblNewLabel_2 = new JLabel("Answer type");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JButton addQuestionBut = new JButton("Add question");
		addQuestionBut.setForeground(Color.WHITE);
		addQuestionBut.setBackground(new Color(102, 0, 204));
		addQuestionBut.setFont(new Font("Verdana", Font.BOLD, 15));
		ArrayList a = new ArrayList();
		addQuestionBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(questionVerification()) {
					a.add(newQuestion.getText());
					for (Map.Entry<JTextField, JCheckBox> answer : answers.entrySet()) {
						if(answer.getKey().getText().replace(" ", "").length() > 0) {
							a.add("\nAnswer: " + answer.getKey().getText());
							if(answer.getValue().isSelected()) {
								a.add("\nCorrect: " + "Yes");
							}else {
								a.add("\nCorrect: " + "No");
							}
						}
					}
					System.out.println(a);
				}
				
				
			}
		});
		
		JButton saveKadammBut = new JButton("<html>Save new <br>  Kadamm</html>");
		saveKadammBut.setForeground(Color.WHITE);
		saveKadammBut.setBackground(new Color(102, 0, 204));
		saveKadammBut.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Asociated topics");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4 = new JLabel("Answers");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1 = new JLabel("Correct");
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(250)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(216)
							.addComponent(addQuestionBut)
							.addGap(111)
							.addComponent(saveKadammBut, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(217, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(340)
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblTitol)
									.addGap(18)
									.addComponent(newTitle, 411, 411, 411))
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(48)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
									.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
							.addComponent(lblNewLabel_4_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(61)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitol)
						.addComponent(newTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(addQuestionBut, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(saveKadammBut, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(30))
		);
		
		newAnswerOne = new JTextField();
		newAnswerOne.setColumns(10);
		
		newAnswerFour = new JTextField();
		newAnswerFour.setColumns(10);

		newAnswerThree = new JTextField();
		newAnswerThree.setColumns(10);

		newAnswerTwo = new JTextField();
		newAnswerTwo.setColumns(10);

		JCheckBox newAnswerCheckOne = new JCheckBox("");
		newAnswerCheckOne.setBackground(Color.WHITE);
		answers.put(newAnswerOne, newAnswerCheckOne);
		
		JCheckBox newAnswerCheckTwo = new JCheckBox("");
		newAnswerCheckTwo.setBackground(Color.WHITE);
		answers.put(newAnswerTwo, newAnswerCheckTwo);

		JCheckBox newAnswerCheckThree = new JCheckBox("");
		newAnswerCheckThree.setBackground(Color.WHITE);
		answers.put(newAnswerThree, newAnswerCheckThree);

		JCheckBox newAnswerCheckFour = new JCheckBox("");
		newAnswerCheckFour.setBackground(Color.WHITE);
		answers.put(newAnswerFour, newAnswerCheckFour);

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(newAnswerTwo, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addComponent(newAnswerThree, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addComponent(newAnswerOne, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
						.addComponent(newAnswerFour, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(newAnswerCheckOne)
						.addComponent(newAnswerCheckTwo, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(newAnswerCheckThree, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(newAnswerCheckFour, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(newAnswerOne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(newAnswerCheckTwo)
								.addComponent(newAnswerTwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(newAnswerCheckOne))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(newAnswerThree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(newAnswerCheckFour)
								.addComponent(newAnswerFour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(10))
						.addComponent(newAnswerCheckThree)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JTextArea topicsList = new JTextArea();
		scrollPane_2.setViewportView(topicsList);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton answerTypeSelect = new JRadioButton("Select one or more answers");
		answerTypeSelect.setBackground(Color.WHITE);
		answerTypeSelect.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_1.add(answerTypeSelect);
		
		JRadioButton answerTypeWrite = new JRadioButton("Write the answer");
		answerTypeWrite.setBackground(Color.WHITE);
		answerTypeWrite.setFont(new Font("Arial", Font.PLAIN, 14));
//		panel_1.add(answerTypeWrite);

		ButtonGroup bg = new ButtonGroup();
		bg.add(answerTypeSelect);
		bg.add(answerTypeWrite);
	
		JTextArea questionsList = new JTextArea();
		scrollPane.setViewportView(questionsList);
		
		newQuestion = new JTextArea();
		scrollPane_1.setViewportView(newQuestion);
		panel.setLayout(gl_panel);
	}
	
	private boolean questionVerification() {
		int contAnswers = 0;
		int contChecks = 0;
		for (Map.Entry<JTextField, JCheckBox> answer : answers.entrySet()) {
			if(answer.getKey().getText().replace(" ", "").length() > 0) {
				contAnswers++;
				if(answer.getValue().isSelected()) {
					contChecks++;
				}
			}
		}
		if(contAnswers < 2) {
			new ErrorHandler( "Answer Quantity Error", "You have to write minimum 2 possible answers").setVisible(true);
			return false;
		}
		
		if(contChecks < 1) {
			new ErrorHandler( "Answer Selection Error", "You have select minimum 1 of written answers like correct").setVisible(true);
			return false;
		}
		return true;
	}
}
