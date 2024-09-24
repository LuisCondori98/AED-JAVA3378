package jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema1 extends JFrame {

	private JPanel contentPane;
	private JButton btnProblema1;
	private JTextArea txtProblema1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema1 frame = new Problema1();
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
	public Problema1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProblema1 = new JButton("Procesar");
		btnProblema1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnProblema1(arg0);
			}
		});
		btnProblema1.setBounds(209, 11, 89, 23);
		contentPane.add(btnProblema1);
		
		txtProblema1 = new JTextArea();
		txtProblema1.setBounds(10, 38, 481, 466);
		contentPane.add(txtProblema1);
	}
	
	protected void actionPerformedBtnProblema1(ActionEvent arg0) {
		
		
	}
}