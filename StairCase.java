
public class StairCase {

	static void staircase(int n) {
        int i = 0;
        for(int j = 1; j <=n ; j++){
            for(i = n; i >j; i--){
                System.out.print(" ");
            }
            if(i==j || i < j && i >=1){
                for(; i>=1; i--){
                     System.out.print("#");
            }
            }
           System.out.println();
        }

    }
}
