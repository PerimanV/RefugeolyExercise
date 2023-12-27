/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public abstract class ChoiceAction extends Action{
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Option 1: Pay $1500 to Mafia Bank and roll dice. Option 1: Don't pay and stay 2 turns");
    
    int ans = input.nextInt();
    
    if (ans == 1)
    {
        // if ans == 1 pay mafia 1500 and rolldiceaction
    }
    else
    {
        // if ans == 0 Skipturnsaction
    }
    
    void payMoney(Refugee refugee,ReceiverEntity receiver)
    {
        refugee.giveMoney(true, 1500, receiver);
    }
}
    


