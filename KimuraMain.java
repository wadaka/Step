import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("何段>>");
		int input = new Scanner(System.in).nextInt();

		for(int i=0;i<input;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//逆
		System.out.println();
		System.out.println("//逆");
		System.out.println();

		for(int i=0;i<input;i++){
			for(int j=0;j<input;j++){
				System.out.print(j<i? " ":"*");
			}
			System.out.println();
		}
		//x
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((j+i)%2==0 ? "×":" ");
			}
			System.out.println();
		}
	}
}
