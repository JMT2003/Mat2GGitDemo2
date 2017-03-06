import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PracticaFinal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticaFinal window = new PracticaFinal();
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
	public PracticaFinal() {
		initialize();
	}
	
	

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomePleaseInput = new JLabel("Welcome - Please Input Your Information");
		lblWelcomePleaseInput.setBounds(94, 13, 240, 16);
		frame.getContentPane().add(lblWelcomePleaseInput);
		
		JLabel lblTrainingOrganizationName = new JLabel("Training Organization Name :");
		lblTrainingOrganizationName.setBounds(12, 43, 169, 16);
		frame.getContentPane().add(lblTrainingOrganizationName);
		
		JLabel lblNewLabel = new JLabel("Student Name :");
		lblNewLabel.setBounds(91, 72, 90, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTrainingTitle = new JLabel("Training Title :");
		lblTrainingTitle.setBounds(96, 101, 85, 16);
		frame.getContentPane().add(lblTrainingTitle);
		
		JLabel lblNewLabel_1 = new JLabel("Start Date Of Training :");
		lblNewLabel_1.setBounds(46, 130, 135, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEndDateOf = new JLabel("End Date Of Training :");
		lblEndDateOf.setBounds(53, 159, 128, 16);
		frame.getContentPane().add(lblEndDateOf);
		
		JLabel lblNewLabel_2 = new JLabel("Number Of Continuing Education Credits :");
		lblNewLabel_2.setBounds(12, 188, 240, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblTrainingCost = new JLabel("Training Cost :");
		lblTrainingCost.setBounds(96, 217, 85, 16);
		frame.getContentPane().add(lblTrainingCost);
		
		JLabel lblAverageScoreFor = new JLabel("Average Score For All Assignments :");
		lblAverageScoreFor.setBounds(35, 246, 210, 16);
		frame.getContentPane().add(lblAverageScoreFor);
		
		textField = new JTextField();
		textField.setBounds(186, 42, 232, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 69, 232, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 98, 232, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(186, 127, 232, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(186, 156, 232, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(253, 185, 165, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(250, 243, 168, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(186, 214, 232, 22);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(164, 283, 97, 25);
		frame.getContentPane().add(btnSubmit);
	}
}
