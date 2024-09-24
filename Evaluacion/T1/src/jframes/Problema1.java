package jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Pregunta1;

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
		
		Pregunta1 pg1 = new Pregunta1(123, 1, 2, "Luis");
		
		imprimir("Codigo \t\t:  " + pg1.getCodigo());
		imprimir("Nombre \t\t:  " + pg1.getNombre());
		imprimir("Categoria \t\t:  " + pg1.getCategoria());
		imprimir("Horas \t\t:  " + pg1.getHoras());
		imprimir("Tarifa \t\t:  " + pg1.getTarifa());
		//
		imprimir("Sueldo Bruto \t\t:  " + pg1.retornarSueldoBruto());
		imprimir("Descuento AFP \t:  " + pg1.retornarDescuentoAFP());
		imprimir("Descuento EPS \t:  " + pg1.retornarDescuentoEPS());
		imprimir("Sueldo Neto \t\t:  " + pg1.retornarSueldoNeto());
		imprimir("\n");
		
		pg1.setHoras(pg1.getHoras() + 8);
		
		imprimir("Codigo \t\t:  " + pg1.getCodigo());
		imprimir("Nombre \t\t:  " + pg1.getNombre());
		imprimir("Categoria \t\t:  " + pg1.getCategoria());
		imprimir("Horas \t\t:  " + pg1.getHoras());
		imprimir("Tarifa \t\t:  " + pg1.getTarifa());
		//
		imprimir("Sueldo Bruto \t\t:  " + pg1.retornarSueldoBruto());
		imprimir("Descuento AFP \t:  " + pg1.retornarDescuentoAFP());
		imprimir("Descuento EPS \t:  " + pg1.retornarDescuentoEPS());
		imprimir("Sueldo Neto \t\t:  " + pg1.retornarSueldoNeto());		
	}
	
	void imprimir(String s) {
		
		txtProblema1.append(s + "\n");
	}
}
