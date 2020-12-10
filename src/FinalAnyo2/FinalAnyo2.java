package FinalAnyo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class FinalAnyo2 {

	public static void main(String[] args) throws ParseException {


		String fechaComoString;
		long diferenciaMs, diferenciaDias;
		Scanner teclado = new Scanner (System.in);
		boolean res = true;
		do {
			System.out.println("Dame una fecha(dd/MM/yyyy): ");
			fechaComoString = teclado.nextLine();

			res = validarFecha(fechaComoString);
		}while(res==false);
		teclado.close();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = sdf.parse(fechaComoString);
		LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int anyoProximo  = localDate.getYear() + 1;
		Date finAnyo = sdf.parse("1/1/" + anyoProximo);

		diferenciaMs = finAnyo.getTime() - fecha.getTime();
		diferenciaDias = diferenciaMs / (1000 * 60 * 60 * 24);

		System.out.println("Quedan " + diferenciaDias + " dias para fin de año.");	

	}

	private static boolean validarFecha(String fecha) {
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			sdf.parse(fecha);
		}catch (Exception e) {
			return false;
		}
		return true;
	}

}
