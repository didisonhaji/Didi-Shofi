import java.util.*
class PersegiPanjang{
	public static void main(String[]args){
	Scanner scan = new Scanner (System.in);
	int p,l;
	float hasil;
	System.out.print("Masukan Panjang : ");
	p=scan.nextInt();
	System.out.print("Masukan Lebar : ");
	l=scan.nextInt();

	hasil=p*l;
	System.out.println("Luas Persegi Panjang : "+hasil);
	}
}
