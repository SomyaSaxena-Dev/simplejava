
public class PrecisionDivide {

	static void preciseCompute(int x, int y){
        int d = x/y;
        for (int i = 0; i <= 5; i++) { 
            System.out.print(d); 
            x = x - (y * d); 
            if (x == 0) 
                break; 
            x = x * 10; 
            d = x / y; 
            if (i == 0) 
                System.out.print("."); 
        } 
    }
}
