
import javax.swing.JLabel;
import javax.swing.JFrame;//libreria para poder cerrar la ventana
//importamos las librerias

public class Main extends JFrame {
    public Main() {
        JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer ejemplo"); //Imprimir texto
        add(lblSaludo);
        System.out.println("Hola soy Ruben Alvarez");

        this.setSize(200, 200); //tamaño de la ventana
        this.setTitle("RubenAlvarez"); //nombre de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //boton para cerrar

        // HACE VISIBLE LA VENTANA
        this.setVisible(true);
    }

    public static void main(String[] args) { //necesario para que el codigo se pueda ejecutar
        // Crea una instancia de la clase para que se ejecute el constructor
        new Main();
    }
}