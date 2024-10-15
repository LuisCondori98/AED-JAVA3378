package gui;

import padre.Figura;
import hijos.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_13_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_13_1 frame = new Problema_13_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_13_1() {
		setTitle("Problema 13_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 480, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(185, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 444, 283);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 14));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Circulo cir = new Circulo(30, 40, 10.0);
		listado(cir);

		Cuadrado cua = new Cuadrado(10, 20, 15.0);
		listado(cua);
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void listado(Figura x) {
		imprimir(">>> Datos de " + x.getClass().getName());
		if (x instanceof Circulo) {
			imprimir("ubicación del círculo  :  " + x.ubicacion());
			imprimir("radio                  :  " + ((Circulo)x).radio);
			imprimir("área del círculo       :  " + x.area());
			imprimir(((Circulo)x).dibujar());
		}
		else { 
			imprimir("ubicación del cuadrado :  " + x.ubicacion());
			imprimir("lado                   :  " + ((Cuadrado)x).lado);
			imprimir("área del cuadrado      :  " + x.area());
			imprimir(((Cuadrado)x).dibujar());
			imprimir(((Cuadrado)x).rotar());	
		}
		imprimir("");
	}
	
}
