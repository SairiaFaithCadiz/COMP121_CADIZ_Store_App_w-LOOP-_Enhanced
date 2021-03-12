import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class Cadiz_store_enhanced {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("     .......................................      ");
        System.out.println("     .     Welcome to SFAC Mini-Mart       .      ");
        System.out.println("     . 1. Sairia's Karnehan at Isdaan      .      ");
        System.out.println("     . 2. Bugasan ni Ate Sai               .      ");
        System.out.println("     . 3. CadECE fastfood                  .      ");
        System.out.println("     .......................................      ");
        
        int store;
        int addstore = 0;
        
        do {
            System.out.println("            Where do you want to go?");
            System.out.println("       (just type the NUMBER of that store)");
            store = input.nextInt();
            
            switch (store){
                case 1:
                    System.out.println("     ..........................................      ");
                    System.out.println("     . Welcome to Sairia's Karnehan at Isdaan .      ");
                    System.out.println("     .      Here is our available produce     .      ");
                    System.out.println("     . 1. Whole Chicken..........P120.00/kilo .      ");
                    System.out.println("     . 2. Beef Brisket...........P250.00/kilo .      ");
                    System.out.println("     . 3. Ground Beef............P330.00/kilo .      ");
                    System.out.println("     . 4. Bangus (milkfish)......P140.00/kilo .      ");
                    System.out.println("     . 5. Tilapia................P100.00/kilo .      ");
                    System.out.println("     ..........................................      ");
                    System.out.println("                 IT IS OUR OPENING!!!!               ");
                    System.out.println("              YOU CAN GET A 5% DISCOUNT              ");
                    System.out.println("     ..........................................      ");
                    System.out.println("      BUT IF BUY  500 AND ABOVE WORTH OF ORDER      ");
                    System.out.println("              YOU CAN GET A 10% DISCOUNT             ");
                    System.out.println("     ..........................................      ");
                    
                    int SKISumOfOrders = 0;
                    int SKIorder;
                    int SKInumber1=0,SKInumber2=0,SKInumber3=0,SKInumber4=0,SKInumber5=0;
                    int Chicken=0,Beef=0,Gbeef=0,Bangus=0,Tilapia=0;
                    int SKIfinalorder = 0;
                    int SKIaddorder = 0;
                    
                    do {
                    System.out.println("            What' your order please?");
                    System.out.println("       (just type the NUMBER of that order)");
                    SKIorder = input.nextInt();

                    switch (SKIorder){
                        case 1:
                            System.out.println("   How many kilos of Whole Chicken do you want");
                            SKInumber1 = input.nextInt();
                            SKIfinalorder = 120*SKInumber1;
                            System.out.println("     Your subtotal for this order is P"+SKIfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            SKIaddorder = input.nextInt();
                        break;
                        case 2:
                            System.out.println("    How many kilos of Beef Brisket do you want");
                            SKInumber2 = input.nextInt();
                            SKIfinalorder = 250*SKInumber2;
                            System.out.println("     Your subtotal for this order is P"+SKIfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            SKIaddorder = input.nextInt();
                        break;
                        case 3:
                            System.out.println("     How many kilos of Ground Beef do you want");
                            SKInumber3 = input.nextInt();
                            SKIfinalorder = 330*SKInumber3;
                            System.out.println("     Your subtotal for this order is P"+SKIfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            SKIaddorder = input.nextInt();
                        break;
                        case 4:
                            System.out.println("      How many kilos of Bangus do you want");
                            SKInumber4 = input.nextInt();
                            SKIfinalorder = 140*SKInumber4;
                            System.out.println("     Your subtotal for this order is P"+SKIfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            SKIaddorder = input.nextInt();
                        break;
                        case 5:
                            System.out.println("     How many kilos of Tilapia do you want");
                            SKInumber5 = input.nextInt();
                            SKIfinalorder = 100*SKInumber5;
                            System.out.println("     Your subtotal for this order is P"+SKIfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            SKIaddorder = input.nextInt();
                        break;
                        
                    }
                    SKISumOfOrders += SKIfinalorder;
                    Chicken += SKInumber1;
                    Beef += SKInumber2;
                    Gbeef += SKInumber3;
                    Bangus += SKInumber4;
                    Tilapia += SKInumber5;

                } while (SKIaddorder == 1);
                
                    System.out.println("     ......................................      ");
                    System.out.println("              Here is your receipt               ");
                    if (Chicken != 0) {System.out.println("       Chicken: "+Chicken+"kilos.");}
                    if (Beef != 0) {System.out.println("       Beef: "+Beef+"kilos.");}
                    if (Gbeef != 0) {System.out.println("       Ground Beef: "+Gbeef+"pcs.");}
                    if (Bangus != 0) {System.out.println("       Bangus: "+Bangus+"pcs.");}
                    if (Tilapia != 0) {System.out.println("       Tilapia: "+Tilapia+"pcs.");}
                    System.out.println("       TOTAL: P"+SKISumOfOrders);
                    System.out.println("     ......................................      ");
                    System.out.println("     Because you bought P"+SKISumOfOrders+" worth of order");

                    if (SKISumOfOrders < 500){
                    System.out.println("        You will receive a 5% discount");
                    double SKIDiscountedTotal = SKISumOfOrders - (SKISumOfOrders*0.05) ;
                    System.out.println("         You will only pay P" + SKIDiscountedTotal);
                    System.out.println("     ......................................      ");
                    System.out.println("          Please enter your payment");
                    double SKI = input.nextInt();
                    System.out.println("     ......................................      ");
                    System.out.println("             We received: P"+SKI);
                    System.out.println("           Your change is P"+ (SKI-SKIDiscountedTotal));
                    System.out.println("         Thank you for ordering :)!"); }

                    else if(SKISumOfOrders>=500){
                    System.out.println("        You will receive a 20% discount");
                    double SKIDiscountedTotal = SKISumOfOrders - (SKISumOfOrders*0.10) ;
                    System.out.println("         You will only pay P" + SKIDiscountedTotal);
                    System.out.println("     ......................................      ");
                    System.out.println("          Please enter your payment");
                    double f = input.nextInt();
                    System.out.println("     ......................................      ");
                    System.out.println("             We received: P"+f);
                    System.out.println("           Your change is P"+ (f-SKIDiscountedTotal));
                    System.out.println("         Thank you for ordering :)!"); }
                    
                    System.out.println("     *Do you still want to go to other store?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addstore = input.nextInt();
                break;
                case 2:
                    System.out.println("     ..........................................      ");
                    System.out.println("     .      Welcome to Bugasan ni Ate Sai     .      ");
                    System.out.println("     .      Here is our available products    .      ");
                    System.out.println("     . 1. NFA RICE................P35.00/kilo .      ");
                    System.out.println("     . 2. REGULAR RICE............P41.00/kilo .      ");
                    System.out.println("     . 3. WELL-MILED RICE.........P49.00/kilo .      ");
                    System.out.println("     . 4. PREMIUM RICE............P55.00/kilo .      ");
                    System.out.println("     . 5. FANCY RICE..............P60.00/kilo .      ");
                    System.out.println("     ..........................................      ");
                    System.out.println("     SWERTE KA KAPAMILYA, MAY PROMO KAMI WOHOO!      ");
                    System.out.println("              YOU CAN GET A 3% DISCOUNT              ");
                    System.out.println("     ..........................................      ");
                    System.out.println("      BUT IF BUY a minimum of 1 SACK (50 KILOS)      ");
                    System.out.println("          EVEN IF IT IS OF THE SAME RICE OR          ");
                    System.out.println("           A COMBINATION OF DIFFERENT RICE           ");
                    System.out.println("              YOU CAN GET A 5% DISCOUNT              ");
                    System.out.println("     ..........................................      ");
                    
                    int BASSumOfOrders = 0;
                    int BASorder;
                    int BASnumber1=0,BASnumber2=0,BASnumber3=0,BASnumber4=0,BASnumber5=0;
                    int NFA=0,REGULAR=0,WELL=0,PREMIUM=0,FANCY=0;
                    int BASfinalorder = 0;
                    int BASaddorder = 0;
                    
                    do {
                    System.out.println("            What' your order please?");
                    System.out.println("       (just type the NUMBER of that order)");
                    BASorder = input.nextInt();

                    switch (BASorder){
                        case 1:
                            System.out.println("      How many kilos of NFA RICE do you want");
                            BASnumber1 = input.nextInt();
                            BASfinalorder = 35*BASnumber1;
                            System.out.println("     Your subtotal for this order is P"+BASfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            BASaddorder = input.nextInt();
                        break;
                        case 2:
                            System.out.println("    How many kilos of REGULAR RICE do you want");
                            BASnumber2 = input.nextInt();
                            BASfinalorder =41*BASnumber2;
                            System.out.println("     Your subtotal for this order is P"+BASfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            BASaddorder = input.nextInt();
                        break;
                        case 3:
                            System.out.println("  How many kilos of WELL-MILLED RICE do you want");
                            BASnumber3 = input.nextInt();
                            BASfinalorder = 49*BASnumber3;
                            System.out.println("     Your subtotal for this order is P"+BASfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            BASaddorder = input.nextInt();
                        break;
                        case 4:
                            System.out.println("    How many kilos of PREMIUM RICE do you want");
                            BASnumber4 = input.nextInt();
                            BASfinalorder = 55*BASnumber4;
                            System.out.println("     Your subtotal for this order is P"+BASfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            BASaddorder = input.nextInt();
                        break;
                        case 5:
                            System.out.println("     How many kilos of FANCY RICE do you want");
                            BASnumber5 = input.nextInt();
                            BASfinalorder = 60*BASnumber5;
                            System.out.println("     Your subtotal for this order is P"+BASfinalorder);
                            System.out.println("     ..........................................      ");
                            System.out.println("     *Do you still want to add you order?*");
                            System.out.println("        If yes, type 1. If no type 2.");
                            BASaddorder = input.nextInt();
                        break;
                        
                    }
                    BASSumOfOrders += BASfinalorder;
                    NFA += BASnumber1;
                    REGULAR += BASnumber2;
                    WELL += BASnumber3;
                    PREMIUM += BASnumber4;
                    FANCY += BASnumber5;

                } while (BASaddorder == 1);
                    
                    double BASraw = NFA + REGULAR + WELL + PREMIUM + FANCY;
                    double BASremainder = BASraw % 50;
                    double BASwholenumber = (BASraw-BASremainder)/50;
                    
                    System.out.println("     ......................................      ");
                    System.out.println("              Here is your receipt               ");
                    if (NFA != 0) {System.out.println("       NFA RICE: "+NFA+" kilos.");}
                    if (REGULAR != 0) {System.out.println("       REGULAR RICE: "+REGULAR+" kilos.");}
                    if (WELL != 0) {System.out.println("       WELL-MILLED RICE: "+WELL+" kilos.");}
                    if (PREMIUM != 0) {System.out.println("       PREMIUM RICE: "+PREMIUM+" kilos.");}
                    if (FANCY != 0) {System.out.println("       FANCY RICE: "+FANCY+" kilos");}
                    System.out.println("       TOTAL: P"+BASSumOfOrders);
                    System.out.println("     ......................................      ");
                                              System.out.println("         Because you bought "+BASraw+" kilos");
                    if (BASwholenumber != 0 & BASremainder != 0)
                    {                         System.out.println("     Which means you have a total of "+BASwholenumber+" sacks");
                                              System.out.println("           and "+BASremainder+" kilos of rice");
                                              System.out.println("         You will receive a 5% discount");
                                              double BASDiscountedTotal = BASSumOfOrders - (BASSumOfOrders*0.05) ;
                                              System.out.println("         You will only pay P" + BASDiscountedTotal);
                                              System.out.println("     ......................................      ");
                                              System.out.println("          Please enter your payment");
                                              double BAS = input.nextInt();
                                              System.out.println("     ......................................      ");
                                              System.out.println("             We received: P"+BAS);
                                              System.out.println("           Your change is P"+ (BAS-BASDiscountedTotal));
                                              System.out.println("         Thank you for ordering :)!"); 
                    }
                    if (BASwholenumber != 0 & BASremainder == 0)
                    {                         System.out.println("     Which means you have a total of "+BASwholenumber+"sacks");
                                              System.out.println("        You will receive a 5% discount");
                                              double BASDiscountedTotal = BASSumOfOrders - (BASSumOfOrders*0.05) ;
                                              System.out.println("         You will only pay P" + BASDiscountedTotal);
                                              System.out.println("     ......................................      ");
                                              System.out.println("          Please enter your payment");
                                              double BAS = input.nextInt();
                                              System.out.println("     ......................................      ");
                                              System.out.println("             We received: P"+BAS);
                                              System.out.println("           Your change is P"+ (BAS-BASDiscountedTotal));
                                              System.out.println("         Thank you for ordering :)!"); 
                    }
                    if (BASwholenumber == 0 & BASremainder !=0)
                    {                         System.out.println("     Which means you have a total of "+BASremainder+"kilos of rice");
                                              System.out.println("         You will receive a 3% discount");
                                              double BASDiscountedTotal = BASSumOfOrders - (BASSumOfOrders*0.03) ;
                                              System.out.println("         You will only pay P" + BASDiscountedTotal);
                                              System.out.println("     ......................................      ");
                                              System.out.println("          Please enter your payment");
                                              double BAS = input.nextInt();
                                              System.out.println("     ......................................      ");
                                              System.out.println("             We received: P"+BAS);
                                              System.out.println("           Your change is P"+ (BAS-BASDiscountedTotal));
                                              System.out.println("         Thank you for ordering :)!"); 
                    }

                    System.out.println("     *Do you still want to go to other store?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addstore = input.nextInt();
                break;
                case 3:
                    System.out.println("     ......................................      ");
                    System.out.println("     .     Welcome to cadECE fastfood     .      ");
                    System.out.println("     .          Here is our menu          .      ");
                    System.out.println("     . 1. Fried Chicken w/ rice...P60.00  .      ");
                    System.out.println("     . 2. Spaghetti...............P50.00  .      ");
                    System.out.println("     . 3. Burger..................P30.00  .      ");
                    System.out.println("     . 4. Fries...................P30.00  .      ");
                    System.out.println("     . 5. Ice cream Sundae........P20.00  .      ");
                    System.out.println("     ......................................      ");
                    System.out.println("         IT IS OUR 1ST ANIVERSARY!!!!            ");
                    System.out.println("          YOU CAN GET A 10% DISCOUNT             ");
                    System.out.println("     ......................................      ");
                    System.out.println("    BUT IF BUY  200 AND ABOVE WORTH OF ORDER      ");
                    System.out.println("         YOU CAN GET A 20% DISCOUNT              ");
                    System.out.println("     ......................................      ");


                    int SumOfOrders = 0;
                    int order;
                    int number1=0,number2=0,number3=0,number4=0,number5=0;
                    int Friedchicken=0,Spaghetti=0,Burger=0,Fries=0,Icecreamsundae=0;
                    int finalorder = 0;
                    int addorder = 0;


                    do {
                        System.out.println("            What' your order please?");
                        System.out.println("       (just type the NUMBER of that order)");
                        order = input.nextInt();

                        switch (order){
                            case 1:
                                System.out.println("     How many FRIED CHICKEN do you want");
                                number1 = input.nextInt();
                                finalorder = 60*number1;
                                System.out.println("     Your subtotal for this order is P"+finalorder);
                                System.out.println("     ......................................      ");
                                System.out.println("     *Do you still want to add you order?*");
                                System.out.println("        If yes, type 1. If no type 2.");
                                addorder = input.nextInt();
                            break;
                            case 2:
                                System.out.println("        How many SPAGHETTI do you want");
                                number2 = input.nextInt();
                                finalorder = 50*number2;
                                System.out.println("     Your subtotal for this order is P"+finalorder);
                                System.out.println("     ......................................      ");
                                System.out.println("     *Do you still want to add you order?*");
                                System.out.println("        If yes, type 1. If no type 2.");
                                addorder = input.nextInt();
                            break;
                            case 3:
                                System.out.println("          How many BURGER do you want");
                                number3 = input.nextInt();
                                finalorder = 30*number3;
                                System.out.println("     Your subtotal for this order is P"+finalorder);
                                System.out.println("     ......................................      ");
                                System.out.println("     *Do you still want to add you order?*");
                                System.out.println("        If yes, type 1. If no type 2.");
                                addorder = input.nextInt();
                            break;
                            case 4:
                                System.out.println("          How many FRIES do you want");
                                number4 = input.nextInt();
                                finalorder = 30*number4;
                                System.out.println("     Your subtotal for this order is P"+finalorder);
                                System.out.println("     ......................................      ");
                                System.out.println("     *Do you still want to add you order?*");
                                System.out.println("        If yes, type 1. If no type 2.");
                                addorder = input.nextInt();
                            break;
                            case 5:
                                System.out.println("     How many ICE CREAM SUNDAE do you want");
                                number5 = input.nextInt();
                                finalorder = 20*number5;
                                System.out.println("     Your subtotal for this order is P"+finalorder);
                                System.out.println("     ......................................      ");
                                System.out.println("     *Do you still want to add you order?*");
                                System.out.println("        If yes, type 1. If no type 2.");
                                addorder = input.nextInt();
                            break;

                        }
                        SumOfOrders += finalorder;
                        Friedchicken += number1;
                        Spaghetti += number2;
                        Burger += number3;
                        Fries += number4;
                        Icecreamsundae += number5;

                    } while (addorder == 1);

                    System.out.println("     ......................................      ");
                    System.out.println("              Here is your receipt               ");
                    if (Friedchicken != 0) {System.out.println("       Fried Chicken w/ rice........."+Friedchicken+"pcs.");}
                    if (Spaghetti != 0) {System.out.println("       Spaghetti....................."+Spaghetti+"pcs.");}
                    if (Burger != 0) {System.out.println("       Burger........................"+Burger+"pcs.");}
                    if (Fries != 0) {System.out.println("       Fries........................."+Fries+"pcs.");}
                    if (Icecreamsundae != 0) {System.out.println("       Ice cream Sundae.............."+Icecreamsundae+"pcs.");}
                    System.out.println("       TOTAL: P"+SumOfOrders);
                    System.out.println("     ......................................      ");
                    System.out.println("     Because you bought P"+SumOfOrders+" worth of order");

                    if (SumOfOrders <= 200){
                    System.out.println("        You will receive a 10% discount");
                    double DiscountedTotal = SumOfOrders - (SumOfOrders*0.10) ;
                    System.out.println("         You will only pay P" + DiscountedTotal);
                    System.out.println("     ......................................      ");
                    System.out.println("          Please enter your payment");
                    double f = input.nextInt();
                    System.out.println("     ......................................      ");
                    System.out.println("             We received: P"+f);
                    System.out.println("           Your change is P"+ (f-DiscountedTotal));
                    System.out.println("         Thank you for ordering :)!"); }

                    else if(SumOfOrders>=200){
                    System.out.println("        You will receive a 20% discount");
                    double DiscountedTotal = SumOfOrders - (SumOfOrders*0.20) ;
                    System.out.println("         You will only pay P" + DiscountedTotal);
                    System.out.println("     ......................................      ");
                    System.out.println("          Please enter your payment");
                    double f = input.nextInt();
                    System.out.println("     ......................................      ");
                    System.out.println("             We received: P"+f);
                    System.out.println("           Your change is P"+ (f-DiscountedTotal));
                    System.out.println("         Thank you for ordering :)!"); }
                    
                    System.out.println("     *Do you still want to go to other store?*");
                    System.out.println("        If yes, type 1. If no type 2.");
                    addstore = input.nextInt();
                break;
            }
        }while (addstore == 1);
        
        System.out.println("               Happy to serve you :)!");
        System.out.println("         Thank you, Have a blessed day :)!");
        System.out.println("               sa SFAC bida and tipid!");
    }
    
}
