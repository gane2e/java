package ex02;

public class For예제 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for(int j=0; j<=9; j++) 
				System.out.printf("%d X %d = %d\n", i, j, i*j);
		}
	}

}
