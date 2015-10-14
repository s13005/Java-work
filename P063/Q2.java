
public class Q2 {

    

    public static void main(String[] args){
	int i =  0;
	for(i = 1; i <= 100; i++){
	    String s = String.valueOf(i);
	    if(i % 3 == 0){
		System.out.println("THREE");
	    }else if(s.matches(".*3.*")){
		System.out.println("THREE");
	    }else{
		System.out.println(i);
	    }

	}

    }
}
