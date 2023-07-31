package mx.com.conversor.main;
import javax.swing.JOptionPane;

public class ControlDeTemperatura {

    public static void conversorDeTemperatura() {
        String[] OpcionesDeCambio = { "De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "Regresar al Menú Anterior" };
        
        
        String SelectorDeTemperatura = (String) JOptionPane.showInputDialog(null,
                "¿Qué tipo de conversión de temperatura deseas realizar?", "Conversión de Temperatura",
                JOptionPane.QUESTION_MESSAGE, null, OpcionesDeCambio, OpcionesDeCambio[0]);

        if (SelectorDeTemperatura == null || SelectorDeTemperatura.equals("Regresar al Menú Anterior")) {
            return;
        }

        switch (SelectorDeTemperatura) {
            case "De Celsius a Fahrenheit":
            	ControlDeTemperatura .ConversionCelsiusaFahrenheit();
                break;
            case "De Fahrenheit a Celsius":
            	ControlDeTemperatura .ConversionDeFahrenheitaCelsius();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

        conversorDeTemperatura(); // Realizamos el codigo para las conversiones de Temperatura
    }
	    public static void ConversionCelsiusaFahrenheit() {
	        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la temperatura en Celsius:",
	                "Convertir de Celsius a Fahrenheit", JOptionPane.QUESTION_MESSAGE));
	
	        double fahrenheit = (celsius * 9/5) + 32;
	
	        JOptionPane.showMessageDialog(null, celsius + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.",
	                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    }
	
	    public static void ConversionDeFahrenheitaCelsius() {
	        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la temperatura en Fahrenheit:",
	                "Convertir de Fahrenheit a Celsius", JOptionPane.QUESTION_MESSAGE));
	
	        double celsius = (fahrenheit - 32) * 5/9;
	
	        JOptionPane.showMessageDialog(null, fahrenheit + " grados Fahrenheit son equivalentes a " + celsius + " grados Celsius.",
	                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    }
}
