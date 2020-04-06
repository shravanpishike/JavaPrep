//import java.util.ArrayList;

class GFG2 
{ 
    // Function to calculate Fibonacci Terms 
    public static void calcFiboTerms(int fiboterms[], 
                                                            int k) 
    { 
        int i = 3, nextTerm = 0; 
              
        fiboterms[0] = 0; 
        fiboterms[1] = 1; 
        fiboterms[2] = 1; 
              
        // Calculate all Fibonacci terms 
        // which are less than or equal to k. 
        while(true) 
        { 
            nextTerm = fiboterms[i - 1] + fiboterms[i - 2]; 
                  
            // If next term is greater than k 
            // do not add in arraylist and return. 
            if(nextTerm>k) 
            return; 
                  
            fiboterms[i] = nextTerm; 
            i++; 
        } 
    } 
      
    // Function to find the minimum number of 
    // Fibonacci terms having sum equal to k. 
    public static int fibMinTerms(int k) 
    { 
        // ArrayList to store Fibonacci terms. 
        int fiboterms []= new int[8]; 
        calcFiboTerms(fiboterms,k); 
          
        int count = 0, j = fiboterms.length - 1; 
          
        // Subtract Fibonacci terms from sum k  
        // until sum > 0. 
        while(k > 0) 
        { 
            // Divide sum k by j-th Fibonacci term to find 
            // how many terms it contribute in sum. 
            count += (k / fiboterms[j]); 
            k %= (fiboterms[j]); 
              
            j--; 
        } 
        return count; 
    } 
      
    // driver code 
    public static void main (String[] args) { 
      
        int k = 17; 
      
        System.out.println(fibMinTerms(k)); 
    } 
} 