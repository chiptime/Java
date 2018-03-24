package monopolio;

import javax.swing.*;
import java.net.URL;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class Ventana extends JFrame  {
	
	public Image imagenFondo;
	public URL fondo;
	
    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configuracion();        // configuramos la ventana
    }
    
    //Configuración basica de la ventana
    
	public void configuracion() {
		
		this.setSize(														// Tamaño
				java.awt.Toolkit.getDefaultToolkit().getScreenSize().width,	// de
				java.awt.Toolkit.getDefaultToolkit().getScreenSize().height	// la
				);															// ventana
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);						//Maximiza la ventana
		this.setTitle("Monopolio");											//Nombre de la ventana

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 				//cierra el proceso al cerrar

		
		fondo = this.getClass().getResource("/monopolio/table.jpg");	//  Tablero monopoly
		imagenFondo = new ImageIcon(fondo).getImage();			   			//
		
		 Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/monopolio/icon.png"));//Icono ventana
	        setIconImage(icon);																		 //
		
		Container contenedor = getContentPane();
		contenedor.add(panel);
	}
	

	public JPanel panel = new JPanel() {
	
	public void paintComponent(Graphics g) {
		
		g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
	}
	};
	
	
	

	
	public static void main(String[] args) {
		
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
	}

}
