/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class ChoiceAction extends Action{
    Refugee refugee;
    ReceiverEntity receiver;
    
    
    public ChoiceAction (Refugee refugee,ReceiverEntity receiver)
    {
        this.refugee = refugee;
        this.receiver = receiver;
    }
    
    Scanner input = new Scanner(System.in);
    
   @Override
   public void act(Refugee refugee) {
        System.out.println("Option 1: Pay $1500 to Mafia Bank and roll dice. Option 2: Don't pay and stay 2 turns");
   
        int ans = input.nextInt();

        if (ans == 1)
        {
            refugee.giveMoney(true, 1500,receiver );
            
        }
        else
        {
            refugee.addSkipTurns(2);
        }
   }
    
    public void payMoney(Refugee refugee,ReceiverEntity receiver)
    {
        refugee.giveMoney(true, 1500, receiver);
    }
}
    


