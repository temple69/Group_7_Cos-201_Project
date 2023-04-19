import java.util.Scanner;

public class MultiplicationTableApp {
    public static void main(String[] args){
        //creating the Scanner object
        Scanner obj= new Scanner(System.in);
        System.out.print("Input the maximum number of table: ");
        int maxnum= obj.nextInt();
        System.out.println("Multiplication Table "+"1-"+maxnum+"\n");
        obj.close();
        
        //loop for the number of tables
        for (int number= 1; number <=maxnum; number++) {
            //loop for lines required 
            System.out.print(number + " Times Table\t\n " );
            System.out.println();
          for(int lines=1; lines<=12; lines++){
            System.out.print(number + " x " + lines +" = ");
            //This prints the product of multiplication with 3 set integers
            System.out.printf("%3d\t\n",number*lines);
            
    
         }
         //This Prints A Divider after each Table Iteration by twelve
         System.out.println("----------------------");
         
         
    }
         //This adds a new line after every iteration
         System.out.println();
         



    }


}
