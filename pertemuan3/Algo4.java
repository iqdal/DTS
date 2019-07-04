import java.util.Scanner;
class Algo4{
	public static void main(String args[]){
		int bil1,bil2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan bilangan 1 :");
		bil1=scan.nextInt();
		System.out.print("Masukkan bilangan 2 :");
		bil2=scan.nextInt();
		if(bil1<bil2){
			System.out.println(bil1+" lebih kecil dari "+bil2);
		}
		else if(bil1==bil2){
			System.out.println(bil1+" sama dengan "+bil2);
		}
		else{
			System.out.println(bil1+" lebih besar dari "+bil2);
		}
			 
	}
}