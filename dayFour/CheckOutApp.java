import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class CheckOutApp{

    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("What is the customers name: ");
        String customer = inputCollector.nextLine();
        String decision = "";
        String product = "";
        int unit = 0;
        double price = 0;
        ArrayList<String> theProduct = new ArrayList<String>();
        ArrayList<Integer> theUnit = new ArrayList<Integer>();
        ArrayList<Double> thePrice = new ArrayList<Double>();
               
        while(!decision.equals("no")){
            System.out.println("What did the user buy: ");
            product = inputCollector.nextLine();
            theProduct.add(product);

            System.out.println("How many pieces: ");
            unit = inputCollector.nextInt();
            theUnit.add(unit);

            System.out.println("How much per unit: ");
            price = inputCollector.nextDouble();
            thePrice.add(price);
            
            inputCollector.nextLine();
            System.out.println("Add more items: ");
            decision = inputCollector.nextLine();
            
        }
        
        System.out.println("What is your name: ");
        String cashiersName = inputCollector.nextLine();
        System.out.println("How much discount will he get: ");
        double discount = inputCollector.nextDouble();
        System.out.println();


    System.out.printf("SEMICOLON STORES%nMAIN BRANCH%nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABO, LAGOS.%nTEL: 03293828343%nDate : 18-Dec-22 8:48:11 pm%nCashier: %s %nCustomer's Name: %s%n%n", cashiersName,customer);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-15s%-14s%-14s%-14s%-14s%n","","ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.printf("  -----------------------------------------------------------------------%n");
    for(int counter = 0; counter < theProduct.size(); counter++){

        System.out.printf("%-15s%-14s%-14d%-14.2f%-14.2f%n","",theProduct.get(counter),theUnit.get(counter),thePrice.get(counter), thePrice.get(counter) * theUnit.get(counter));

    }
    System.out.printf("%n  -----------------------------------------------------------------------%n");
    double total = 0;
    for(int counter = 0; counter < theProduct.size(); counter++){

        total = total + thePrice.get(counter) * theUnit.get(counter);

    }
    discount = (discount/100.0) * total;
    double vat = (17.50/100.0) * total;
    double billTotal = total - discount + vat;    

    System.out.printf("%-29s%-16s%.2f%n","","Sub Total:",total);
    System.out.printf("%-29s%-16s%.2f%n","","Discount:",discount);
    System.out.printf("%-29s%-16s%.2f%n","","VAT @ 17.50%:",vat);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-29s%-16s%.2f%n","","Bill Total:",billTotal);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-4sTHIS IS NOT A RECEIPT KINDLY PAY %.2f%n","",billTotal);
    System.out.printf("  =======================================================================%n%n");

    System.out.println("How much did the customer give to you?");
    double amountPayed = inputCollector.nextDouble();
    System.out.println();


    System.out.printf("SEMICOLON STORES%nMAIN BRANCH%nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABO, LAGOS.%nTEL: 03293828343%nDate : 18-Dec-22 8:48:11 pm%nCashier: %s %nCustomer's Name: %s%n%n", cashiersName,customer);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-15s%-14s%-14s%-14s%-14s%n","","ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.printf("  -----------------------------------------------------------------------%n");
    for(int counter = 0; counter < theProduct.size(); counter++){

        System.out.printf("%-15s%-14s%-14d%-14.2f%-14.2f%n","",theProduct.get(counter),theUnit.get(counter),thePrice.get(counter), thePrice.get(counter) * theUnit.get(counter));

    }
    System.out.printf("%n  -----------------------------------------------------------------------%n");
    //double total = 0;
    for(int counter = 0; counter < theProduct.size(); counter++){

        total = total + thePrice.get(counter) * theUnit.get(counter);

    }
    discount = (discount/100.0) * total;
    double balance = amountPayed - billTotal;

    System.out.printf("%-29s%-16s%.2f%n","","Sub Total:",total);
    System.out.printf("%-29s%-16s%.2f%n","","Discount:",discount);
    System.out.printf("%-29s%-16s%.2f%n","","VAT @ 17.50%:",vat);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-29s%-16s%.2f%n","","Bill Total:",billTotal);
    System.out.printf("%-29s%-16s%.2f%n","","Amount Paid:",amountPayed);
    System.out.printf("%-29s%-16s%.2f%n","","Balance:",balance);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-15sTHANK YOU FOR YOUR PATRONAGE%n","");
    System.out.printf("  =======================================================================%n%n");


    }
    
}
