/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Bipin Bhatt
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Output the print statement
       System.out.println("Information for the  first 10 Rounds:");
       
        //Declaring all the variables
       int total;
       int win = 0;
       int loss = 0;
       int point = 0;
       int roll = 1;
       boolean winOrLoss;
       
       //declaring a foor loop from 1 to 100000
       for (int i = 1; i < 100001; i++) {
           total = getScore(i, roll);
           
           //condition to win is either to get 7 or either 11
          if (total == 7 || total == 11)
           {
               winOrLoss = true;
               win++;
           }   
               //condition to lose is to get the total 2, 3, 13
          else if (total == 2 || total == 3 || total == 13)
           {
               winOrLoss = false;
               loss++;
           } 
           
           //the remaining condition will be the condition to get a point
           else 
           {
               //Takiing the value of point equal to the value of the total
               point = total;
               
               // Condition for point to be equal to total value when between 1 to 10
               if(i <= 10) 
               {
                   System.out.println("Point is " + point);
               }
               
               while (true)
               {
                  
                   total = getScore(i, roll);
                   if (total == point) {
                       winOrLoss = true;
                       win++;
                       break;
                   }
                    
                   else if (total == 7) 
                   {
                       winOrLoss = false;
                       loss++;
                      break;
                   }
                    roll++;
               }
           }
           roll = 1;
           if (i <= 10) {
               if (winOrLoss)
               {
                   System.out.println("Congratulations, It's a Win!");
               }
               else
               {
               System.out.println("Sorry, It's a Loss");
               }
               System.out.println(win + " win(s) , " + loss + " loss(es)");
               System.out.println("\n" );
               
           }
       }
       //showing total wins and loss    
       System.out.println("OVERALL: \n" + win + " wins , " + loss + " losses");
   }

   private static int getScore(int i, int roll) 
   {
       
       //generating random dice value 
       int dice1 = (int) ((Math.random() * 6) + 1);
       int dice2 = (int) ((Math.random() * 6) + 1);
      
       //adding both dice value after rollingthe dies 
       int total = dice1 + dice2;
      
       
       if (i <= 10) {//printing details
           
           System.out.println("Round " + i + " , Roll " + roll + " -- Die1: " + dice1 + " , Die2: " + dice2 + " -- Total: " + total);
       }      
      
       return total;
   }
   
}


    
    

