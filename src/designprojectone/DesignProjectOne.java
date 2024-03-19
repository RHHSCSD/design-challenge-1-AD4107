/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
import java.util.Scanner;
/***************************************************
*
*  Program: Tech Fair Cost Calculator
*  Author: Alexander Dai
*  Date: March 7, 2024
*  Description: Find the total cost for the Tech Fair thing
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* Number of students for the Arduino Project
*Number of students for Raspberry Pi Project
* Number of students for VR Project
* 
*PROCESSING:
*Calculate total amount of money needed for arduino projects
*Calculate total amount of money needed for raspberry pi
*Calculate total amount of money needed for VR project
* Calculate total amount of students and if it’s above 100, give 5% discount
*
*OUTPUT:
*Total cost
*Cost for each project
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Ouput
* 1      15, 15, 15       2925
* 2      50, 50, 50       9175
* 3      10, 10, 10       1950
* 4      16, 20, 10       2944
* 5      15, 21, 10       2902
* 6      -1, -1, -1       -195
* 7      0, 0, 0          0
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
   /* Pesudocode:
      PROGRAM TechFairCostCalculator:
        Read int ARDUINO_STUDENTS
        Read int RASPBERRY_STUDENTS
        Read int VR_STUDENTS
        
        SUM_OF_STUDENTS = ARDUINO_STUDENTS + RASPBERRY_STUDENTS + VR_STUDENTS
        
        int ARDUINO_COST = $10
        int RASPBERRY_COST = $15
        int VR_COST = $20
        
        IF ARDUINO_STUDENTS > 15
            THEN ARDUINO_COST = $9
        ELSE
            ARDUINO_COST = $10
        END IF
        
        IF RASPBERRY_STUDENTS > 20
            THEN RASPBERRY_COST = $12
        ELSE
            RASPBERRY_COST = $15
        END IF
        
        IF SUM_OF_STUDENTS > 100
            THEN give discount of 5%
        ELSE
            don't give discount
        
        Print total amount of money
        END.
   
   */
   
  //CONSTANTS
final int vrCost = 20;

  //VARIABLES
int arduinoCost = 10;
int raspberryCost = 15;
  
  //CODE
  Scanner lol = new Scanner (System.in);
  System.out.println("How many Arduino students: ");
  int arduinoStudents = lol.nextInt();
  System.out.println("How many raspberry Pi students: ");
  int raspberryStudents = lol.nextInt();
  System.out.println("How many VR Projects");
  int vrStudents = lol.nextInt();
  
  if (arduinoStudents>15){
      arduinoCost = 9;
  }
  else{
      arduinoCost = 10;
  }
  if (raspberryStudents > 20){
      raspberryCost = 12;
  }
  else{
      raspberryCost = 15;
  }
  
  int totalStudents = arduinoStudents + raspberryStudents + vrStudents;
  int sumOfEverything = (arduinoCost*arduinoStudents + raspberryStudents*raspberryCost + vrStudents*vrCost);
  double discount = 1;
  
  if (totalStudents>100){
      discount = 0.95;
  }
  else{
      discount = 1;

  }

  System.out.println("Cost for each student is $" + (double)(sumOfEverything+totalStudents*50*discount)/totalStudents);
  
  
    }
    
}
