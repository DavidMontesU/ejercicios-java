package ejerciciosEnCasa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrecuenciaCardiaca extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblEdad;
	private JLabel lblPeso;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrecuenciaCardiaca frame = new FrecuenciaCardiaca();
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
	public FrecuenciaCardiaca() {
		setTitle("FrecuenciaCardiaca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEdad = new JLabel("edad");
		lblEdad.setBounds(10, 11, 46, 14);
		contentPane.add(lblEdad);
		
		lblPeso = new JLabel("peso");
		lblPeso.setBounds(10, 44, 46, 14);
		contentPane.add(lblPeso);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(94, 8, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(94, 41, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		btnProcesar = new JButton("procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("borrar");
		btnBorrar.setBounds(335, 40, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(72, 119, 290, 103);
		contentPane.add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		double peso,frecuencia;
		int edad;
		edad = (int)Double.parseDouble(txtEdad.getText());
		peso = Double.parseDouble(txtPeso.getText());
		frecuencia = 210 - (0.5 * edad) - (0.01 * peso + 4);
		txtResultado.setText("Su frecuencia cardiaca es: "+frecuencia);
	}
}
