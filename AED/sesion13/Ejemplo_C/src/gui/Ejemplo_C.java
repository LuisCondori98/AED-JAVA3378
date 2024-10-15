package gui;

import herencia.*;

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

public class Ejemplo_C extends JFrame implements ActionListener {
	
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
					Ejemplo_C frame = new Ejemplo_C();
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
	public Ejemplo_C() {
		setTitle("Ejemplo_C - Semana_13");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 480, 840);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(185, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 444, 723);
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
			//  Upcasting
			Object oa = new Animal();
			Object om = new Mamifero();
			Object op = new Perro();
			Animal am = new Mamifero();
			Animal ap = new Perro();
			Mamifero mp = new Perro();

			imprimir("U P C A S T I N G");
		
			imprimir(">>> Objeto am");
			imprimir("hacer ruido :  " + am.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto ap");
			imprimir("hacer ruido :  " + ap.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto mp");
			imprimir("mensaje     :  " + mp.mensaje());
			imprimir("hacer ruido :  " + mp.hacerRuido());
			imprimir("");

			//  Downcasting
			Animal    ao = (Animal) oa;
			Mamifero  mo = (Mamifero) om;
			Perro     po = (Perro) op;
			Mamifero  ma = (Mamifero) am;
			Perro     pa = (Perro) ap;
			Perro     pm = (Perro) mp;

			imprimir("D O W N C A S T I N G");
			imprimir(">>> Objeto ao");
			imprimir("hacer ruido :  " + ao.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto mo");
			imprimir("mensaje     :  " + mo.mensaje());
			imprimir("hacer ruido :  " + mo.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto po");
			imprimir("mensaje     :  " + po.mensaje());
			imprimir("hacer ruido :  " + po.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto ma");
			imprimir("mensaje     :  " + ma.mensaje());
			imprimir("hacer ruido :  " + ma.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto pa");
			imprimir("mensaje     :  " + pa.mensaje());
			imprimir("hacer ruido :  " + pa.hacerRuido());
			imprimir("");

			imprimir(">>> Objeto pm");
			imprimir("mensaje     :  " + pm.mensaje());
			imprimir("hacer ruido :  " + pm.hacerRuido());
			imprimir("");

			// Animal  aa = new Animal();
			// No se puede convertir un objeto Animal
			// en un objeto Perro. ERROR

			//  Perro pp = (Perro) aa;
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void listado() {

	}
	
}
