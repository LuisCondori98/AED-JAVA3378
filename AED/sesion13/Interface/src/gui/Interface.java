package gui;

import padre.Mamifero;
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

public class Interface extends JFrame implements ActionListener {
	
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
					Interface frame = new Interface();
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
	public Interface() {
		setTitle("Interfaz - Semana_13");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(185, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 444, 310);
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
		Gato g = new Gato();
		listado(g);

		Perro p = new Perro();
		listado(p);
	}
	// Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	// Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void listado(Mamifero x) {
   		if (x instanceof Gato)
       		imprimir(">>>  G A T O");
   		else
       		imprimir(">>>  P E R R O");
		
		imprimir("mensaje     :  " + x.mensaje());
		imprimir("hacer ruido :  " + x.hacerRuido());
		
		if (x instanceof Gato) {
			imprimir("vacuna A    :  S/ " + ((Gato) x).vacunaA);
			imprimir("cuidado     :  " + ((Gato) x).cuidado());			
		}
		else {
			imprimir("vacuna A    :  S/ " + ((Perro) x).vacunaA);
			imprimir("vacuna B    :  S/ " + ((Perro) x).vacunaB);
			imprimir("cuidado     :  " + ((Perro) x).cuidado());
			imprimir("peligro     :  " + ((Perro) x).peligro());
		}
		imprimir("");
	}
	
}
