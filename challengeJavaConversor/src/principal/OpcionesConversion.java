package principal;

import javax.swing.JOptionPane;

import conversorDeMonedas.ConvertirMonedas;
import conversorDeTemperaturas.ConvertirTemperaturas;

public class OpcionesConversion {
	
	public void opcionConversion(String opcion, double valor) {
		
		switch(opcion) {
		case "Conversor de moneda":
			String tipoDeConversion = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión de moneda",
					   "Conversión de moneda", JOptionPane.PLAIN_MESSAGE, null,
					   new Object[] {"De ARS a Dólar", "De ARS a Euro", "De ARS a Libras",
							   "De ARS a Yen", "De ARS a Won Coreano", "De Dólar a ARS", "De Euro a ARS",
							   "De Libras a ARS", "De Yen a ARS", "De Won Coreano a ARS",}, "Seleccionar").toString();
			ConvertirMonedas conversion = new ConvertirMonedas();
			conversion.convertir(tipoDeConversion, valor);
			break;
			
		case "Conversor de temperatura":
			String tipoDeConversionTemp = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión de temperatura",
					   "Conversión de temperatura", JOptionPane.PLAIN_MESSAGE, null,
					   new Object[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
							   "De Kelvin a Celsius"}, "Seleccionar").toString();
			ConvertirTemperaturas conversionTemp = new ConvertirTemperaturas();
			conversionTemp.convertir(tipoDeConversionTemp, valor);
			break;
			
		}
	}
}
