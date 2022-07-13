import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
/**
 * This Program calculates how many hours you have been asleep and how many days you have lived.
 * modified 20220221
 * date 20220221
 * @filename SleepApp.java
 * @author Lorrin Shen
 * @version 1.0
 * @see ICS4U Content
 */
public class SleepApp extends JFrame {

	private JPanel JFrame;
	private JTextField txtBDay;
	private JTextField txtBMonth;
	private JTextField txtBYear;
	private JTextField txtTDay;
	private JTextField txtTMonth;
	private JTextField txtTYear;
	private JTextField txtDaysAlive;
	private JTextField txtHoursAsleep;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SleepApp frame = new SleepApp();
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
	public SleepApp() {
		super("Sleep Calculator");
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		JFrame = new JPanel();
		JFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JFrame);
		
		lblError = new JLabel("s");
		JLabel lblBirthIn = new JLabel("Enter your birthdate:");
		
		JLabel title = new JLabel("Sleep Calculator");
		title.setFont(new Font("Tahoma", Font.PLAIN, 22));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTodayIn = new JLabel("Enter Today's Date:");
		
		JLabel lblBDay = new JLabel("Day");
		
		JLabel lblBMonth = new JLabel("Month");
		
		JLabel lblBYear = new JLabel("Year");
		
		JLabel lblTYear = new JLabel("Year");
		
		JLabel lblTMonth = new JLabel("Month");
		
		JLabel lblTDay = new JLabel("Day");
		
		txtBDay = new JTextField();
		txtBDay.setColumns(10);
		
		txtBMonth = new JTextField();
		txtBMonth.setColumns(10);
		
		txtBYear = new JTextField();
		txtBYear.setColumns(10);
		
		txtTDay = new JTextField();
		txtTDay.setColumns(10);
		
		txtTMonth = new JTextField();
		txtTMonth.setColumns(10);
		
		txtTYear = new JTextField();
		txtTYear.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		
		JButton btnExit = new JButton("Exit");
		
		btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
		 btnExit.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnExitActionPerformed(evt);
	            }
	        });
		
		txtDaysAlive = new JTextField();
		txtDaysAlive.setColumns(10);
		
		txtHoursAsleep = new JTextField();
		txtHoursAsleep.setColumns(10);
		
		
		GroupLayout gl_JFrame = new GroupLayout(JFrame);
		gl_JFrame.setHorizontalGroup(
			gl_JFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JFrame.createSequentialGroup()
					.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_JFrame.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_JFrame.createSequentialGroup()
									.addGap(86)
									.addComponent(title, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_JFrame.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblBirthIn, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_JFrame.createSequentialGroup()
									.addGap(192)
									.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_JFrame.createSequentialGroup()
											.addComponent(lblTDay, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblTodayIn, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_JFrame.createSequentialGroup()
											.addComponent(lblTMonth, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_JFrame.createSequentialGroup()
											.addComponent(lblTYear, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_JFrame.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_JFrame.createSequentialGroup()
									.addComponent(lblBMonth, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtBMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_JFrame.createSequentialGroup()
									.addComponent(lblBDay, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtBDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_JFrame.createSequentialGroup()
									.addComponent(lblBYear, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtBYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnCalculate)
								.addComponent(btnExit))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDaysAlive, 242, 242, 242)
								.addComponent(txtHoursAsleep, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
							.addGap(70)))
					.addGap(91))
				.addGroup(gl_JFrame.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblError, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
					.addGap(240))
		);
		gl_JFrame.setVerticalGroup(
			gl_JFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JFrame.createSequentialGroup()
					.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_JFrame.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_JFrame.createSequentialGroup()
									.addGap(42)
									.addComponent(lblTodayIn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addComponent(title, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_JFrame.createSequentialGroup()
									.addGap(11)
									.addGroup(gl_JFrame.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblBDay)
										.addComponent(txtBDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_JFrame.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblBMonth)
										.addComponent(txtBMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTMonth)
										.addComponent(txtTMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_JFrame.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblBYear)
										.addComponent(txtBYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTYear)
										.addComponent(txtTYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_JFrame.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_JFrame.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblTDay)
										.addComponent(txtTDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_JFrame.createSequentialGroup()
							.addGap(48)
							.addComponent(lblBirthIn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCalculate)
						.addComponent(txtDaysAlive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_JFrame.createParallelGroup(Alignment.LEADING)
						.addComponent(txtHoursAsleep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblError)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		JFrame.setLayout(gl_JFrame);
	}
	static public boolean intCheck(String in1, String in2, String in3, String in4, String in5, String in6 ){
    	try {
    		Integer.parseInt(in1);
    		Integer.parseInt(in2);
    		Integer.parseInt(in3);
    		Integer.parseInt(in4);
    		Integer.parseInt(in5);
    		Integer.parseInt(in6);
    		return true;
    	}
    	catch (Exception e ) {
    		return false;
    	}
    }
	static public boolean rangeCheck(int low, int high, int in1, int in2) {
		if (in1>=low && in1<=high && in2>=low && in2<=high) {
			return true;
		}
		else return false;
	}
	private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
		String inBDay, inBMonth, inBYear, inTDay, inTMonth, inTYear;
		int bDay, bMonth, bYear, tDay, tMonth, tYear, daysAlive, hoursAsleep;
		
		inBDay = txtBDay.getText();
		inBMonth = txtBMonth.getText();
		inBYear = txtBYear.getText();
		inTDay = txtTDay.getText();
		inTMonth = txtTMonth.getText();
		inTYear = txtTYear.getText();
		
		if (intCheck(inBDay, inTDay, inBMonth, inTMonth, inBYear, inTYear)) {
			lblError.setText("");
			bDay = Integer.parseInt(inBDay);
			bMonth = Integer.parseInt(inBMonth);
			bYear = Integer.parseInt(inBYear);
			tDay = Integer.parseInt(inTDay);
			tMonth = Integer.parseInt(inTMonth);
			tYear = Integer.parseInt(inTYear);
			
			if(rangeCheck(1,30,bDay,tDay) && rangeCheck(1,12,bMonth, tMonth) && rangeCheck(1,(tYear+1),bYear,tYear)) {
				daysAlive = 0;
				hoursAsleep = 0;
				daysAlive += tMonth * 30;
				daysAlive += tDay;
				daysAlive += tYear * 365;
				daysAlive -= bMonth * 30;
        		daysAlive -= bDay;
        		daysAlive -= bYear * 365;

        		hoursAsleep += daysAlive * 8;
        		if (hoursAsleep<0) {
        			lblError.setText("Error: Incorrect input. Please try again.");
    				txtDaysAlive.setText(""); 
    	    		txtHoursAsleep.setText("");
        		}
        		else {
        		txtDaysAlive.setText("You have been alive for "+Integer.toString(daysAlive)+" days.");
        		txtHoursAsleep.setText("You have slept for "+Integer.toString(hoursAsleep)+" hours.");
        		}
			}
			else {
				lblError.setText("Error: Incorrect input. Please try again.s");
				txtDaysAlive.setText(""); 
	    		txtHoursAsleep.setText("");
			}
        	
		}
		else {
			lblError.setText("Error: Incorrect input. Please try again.");
			txtDaysAlive.setText(""); 
    		txtHoursAsleep.setText("");
		}
        
		
	}
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); // Exit the application.
    }//GEN-LAST:event_btnExitActionPerformed
}
