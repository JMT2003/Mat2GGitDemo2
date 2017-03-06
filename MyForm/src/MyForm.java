import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MyForm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyForm window = new MyForm();
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
	public MyForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JComboBox <String>comboBox;
	JComboBox <String>comboBox_1;
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	ButtonGroup radioGroup; 
	JCheckBox chckbxNewCheckBox;
	JSlider slider;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 493, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		comboBox = new JComboBox<>();
		String[][] Cities= {{"Detroit","Dearborn","Royal Oak"},{"Milwaukee","Adams","Loyal"},{"Chicago","Urbana", "Washington"}};
		comboBox.setBounds(65, 84, 82, 22);
		frame.getContentPane().add(comboBox);
		
		comboBox_1 = new JComboBox<>();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = comboBox.getSelectedIndex();
				
				comboBox_1.removeAllItems();
				for(int j=0;j<Cities[index].length;j++)
				{
					comboBox_1.addItem(Cities[index][j]);
				}
				
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MI\t", "WI", "IL"}));
		comboBox_1.setBounds(65, 49, 82, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(10, 49, 56, 16);
		frame.getContentPane().add(lblState);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(10, 81, 56, 16);
		frame.getContentPane().add(lblCity);
		
		JPanel panel = new JPanel();
		panel.setBounds(336, 26, 127, 114);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		rb1 = new JRadioButton("Visa");
		rb1.setBounds(17, 9, 93, 25);
		panel.add(rb1);
		
		 rb2 = new JRadioButton("Mastercard");
		rb2.setBounds(17, 39, 93, 25);
		panel.add(rb2);
		
		 rb3 = new JRadioButton("PayPal");
		rb3.setBounds(17, 65, 93, 25);
		panel.add(rb3);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(rb1);
		radioGroup.add(rb2);
		radioGroup.add(rb3);
		
		JButton btnShowSelected = new JButton("Show Selected");
		btnShowSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if (rb1.isSelected())
					JOptionPane.showMessageDialog(null, "Visa");
				if (rb2.isSelected())
					JOptionPane.showMessageDialog(null, "Mastercard");
				if (rb3.isSelected())
					JOptionPane.showMessageDialog(null, "PayPal");
				
				
			
		}
		
			
				
		});
		btnShowSelected.setBounds(336, 153, 127, 25);
		frame.getContentPane().add(btnShowSelected);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(67, 153, 113, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setBounds(45, 214, 226, 60);
		frame.getContentPane().add(slider);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 119, 26);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You Clicked On New!");
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
		mnFile.add(mntmNewMenuItem_1);
		
		
		
	}
}
