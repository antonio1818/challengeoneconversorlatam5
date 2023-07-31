package mx.com.conversor.main;
import javax.swing.JOptionPane;

public class ControlDeDistancia {

    public static void conversorDeDistancia() {
    	
        String[] OpcionesDeDistancia = { "De Kilómetros a Metros", "De Metros a Kilómetros", "Regresar al Menú Anterior" };
        String SelectorDeDistancia = (String) JOptionPane.showInputDialog(null,
                "¿Qué tipo de conversión de distancia deseas realizar?", "Kilometros y Metros",
                JOptionPane.QUESTION_MESSAGE, null, OpcionesDeDistancia, OpcionesDeDistancia[0]);

        if (SelectorDeDistancia == null || SelectorDeDistancia.equals("Regresar al Menú Anterior")) {
            return;
        }

        switch (SelectorDeDistancia) {
            case "De Kilómetros a Metros":
            	ControlDeDistancia.ConvertirKilometrosaMetros();
                break;
            case "De Metros a Kilómetros":
            	ControlDeDistancia.ConvertirDeMetrosaKilometros();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

        conversorDeDistancia(); // Realizamos las operaciones de distancia
    }
    public static void ConvertirKilometrosaMetros() {
        double Kilometros = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la distancia en Kilómetros:",
                "Convertir de Kilómetros a Metros", JOptionPane.QUESTION_MESSAGE));

        double Metros = Kilometros * 1000;

        JOptionPane.showMessageDialog(null, Kilometros + " kilómetros son equivalentes a " + Metros + " metros.",
                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ConvertirDeMetrosaKilometros() {
        double metros = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la distancia en Metros:",
                "Convertir de Metros a Kilómetros", JOptionPane.QUESTION_MESSAGE));

        double kilometros = metros / 1000;

        JOptionPane.showMessageDialog(null, metros + " metros son equivalentes a " + kilometros + " kilómetros.",
                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
    }

}
