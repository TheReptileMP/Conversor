package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void convertir(String tipoDeConversion, double valor) {
		double equivalencia = 0;
		double monto = 0;
		switch(tipoDeConversion) {
			case "De ARS a Dólar":
				equivalencia = 288;
				monto = (double) Math.round((valor / equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " ARS equivalen a: " + monto + " Dolares" );
				break;
				
			case "De ARS a Euro":
				equivalencia = 310;
				monto = (double) Math.round((valor / equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " ARS equivalen a: " + monto + " Euros" );
				break;
				
			case "De ARS a Libras":
				equivalencia = 318;
				monto = (double) Math.round((valor / equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " ARS equivalen a: " + monto + " Libras" );
				break;
				
			case "De ARS a Yen":
				equivalencia = 199;
				monto = (double) Math.round((valor / equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " ARS equivalen a: " + monto + " Yen" );
				break;
				
			case "De ARS a Won Coreano":
				equivalencia = 9.78;
				monto = (double) Math.round((valor / equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " ARS equivalen a: " + monto + " Won Coreano" );
				break;
				
			case "De Dólar a ARS":
				equivalencia = 288;
				monto = (double) Math.round((valor * equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " Dolares equivalen a: " + monto + " ARS" );
				break;
				
			case "De Euro a ARS":
				equivalencia = 310;
				monto = (double) Math.round((valor * equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " Euros equivalen a: " + monto + " ARS" );
				break;
				
			case "De Libras a ARS":
				equivalencia = 318;
				monto = (double) Math.round((valor * equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " Libras equivalen a: " + monto + " ARS" );
				break;
				
			case "De Yen a ARS":
				equivalencia = 199;
				monto = (double) Math.round((valor * equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " Yenes equivalen a: " + monto + " ARS" );
				break;
				
			case "De Won Coreano a ARS":
				equivalencia = 9.78;
				monto = (double) Math.round((valor * equivalencia) * 100d) / 100;
				JOptionPane.showMessageDialog(null, valor + " Won Coreanos equivalen a: " + monto + " ARS" );
				break;
		}
	}
}
