public class Factorial10 {
    
    static int x(int n){
	int fact = 1;
	for(int i = n; i > 0; i--){
	    fact *= i;
	}
	return fact;
    }

    public static void main(String[] args){
	System.out.println("10の階乗は" + x(10));
    }

}
