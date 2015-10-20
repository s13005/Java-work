import java.io.*;
import java.util.Scanner;

public class Average{
    
    public static void main(String[] args)throws IOException{
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("繰り返す回数を入力してください:");
	int a = scanner.nextInt();

	double ave = 0;

	if(a > 0){
	    for(int i = a; i > 0; i--){
		System.out.print("値を入力してください:");
		double b = scanner.nextDouble();
		ave += b;
	    }
	}else{
	    System.out.println("繰り返すには1以上を入れてください。");
	}

	double x = ave/a;
	System.out.println("平均は" + x);
    }
}
