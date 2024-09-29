import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Programa extends JFrame {

	private JPanel contentPane;
	private static DefaultListModel<Peliculas> listModel;


	public Programa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listModel = new DefaultListModel<Peliculas>();
	
		setBounds(350, 280, 480, 350);
		setTitle("Programa");
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Peliculas");
		menuBar.add(mnNewMenu);
		
		JMenuItem btnAgregar = new JMenuItem("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				contentPane.removeAll();
				Agregar Panel = new Agregar();
				Panel.setDefaultListModel(listModel);
				contentPane.add(Panel);
				contentPane.repaint();
				contentPane.revalidate();
				
				
				
			}
		});
		mnNewMenu.add(btnAgregar);
	
		
		JMenuItem btnListar = new JMenuItem("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				Listar Panel = new Listar();
				Panel.setDefaultListModel(listModel);
				contentPane.add(Panel);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnNewMenu.add(btnListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
