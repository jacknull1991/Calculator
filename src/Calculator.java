import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frmJavaCalculator;
	private JTextField displayText;
	
	private double num1;
	private double num2;
	private double ans;
	
	private int operator;
	private final int OP_PLUS = 0;
	private final int OP_MINUS = 1;
	private final int OP_MULT = 2;
	private final int OP_DIV = 3;
	private final int OP_MOD = 4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmJavaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCalculator = new JFrame();
		frmJavaCalculator.setResizable(false);
		frmJavaCalculator.setType(Type.UTILITY);
		frmJavaCalculator.setTitle("Calculator");
		frmJavaCalculator.setBounds(100, 100, 278, 345);
		frmJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCalculator.setLocation(500, 250);
		frmJavaCalculator.getContentPane().setLayout(null);
		
		displayText = new JTextField();
		displayText.setEditable(false);
		displayText.setBackground(Color.WHITE);
		displayText.setHorizontalAlignment(SwingConstants.RIGHT);
		displayText.setFont(new Font("Tahoma", Font.BOLD, 22));
		displayText.setBounds(10, 23, 244, 36);
		frmJavaCalculator.getContentPane().add(displayText);
		displayText.setColumns(10);
		
		JButton btnClear = new JButton("AC");
		btnClear.setFocusable(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(10, 70, 54, 36);
		frmJavaCalculator.getContentPane().add(btnClear);
		
		JButton btnSign = new JButton("+-");
		btnSign.setFocusable(false);
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSign.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSign.setBounds(74, 70, 54, 36);
		frmJavaCalculator.getContentPane().add(btnSign);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "%");
			}
		});
		btnMod.setFocusable(false);
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMod.setBounds(138, 70, 54, 36);
		frmJavaCalculator.getContentPane().add(btnMod);
		
		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "\u00F7");
			}
		});
		btnDiv.setFocusable(false);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(200, 70, 54, 36);
		frmJavaCalculator.getContentPane().add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "7");
			}
		});
		btn7.setFocusable(false);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(10, 117, 54, 36);
		frmJavaCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "8");
			}
		});
		btn8.setFocusable(false);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(74, 117, 54, 36);
		frmJavaCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "9");
			}
		});
		btn9.setFocusable(false);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(138, 117, 54, 36);
		frmJavaCalculator.getContentPane().add(btn9);
		
		JButton btnMult = new JButton("\u00D7");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "\u00D7");
			}
		});
		btnMult.setFocusable(false);
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMult.setBounds(200, 117, 54, 36);
		frmJavaCalculator.getContentPane().add(btnMult);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "4");
			}
		});
		btn4.setFocusable(false);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(10, 164, 54, 36);
		frmJavaCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "5");
			}
		});
		btn5.setFocusable(false);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(74, 164, 54, 36);
		frmJavaCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "6");
			}
		});
		btn6.setFocusable(false);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(138, 164, 54, 36);
		frmJavaCalculator.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "-");
			}
		});
		btnMinus.setFocusable(false);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMinus.setBounds(200, 164, 54, 36);
		frmJavaCalculator.getContentPane().add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.setFocusable(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(10, 211, 54, 36);
		frmJavaCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "2");
			}
		});
		btn2.setFocusable(false);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(74, 211, 54, 36);
		frmJavaCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText(displayText.getText() + "3");
			}
		});
		btn3.setFocusable(false);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(138, 211, 54, 36);
		frmJavaCalculator.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: check if this is the first operator
				displayText.setText(displayText.getText() + "+");
			}
		});
		btnPlus.setFocusable(false);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(200, 211, 54, 36);
		frmJavaCalculator.getContentPane().add(btnPlus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: check if this is the first digit
				displayText.setText(displayText.getText() + "0");
			}
		});
		btn0.setFocusable(false);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(10, 258, 118, 36);
		frmJavaCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: check if there is a decimal point already
				displayText.setText(displayText.getText() + ".");
			}
		});
		btnDot.setFocusable(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(138, 258, 54, 36);
		frmJavaCalculator.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnEqual.setFocusable(false);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(200, 258, 54, 36);
		frmJavaCalculator.getContentPane().add(btnEqual);
	}
	
	/**
	 * parse the textfield and assign value to operands and operator
	 */
	private boolean parseText() {
		String text = displayText.getText();
		int pos = Math.max(text.indexOf("+"), Math.max(text.indexOf("-"), 
				Math.max(text.indexOf("\u00F7"), Math.max(text.indexOf("%"), text.indexOf("\u00D7")))));
		char op = text.charAt(pos);
		switch(op) {
			case '+':
				operator = OP_PLUS;
				break;
			case '-':
				operator = OP_MINUS;
				break;
			case '\u00F7':
				operator = OP_DIV;
				break;
			case '%':
				operator = OP_MOD;
				break;
			case '\u00D7':
				operator = OP_MULT;
				break;
			default:
				break;
		}
		num1 = Double.parseDouble(text.substring(0, pos));
		num2 = Double.parseDouble(text.substring(pos+1));
		return true;
	}
	/**
	 * Compute the result
	 * precondition: num1 and num2 assigned value with operation set
	 */
	private void calculate() {
		if (!parseText()) {
			// TODO : error handling
		}
		switch(operator) {
			case 0: // addition
				ans = num1 + num2;
				break;
			case 1: // subtraction
				ans = num1 - num2;
				break;
			case 2: // multiplication
				ans = num1 * num2;
				break;
			case 3: // division
				if (num2 != 0)
					ans = num1 / num2;
				else
					ans = 0;
				break;
			case 4: // MOD
				ans = (int)num1%(int)num2;
				break;
			default:
				break;
		}
		displayText.setText(String.valueOf(ans));
		operator = -1;
		ans = 0;
		num1 = 0;
		num2 = 0;
	}
}
