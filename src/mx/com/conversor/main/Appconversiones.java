package mx.com.conversor.main;


/**
 * @author Antonio Aguilar Patricio
 * @version 1.0
 */

import javax.swing.JOptionPane;



public class Appconversiones {

	
    public static void main(String[] args) {
       
    	run();
    }

    public static void run() {
        int OpcionPrincipal;
        do {
            
        	String[] SelectorDeOpciones = { "Conversión de Monedas", "Conversión de Temperatura", "Conversión de Distancia", "Salir" };
            OpcionPrincipal = JOptionPane.showOptionDialog(null, "¿Qué tipo de conversión deseas realizar?", "Conversor Allura LATAM",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, SelectorDeOpciones, SelectorDeOpciones[0]);


            switch (OpcionPrincipal) {
                case 0:
                	Monedas.conversorDivisa();
                    break;
                case 1:
                	ControlDeTemperatura .conversorDeTemperatura();
                    break;
                case 2:
                	ControlDeDistancia.conversorDeDistancia();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Creado por Antonio Aguilar Patricio.", "¡Adios!",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (OpcionPrincipal != 3);
    }
}
