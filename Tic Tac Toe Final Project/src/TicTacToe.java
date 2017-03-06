import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frmTicTacToe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	


import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public int Winner[][] = {{2,2,2},{2,2,2},{2,2,2}};
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	private JButton Load;
	private JButton btnNewButton_1;
	public int increment=1;
	public PrintWriter writer;
	
	public int CheckWinRow() {
		int checkR = 2;
		for (int j=0; j<3; j++) {
			if (Winner[j][0] == 0 && Winner[j][1] == 0 && Winner[j][2] == 0) {
				checkR = 0;
				JOptionPane.showMessageDialog(null, "X has won");
				button1.setText("");
				button1.setEnabled(true);
				button2.setText("");
				button2.setEnabled(true);
				button3.setText("");
				button3.setEnabled(true);
				button4.setText("");
				button4.setEnabled(true);
				button5.setText("");
				button5.setEnabled(true);
				button6.setText("");
				button6.setEnabled(true);
				button7.setText("");
				button7.setEnabled(true);
				button8.setText("");
				button8.setEnabled(true);
				button9.setText("");
				button9.setEnabled(true);
			}
			if (Winner[j][0] == 1 && Winner[j][1] == 1 && Winner[j][2] == 1) {
				checkR = 1;
				JOptionPane.showMessageDialog(null, "O has won");
				button1.setText("");
				button1.setEnabled(true);
				button2.setText("");
				button2.setEnabled(true);
				button3.setText("");
				button3.setEnabled(true);
				button4.setText("");
				button4.setEnabled(true);
				button5.setText("");
				button5.setEnabled(true);
				button6.setText("");
				button6.setEnabled(true);
				button7.setText("");
				button7.setEnabled(true);
				button8.setText("");
				button8.setEnabled(true);
				button9.setText("");
				button9.setEnabled(true);
				
			}
		}
		return checkR;
	}
	
	public int CheckWinCol() {
		int checkR = 2;
		for (int i=0; i<3; i++) {
			if (Winner[0][i] == 0 && Winner[1][i] == 0 && Winner[2][i] == 0) {
				checkR = 0;
				JOptionPane.showMessageDialog(null, "O has won");
				button1.setText("");
				button1.setEnabled(true);
				button2.setText("");
				button2.setEnabled(true);
				button3.setText("");
				button3.setEnabled(true);
				button4.setText("");
				button4.setEnabled(true);
				button5.setText("");
				button5.setEnabled(true);
				button6.setText("");
				button6.setEnabled(true);
				button7.setText("");
				button7.setEnabled(true);
				button8.setText("");
				button8.setEnabled(true);
				button9.setText("");
				button9.setEnabled(true);
			}
			if (Winner[0][i] == 0 && Winner[1][i] == 0 && Winner[2][i] == 0) {
				checkR = 1;
				JOptionPane.showMessageDialog(null, "X has won");
				button1.setText("");
				button1.setEnabled(true);
				button2.setText("");
				button2.setEnabled(true);
				button3.setText("");
				button3.setEnabled(true);
				button4.setText("");
				button4.setEnabled(true);
				button5.setText("");
				button5.setEnabled(true);
				button6.setText("");
				button6.setEnabled(true);
				button7.setText("");
				button7.setEnabled(true);
				button8.setText("");
				button8.setEnabled(true);
				button9.setText("");
				button9.setEnabled(true);}}
		return checkR;
			}
	public int CheckLeftDiag() {
		int checkLD = 2;
		if (Winner[0][0] == 0 && Winner[1][1] == 0 && Winner[2][2] == 0) {
			checkLD = 0;
			btnNewButton_1.setEnabled(true);
			button1.setText("");
			button1.setEnabled(true);
			button2.setText("");
			button2.setEnabled(true);
			button3.setText("");
			button3.setEnabled(true);
			button4.setText("");
			button4.setEnabled(true);
			button5.setText("");
			button5.setEnabled(true);
			button6.setText("");
			button6.setEnabled(true);
			button7.setText("");
			button7.setEnabled(true);
			button8.setText("");
			button8.setEnabled(true);
			button9.setText("");
			button9.setEnabled(true);}
		if (Winner[0][0] == 1 && Winner[1][1] == 1 && Winner[2][2] == 1) {
			checkLD = 1;
			JOptionPane.showMessageDialog(null, "O has won");
			button1.setText("");
			button1.setEnabled(true);
			button2.setText("");
			button2.setEnabled(true);
			button3.setText("");
			button3.setEnabled(true);
			button4.setText("");
			button4.setEnabled(true);
			button5.setText("");
			button5.setEnabled(true);
			button6.setText("");
			button6.setEnabled(true);
			button7.setText("");
			button7.setEnabled(true);
			button8.setText("");
			button8.setEnabled(true);
			button9.setText("");
			button9.setEnabled(true);}
		return checkLD;
	}
	public int CheckRightDiag() {
		int checkRD = 2;
		if (Winner[0][2] == 0 && Winner[1][1] == 0 && Winner[0][0] == 0) {
			checkRD = 0;
			JOptionPane.showMessageDialog(null, "X has won");
			button1.setText("");
			button1.setEnabled(true);
			button2.setText("");
			button2.setEnabled(true);
			button3.setText("");
			button3.setEnabled(true);
			button4.setText("");
			button4.setEnabled(true);
			button5.setText("");
			button5.setEnabled(true);
			button6.setText("");
			button6.setEnabled(true);
			button7.setText("");
			button7.setEnabled(true);
			button8.setText("");
			button8.setEnabled(true);
			button9.setText("");
			button9.setEnabled(true);
			}
		if (Winner[0][2] == 1 && Winner[1][1] == 1 && Winner[2][0] == 1) {
			checkRD = 1;
			JOptionPane.showMessageDialog(null, "O has won");
			button1.setText("");
			button1.setEnabled(true);
			button2.setText("");
			button2.setEnabled(true);
			button3.setText("");
			button3.setEnabled(true);
			button4.setText("");
			button4.setEnabled(true);
			button5.setText("");
			button5.setEnabled(true);
			button6.setText("");
			button6.setEnabled(true);
			button7.setText("");
			button7.setEnabled(true);
			button8.setText("");
			button8.setEnabled(true);
			button9.setText("");
			button9.setEnabled(true);
			}
		return checkRD;
	}
	public int checker;
	
	private void initialize() {	
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		button1 = new JButton("[]");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (increment %2==0)
				{	button1.setText("O");
				Winner[0][0]=1;
				}
				else 
					{button1.setText("X");
					Winner[0][0]=0;
					}
				increment++;
				button1.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
			
			}});
		button1.setBounds(82, 57, 97, 67);
		frame.getContentPane().add(button1);
		
		button2 = new JButton("[]");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (increment %2==0)
				{	button2.setText("O");
				Winner[0][1]=1;
				}
				else 
					{button2.setText("X");
					Winner[0][1]=0;
					}
				
				increment++;
				button2.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button2.setBounds(238, 57, 97, 67);
		frame.getContentPane().add(button2);
		
		button3 = new JButton("[]");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
				{	button1.setText("O");
				Winner[0][2]=1;
				}
				else 
					{button1.setText("X");
					Winner[0][2]=0;
					}
				
				increment++;
				button3.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button3.setBounds(388, 57, 97, 67);
		frame.getContentPane().add(button3);
		
		button6 = new JButton("[]");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button6.setText("O");
				else
					button6.setText("X");
				
				increment++;
				button6.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button6.setBounds(388, 151, 97, 67);
		frame.getContentPane().add(button6);
		
		button5 = new JButton("[]");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button5.setText("O");
				else
					button5.setText("X");
				
				increment++;
				button5.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button5.setBounds(238, 151, 97, 67);
		frame.getContentPane().add(button5);
		
		button4 = new JButton("[]");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button4.setText("O");
				else
					button4.setText("X");
				
				increment++;
				button4.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button4.setBounds(82, 151, 97, 67);
		frame.getContentPane().add(button4);
		
		button7 = new JButton("[]");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button7.setText("O");
				else
					button7.setText("X");
				
				increment++;
				button7.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button7.setBounds(82, 254, 97, 67);
		frame.getContentPane().add(button7);
		
		button8 = new JButton("[]");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button8.setText("O");
				else
					button8.setText("X");
				
				increment++;
				button8.setEnabled(false);
				CheckWinCol();
				CheckWinRow();
				CheckLeftDiag();
				CheckRightDiag();
		}});
		button8.setBounds(238, 254, 97, 67);
		frame.getContentPane().add(button8);
		
		button9 = new JButton("[]");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					button9.setText("O");
				else
					button9.setText("X");
				
				 increment++;
				 button9.setEnabled(false);
				 CheckWinCol();
					CheckWinRow();
					CheckLeftDiag();
					CheckRightDiag();
		}});
		button9.setBounds(388, 254, 97, 67);
		frame.getContentPane().add(button9);
		
		Load = new JButton("Load");
		Load.setBounds(156, 368, 97, 37);
		frame.getContentPane().add(Load);
		
		btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(320, 368, 97, 37);
		frame.getContentPane().add(btnNewButton_1);
		
	
	}


		

	
	
	
	int increment=1;
	
	
	
	
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setBounds(100, 100, 463, 389);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (increment %2==0)
					btnNewButton.setText("X"); //sets button to x or o
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