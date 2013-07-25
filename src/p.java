
import java.util.*;


public class p {

	private static Scanner sc;
	public static void main(String[]args){
		
		sc = new Scanner(System.in);
		double conver=0 , aconver=0 ;
		char reponse=' ' , choix=' ';
		Ville ville=new Ville("Blida",12322,"Algérie");
		
		System.out.println(ville.getNom());
		ville.setNom("Tlemcen");
		System.out.println(ville.getNom());
		
		do
		{
		System.out.println("--Un convertisseur degré celsus et degré fahrenheit--");
		System.out.println(" ");
		System.out.println("Choisissez le mode de convertion");
		System.out.println("1-Celsus vers fahrenheit");
		System.out.println("2-Fahrenheit vers celsus");
		
		do
		{
		choix=sc.nextLine().charAt(0);
		
		if(choix=='1' ||choix =='2')
		{
		}
		else
		{
		System.out.println("Choisissez le mode de convertion");
		System.out.println("1-Celsus vers fahrenheit");
		System.out.println("2-Fahrenheit vers celsus");
		}
		}while(choix!='1' && choix !='2');
		
		if(choix=='1')
		{
			System.out.println("température à convertir ");
			aconver=sc.nextDouble();
			sc.nextLine();
			conver=((9.0/5.0)*aconver)+32.0;
			System.out.println(+aconver+"°C corespond à :"+conver+"°F");
			
		}
		else if(choix=='2')
		{
			System.out.println("température à convertir ");
			aconver=sc.nextDouble();
			sc.nextLine();
			conver=((aconver-32)*5)/9;
			System.out.println(+aconver+"°F corespond à :"+conver+"°C");
		}
		
		System.out.println("Souhaitez-vous convertir une autre temprérature (O/N)");
		reponse=sc.nextLine().charAt(0);
		switch(reponse)
		{
		case'O':
			break;
		case'N':
			break;
			default:
				System.out.println("-_____-");
				break;	
		}	
		}while(reponse=='O');
	}
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
}
