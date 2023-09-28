package programsproject;
public class ReverseString

{

   public static void main(String[] args) {


       String stringExample  =  "Software Testing";

       System.out.println("Original string: "+stringExample);


       StringBuilder reverseString = new StringBuilder(stringExample);


       reverseString.reverse();  


    

       String result = reverseString.toString();


       System.out.println("Reversed string: "+result); 


   }

}