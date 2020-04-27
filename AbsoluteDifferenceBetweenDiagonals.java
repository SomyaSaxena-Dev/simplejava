import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Math.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int rightSum = 0;
    int leftSum = 0;
    int k = 2,j = 0;
    for (List<Integer> row : arr){
        
            System.out.println("K, j:" +  k +" " + j);
            rightSum += row.get(j++);
            leftSum += row.get(k--);
        
        
    }
    return Math.abs(rightSum - leftSum);

    }

}

public class AbsoluteDifferenceBetweenDiagonals {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	            List<Integer> arrRowItems = new ArrayList<>();

	            for (int j = 0; j < n; j++) {
	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }

	            arr.add(arrRowItems);
	        }

	        int result = Result.diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}