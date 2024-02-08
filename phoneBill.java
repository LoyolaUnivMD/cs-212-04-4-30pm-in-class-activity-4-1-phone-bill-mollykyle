// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

import java.util.Objects;
import java.util.Scanner;
import java.text.DecimalFormat;

class phoneBill {
    public static void main(String[] args) {
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        //String format = decimalFormat.format(123456789.123);
        //System.out.println(format);


        System.out.println("Phone Bill Activity!");
        Scanner input = new Scanner(System.in);

//        1. Ask user for input for typePackage
        System.out.println("What type of package do you have?");
        String typePackage = input.next();
//        2. Strip and set typePackage to lowercase
        typePackage = typePackage.toLowerCase();
//        3. while the typePackage is either "green", "blue", or "purple":
        while (Objects.equals(typePackage, "green") || (Objects.equals(typePackage, "blue") || (Objects.equals(typePackage, "purple")))) {
            //a. if typePackage = "green"
            if (Objects.equals(typePackage, "green")) {
                //i. providedGB = 2
                int providedGB = 2;
//               ii. additionalGBCost = 15
                int additionalGBCost = 15;
//               iii. costPerMonth = 49.99
                double costPerMonth = 49.99;
//               iv. assign GBused to user input
                System.out.println("How many GB have you used?");
                int GBused = input.nextInt();
//               v. if GBused is greater than providedGB:
                if (GBused > providedGB) {
                    //  1. calculate totalCost by adding costPerMonth and ((GBused - providedGB)(additionalGBCost))
                    double totalCost = costPerMonth + ((GBused - providedGB) * additionalGBCost);
//                   2. ask user if they have a coupon
                    System.out.println("Do you have a coupon?");
                    String coupon = input.next();
//                  3. if coupon is true and cost is greater than or equal to 75:
                    if (Objects.equals(coupon, "yes") && totalCost > 75) {
                        //a. set value for coupon
                        int couponValue = 20;
//                      b. subtract coupon from cost
                        totalCost = totalCost - couponValue;
                        String cost = decimalFormat.format(totalCost);
                        System.out.print("Your total cost this month is $" + cost);
                    }
                    //if they don't have a coupon
                    else {
                        //totalCost = costPerMonth;
                        String cost = decimalFormat.format(totalCost);
                        System.out.print("Your total cost this month is $" + cost);
                    }

                }
                else {
                    double totalCost = costPerMonth;
                    String cost = decimalFormat.format(totalCost);
                    System.out.print("Your total cost this month is $" + cost);
                }
            }
////              vii. output total cost


            //           b. otherwise if typePackage = "blue"
            else if (Objects.equals(typePackage, "blue")) {

//               i. providedGB = 4
                int providedGB = 4;

//              ii. additionalGBCost = 10
                int additionalGBCost = 10;

//              iii. costPerMonth = 70
                int costPerMonth = 70;

//              iv. assign GBused to user input
                System.out.println("How many GB have you used?");
                int GBused = input.nextInt();

//              v. if GBused is greater than providedGB:
                if (GBused > providedGB) {
                    //1. calculate totalCost by adding costPerMonth and ((GBused - providedGB)(additionalGBCost))
                    double totalCost = costPerMonth + ((GBused - providedGB) * additionalGBCost);
                    String cost = decimalFormat.format(totalCost);
                    System.out.print("Your total cost this month is $" + cost);
                }
//              iv. else
                else {
                    //1. totalCost = costPerMonth
                    double totalCost = costPerMonth;
//                      2. output totalCost
                    String cost = decimalFormat.format(totalCost);
                    System.out.print("Your total cost this month is $" + cost);
                }
//
//


            }

//        c. otherwise if typePackage = "purple":
            else if (Objects.equals(typePackage, "purple")) {
//          iii. costPerMonth = 99.95
                double costPerMonth = 99.95;
                double totalCost = costPerMonth;
                String cost = decimalFormat.format(totalCost);
                System.out.print("Your total cost this month is $" + cost);

            }
//         e. Ask for exit input?
            System.out.println();
            System.out.println("Please enter something to end the program");
            typePackage = input.next();

        }
        //d. Output error message
        //System.out.println("Incorrect input please try the program again");
    }


    }

