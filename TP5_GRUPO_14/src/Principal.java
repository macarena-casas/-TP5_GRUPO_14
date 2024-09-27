import java.awt.EventQueue;
import java.awt.Color;

public class Principal {
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
					frame.setForeground(Color.BLACK);
					frame.setBackground(Color.WHITE);				
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
