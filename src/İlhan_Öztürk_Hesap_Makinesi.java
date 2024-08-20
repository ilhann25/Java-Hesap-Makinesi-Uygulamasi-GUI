import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class İlhan_Öztürk_Hesap_Makinesi extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Asİşlemler;
	private String operator = "";
	private double num1 = 0, num2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					İlhan_Öztürk_Hesap_Makinesi frame = new İlhan_Öztürk_Hesap_Makinesi();
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
	public İlhan_Öztürk_Hesap_Makinesi() {
		setForeground(SystemColor.inactiveCaption);
		setTitle("İLHAN ÖZTÜRK HESAP MAKİNESİ");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 50, 50, 500));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel İşlemler = new JPanel();
		İşlemler.setBounds(0, 10, 442, 74);
		contentPane.add(İşlemler);
		İşlemler.setLayout(null);
		
		Asİşlemler = new JTextField();
		Asİşlemler.setHorizontalAlignment(SwingConstants.RIGHT);
		Asİşlemler.setFont(new Font("Tahoma", Font.BOLD, 25));
		Asİşlemler.setBounds(10, 10, 432, 54);
		İşlemler.add(Asİşlemler);
		Asİşlemler.setColumns(10);
		
		JPanel Girişler = new JPanel();
		Girişler.setBounds(0, 115, 442, 357);
		contentPane.add(Girişler);
		Girişler.setLayout(new GridLayout(0, 4, 21, 21));
		
		// Sayılar için ActionListener
		ActionListener numberListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				Asİşlemler.setText(Asİşlemler.getText() + source.getText());
			}
		};
		
		// İşlemler için ActionListener
		ActionListener operatorListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				num1 = Double.parseDouble(Asİşlemler.getText());
				operator = source.getText();
				Asİşlemler.setText("");
			}
		};
		
		JButton btnNewButton_12 = new JButton("7");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_12.addActionListener(numberListener);
		Girişler.add(btnNewButton_12);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.addActionListener(numberListener);
		Girişler.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6.addActionListener(numberListener);
		Girişler.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.addActionListener(operatorListener);
		Girişler.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.addActionListener(numberListener);
		Girişler.add(btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_7.addActionListener(numberListener);
		Girişler.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_5.addActionListener(numberListener);
		Girişler.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("-");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.addActionListener(operatorListener);
		Girişler.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.addActionListener(numberListener);
		Girişler.add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_8.addActionListener(numberListener);
		Girişler.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("3");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9.addActionListener(numberListener);
		Girişler.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_10.addActionListener(operatorListener);
		Girişler.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("C");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Asİşlemler.setText("");
				num1 = 0;
				num2 = 0;
				operator = "";
			}
		});
		Girişler.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_13.addActionListener(numberListener);
		Girişler.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("÷");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_14.addActionListener(operatorListener);
		Girişler.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_15.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(Asİşlemler.getText());
				double result = 0;
				
				//basit sayısal işlemler 
				switch(operator) {
					case "+": result = num1 + num2; break;
					case "-": result = num1 - num2; break;
					case "*": result = num1 * num2; break;
					case "÷": result = num1 / num2; break;
				}
				Asİşlemler.setText(String.valueOf(result));
			}
		});
		Girişler.add(btnNewButton_15);
	}
}