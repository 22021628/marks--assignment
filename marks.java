import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
         
     System.out.println("Enter learners  marks:");

     Double mark = scann.nextDouble();

     if (mark >=80){
        System.out.println("Outstanding achievement");
     }
     else if (mark >= 70 && mark<= 79) {
        System.out.println("Meritoeious achievement"); 
     }else if (mark >= 60 && mark<= 69) {
        System.out.println("Substantial achievement"); 
     }
     else if (mark >= 50 && mark<= 59) {
        System.out.println("Moderate achievement"); 
     }
     else if (mark >= 40 && mark<= 49) {
        System.out.println("Adequate  achievement"); 
     }
     else if (mark >= 30 && mark<= 39) {
        System.out.println("Elementary achievement"); 
     }
     else if (mark >= 0 && mark<= 29) {
        System.out.println("Not achieved-fail"); 
     }
     else  {
        System.out.println("Error when entering the marks"); 
     }
      
        
    }
    
}
