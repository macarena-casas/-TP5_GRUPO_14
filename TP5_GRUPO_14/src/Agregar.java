import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agregar extends JPanel {
	
	public JComboBox<Categorias> cbCategorias;
	private JTextField txtNombre;
	/**
	 * Create the panel.
	 */
	public Agregar() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(91, 75, 46, 14);
		add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(91, 100, 74, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero: ");
		lblGenero.setBounds(91, 125, 74, 14);
		add(lblGenero);
		
		JLabel lblIdpelicula = new JLabel("");
		lblIdpelicula.setBounds(202, 75, 46, 14);
		add(lblIdpelicula);
		
		
		lblIdpelicula.setText(String.valueOf(Peliculas.siguienteID()));
		cbCategorias = new JComboBox<Categorias>();
		cbCategorias.setToolTipText("");
		cbCategorias.setBounds(202, 122, 155, 20);
		add(cbCategorias);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(202, 97, 155, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		
		cbCategorias.addItem(new Categorias(0,"Seleccione un género"));
		cbCategorias.addItem(new Categorias(1,"Terror"));
		cbCategorias.addItem(new Categorias(2,"Accion"));
		cbCategorias.addItem(new Categorias(3,"Suspenso"));
		cbCategorias.addItem(new Categorias(4,"Romantica"));
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String nombre = txtNombre.getText();
				Categorias catSelec = (Categorias) cbCategorias.getSelectedItem();
				if (nombre.isEmpty() || (catSelec != null && catSelec.getID() == 0)) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre y seleccione un género válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
				Peliculas aux = new Peliculas(nombre,catSelec);
				JOptionPane.showMessageDialog(null, aux.toString() + " ha Cargado con exito");
				txtNombre.setText("");
				cbCategorias.setSelectedIndex(0);
				lblIdpelicula.setText(String.valueOf(Peliculas.siguienteID()));
			}
		});
		btnAceptar.setBounds(91, 150, 110, 23);
		add(btnAceptar);
		
	}
}
