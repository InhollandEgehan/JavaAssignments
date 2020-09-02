package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Please enter the size of the group and press [ENTER]");
        boolean isInt= scanner.hasNextInt();
       if(isInt){
           int numberOfStudents = scanner.nextInt();
           Student[] students = new Student[numberOfStudents];
           scanner.nextLine();
           for (int i=0;i<students.length;i++) {
               System.out.println("Please enter the name of Student #"+ (i+1));
               students[i]= new Student();
               students[i].setName(scanner.nextLine());
               
           }
           for (int i=0;i<students.length;i++) {
               System.out.println("Student #"+ (i+1)+":" + students[i].getName());
           }

           boolean absence =true;
           for(int i=0;i< students.length;i++){
               System.out.println("is student #"+(i+1)+ students[i].getName()+"present ? [y/n + ENTER]");
               String studentAbsence =scanner.nextLine();
               System.out.println(studentAbsence);
               if(studentAbsence.equals("y")){
                 absence=true;
               }
               else {
                   absence=false;
               }
               students[i].setPresentAbsent(absence);


           }

           for(int i=0;i< students.length;i++){
               System.out.println("Student #"+ (i+1)+":" + students[i].getName()+"    | Present: "+students[i].getPresentAbsent());
           }
       }
       else{
           System.out.println("Please enter an integer next time");
       }


    }
}
