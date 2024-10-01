package com.example.project;
import java.text.DecimalFormat;
import java.util.Scanner;




public class ExtraCredit {




    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();


                //COPY AND PASTE YOUR CODE HERE


               


                DecimalFormat df1 = new DecimalFormat("#.##"); //i learned this from https://stackoverflow.com/questions/16583604/formatting-numbers-using-decimalformat


        double totalBill = (percent/ 100.0 * cost) + cost;
        double tipAmount = totalBill - cost;
        double perPersonCost = cost / people;
        double perPersonTipAmount = tipAmount / people;
        double perPersonTotalCost = totalBill / people;


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + df1.format(cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + df1.format(percent) + "%\n");
        result.append("Total tip: $" + df1.format(tipAmount) + "\n");
        result.append("Total Bill with tip: $" + df1.format(totalBill) + "\n");
        result.append("Per person cost before tip: $" + df1.format(perPersonCost) + "\n");
        result.append("Tip per person: $" + df1.format(perPersonTipAmount) + "\n");
        result.append("Total cost per person: $" + df1.format(perPersonTotalCost) + "\n");
        result.append("-------------------------------\n");
       


        //the two lines  should go below result.append("-------------------------------\n");
        result.append("Items ordered:\n");
        result.append(items);




        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 2;
        int percent = 5;
        double cost = 29.56;
        String items = "";
       


        //Your scanner object and while loop should go here


        Scanner scan = new Scanner(System.in);
                    System.out.println("Enter a food item or type '-1' to finish");
                    String food = scan.nextLine();
                    if(!"-1".equals(food)) // I learned the .equals function from https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
                    items += food;
                    items += "\n";
                    while(!"-1".equals(food)) {
                    System.out.println("Enter a food or enter -1 to finish");
                    food = scan.nextLine();
                    if(!"-1".equals(food))
                    items += food;
                    items += "\n";


                    }


                   
                   


   
                             
        System.out.println(calculateTip(people,percent,cost,items));


        scan.close();
    }
}
