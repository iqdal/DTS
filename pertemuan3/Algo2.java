import java.util.Scanner;
class Algo2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("masukkan Angka :");
		int bil=scan.nextInt();
		if(bil%2==0){
			System.out.println(bil+" adalah bilangan genap");
		}
		else
			System.out.println(bil+" adalah bilangan ganjil");
	}
}