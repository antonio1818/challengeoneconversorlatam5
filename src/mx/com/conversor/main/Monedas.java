package mx.com.conversor.main;
import javax.swing.JOptionPane;

public class Monedas {

    public static void conversorDivisa() {
        String[] OpcioneDeMonedas = { "De Pesos Mexicanos a Dólares", "De Dólares a Pesos Mexicanos",
                "De Pesos Mexicanos a Euros", "De Euros a Pesos Mexicanos", "De Pesos Mexicanos a Libras Esterlinas",
                "De Libras Esterlinas a Pesos Mexicanos", "De Pesos Mexicanos a Yen Japonés",
                "De Yen Japonés a Pesos Mexicanos", "De Pesos Mexicanos a Won Surcoreano",
                "De Won Surcoreano a Pesos Mexicanos", "Regresar al Menú Anterior" };
        
        
        String SelectorDeMoneda = (String) JOptionPane.showInputDialog(null,
                "¿Qué tipo de conversión de monedas deseas realizar?", "Conversión de Monedas",
                JOptionPane.QUESTION_MESSAGE, null, OpcioneDeMonedas, OpcioneDeMonedas[0]);

        if (SelectorDeMoneda == null || SelectorDeMoneda.equals("Regresar al Menú Anterior")) {
            return;
        }

        switch (SelectorDeMoneda) {
            case "De Pesos Mexicanos a Dólares":
            	Monedas.CambioDePesoaDolar();
                break;
            case "De Dólares a Pesos Mexicanos":
            	Monedas.CambioDeDolaraPeso();
                break;
            case "De Pesos Mexicanos a Euros":
            	Monedas.CambioDepesoaEuro();
                break;
            case "De Euros a Pesos Mexicanos":
            	Monedas.CambioDeEurosaPesos();
                break;
            case "De Pesos Mexicanos a Libras Esterlinas":
            	Monedas.CambioDePesoaLibrasEsterlinas();
                break;
            case "De Libras Esterlinas a Pesos Mexicanos":
            	Monedas.CambioDeLibraEsterlinaApeso();
                break;
            case "De Pesos Mexicanos a Yen Japonés":
            	Monedas.CambioDePesoaYen();
                break;
            case "De Yen Japonés a Pesos Mexicanos":
            	Monedas.CambioDeYenaPeso();
                break;
            case "De Pesos Mexicanos a Won Surcoreano":
            	Monedas.CambioDePesoaWon();
                break;
            case "De Won Surcoreano a Pesos Mexicanos":
            	Monedas.CambioDeWonaPeso();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        

        conversorDivisa(); // El tipo de cambio esta actualizado al 30 de julio del 2023
    }
	    private static void CambioDePesoaDolar() {
	        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Pesos Mexicanos:",
	                "Convertir de Pesos Mexicanos a Dólares", JOptionPane.QUESTION_MESSAGE));
	        double dollars = pesos / 16.68; // Tipo de cambio actual: 1 Dólar = 16.68 Pesos Mexicanos 
	        dollars = Math.round(dollars * 100.00) / 100.00; // Redondear a 2 decimales
	        JOptionPane.showMessageDialog(null, pesos + " Pesos Mexicanos son equivalentes a " + dollars + " Dólares.",
	                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
    }
	    
	    private static void CambioDeDolaraPeso() {
	        double dollars = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Dólares:",
	                "Convertir de Dólares a Pesos Mexicanos", JOptionPane.QUESTION_MESSAGE));
	        double pesos = dollars * 16.68; // Tipo de cambio actual: 1 Dólar = 16.68 Pesos Mexicanos
	        pesos = Math.round(pesos * 100.00) / 100.00; // Redondear a 2 decimales
	        JOptionPane.showMessageDialog(null, dollars + " Dólares son equivalentes a " + pesos + " Pesos Mexicanos.",
	                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    }
	    

	    private static void CambioDepesoaEuro() {
	    	 double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Pesos Mexicanos:",
	    	            "Convertir de Pesos Mexicanos a Euros", JOptionPane.QUESTION_MESSAGE));
	    	    double euros = pesos / 18.38; // Tipo de cambio actual: 1 Euro = 18.38 Pesos Mexicanos
	    	    euros = Math.round(euros * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, pesos + " Pesos Mexicanos son equivalentes a " + euros + " Euros.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	
	    }
	    

	    private static void CambioDeEurosaPesos() {
	    	   double euros = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Euros:",
	    	            "Convertir de Euros a Pesos Mexicanos", JOptionPane.QUESTION_MESSAGE));
	    	    double pesos = euros * 18.38;  // Tipo de cambio actual: 1 Euro = 18.38 Pesos Mexicanos
	    	    pesos = Math.round(pesos * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, euros + " Euros son equivalentes a " + pesos + " Pesos Mexicanos.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	
	    }

	    private static void CambioDePesoaLibrasEsterlinas() {
	    	  double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Pesos Mexicanos:",
	    	            "Convertir de Pesos Mexicanos a Libras Esterlinas", JOptionPane.QUESTION_MESSAGE));
	    	    double LibraEsterlina = pesos / 21.42;  // Tipo de cambio actual: 1 Libra Esterlina = 21.42 Pesos Mexicanos
	    	    LibraEsterlina = Math.round(LibraEsterlina * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, pesos + " Pesos Mexicanos son equivalentes a " + LibraEsterlina + " Libras Esterlinas.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	}
	    

	    private static void CambioDeLibraEsterlinaApeso() {
	    	  double pounds = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Libras Esterlinas:",
	    	            "Convertir de Libras Esterlinas a Pesos Mexicanos", JOptionPane.QUESTION_MESSAGE));
	    	    double pesos = pounds * 21.42; //Tipo de cambio actual: 1 Libra Esterlina = 21.42 Pesos Mexicanos
	    	    pesos = Math.round(pesos * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, pounds + " Libras Esterlinas son equivalentes a " + pesos + " Pesos Mexicanos.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	}
	    

	    private static void CambioDePesoaYen() {
	    	  double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Pesos Mexicanos:",
	    	            "Convertir de Pesos Mexicanos a Yen Japonés", JOptionPane.QUESTION_MESSAGE));
	    	    double yen = pesos / 0.12; // Tipo de cambio actual: 1 Yen Japonés = 0.12 Pesos Mexicanos
	    	    yen = Math.round(yen * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, pesos + " Pesos Mexicanos son equivalentes a " + yen + " Yen Japonés.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	}

	    private static void CambioDeYenaPeso() {
	    	double yen = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Yen Japonés:",
	                "Convertir de Yen Japonés a Pesos Mexicanos", JOptionPane.QUESTION_MESSAGE));
	        double pesos = yen * 0.12; // Tipo de cambio actual: 1 Yen Japonés = 0.12 Pesos Mexicanos
	        pesos = Math.round(pesos * 100.00) / 100.00; // Redondear a 2 decimales
	        JOptionPane.showMessageDialog(null, yen + " Yen Japonés son equivalentes a " + pesos + " Pesos Mexicanos.",
	                "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    
	    }

	    private static void CambioDePesoaWon() {
	    	 double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Pesos Mexicanos:",
	    	            "Convertir de Pesos Mexicanos a Won Surcoreano", JOptionPane.QUESTION_MESSAGE));
	    	    double won = pesos / 0.013;// Tipo de cambio actual: 1 Won Surcoreano = 0.013 Pesos Mexicanos
	    	    won = Math.round(won * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, pesos + " Pesos Mexicanos son equivalentes a " + won + " Won Surcoreano.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	
	    }

	    private static void CambioDeWonaPeso() {
	    	 double won = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad en Won Surcoreano:",
	    	            "Convertir de Won Surcoreano a Pesos Mexicanos", JOptionPane.QUESTION_MESSAGE));
	    	    double pesos = won * 0.013;// Tipo de cambio actual: 1 Won Surcoreano = 0.013 Pesos Mexicanos
	    	    pesos = Math.round(pesos * 100.00) / 100.00; // Redondear a 2 decimales
	    	    JOptionPane.showMessageDialog(null, won + " Won Surcoreano son equivalentes a " + pesos + " Pesos Mexicanos.",
	    	            "Resultado de la Conversión", JOptionPane.INFORMATION_MESSAGE);
	    	
	    }
}
