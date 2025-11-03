import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int dia, mes, anno;
		boolean fechaCorrecta = true;
		
		
		System.out.println("Dame un día");
		dia =sc.nextInt();
		
		System.out.println("Dame un mes");
		mes = sc.nextInt();
		
		System.out.println("Dame el año");
		
		boolean fechaCorrecta = true;
		
		if (mes <1)||(mes<12) {
			//System.out.println()
			fechaCorrecta=false
		}else {
			//Fecha correcta
			int diaMax =31;//Enero, marzo, mayo, julio, agosto, octubre, diciembre.
			
			if (mes == 2);
				diaMax=28;//mes de febrero
		}else if (mes==4) ||(mes==6)||(mes==9)||(mes==11);//Meses de abril, junio, septiembre y noviembre.
				diaMax=30;
		}
	}

if (dia<1 || dia>diaMax) {
	fechaCorrecta=false;

}
	
}
