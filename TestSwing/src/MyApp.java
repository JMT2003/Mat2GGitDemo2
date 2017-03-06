import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MyApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
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
	public MyApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLabel lblNewLabel;
	JComboBox <String> comboBox;
	private JTextField xTextField;
	private JTextField yTextField;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1control = new JButton("Button 1");
		button1control.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//JOptionPane.showConfirmDialog(null, "Hello")
				
				int result = JOptionPane.showConfirmDialog(null, "Hello ", "Warning",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (result==0)
					lblNewLabel.setText("User selected yes!");
				else if (result==1)
					lblNewLabel.setText("User selected no!");
			}
		});
		button1control.setToolTipText("This is a Button");
		button1control.setBounds(38, 46, 97, 25);
		frame.getContentPane().add(button1control);
		
		 lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(175, 50, 104, 16);
		frame.getContentPane().add(lblNewLabel);
		
		xTextField = new JTextField();
		xTextField.setBounds(111, 97, 116, 22);
		frame.getContentPane().add(xTextField);
		xTextField.setColumns(10);
		
		yTextField = new JTextField();
		yTextField.setBounds(111, 134, 116, 22);
		frame.getContentPane().add(yTextField);
		yTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(38, 100, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Y");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(38, 137, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int x = Integer.parseInt(xTextField.getText());
				int y = Integer.parseInt(yTextField.getText());
				
				int sum = x+y; 
				
				JOptionPane.showMessageDialog(null, "Sum = "+sum + " Hello from "+comboBox.getSelectedItem());
				
				//comboBox.addItem(item);
				
				
			}
		});
		btnAdd.setBounds(111, 182, 116, 25);
		frame.getContentPane().add(btnAdd);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MI", "WA", "IL", "OH", "CA", "LA", "AZ", "MD"}));
		comboBox.setBounds(295, 47, 97, 25);
		frame.getContentPane().add(comboBox);
	}
}
