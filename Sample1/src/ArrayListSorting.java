import java.util.*;
public class ArrayListSorting  {

	public static void main(String args[]){
	   LinkedList<Student> arraylist = new LinkedList<Student>();
	   arraylist.add(new Student(223, "Chaitanya", 26));
	   arraylist.add(new Student(245, "Rahul", 24));
	   arraylist.add(new Student(209, "Ajeet", 32));
	   
	   Iterator i = arraylist.iterator();
	   
	  // System.out.println(arraylist.);
	   
	   Collections.sort(arraylist);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
	}
}