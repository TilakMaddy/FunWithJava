/**********************************************************************************************
 * 	 																						  *
 * 																							  *
 * 				    Tilak  Maddy Java GUI Studio Inc .©       								  *
 *  					All Rights reserved ™ 												  *
 * 																							  *
 * 																							  *
 **********************************************************************************************/

package mathGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class MathGame {
	
    private JOptionPane myfinpane ;
	private JFrame frame;
	private JTextField textFieldName;
	private JPanel pnlStartup;
	private JPanel pnlChoose;
	private JPanel pnlBasicMath;
	private JPanel pnlRightAngles;
	private JPanel pnlMiscellanous;
	public  JLabel lblHiUser;
	private JPanel pnlSum1;
	private ButtonGroup b1;
	private JLabel lblCorrectAnsSum1 ;
	private JPanel pnlSum2;
	private ButtonGroup bgSum2 ;
	private ButtonGroup bg3;
	private JPanel pnlRightAngles_1 ;
	private ButtonGroup bg4; 
	private JPanel pnlRightAngels_2 ;
	private JRadioButton rdbtnRightSum21 ;
	private JRadioButton rdbtnRightSum22 ;
	private JRadioButton rdbtnRightSum23;
	private JRadioButton rdbtnRightSum24 ;
	private JButton btnCheckR2;
	private JLabel lblfindTheTan ;
	private ButtonGroup bgUltimate ;
	private JOptionPane errorPane ;
	private JOptionPane corr ;
	
	// Temporary variables  :- 
	
	private String usrName;
	
	// -----------------   End of Temporary variables   ------------------- 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathGame window = new MathGame();
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
	public MathGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel pnlStartup = new JPanel();
		pnlStartup.setBackground(Color.RED);
		pnlStartup.setBorder(new LineBorder(Color.GREEN, 5));
		frame.getContentPane().add(pnlStartup, "name_479441150883");
		pnlStartup.setLayout(null);
				
		JPanel pnlChoose = new JPanel();
		pnlChoose.setBackground(new Color(255, 165, 0));
		pnlChoose.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 255), 5, true), new BevelBorder(BevelBorder.RAISED, null, new Color(255, 0, 0), null, null)));
		frame.getContentPane().add(pnlChoose, "name_492552390696");
		pnlChoose.setLayout(null);
		
		JPanel pnlSum1= new JPanel();
		frame.getContentPane().add(pnlSum1, "name_6163881536473");
		pnlSum1.setLayout(null);
		pnlSum1.setBackground(new Color(152, 251, 152));
		
		JPanel pnlSum2 = new JPanel();
		pnlSum2.setBackground(new Color(0, 250, 154));
		frame.getContentPane().add(pnlSum2, "name_4850553212744");
		pnlSum2.setLayout(null);
		
		

		JPanel pnlSum3_lastSum = new JPanel();
		pnlSum3_lastSum.setToolTipText("This is the last Sum in the SERIES !!");
		pnlSum3_lastSum.setBackground(new Color(0, 255, 127));
		frame.getContentPane().add(pnlSum3_lastSum, "name_2096495695751");
		pnlSum3_lastSum.setLayout(null);
		
		JPanel pnlRightAngles_1 = new JPanel();
		pnlRightAngles_1.setToolTipText("This is the first sum !! (for dummies)");
		pnlRightAngles_1.setForeground(new Color(0, 0, 0));
		pnlRightAngles_1.setBorder(null);
		frame.getContentPane().add(pnlRightAngles_1, "name_12139306334951");
		pnlRightAngles_1.setLayout(null);
		
		
		JLabel lblRightSum1 = new JLabel("");
		lblRightSum1.setToolTipText("Find the value of \"x\" ");
		lblRightSum1.setIcon(new ImageIcon("C:\\Users\\Chintu\\Documents\\java_eclipse_tilak\\MathGame\\src\\mathGame\\right1.jpg"));
		lblRightSum1.setBounds(91, 26, 237, 154);
		pnlRightAngles_1.add(lblRightSum1);
		

		JPanel pnlRightAngles_2 = new JPanel();
		pnlRightAngles_2.setToolTipText("Second challenge in Right Angles");
		pnlRightAngles_2.setBackground(Color.WHITE);
		pnlRightAngles_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.YELLOW));
		frame.getContentPane().add(pnlRightAngles_2, "name_16208436468037");
		pnlRightAngles_2.setLayout(null);
		
		
		
		JLabel lblRightSum_2 = new JLabel("");
		lblRightSum_2.setToolTipText("Find the tan of marked angle .");
	    lblRightSum_2.setIcon(new ImageIcon("C:\\Users\\Chintu\\Documents\\java_eclipse_tilak\\MathGame\\src\\mathGame\\r2.jpg")); 
		lblRightSum_2.setBounds(98, 40, 249, 153);
		pnlRightAngles_2.add(lblRightSum_2);
		
		
				
		JRadioButton rdbtnRightSum21 = new JRadioButton("0.57");
		rdbtnRightSum21.setBounds(47, 200, 109, 23);
		pnlRightAngles_2.add(rdbtnRightSum21);
		
		JRadioButton rdbtnRightSum22 = new JRadioButton("0.75");
		rdbtnRightSum22.setBounds(47, 232, 109, 23);
		pnlRightAngles_2.add(rdbtnRightSum22);
		
		JRadioButton rdbtnRightSum23 = new JRadioButton("7.05");
		rdbtnRightSum23.setBounds(203, 200, 109, 23);
		pnlRightAngles_2.add(rdbtnRightSum23);
		
		JRadioButton rdbtnRightSum24 = new JRadioButton("5.70");
		rdbtnRightSum24.setBounds(203, 232, 109, 23);
		pnlRightAngles_2.add(rdbtnRightSum24);
		
		// Radio Button Group for Right Angle Sum 2 
		
				bgUltimate = new ButtonGroup();
				bgUltimate.add(rdbtnRightSum21);
				bgUltimate.add(rdbtnRightSum22);
				bgUltimate.add(rdbtnRightSum23);
				bgUltimate.add(rdbtnRightSum24);
				
		// End of set  [!] 

				JButton btnCheckR2 = new JButton("<html><strong>Check <br/>it !</strong></html>");
				btnCheckR2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent eventForSum2Part2) {
						corr = new JOptionPane();
						if(rdbtnRightSum22.isSelected() == true){
							corr.showMessageDialog(null, "Keep up the good work buddy !!", "Success", JOptionPane.PLAIN_MESSAGE);
						}else{
							corr.showMessageDialog(null, "Oh No ! You went wrong ", "Failed to accomplish", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
		btnCheckR2.setBounds(10, 66, 85, 59);
		pnlRightAngles_2.add(btnCheckR2);
		
		JLabel lblfindTheTan = new JLabel("<html><i>Find the tan of angle B</i></html>");
		lblfindTheTan.setBounds(130, 11, 182, 28);
		pnlRightAngles_2.add(lblfindTheTan);
		
		JButton btnPro = new JButton("<html>Proceed <br/>to check out !!</html>");
		btnPro.setBounds(345, 189, 89, 66);
		pnlRightAngles_2.add(btnPro);
		
		

		JLabel lblHintRightSum1 = new JLabel("<html>Take the sin <br/> of \"X\"</html>");
		lblHintRightSum1.setBounds(354, 74, 70, 58);
		pnlRightAngles_1.add(lblHintRightSum1);
		lblHintRightSum1.setVisible(false);
		
		JButton btnHintRightSum1 = new JButton("Hint");
		btnHintRightSum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e12dsg4) {
				lblHintRightSum1.setVisible(true);
			
			}
		});
		btnHintRightSum1.setBounds(335, 143, 89, 23);
		pnlRightAngles_1.add(btnHintRightSum1);
		
		
		JRadioButton rdbtnCorrectAnsRightSum1 = new JRadioButton("0.375");
		rdbtnCorrectAnsRightSum1.setBounds(34, 232, 109, 23);
		pnlRightAngles_1.add(rdbtnCorrectAnsRightSum1);
		
		JRadioButton rdbtn2RightSum1 = new JRadioButton("0.278");
		rdbtn2RightSum1.setBounds(34, 187, 109, 23);
		pnlRightAngles_1.add(rdbtn2RightSum1);
		
		JRadioButton rdbtn3RightSum1 = new JRadioButton("24 ");
		rdbtn3RightSum1.setBounds(232, 187, 109, 23);
		pnlRightAngles_1.add(rdbtn3RightSum1);
		
		JRadioButton rdbtn4RightSum1 = new JRadioButton("2.14");
		rdbtn4RightSum1.setBounds(232, 232, 109, 23);
		pnlRightAngles_1.add(rdbtn4RightSum1);
		
		bg4 = new ButtonGroup();
		
		bg4.add(rdbtn4RightSum1);
		bg4.add(rdbtn3RightSum1);
		bg4.add(rdbtn2RightSum1);
		bg4.add(rdbtnCorrectAnsRightSum1);
		
		JButton btncheck = new JButton("<html><strong>Check <strong></html>");
		btncheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnCorrectAnsRightSum1.isSelected()){
					
					JOptionPane.showMessageDialog(null, "You have answerd correctly " , " Correct Answer Reward ", JOptionPane.PLAIN_MESSAGE);
					
				}else{
					
					JOptionPane.showMessageDialog(null, "You gave the wrong answer" , "Wrong Answer !! (better luck next time)", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		btncheck.setBounds(10, 62, 71, 58);
		pnlRightAngles_1.add(btncheck);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent sudkfy4hus) {
				pnlRightAngles_1.setVisible(false);
				pnlRightAngles_2.setVisible(true);
			}
		});
		
		btnNext_1.setBounds(320, 217, 89, 23);
		pnlRightAngles_1.add(btnNext_1);
		
		JLabel blSum3_lastQ = new JLabel("<html>What is 1 / 7 <strong> times </strong>  77 / 7.7 <br/> when the result is multiplied by 7 to the<br/> power of 7 ?</html>");
		blSum3_lastQ.setFont(new Font("Tahoma", Font.PLAIN, 17));
		blSum3_lastQ.setBounds(20, 38, 315, 118);
		pnlSum3_lastSum.add(blSum3_lastQ);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("6384393.10");
		rdbtnNewRadioButton.setBounds(44, 150, 109, 23);
		pnlSum3_lastSum.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton_7 = new JRadioButton("9999999.21");
		radioButton_7.setBounds(44, 195, 109, 23);
		pnlSum3_lastSum.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("11562306.2");
		radioButton_8.setBounds(207, 150, 109, 23);
		pnlSum3_lastSum.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("1152960.2");
		radioButton_9.setBounds(207, 195, 109, 23);
		pnlSum3_lastSum.add(radioButton_9);
		
		
		
		
		JLabel label = new JLabel("54.31");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 19));
		label.setBounds(53, 82, 86, 46);
		pnlSum1.add(label);
		
		JLabel label_1 = new JLabel("X");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(135, 90, 55, 30);
		pnlSum1.add(label_1);
		
		JLabel label_2 = new JLabel("( 68  /  21)");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_2.setBounds(217, 92, 128, 26);
		pnlSum1.add(label_2);
		
		JRadioButton radioButton = new JRadioButton("175.42");
		radioButton.setBounds(68, 146, 109, 23);
		pnlSum1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("68.42");
		radioButton_1.setBounds(68, 192, 109, 23);
		pnlSum1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("140.92");
		radioButton_2.setBounds(246, 146, 109, 23);
		pnlSum1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("None of the above");
		radioButton_3.setBounds(246, 192, 145, 23);
		pnlSum1.add(radioButton_3);
		JRadioButton radioButtonSum2_1 = new JRadioButton("- 44.98");
		radioButtonSum2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButtonSum2_1.setHorizontalAlignment(SwingConstants.CENTER);
		radioButtonSum2_1.setBounds(37, 161, 109, 23);
		pnlSum2.add(radioButtonSum2_1);
		radioButtonSum2_1.setVisible(true);
		
		JRadioButton radioButton_4 = new JRadioButton("  44.98");
		radioButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton_4.setBounds(233, 207, 109, 23);
		pnlSum2.add(radioButton_4);
		radioButton_4.setVisible(true);
		
		JRadioButton radioButton_5 = new JRadioButton("       44");
		radioButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton_5.setBounds(233, 161, 109, 23);
		pnlSum2.add(radioButton_5);
		radioButton_5.setVisible(true);
		
		JRadioButton radioButton_6 = new JRadioButton("   -  44");
		radioButton_6.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton_6.setBounds(37, 207, 109, 23);
		pnlSum2.add(radioButton_6);
		radioButton_6.setVisible(true);
		
		JLabel lblCorrectAnsSum2 = new JLabel("Correct !!");
		lblCorrectAnsSum2.setBounds(10, 27, 81, 44);
		pnlSum2.add(lblCorrectAnsSum2);
		lblCorrectAnsSum2.setVisible(false);
		
		JLabel lblWrongAnsSum2 = new JLabel("Wrong (Better luck Next Time !!)");
		lblWrongAnsSum2.setBounds(250, 20, 174, 59);
		pnlSum2.add(lblWrongAnsSum2);
		lblWrongAnsSum2.setVisible(false);
		
		JLabel lblSum2Question = new JLabel("( 1 / 45 )  - ( 45 / 1 ) ");
		lblSum2Question.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSum2Question.setBounds(81, 85, 296, 69);
		pnlSum2.add(lblSum2Question);
		lblSum2Question.setVisible(true);
		
		JLabel lblCorrect = new JLabel("<html><strong> <a href=\"www.google.com\">CORRECT</a></strong></htlm>");
		lblCorrect.setBounds(20, 13, 124, 14);
		pnlSum3_lastSum.add(lblCorrect);
		lblCorrect.setVisible(false);
		
		JLabel lblWrong = new JLabel("<html><strong><a href=\"https://www.google.com/ncr\">WRONG<br/><h6>Better luck next time</h6></a></strong><html>");
		lblWrong.setBounds(191, 11, 103, 48);
		pnlSum3_lastSum.add(lblWrong);
		lblWrong.setVisible(false);		
		
		bg3 = new ButtonGroup();
		bg3.add(rdbtnNewRadioButton);
		bg3.add(radioButton_7);
		bg3.add(radioButton_8);
		bg3.add(radioButton_9);
		
		JButton btnNewButton_2 = new JButton("Check it !!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventieoklaiwer) {
				if(radioButton_9.isSelected() == true){
					lblCorrect.setVisible(true);
					lblWrong.setVisible(false);
				}else{
					lblCorrect.setVisible(false);
					lblWrong.setVisible(true);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(224, 228, 185, 34);
		pnlSum3_lastSum.add(btnNewButton_2);
		
		
		// end of 3rd 
		
		bgSum2 = new ButtonGroup();
		
		bgSum2.add(radioButtonSum2_1);
		bgSum2.add(radioButton_4);
		bgSum2.add(radioButton_5);
		bgSum2.add(radioButton_6);
		
		// End of second panel Radio button group .
		
		b1 = new ButtonGroup();
		
		b1.add(radioButton);
		b1.add(radioButton_1);
		b1.add(radioButton_2);
		b1.add(radioButton_3);
		
		JButton btnNextSum1 = new JButton("Next");
		btnNextSum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventNext12) {
				pnlSum2.setVisible(true);
				pnlSum1.setVisible(false);
			}
		});
		btnNextSum1.setBounds(317, 228, 89, 23);
		pnlSum1.add(btnNextSum1);
		
		JLabel lblCorrectAnsSum1 = new JLabel("Correct !!");
		lblCorrectAnsSum1.setBounds(16, 16, 97, 61);
		pnlSum1.add(lblCorrectAnsSum1);
		lblCorrectAnsSum1.setVisible(false);
		
		JLabel lblWrongAnsSum1 = new JLabel("Wrong (Better luck next Time)");
		lblWrongAnsSum1.setBounds(252, 22, 182, 49);
		pnlSum1.add(lblWrongAnsSum1); 
		lblWrongAnsSum1.setVisible(false);
		
		JButton btnCheckAnsSum1 = new JButton("Check ");
		btnCheckAnsSum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eve1) {
				if(radioButton.isSelected() == true){
					lblCorrectAnsSum1.setVisible(true);
					lblWrongAnsSum1.setVisible(false);
				}
				else{
					lblCorrectAnsSum1.setVisible(false);
					lblWrongAnsSum1.setVisible(true);
				}
			}
		});
		btnCheckAnsSum1.setBounds(123, 22, 119, 49);
		pnlSum1.add(btnCheckAnsSum1);
		
		
		JButton btnCheckAnsSum2 = new JButton("Check ");
		btnCheckAnsSum2.setVisible(true);
		btnCheckAnsSum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonSum2_1.isSelected() == true){
						lblCorrectAnsSum2.setVisible(true);
						lblWrongAnsSum2.setVisible(false);
				}
				else{
					lblCorrectAnsSum2.setVisible(false);
					lblWrongAnsSum2.setVisible(true);
				}
			}
		});
		btnCheckAnsSum2.setBounds(121, 25, 119, 49);
		pnlSum2.add(btnCheckAnsSum2);
		btnCheckAnsSum2.setVisible(true);
		
		JLabel lblHintSum2 = new JLabel("Take LCM ");
		lblHintSum2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHintSum2.setVerticalAlignment(SwingConstants.TOP);
		lblHintSum2.setBounds(335, 85, 89, 30);
		pnlSum2.add(lblHintSum2);
		lblHintSum2.setVisible(false);
		lblHintSum2.setFont(new Font("Serif" , Font.ITALIC , 16));
		
		
		JButton btnHint = new JButton("Hint");
		btnHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHintSum2.setVisible(true);
				
			}
		});
		btnHint.setBounds(345, 131, 64, 23);
		pnlSum2.add(btnHint);
		
		JButton btnNewButton = new JButton("Next ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventRandom56) {
				
			pnlSum3_lastSum.setVisible(true);
			pnlSum2.setVisible(false);
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.setBounds(300, 239, 109, 23);
		pnlSum2.add(btnNewButton);
		btnHint.setVisible(true);
		
		JPanel pnlFinishCommon = new JPanel();
		frame.getContentPane().add(pnlFinishCommon, "name_4838809180294");
		pnlFinishCommon.setLayout(null);
		pnlFinishCommon.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("<html> Finish the <br/> TEST !!</html>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pnlFinishCommon.setVisible(true);
		    pnlSum3_lastSum.setVisible(false);		
			}
		});
		btnNewButton_1.setToolTipText("Finish the test and go to see the score !!");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(327, 11, 97, 93);
		pnlSum3_lastSum.add(btnNewButton_1);
		
		try{
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Chintu\\Documents\\java_eclipse_tilak\\MathGame\\src\\mathGame\\finish.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		pnlFinishCommon.add(lblNewLabel);
		  
		}catch(Exception jsfsa){
			System.out.printf("%s", "Error occured");
			errorPane = new JOptionPane();
			errorPane.showMessageDialog(null, "Failed to load resources" , "Warning" , JOptionPane.WARNING_MESSAGE);			
		}
		JPanel pnlIdentities = new JPanel();
		frame.getContentPane().add(pnlIdentities, "name_1924837379233");
		
		JPanel pnlMiscellanous = new JPanel();
		frame.getContentPane().add(pnlMiscellanous, "name_1850986854608");
		pnlMiscellanous.setLayout(new CardLayout(0, 0));
		
		// Chose  :Jpanel Components ...
		
		
		JLabel lblChooseOne = new JLabel("Choose one  of the options : ");
		lblChooseOne.setBackground(new Color(178, 34, 34));
		lblChooseOne.setForeground(new Color(255, 0, 0));
		lblChooseOne.setFont(new Font("Ravie", Font.BOLD, 12));
		lblChooseOne.setBounds(36, 31, 261, 26);
		pnlChoose.add(lblChooseOne);
		
		
		JButton btnRightAngels = new JButton("Right Angles");
		btnRightAngels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlChoose.setVisible(false);
				pnlRightAngles_1.setVisible(true);
			}
		});
		btnRightAngels.setForeground(new Color(34, 139, 34));
		btnRightAngels.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnRightAngels.setBounds(136, 134, 108, 23);
		pnlChoose.add(btnRightAngels);
		
		JButton btnIdentities = new JButton("Identities");
		btnIdentities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				myfinpane.showMessageDialog(null,  "Stay tuned till it releases officially from Maddy" ,"Stay tuned", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnIdentities.setForeground(new Color(34, 139, 34));
		btnIdentities.setBounds(136, 190, 108, 23);
		pnlChoose.add(btnIdentities);
		
		
		JButton btnMiscellanous = new JButton("<html>Miscellanous <br/>(with Trignometry)</html>");
		btnMiscellanous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myfinpane.showMessageDialog(null,  "Stay tuned till it releases officially from Maddy" , "Stay tuned" , JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnMiscellanous.setBackground(new Color(0, 255, 255));
		btnMiscellanous.setFont(new Font("Levenim MT", Font.BOLD, 11));
		btnMiscellanous.setBounds(277, 109, 115, 75);
		pnlChoose.add(btnMiscellanous);
		
		
		// Startup : JPanel components ...
		
		JTextField textFieldName = new JTextField ();
		textFieldName = new JTextField();
		textFieldName.setBackground(Color.YELLOW);
		textFieldName.setFont(new Font("Ravie", Font.BOLD, 24));
		textFieldName.setForeground(Color.BLUE);
		textFieldName.setBounds(98, 143, 214, 52);
		textFieldName.setAutoscrolls(false);
		pnlStartup.add(textFieldName);
		textFieldName.setColumns(10);
		thehandler h = new thehandler();
		textFieldName.addActionListener(h);
		
		
		Label lblFieldNamePrompter = new Label("Enter your name .");
		lblFieldNamePrompter.setForeground(new Color(34, 139, 34));
		lblFieldNamePrompter.setFont(new Font("Palatino Linotype", Font.BOLD, 12));
		lblFieldNamePrompter.setBackground(Color.CYAN);
		lblFieldNamePrompter.setAlignment(Label.CENTER);
		lblFieldNamePrompter.setBounds(149, 85, 107, 39);
		pnlStartup.add(lblFieldNamePrompter);
		
		JButton btnNext = new JButton("Proceed -->>>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0 ) {
				
			
				
				 pnlStartup.setVisible(false);
				 pnlChoose.setVisible(true);
				 
			     pnlMiscellanous.setVisible(false);
			    
			    rim();
			
			    
			}

			private void rim() {
				// TODO Auto-generated method stub
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, " Welcome to the Fun world " , "Welcome Note", JOptionPane.PLAIN_MESSAGE);
				jop.setToolTipText("Welcome brothers and sisters .");
			}
					
		});
		
		JButton btnBaiscMath = new JButton("Baisc Math");
		btnBaiscMath.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				pnlSum1.setVisible(true);
				pnlChoose.setVisible(false);
				pnlIdentities.setVisible(false);
			    pnlRightAngles_1.setVisible(false); 
			}
		});
		btnBaiscMath.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnBaiscMath.setForeground(new Color(0, 100, 0));
		btnBaiscMath.setBounds(136, 79, 108, 23);
		pnlChoose.add(btnBaiscMath);
		
		
		btnNext.setBackground(new Color(224, 255, 255));
		btnNext.setBounds(267, 217, 124, 34);
		pnlStartup.add(btnNext);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_19449838467225");
		
		
	}
	
	private class thehandler implements ActionListener{

		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			JTextField textFieldName = new JTextField();
			if(event.getSource()==textFieldName){
				// Do nothing
				if(event.getActionCommand().isEmpty() != false){
					
				}
				else{
					
				}
			}
		}
		private  void jimyk() {
		
			JOptionPane jop = new JOptionPane();
			jop.showMessageDialog(null, " Welcome to the Fun world " , "Welcome Note", JOptionPane.PLAIN_MESSAGE);
			jop.setToolTipText("Welcome brothers and sisters .");
		}
		
		
	}
}
