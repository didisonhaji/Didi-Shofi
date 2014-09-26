import java.util.*
class Segitiga{
	public static void main(String[]args){
	Scanner scan = new Scanner (System.in);
	int a,t;
	float hasil;
	System.out.print("Masukan Alas : ");
	a=scan.nextInt();
	System.out.print("Masukan Panjang : ");
	t=scan.nextInt();

	hasil=0.5*a*t;
	System.out.println("Luas Segitiga : "+hasil);
	}
}
