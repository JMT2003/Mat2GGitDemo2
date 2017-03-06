import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class AppTest {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppTest window = new AppTest();
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
	public AppTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 13, 56, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(12, 39, 56, 16);
		frame.getContentPane().add(lblState);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(12, 68, 56, 16);
		frame.getContentPane().add(lblSalary);
		
		textField = new JTextField();
		textField.setBounds(80, 10, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 65, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox <String>comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MI", "WA", "IL", "MA"}));
		comboBox.setBounds(80, 36, 116, 19);
		frame.getContentPane().add(comboBox);
		
		JButton btnCalculateTax = new JButton("Calculate Tax");
		btnCalculateTax.setBounds(80, 99, 116, 25);
		frame.getContentPane().add(btnCalculateTax);
		
		JLabel lblYouOweThis = new JLabel("You Owe This Much");
		lblYouOweThis.setBounds(80, 161, 159, 16);
		frame.getContentPane().add(lblYouOweThis);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 137, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
