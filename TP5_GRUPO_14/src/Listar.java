import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Listar extends JPanel {

	/**
	 * Create the panel.
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblPeliculas;
	private JList<Peliculas> jList;
	private DefaultListModel<Peliculas> listModel;
	private JScrollPane scrollPane;

	public Listar() {
		setLayout(null);
		listModel = new DefaultListModel<Peliculas>();
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(10, 11, 70, 33);
		add(lblPeliculas);
		
		jList = new JList<Peliculas>();
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 55, 420, 200);
	    scrollPane.setViewportView(jList);
	    jList.setLayoutOrientation(JList.VERTICAL);
		add(scrollPane);
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModel) {
		this.listModel = listModel;
		jList.setModel(this.listModel);
	}

}
