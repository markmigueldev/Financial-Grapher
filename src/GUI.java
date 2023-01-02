import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JLabel lblNewLabel_2_1_5;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Average Free Cash Flow Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 325);
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 47, 50, 25);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 47, 50, 25);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(252, 47, 50, 25);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(312, 47, 50, 25);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(614, 47, 50, 25);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(554, 47, 50, 25);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(494, 47, 50, 25);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(434, 47, 50, 25);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(372, 47, 50, 25);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(674, 47, 50, 25);
		getContentPane().add(textField_10);
		
		JLabel lblNewLabel = new JLabel("-10");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(132, 11, 50, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 11, 50, 25);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("EPS");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(10, 47, 112, 25);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("-9");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(192, 11, 50, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("-8");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(252, 11, 50, 25);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("-7");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(312, 11, 50, 25);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("-6");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(372, 11, 50, 25);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("-5");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(432, 11, 50, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("-4");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(492, 11, 50, 25);
		getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("-3");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(552, 11, 50, 25);
		getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("-2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(614, 11, 50, 25);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_2 = new JLabel("-1");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(674, 11, 50, 25);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Dividend");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(10, 83, 112, 25);
		getContentPane().add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 83, 50, 25);
		getContentPane().add(textField);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(192, 83, 50, 25);
		getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(252, 83, 50, 25);
		getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(312, 83, 50, 25);
		getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(372, 83, 50, 25);
		getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(434, 83, 50, 25);
		getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(494, 83, 50, 25);
		getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(554, 83, 50, 25);
		getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(614, 83, 50, 25);
		getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(674, 83, 50, 25);
		getContentPane().add(textField_19);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Book Value");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_2.setBounds(10, 119, 112, 25);
		getContentPane().add(lblNewLabel_2_1_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(132, 119, 50, 25);
		getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(192, 119, 50, 25);
		getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(252, 119, 50, 25);
		getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(312, 119, 50, 25);
		getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(372, 119, 50, 25);
		getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(434, 119, 50, 25);
		getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(494, 119, 50, 25);
		getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(554, 119, 50, 25);
		getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(614, 119, 50, 25);
		getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(674, 119, 50, 25);
		getContentPane().add(textField_29);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Return On Equity");
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_3.setBounds(10, 155, 112, 25);
		getContentPane().add(lblNewLabel_2_1_3);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(132, 155, 50, 25);
		getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(192, 155, 50, 25);
		getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(252, 155, 50, 25);
		getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(312, 155, 50, 25);
		getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(372, 155, 50, 25);
		getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(434, 155, 50, 25);
		getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(494, 155, 50, 25);
		getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(554, 155, 50, 25);
		getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(614, 155, 50, 25);
		getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(674, 155, 50, 25);
		getContentPane().add(textField_39);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Current Ratio");
		lblNewLabel_2_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_4.setBounds(10, 191, 112, 25);
		getContentPane().add(lblNewLabel_2_1_4);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(132, 191, 50, 25);
		getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(192, 191, 50, 25);
		getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(252, 191, 50, 25);
		getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(312, 191, 50, 25);
		getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(372, 191, 50, 25);
		getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(434, 191, 50, 25);
		getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(494, 191, 50, 25);
		getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(554, 191, 50, 25);
		getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(614, 191, 50, 25);
		getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(674, 191, 50, 25);
		getContentPane().add(textField_49);
		
		JButton btnCalculate_4_1 = new JButton("Graph");
		btnCalculate_4_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalculate_4_1.setBounds(734, 47, 90, 205);
		getContentPane().add(btnCalculate_4_1);
		
		lblNewLabel_2_1_5 = new JLabel("Debt/Equity");
		lblNewLabel_2_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_5.setBounds(10, 227, 112, 25);
		getContentPane().add(lblNewLabel_2_1_5);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(132, 227, 50, 25);
		getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(192, 227, 50, 25);
		getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(252, 227, 50, 25);
		getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(312, 227, 50, 25);
		getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(372, 227, 50, 25);
		getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(434, 227, 50, 25);
		getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(494, 227, 50, 25);
		getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(554, 227, 50, 25);
		getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(614, 227, 50, 25);
		getContentPane().add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(674, 227, 50, 25);
		getContentPane().add(textField_59);
	}
}
