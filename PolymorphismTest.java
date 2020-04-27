public class PolymorphismTest extends Addition
{
public void add(){
	System.out.println("P blank");
}
public void add(int a){ 
 System.out.println("p not blank");
}


public static void main(String args[]){
Addition addition = new PolymorphismTest(); 
addition.add(); 
}
}
