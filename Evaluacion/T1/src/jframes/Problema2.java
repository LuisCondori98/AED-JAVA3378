package jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Pregunta2;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema2 extends JFrame {

	private JPanel contentPane;
	private JButton btnProblema2;
	private JTextArea txtProblema2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema2 frame = new Problema2();
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
	public Problema2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 796);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProblema2 = new JButton("Procesar");
		btnProblema2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnProblema2(e);
			}
		});
		btnProblema2.setBounds(225, 11, 89, 23);
		contentPane.add(btnProblema2);
		
		txtProblema2 = new JTextArea();
		txtProblema2.setBounds(10, 45, 486, 701);
		contentPane.add(txtProblema2);
	}

	protected void actionPerformedBtnProblema2(ActionEvent e) {
		
		Pregunta2 Asesor = new Pregunta2(123, 9, 200.9, "Juanjo");
		Pregunta2 Asesor2 = new Pregunta2(456, 380.9);
		Pregunta2 Asesor3 = new Pregunta2();
		//Pregunta2 Asesor4 = new Pregunta2(963, 4, 590.9, "Fiorella");
		
		listado(Asesor);
		imprimir("\n");
		listado(Asesor2);
		imprimir("\n");
		listado(Asesor3);
		imprimir("");
		//listado(Asesor4);
		//imprimir("");
		//-	Muestre el factor de descuento, la cantidad de objetos creados y la suma de los sueldos netos
		imprimir("Factor de descuento \t:" + Asesor.FACTOR_DSCTO);
		imprimir("Cantidad de objetos creados \t:" + Asesor.getcAsesores());
		imprimir("Suma de Sueldos Netos \t:" + Asesor.getaAsesores());
	}
	
	void listado(Pregunta2 x) {
		
		imprimir("Dir Mem. \t\t: " + x);
		imprimir("Codigo \t\t: " + x.getCodigo());
		imprimir("Cantidad de asesorias \t: " + x.getCantAsesorias());
		imprimir("Tarifa por asesoria \t: " + x.getTarifaAsesoria());
		imprimir("Asesor \t\t: " + x.getAsesor());
		imprimir("Sueldo Bruto \t\t: " + x.retornarSueldoBruto());
		imprimir("Descuento \t\t: " + x.retornarDescuento());
		imprimir("Sueldo Neto \t\t: " + x.retornarSueldoNeto());
	}
	
	void imprimir(String s) {
		
		txtProblema2.append(s + "\n");
	}
}
