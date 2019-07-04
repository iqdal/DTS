import java.util.Scanner;
class Algo1{
	public static void main(String[] arg){
		int a,x=1,y;
		System.out.print("Masukkan Angka :");
		Scanner scan= new Scanner(System.in);
		a=scan.nextInt();
		y=x*x;
		while(y!=a){
			x=x+1;
			y=x*x;
				}
		System.out.print("Akarnya adalah :"+x);
		
		
	}
}