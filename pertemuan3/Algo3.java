import java.util.Scanner;
class Algo3{
	public static void main(String args[]){
		float jari,KL,luas;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jari-jari :");
		jari=scan.nextFloat();
		luas=(22*jari*jari)/7;
		KL=(2*jari)*22/7;
		System.out.println("keliling ="+KL);
		System.out.println("Luas ="+luas);
	}
}