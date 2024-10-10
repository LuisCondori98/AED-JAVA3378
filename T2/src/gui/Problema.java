package gui;

import clase.ArregloTarifas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel btnEliminar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnAdicionar;
	private JButton btnEliminarTodo;
	private JButton btnEliminarFinal;
	private JButton btnReemplazar;
	private JButton btnIncrementar;
	private JButton btnEliminarTarifa;
	private JTextField txtTarifa;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema frame = new Problema();
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
	public Problema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 581);
		btnEliminar = new JPanel();
		btnEliminar.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(btnEliminar);
		btnEliminar.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 416, 469);
		btnEliminar.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdicionar.setBounds(453, 26, 248, 28);
		btnEliminar.add(btnAdicionar);
		
		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEliminarTodo.setBounds(453, 64, 248, 28);
		btnEliminar.add(btnEliminarTodo);
		
		btnEliminarFinal = new JButton("Eliminar final");
		btnEliminarFinal.addActionListener(this);
		btnEliminarFinal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEliminarFinal.setBounds(453, 102, 248, 28);
		btnEliminar.add(btnEliminarFinal);
		
		btnReemplazar = new JButton("Incrementar Tarifas menores que 100");
		btnReemplazar.addActionListener(this);
		btnReemplazar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReemplazar.setBounds(453, 216, 248, 28);
		btnEliminar.add(btnReemplazar);
		
		btnIncrementar = new JButton("Reemplazar último Tarifa menor que 100");
		btnIncrementar.addActionListener(this);
		btnIncrementar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIncrementar.setBounds(453, 178, 248, 28);
		btnEliminar.add(btnIncrementar);
		
		btnEliminarTarifa = new JButton("Eliminar última Tarifa menor que 100");
		btnEliminarTarifa.addActionListener(this);
		btnEliminarTarifa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEliminarTarifa.setBounds(453, 254, 248, 28);
		btnEliminar.add(btnEliminarTarifa);
		
		txtTarifa = new JTextField();
		txtTarifa.setBounds(66, 21, 96, 19);
		btnEliminar.add(txtTarifa);
		txtTarifa.setColumns(10);
		
		lblNewLabel = new JLabel("Tarifa:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 20, 63, 19);
		btnEliminar.add(lblNewLabel);
	}
	
	ArregloTarifas at = new ArregloTarifas(); 
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminarTarifa) {
			actionPerformedBtnEliminarTarifa(e);
		}
		if (e.getSource() == btnReemplazar) {
			actionPerformedBtnReemplazar(e);
		}
		if (e.getSource() == btnIncrementar) {
			actionPerformedBtnIncrementar(e);
		}
		if (e.getSource() == btnEliminarFinal) {
			actionPerformedBtnEliminarFinal(e);
		}
		if (e.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
	}
	
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
		
		at.adicionar(Double.parseDouble(txtTarifa.getText()));
		listar();
		limpiar();
	}
	
	protected void actionPerformedBtnEliminarTodo(ActionEvent e) {
		
		at.eliminarTodo();
		listar();
	}
	
	protected void actionPerformedBtnEliminarFinal(ActionEvent e) {
		
		at.eliminarFinal();
		listar();
	}
	
	protected void actionPerformedBtnIncrementar(ActionEvent e) {
		
		at.reemplazarUltimaTarifaMenorQue100();
		listar();
	}
	
	protected void actionPerformedBtnReemplazar(ActionEvent e) {
		
		at.incrementarTarifasMenoresQue100();
		listar();
	}
	
	protected void actionPerformedBtnEliminarTarifa(ActionEvent e) {
		
		at.eliminarUltimaTarifaMenorQue100();
		listar();
	}
	
	void listar() {
		
		txtS.setText("");
		
		for (int i=0; i<at.tamanio(); i++)
			
			imprimir("edad[" + i + "] : " + at.obtener(i));
	}

	int leerTarifa()  {
		return Integer.parseInt(txtTarifa.getText().trim());
	}
	
	void limpiar() {
		
		txtTarifa.setText("");
	}
	
	void imprimir(String s) {
		
		txtS.append(s + "\n");
	}
}
