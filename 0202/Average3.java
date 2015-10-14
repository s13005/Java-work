public class Average3{

    static float x(float a, float b, float c){
	float ave = (a+b+c)/3;
	return ave;
    }

    public static void main(String[] args){

	System.out.println("3つの数の平均値は"+ x(5.5f,10.0f,12.1f));

    }

}
