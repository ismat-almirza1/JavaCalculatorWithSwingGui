// Author : Ismat Almirza

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ekran;
	double say1, say2, memory;
	double netice;
	String emeliyyat = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		setForeground(new Color(192, 192, 192));
		setResizable(false);
		setFont(new Font("Times New Roman", Font.PLAIN, 14));
		setBackground(new Color(192, 192, 192));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/Icon/icon512.png")));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ekran.setText(ekran.getText() + "0");

			}
		});
		btnNewButton0.setForeground(Color.BLACK);
		btnNewButton0.setBackground(new Color(51, 153, 51));
		btnNewButton0.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton0.setBounds(5, 265, 50, 50);
		contentPane.add(btnNewButton0);

		JButton btnNewButton00 = new JButton("00");
		btnNewButton00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ekran.getText().equals("")) {
					ekran.setText("");
				} else {
					ekran.setText(ekran.getText() + "00");

				}

			}
		});
		btnNewButton00.setForeground(Color.BLACK);
		btnNewButton00.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton00.setBackground(new Color(51, 153, 51));
		btnNewButton00.setBounds(57, 265, 50, 50);
		contentPane.add(btnNewButton00);

		JButton btnNewButtonMP = new JButton("M+");
		btnNewButtonMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ekran.getText().equals("")) {
					ekran.setText("");
				} else {
					memory = Double.parseDouble(ekran.getText());
					ekran.setText("");

				}
				
			}
		});
		btnNewButtonMP.setForeground(Color.BLACK);
		btnNewButtonMP.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonMP.setBackground(new Color(51, 153, 51));
		btnNewButtonMP.setBounds(161, 57, 102, 50);
		contentPane.add(btnNewButtonMP);

		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "3");

			}
		});
		btnNewButton3.setForeground(Color.BLACK);
		btnNewButton3.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton3.setBackground(new Color(51, 153, 51));
		btnNewButton3.setBounds(109, 213, 50, 50);
		contentPane.add(btnNewButton3);

		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "1");

			}
		});
		btnNewButton1.setForeground(Color.BLACK);
		btnNewButton1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton1.setBackground(new Color(51, 153, 51));
		btnNewButton1.setBounds(5, 213, 50, 50);
		contentPane.add(btnNewButton1);

		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "2");

			}
		});
		btnNewButton2.setForeground(Color.BLACK);
		btnNewButton2.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton2.setBackground(new Color(51, 153, 51));
		btnNewButton2.setBounds(57, 213, 50, 50);
		contentPane.add(btnNewButton2);

		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "4");

			}
		});
		btnNewButton4.setForeground(Color.BLACK);
		btnNewButton4.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton4.setBackground(new Color(51, 153, 51));
		btnNewButton4.setBounds(5, 161, 50, 50);
		contentPane.add(btnNewButton4);

		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "5");

			}
		});
		btnNewButton5.setForeground(Color.BLACK);
		btnNewButton5.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton5.setBackground(new Color(51, 153, 51));
		btnNewButton5.setBounds(57, 161, 50, 50);
		contentPane.add(btnNewButton5);

		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "6");
			}
		});
		btnNewButton6.setForeground(Color.BLACK);
		btnNewButton6.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton6.setBackground(new Color(51, 153, 51));
		btnNewButton6.setBounds(109, 161, 50, 50);
		contentPane.add(btnNewButton6);

		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "7");

			}
		});
		btnNewButton7.setForeground(Color.BLACK);
		btnNewButton7.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton7.setBackground(new Color(51, 153, 51));
		btnNewButton7.setBounds(5, 109, 50, 50);
		contentPane.add(btnNewButton7);

		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "8");
			}
		});
		btnNewButton8.setForeground(Color.BLACK);
		btnNewButton8.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton8.setBackground(new Color(51, 153, 51));
		btnNewButton8.setBounds(57, 109, 50, 50);
		contentPane.add(btnNewButton8);

		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "9");
			}
		});
		btnNewButton9.setForeground(Color.BLACK);
		btnNewButton9.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton9.setBackground(new Color(51, 153, 51));
		btnNewButton9.setBounds(109, 109, 50, 50);
		contentPane.add(btnNewButton9);

		JButton btnNewButtonC = new JButton("C");
		btnNewButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText("");
			}
		});
		btnNewButtonC.setForeground(Color.BLACK);
		btnNewButtonC.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonC.setBackground(new Color(51, 153, 51));
		btnNewButtonC.setBounds(5, 57, 102, 50);
		contentPane.add(btnNewButtonC);

		JButton btnNewButtonM = new JButton("M");
		btnNewButtonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(Double.toString(memory));
			}
		});
		btnNewButtonM.setForeground(Color.BLACK);
		btnNewButtonM.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonM.setBackground(new Color(51, 153, 51));
		btnNewButtonM.setBounds(109, 57, 50, 50);
		contentPane.add(btnNewButtonM);

		JButton btnNewButtonMinus = new JButton("-");
		btnNewButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ekran.getText().equals("")) {
					say1 = Double.parseDouble(ekran.getText());
					emeliyyat = "cixma";
					ekran.setText("");

				}
			}
		});
		btnNewButtonMinus.setForeground(Color.BLACK);
		btnNewButtonMinus.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonMinus.setBackground(new Color(51, 153, 51));
		btnNewButtonMinus.setBounds(213, 161, 50, 50);
		contentPane.add(btnNewButtonMinus);

		JButton btnNewButtonMultip = new JButton("x");
		btnNewButtonMultip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ekran.getText().equals("")) {
					say1 = Double.parseDouble(ekran.getText());
					emeliyyat = "vurma";
					ekran.setText("");

				}
			}
		});
		btnNewButtonMultip.setForeground(Color.BLACK);
		btnNewButtonMultip.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonMultip.setBackground(new Color(51, 153, 51));
		btnNewButtonMultip.setBounds(161, 161, 50, 50);
		contentPane.add(btnNewButtonMultip);

		JButton btnNewButtonDot = new JButton(".");
		btnNewButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ekran.getText().equals("")) {
					ekran.setText(".");

				}
				if (!ekran.getText().contains(".")) {
					ekran.setText(ekran.getText() + ".");

				}
			}
		});

		btnNewButtonDot.setForeground(Color.BLACK);
		btnNewButtonDot.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonDot.setBackground(new Color(51, 153, 51));
		btnNewButtonDot.setBounds(109, 265, 50, 50);
		contentPane.add(btnNewButtonDot);

		JButton btnNewButtonPlus = new JButton("+");
		btnNewButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ekran.getText().equals("")) {
					say1 = Double.parseDouble(ekran.getText());
					emeliyyat = "topla";
					ekran.setText("");

				}
			}
		});
		btnNewButtonPlus.setForeground(Color.RED);
		btnNewButtonPlus.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonPlus.setBackground(new Color(51, 153, 51));
		btnNewButtonPlus.setBounds(161, 213, 50, 102);
		contentPane.add(btnNewButtonPlus);

		JButton btnNewButtonBeraber = new JButton("=");
		btnNewButtonBeraber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ekran.getText().equals("")) {
					say2 = Double.parseDouble(ekran.getText());
					if (emeliyyat == "topla") {
						netice = say1 + say2;
						ekran.setText(Double.toString(netice));
					} else if (emeliyyat == "cixma") {
						netice = say1 - say2;
						ekran.setText(Double.toString(netice));
					} else if (emeliyyat == "vurma") {
						netice = say1 * say2;
						ekran.setText(Double.toString(netice));
					} else if (emeliyyat == "bolme") {
						netice = say1 / say2;
						ekran.setText(Double.toString(netice));
					}else if (emeliyyat == "faiz") {
						netice = (say1 * say2)/100;
						ekran.setText(Double.toString(netice));
					}

				}

			}
		});
		btnNewButtonBeraber.setForeground(Color.RED);
		btnNewButtonBeraber.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonBeraber.setBackground(new Color(51, 153, 51));
		btnNewButtonBeraber.setBounds(213, 213, 50, 102);
		contentPane.add(btnNewButtonBeraber);

		JButton btnNewButtonDivision = new JButton("/");
		btnNewButtonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ekran.getText().equals("")) {
					say1 = Double.parseDouble(ekran.getText());
					emeliyyat = "bolme";
					ekran.setText("");

				}
			}
		});
		btnNewButtonDivision.setForeground(Color.BLACK);
		btnNewButtonDivision.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonDivision.setBackground(new Color(51, 153, 51));
		btnNewButtonDivision.setBounds(161, 109, 50, 50);
		contentPane.add(btnNewButtonDivision);

		JButton btnNewButtonMod = new JButton("%");
		btnNewButtonMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ekran.getText().equals("")) {
					say1 = Double.parseDouble(ekran.getText());
					emeliyyat = "faiz";
					ekran.setText("");

				}
			}
		});
		btnNewButtonMod.setForeground(Color.BLACK);
		btnNewButtonMod.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButtonMod.setBackground(new Color(51, 153, 51));
		btnNewButtonMod.setBounds(213, 109, 50, 50);
		contentPane.add(btnNewButtonMod);

		ekran = new JTextField();
		ekran.setBackground(Color.LIGHT_GRAY);
		ekran.setForeground(Color.BLACK);
		ekran.setHorizontalAlignment(SwingConstants.RIGHT);
		ekran.setFont(new Font("DS-Digital", Font.BOLD, 26));
		ekran.setBounds(5, 6, 256, 39);
		contentPane.add(ekran);
		ekran.setColumns(10);

	}
}
