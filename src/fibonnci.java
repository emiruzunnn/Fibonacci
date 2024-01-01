import java.util.Iterator;
import java.util.Scanner;

public class fibonnci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen karakter sayisini giriniz: ");
		int karakter = scanner.nextInt();
		int first = 0;
		int second = 1;
		System.out.println("Fibonacci Serisi:");
		
		System.out.print(first + " " + second + " ");
		if (karakter > 0) {
			for (int i = 2; i <= karakter; i++) {
				int next = first + second;
				System.out.print(next + " ");
			     first = second;
		            second = next;
			}
		}else {
			System.out.println("Lutfen pozitif bir sayi giriniz!!!");
		}

	}

}
