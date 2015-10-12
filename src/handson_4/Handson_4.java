/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson_4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Handson_4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardnumber;
        System.out.println("choose one card from 1 to 10 ");
	cardnumber= sc.nextInt();
        switch(cardnumber)
{
case 1:
	System.out.println("you have selected card 1");
	break;
case 2:
	System.out.println("you have selected card 2");
	break;
case 3:
	System.out.println("you have selected card 3");
	break;
case 4:
	System.out.println("you have selected card 4");
	break;
case 5:
	System.out.println("you have selected card 5");
	break;
case 6:
	System.out.println("you have selected card 6");
	break;
case 7:
	System.out.println("you have selected card 7");
	break;
case 8:
	System.out.println("you have selected card 8");
	break;
case 9:
	System.out.println("you have selected card 9");
	break;
case 10:
	System.out.println("you have selected card 10");
	break;
default:
	System.out.println("please select card between 1 to 10");
	
}
}

    }
    

