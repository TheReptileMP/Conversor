package conversorDeTemperaturas;
import javax.swing.JOptionPane;

public class ConvertirTemperaturas {

		public void convertir(String tipoDeConversion, double valor) {
			double resultado = 0;
			switch(tipoDeConversion) {
				case "De Celsius a Fahrenheit":
					resultado = (double) Math.round(((valor * 1.8) + 32) * 100d) / 100;
					JOptionPane.showMessageDialog(null, valor + " °C equivalen a: " + resultado + " °F" );
					break;
					
				case "De Celsius a Kelvin":
					resultado = (double) Math.round((valor + 273.15) * 100d) / 100;
					JOptionPane.showMessageDialog(null, valor + " °C equivalen a: " + resultado + " °K" );
					break;
					
				case "De Fahrenheit a Celsius":
					resultado = (double) Math.round(((valor - 32) * 1.8) * 100d) / 100;
					JOptionPane.showMessageDialog(null, valor + " °F equivalen a: " + resultado + " °C" );
					break;
					
				case "De Kelvin a Celsius":
					resultado = (double) Math.round((valor - 273.15 ) * 100d) / 100;
					JOptionPane.showMessageDialog(null, valor + " °K equivalen a: " + resultado + " °C" );
					break;
				
			}
		}
	}
