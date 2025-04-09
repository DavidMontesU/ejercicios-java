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
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class AreaTRectangular extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblLargo;
	private JLabel lblAncho;
	private JTextField txtLargo;
	private JTextField txtAncho;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTRectangular frame = new AreaTRectangular();
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
	public AreaTRectangular() {
		setTitle("AreaTRectangular");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLargo = new JLabel("largo");
		lblLargo.setForeground(new Color(128, 0, 0));
		lblLargo.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblLargo.setBounds(21, 11, 46, 14);
		contentPane.add(lblLargo);
		
		lblAncho = new JLabel("ancho");
		lblAncho.setForeground(new Color(128, 0, 0));
		lblAncho.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblAncho.setBounds(21, 61, 46, 14);
		contentPane.add(lblAncho);
		
		txtLargo = new JTextField();
		txtLargo.setBounds(84, 8, 86, 20);
		contentPane.add(txtLargo);
		txtLargo.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(84, 58, 86, 20);
		contentPane.add(txtAncho);
		txtAncho.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setForeground(new Color(75, 0, 130));
		btnProcesar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(new Color(75, 0, 130));
		btnBorrar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnBorrar.setBounds(335, 57, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 145, 311, 105);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		double largo,ancho,precioTerreno,areaTerreno;
		largo = Double.parseDouble(txtLargo.getText());
		ancho = Double.parseDouble(txtAncho.getText());
		areaTerreno = ancho*largo;
		precioTerreno = areaTerreno*750;
		txtArea.setText("El area es: "+areaTerreno+"  "
				+ " El precio es: "+precioTerreno);
	}
}
