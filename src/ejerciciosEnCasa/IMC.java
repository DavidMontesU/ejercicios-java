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

public class IMC extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JTextField txtPeso;
	private JTextField txtAltura;
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
					IMC frame = new IMC();
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
	public IMC() {
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPeso = new JLabel("peso");
		lblPeso.setBounds(20, 11, 46, 14);
		contentPane.add(lblPeso);
		
		lblAltura = new JLabel("altura");
		lblAltura.setBounds(20, 52, 46, 14);
		contentPane.add(lblAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(79, 8, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(79, 49, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		btnProcesar = new JButton("procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 48, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 113, 290, 101);
		contentPane.add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		double peso,altura,IMC;
		peso = Double.parseDouble(txtPeso.getText());
		altura = Double.parseDouble(txtAltura.getText());
		IMC = peso/(altura*altura);
		txtResultado.setText("Su indice de masa corporal es: "+IMC);
	}
}
