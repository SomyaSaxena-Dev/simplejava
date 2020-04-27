import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {

	public static List<List<Integer>> groupThePeople(int[] gz) {
		  List<List<Integer>> res = new ArrayList();
		  Map<Integer, List<Integer>> groups = new HashMap<>();
		  for (int i = 0; i < gz.length; ++i) {
		    List<Integer> list = groups.computeIfAbsent(gz[i], k -> new ArrayList());
		    
		    list.add(i);
		   // System.out.println("adding"+list.get(i));
		    if (list.size() == gz[i]) {
		      res.add(list);
		      groups.put(gz[i], new ArrayList());
		    }
		  }
		  return res;
		}
	
	public static void main(String args[]) {
		 List<List<Integer>> res;
		 int arr[]={3,3,3,3,3,1,3};
		 res=groupThePeople(arr);
		 
		 res.forEach((temp) -> {
				System.out.println(temp);
			});
	}
}
