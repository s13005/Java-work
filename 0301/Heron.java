import java.util.Scanner;
public class Heron{
    
    static double x(double a, double b, double c){
	double s = (a+b+c)/2;
	double i = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	return i;
    }

    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	double a = scanner.nextDouble();
	double b = scanner.nextDouble();
	double c = scanner.nextDouble();

	System.out.println("三角形の面積は" + x(a,b,c));
    }
}
