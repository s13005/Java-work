import java.io.*;
import java.util.Scanner;

public class ToZero {

    public static void main(String[] args)throws IOException {
	Scanner scanner = new Scanner(System.in);

	System.out.print("整数を入力:");
	int a = scanner.nextInt();

	if(a > 0){
	    for(int i = a; i >= 0; i--){
		System.out.println(i);     
	    }
	}else if(a < 0){
	    for(int i = a; i <= 0; i++){
		System.out.println(i);
	    }
	}else{
	    System.out.println(0);
	}
    }
}
