public class TriangleArea{
    
    static double x(double a, double b, double c){
	double s = (a+b+c)/2;
	double i = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	return i;
    }

    public static void main(String[] args){
	System.out.println("三角形の面積は" + x(5.0,6.0,7.0));
    }
}
