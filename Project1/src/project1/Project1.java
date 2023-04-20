
package project1;
import java.util.Scanner;
/**
 *
 * @author Neura1Nerd
 */
public class Project1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("DART GAME!");
        System.out.print("Enter the number of darts to be thrown: ");
        double darts = scn.nextInt(); //double because in the static calc part ı need decimal number.
        int count = 1;
        int countA = 0; int countB = 0; int countC = 0; int countD = 0;
        int countE = 0; int countF = 0; int countG = 0; int countU = 0;
        double darts1 = darts; //to prevent 0 in the denominator at the end (stat calc part).
        
        while (1 <= darts) {
        
        double oldX = (double)(Math.random()*-10+5); //(a-b, b)
        double x = ((int)(oldX*10)) / 10.0;
        
        double oldY = (double)(Math.random()*-10+5);
        double y = ((int)(oldY*10)) / 10.0;
        
        
        if ( x > 0 && y < 0){
           System.out.println("  ");
           System.out.println("Dart " + count + ":"); 
           System.out.println("Coordinates: " + "(" + x + "," + y + ")");
           System.out.println("Region: F"); 
           countF++;
        } else if ((Math.sqrt(Math.pow(-3-x, 2) + Math.pow(3-y, 2))) < 1 && x < 0 
               && y > 0) {        
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: C");
            countC++;
        } else if ((Math.sqrt(Math.pow(-3-x, 2) + Math.pow(3-y, 2))) > 1 && x < 0
                && y > 0) {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: G");
            countG++;
        } else if (x > 0 && y > 0 && x+y < 5) {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: A"); 
            countA++;
        } else if ( x > 0 && y> 0 && x+y > 5) {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: B");
            countB++;
        } else if ( x < 0 && y < 0 && x < y) {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: D"); 
            countD++;
        } else if ( x < 0 && y < 0 && x > y) {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: E");
            countE++;
        } else if ( x > 0 && y < 0) {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Region: F");
            countF++;
        } else {
            System.out.println("  ");
            System.out.println("Dart " + count + ":"); 
            System.out.println("Coordinates: " + "(" + x + "," + y + ")");
            System.out.println("Undecided");
            countU++;
        }//End of if statement

        
        darts--;
        count++;       
       }//End of While Loop
        
        System.out.println("    ");
        System.out.println("Region statistics:");
        double oldA =(100*countA)/darts1;
        double statA = ((int)(oldA*10)) / 10.0; 
        System.out.println("A: " + countA++ + " dart " + "(" + statA + "%)");
        
        double oldB =(100*countB)/darts1;
        double statB = ((int)(oldB*10)) / 10.0;
        System.out.println("B: " + countB++ + " dart " + "(" + statB + "%)");
       
        double oldC =(100*countC)/darts1;
        double statC = ((int)(oldC*10)) / 10.0;
        System.out.println("C: " + countC++ + " dart " + "(" + statC + "%)");
        
        double oldD =(100*countD)/darts1;
        double statD = ((int)(oldD*10)) / 10.0;
        System.out.println("D: " + countD++ + " dart " + "(" + statD + "%)");
        
        double oldE =(100*countE)/darts1;
        double statE = ((int)(oldE*10)) / 10.0;
        System.out.println("E: " + countE++ + " dart " + "(" + statE + "%)");
        
        double oldF =(100*countF)/darts1;
        double statF = ((int)(oldF*10)) / 10.0;
        System.out.println("F: " + countF++ + " dart " + "(" + statF + "%)");
        
        double oldG =(100*countG)/darts1;
        double statG = ((int)(oldG*10)) / 10.0;
        System.out.println("G: " + countG++ + " dart " + "(" + statG + "%)");
        
        double oldU =(100*countU)/darts1;
        double statU = ((int)(oldU*10)) / 10.0; 
        System.out.println("Undecided: " + countU++ + " dart " + "(" + statU + "%)");
        
        
    }//End of main
    
}//End of class
