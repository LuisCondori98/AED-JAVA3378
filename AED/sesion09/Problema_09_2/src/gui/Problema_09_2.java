package gui;

import arreglo.ArregloDocentes;
import clase.Docente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_09_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblHoras;
	private JLabel lblTarifa;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtHoras;	
	private JTextField txtTarifa;
	private JButton btnAdicionar;	
	private JButton btnReportar;
	private JScrollPane scrollPaneA;
	private JScrollPane scrollPaneB;
	private JTextArea txtS;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_09_2 frame = new Problema_09_2();
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
	public Problema_09_2() {
		setTitle("Problema_09_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 11, 40, 28);
		contentPane.add(lblCodigo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(120, 11, 50, 28);
		contentPane.add(lblNombre);	
		
		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(255, 11, 40, 28);
		contentPane.add(lblHoras);	
		
		lblTarifa = new JLabel("Tarifa");
		lblTarifa.setBounds(356, 11, 40, 28);
		contentPane.add(lblTarifa);	
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(54, 11, 40, 28);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 11, 60, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(295, 11, 40, 28);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		txtTarifa = new JTextField();
		txtTarifa.setBounds(402, 11, 40, 28);
		contentPane.add(txtTarifa);
		txtTarifa.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(450, 50, 155, 23);
		contentPane.add(btnAdicionar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.setBounds(450, 75, 155, 23);
		btnReportar.addActionListener(this);
		contentPane.add(btnReportar);
		
		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(10, 50, 432, 200);
		contentPane.add(scrollPaneA);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPaneA.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("codigo");
		modelo.addColumn("nombre");
		modelo.addColumn("horas");
		modelo.addColumn("tarifa");
		modelo.addColumn("sueldo");
		tblTabla.setModel(modelo);

		scrollPaneB = new JScrollPane();
		scrollPaneB.setBounds(10, 250, 432, 196);
		contentPane.add(scrollPaneB);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Arial", Font.PLAIN, 14));
		scrollPaneB.setViewportView(txtS);
		
		listar();		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	
	//  Declaracion global
	ArregloDocentes ad = new ArregloDocentes();
	
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		
		int codigo = leerCodigo();
		String nombre = leerNombre();
		int horas = leerHoras();
		double tarifa = leerTarifa();
		Docente nuevo = new Docente(nombre, codigo, horas, tarifa);
		ad.adicionar(nuevo);
		listar();
		limpieza();
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		
		txtS.setText("");
		imprimir("Sueldo promedio \t:" + ad.sueldoPromedio());
		imprimir("Sueldo Mayor \t:" + ad.sueldoMayor());
		imprimir("Sueldo Menor \t:" + ad.sueldoMenor());
		imprimir("Tarifa Mayor \t\t:" + ad.tarifaMayor());
		imprimir("Tarifa Menor \t\t:" + ad.tarifaMenor());
		
  	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		
		imprimir("");
	}
	void limpieza() {
		
		txtCodigo.setText("");
		txtNombre.setText("");
		txtHoras.setText("");
		txtTarifa.setText("");
		txtCodigo.requestFocus();
	}
   	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<ad.tamanio(); i++) {
			Object[] fila = { ad.obtener(i).getCodigo(),
					          ad.obtener(i).getNombre(),
					          ad.obtener(i).getHoras(),
					          ad.obtener(i).getTarifa(),
					          ad.obtener(i).calcularSueldoBruto(),
					        };
			modelo.addRow(fila);
		}		
	}
   	
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		
		txtS.append(s + "\n");
	}
	
	void mensaje(String s) {
		
		JOptionPane.showMessageDialog(this, s);
	}		
	
	//  M�todos que retornan valor (sin par�metros)
	int leerCodigo() {
		
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	
	String leerNombre() {
		
		return txtNombre.getText().trim();
	}
	
	int leerHoras() {
		
		return Integer.parseInt(txtHoras.getText().trim());
	}
	
	double leerTarifa() {
		
		return Double.parseDouble(txtTarifa.getText().trim());
	}
}