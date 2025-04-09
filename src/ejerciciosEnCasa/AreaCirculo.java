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

public class AreaCirculo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblRadio;
	private JTextField txtRadio;
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
					AreaCirculo frame = new AreaCirculo();
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
	public AreaCirculo() {
		setTitle("AreaCirculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRadio = new JLabel("radio");
		lblRadio.setBounds(10, 11, 46, 14);
		contentPane.add(lblRadio);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(67, 8, 86, 20);
		contentPane.add(txtRadio);
		txtRadio.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 54, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 136, 263, 91);
		contentPane.add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		double areaCirculo,longitudC,radio;
		radio = Double.parseDouble(txtRadio.getText());
		areaCirculo = 3.1416*radio*radio;
		longitudC = 2*3.1416*radio;
		txtResultado.setText("El area del circulo es: "+areaCirculo  
				+"   "
				+ "Su longitud es: "+longitudC);
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtResultado.setText("");
		txtRadio.setText("");
	}
}
