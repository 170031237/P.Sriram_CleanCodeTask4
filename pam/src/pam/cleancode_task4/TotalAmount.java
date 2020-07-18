package pam.cleancode_task4;

import java.io.*;      

@SuppressWarnings("unused")
abstract public class TotalAmount{  
         protected double rate;  
         abstract void getRate();  
   

		public double calculateBill(double sqrfoot) {
			return sqrfoot*rate;
		}  
}  