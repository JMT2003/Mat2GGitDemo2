import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe2 {

	private JFrame frmTicTacToe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe2 window = new TicTacToe2();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	int increment=1;
	
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setBounds(100, 100, 463, 389);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(null);
	
		String[][] x = new String[3][3];
		for (int i=0; i < 3; i++)
            if (x[i][0]==x[i][1] && x[i][1]== x[i][2] && x[i][0]=="X"){                
              
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					btnNewButton.setText("X");
					else
						btnNewButton.setText("O");

					increment++;
				
				btnNewButton.setEnabled(false); //makes button not clickable after first click
				
			}
		});
		btnNewButton.setBounds(57, 23, 97, 76);
		frmTicTacToe.getContentPane().add(btnNewButton);
		
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button.setText("X");
					else
						button.setText("O");

					increment++;
		button.setEnabled(false);		
			}
		});
		button.setBounds(166, 23, 97, 76);
		frmTicTacToe.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_1.setText("X");
					else
						button_1.setText("O");

					increment++;
		button_1.setEnabled(false);		
			}
		});
		
		
		
		button_1.setBounds(275, 23, 97, 76);
		frmTicTacToe.getContentPane().add(button_1);
		
		
	
		JButton button_2 = new JButton("");
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_2.setText("X");
					else
						button_2.setText("O");

					increment++;
				button_2.setEnabled(false);
			}
		});
		
		
		
		button_2.setBounds(57, 112, 97, 76);
		frmTicTacToe.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_3.setText("X");
					else
						button_3.setText("O");

					increment++;
				button_3.setEnabled(false);
			}
		});
		
		
		button_3.setBounds(166, 112, 97, 76);
		frmTicTacToe.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_4.setText("X");
					else
						button_4.setText("O");

					increment++;
				button_4.setEnabled(false);
			}
		});
		
		
		button_4.setBounds(275, 112, 97, 76);
		frmTicTacToe.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_5.setText("X");
					else
						button_5.setText("O");

					increment++;
				button_5.setEnabled(false);
			}
		});
		
		
		
		button_5.setBounds(57, 201, 97, 76);
		frmTicTacToe.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_6.setText("X");
					else
						button_6.setText("O");

					increment++;
				button_6.setEnabled(false);
				
				
			}
		});
		
		button_6.setBounds(166, 201, 97, 76);
		frmTicTacToe.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button_7.setText("X");
					else
						button_7.setText("O");

					increment++;
				button_7.setEnabled(false);
			}
		});
		
		button_7.setBounds(275, 201, 97, 76);
		frmTicTacToe.getContentPane().add(button_7);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(57, 304, 97, 25);
		frmTicTacToe.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(275, 304, 97, 25);
		frmTicTacToe.getContentPane().add(btnLoad);
	}
}
}
