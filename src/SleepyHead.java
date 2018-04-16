//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        
          //Ask the user for these values using
       int q =  JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
       if ( q == 1  ) {
     	  JOptionPane.showMessageDialog(null, "sleep in");
      }
       else if ( q == 0  ) {
    	   int a =  JOptionPane.showConfirmDialog(null, "is it a vaction ?", "", JOptionPane.YES_NO_OPTION);
           if (a == 1) {
        	   JOptionPane.showMessageDialog(null, "get up lazybones");
           }
           else {
        	   JOptionPane.showMessageDialog(null, "sleep in");

           }
     	  
      }
        
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
