import java.util.Scanner;
/** ***************************************************
 *  Name:           your name here
 *  Class:          CS30S
 *  Assignment:     A1 Q1 Arrays alternating sum
 *  Description:    Calculate the alternating sum of 10 numbers in an array
 *************************************************************/
public class Main{
    public static void main(String[] args) {
        // *** constants ***
        final int MAXLISTSIZE = 10;    // the max length of the array
        final int ONE = 1;             // the number one 
        final int ZERO = 0;            // the number zero
        
        // *** objects ***
        // for input 
        Scanner sc = new Scanner(System.in);
        
        // *** variables ***
        // the array and supporting variables
        int[] list = new int[MAXLISTSIZE];  // array for list of int nums
        int n = 0;                          // number read from standard input using sc
        int count = 0;                      // using the count variable to track the index
        int plusMinus = 0;                  // if 0 then add if 1 then subtract
        int numIndicator = 1;               // the number indicator for each element
        
        // final calculation variables
        int sum = 0;                        // sum of the array of ints

        // banner and new line
        String banner;
        String nl = System.lineSeparator();
        
        // *** banner ***
        // dons't change the name, if you do all of the tests will fail
        banner = "*****************************" + nl;
        banner += "Name:        Programmer" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1 Alt Sum" + nl;
        banner += "*****************************" + nl;
        
        System.out.println(banner);
        //*** load the array with 10 numbers from the keyboard ***
        // printing the prompt
        System.out.println("enter 10 numbers then press enter" + nl);
        // load array
        // priming the loop
        count = 0;            // setting the counter to zero
        plusMinus = 0;        // setting to zero

      // while loop to gather input from the keyboard buffer
      //while(n != 0 && count < (MAXLISTSIZE - ONE)){
        //    list[count] = n;
          //  n = sc.nextInt();
            //count++;
            //if (count <= MAXLISTSIZE - ONE){
              //list[count] = n;
            //} // end if
      //} // end while
      
      for (int i = 0; i < MAXLISTSIZE; i++){
        list[i] = sc.nextInt();     // getting intial input and priming the loop
      }
    
    // ***** Print Formatted Output *****
      // print the list of numbers
      for(int i = 0; i <= count; i++){
        System.out.println(numIndicator + ": " + list[i]);
        numIndicator++;
      } // end int i for displaying the input
        
        // *** calculate the alternating sum here ***
        for(int i = 0; i < list.length; i++){
        if (plusMinus == 0){
        sum += list[i];
        plusMinus = ONE;
      } // end if
        else {
          sum -= list[i];
        plusMinus = ZERO;
        } // end else
      } // end int i for finding the sum
        
        // *** print the array and alternating sum here ***
        System.out.println("\nThe alternating sum = " + sum);

        //*** closing message ***
        System.out.println("\nend of program");
    }// end printList
}  // end class
