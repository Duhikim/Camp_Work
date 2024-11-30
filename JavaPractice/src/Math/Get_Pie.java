package Math;
public class Get_Pie {
    public static void main(String[] args) {
    	
    	double TestCount = 10000; //반복 횟수
    	double in =0, out =0;
    	for(int i=0; i<TestCount; i++) {
    		for(int j=0; j<TestCount; j++) {
    			double a = i/TestCount;
        		double b = j/TestCount;
        		if(a*a + b*b  <= 1) in++;
        		else out++;    			
    			
    		}    		
    	}
    	
    	double ratio = in / TestCount;    	
    	double Pi = ratio * 4.0;
    	System.out.println(Pi);
    }
}