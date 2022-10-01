package principal;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		while(true) {
			String seleccion = "";
			double valor = 0;
			int continuar = 0;
			try {
				seleccion = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
					   "Menú principal", JOptionPane.PLAIN_MESSAGE, null,
					   new Object[] {"Conversor de moneda", "Conversor de temperatura" }, "Seleccionar").toString();
				
				switch(seleccion) {
				case "Conversor de moneda":
					valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a convertir", "Conversion de moneda",
							JOptionPane.INFORMATION_MESSAGE));
					
					OpcionesConversion opcion = new OpcionesConversion();
					opcion.opcionConversion(seleccion, valor);
					
					continuar = JOptionPane.showConfirmDialog(null, 
			                "Seleccione una opción", "Desea realizar otra conversión?",JOptionPane.YES_NO_CANCEL_OPTION);
					
					if(continuar != 0) {
						JOptionPane.showMessageDialog(null, "Fin del programa!" );
						System.exit(0);
					}
					break;
					
				case "Conversor de temperatura":
					valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a convertir", "Conversion de temperatura",
							JOptionPane.INFORMATION_MESSAGE));
					
					OpcionesConversion opcionTemp = new OpcionesConversion();
					opcionTemp.opcionConversion(seleccion, valor);
					
					continuar = JOptionPane.showConfirmDialog(null, 
			                "Seleccione una opción", "Desea realizar otra conversión?",JOptionPane.YES_NO_CANCEL_OPTION);
					
					if(continuar != 0) {
						JOptionPane.showMessageDialog(null, "Fin del programa!" );
						System.exit(0);
					}
					break;
				}
			} catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico!");
				
			} catch(NullPointerException e) {
				
				int opcion = JOptionPane.showConfirmDialog(null, 
		                "Seleccione una opción", "Desea continuar en el programa?",JOptionPane.YES_NO_CANCEL_OPTION);
				
				switch(opcion) {
				case 1:
					JOptionPane.showMessageDialog(null, "Fin del programa!" );
					System.exit(0);
				}
			}
		}			
	}
}
