package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hijo.Auto;
import hijo.Avion;
import hijo.Bicicleta;
import hijo.Helicoptero;
import hijo.Moto;
import padre.Transporte;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa extends JFrame implements ActionListener {

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
					Programa frame = new Programa();
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
	public Programa() {
		setTitle("Clases Abstractas e Interfaces");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(161, 11, 89, 23);
		contentPane.add(btnProcesar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 413, 513);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Auto aut = new Auto(5);
		listado(aut);
		imprimir("");
		
		Bicicleta bic = new Bicicleta(1);
		listado(bic);
		imprimir("");
		
		Moto mot = new Moto(2);
		listado(mot);
		imprimir("");
		
		Helicoptero hel = new Helicoptero(10);
		listado(hel);
		imprimir(hel.subir());
		imprimir(hel.bajar());
		imprimir("");
		
		Avion avi = new Avion(300);
		listado(avi);
		imprimir(avi.subir());
		imprimir(avi.bajar());
	}

	void listado(Transporte x) {
		imprimir(x.mostrarCapacidad());
		imprimir(x.avanzar());
		imprimir(x.detener());
		imprimir(x.retroceder());
	}

	// Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}

	// Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
}
