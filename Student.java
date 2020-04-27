import java.util.HashMap;
import java.util.Map;

public class Student {
int id;
String name;
Student(int id, String name){
	this.id = id;
	this.name = name;
}

public static void main(String args[]) {
	Map<Student,Integer> studentMap = new HashMap<>();
	studentMap.put(new Student(1,"abc"),1000);
	studentMap.put(new Student(1,"abc"),2000);
	System.out.println(studentMap.get(new Student(1,"abc")));
}
}

