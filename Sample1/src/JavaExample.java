import java.util.*;  
class JavaExample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
  
     // Collections.sort(alist);
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      //alist.add(3, "Steve");
      Collections.reverse(alist);
      //displaying elements
      System.out.println(alist);
   }  
}