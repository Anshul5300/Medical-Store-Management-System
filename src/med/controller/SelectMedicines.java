package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;

public class SelectMedicines {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectMedicines window = new SelectMedicines();
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
	public SelectMedicines() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Medicines");
		frame.setBounds(700, 200, 555, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(233, 637, 97, 25);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinalOrder.main(null);
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnAdd);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(176, 47, 38, 22);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1.setBounds(176, 103, 38, 22);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_2.setBounds(176, 152, 38, 22);
		frame.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(176, 207, 38, 22);
		frame.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_4.setBounds(176, 260, 38, 22);
		frame.getContentPane().add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_5.setBounds(176, 317, 38, 22);
		frame.getContentPane().add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_6.setBounds(176, 375, 38, 22);
		frame.getContentPane().add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7.setBounds(176, 433, 38, 22);
		frame.getContentPane().add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_8.setBounds(176, 488, 38, 22);
		frame.getContentPane().add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_9.setBounds(176, 540, 38, 22);
		frame.getContentPane().add(spinner_9);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_10.setBounds(468, 47, 38, 22);
		frame.getContentPane().add(spinner_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_11.setBounds(468, 103, 38, 22);
		frame.getContentPane().add(spinner_11);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_12.setBounds(468, 152, 38, 22);
		frame.getContentPane().add(spinner_12);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_13.setBounds(468, 207, 38, 22);
		frame.getContentPane().add(spinner_13);
		
		JSpinner spinner_14 = new JSpinner();
		spinner_14.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_14.setBounds(468, 260, 38, 22);
		frame.getContentPane().add(spinner_14);
		
		JSpinner spinner_15 = new JSpinner();
		spinner_15.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_15.setBounds(468, 317, 38, 22);
		frame.getContentPane().add(spinner_15);
		
		JSpinner spinner_16 = new JSpinner();
		spinner_16.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_16.setBounds(468, 375, 38, 22);
		frame.getContentPane().add(spinner_16);
		
		JSpinner spinner_17 = new JSpinner();
		spinner_17.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_17.setBounds(468, 433, 38, 22);
		frame.getContentPane().add(spinner_17);
		
		JSpinner spinner_18 = new JSpinner();
		spinner_18.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_18.setBounds(468, 488, 38, 22);
		frame.getContentPane().add(spinner_18);
		
		JSpinner spinner_19 = new JSpinner();
		spinner_19.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_19.setBounds(468, 540, 38, 22);
		frame.getContentPane().add(spinner_19);
		
		JLabel lblNewLabel = new JLabel("Acetaminophen");
		lblNewLabel.setBounds(51, 50, 104, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adderall");
		lblNewLabel_1.setBounds(51, 106, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ciprofloxacin");
		lblNewLabel_2.setBounds(51, 155, 104, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cymbalta");
		lblNewLabel_3.setBounds(51, 210, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Doxycycline");
		lblNewLabel_4.setBounds(51, 263, 82, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gabapentin");
		lblNewLabel_5.setBounds(51, 320, 82, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ibuprofen");
		lblNewLabel_6.setBounds(51, 378, 56, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Lexapro");
		lblNewLabel_7.setBounds(51, 436, 56, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Lisinopril");
		lblNewLabel_8.setBounds(51, 491, 56, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Loratadine");
		lblNewLabel_9.setBounds(51, 543, 82, 16);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Lorazepam");
		lblNewLabel_10.setBounds(331, 50, 75, 16);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Metformin");
		lblNewLabel_11.setBounds(331, 106, 88, 16);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Metoprolol");
		lblNewLabel_12.setBounds(331, 155, 88, 16);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Naproxen");
		lblNewLabel_13.setBounds(331, 210, 56, 16);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Omeprazole");
		lblNewLabel_14.setBounds(331, 263, 88, 16);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Oxycodone");
		lblNewLabel_15.setBounds(331, 320, 75, 16);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Pantoprazole");
		lblNewLabel_16.setBounds(331, 378, 88, 16);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Wellbutrin");
		lblNewLabel_17.setBounds(331, 436, 88, 16);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Xanax");
		lblNewLabel_18.setBounds(331, 491, 56, 16);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Zoloft");
		lblNewLabel_19.setBounds(331, 543, 56, 16);
		frame.getContentPane().add(lblNewLabel_19);
	}
}
