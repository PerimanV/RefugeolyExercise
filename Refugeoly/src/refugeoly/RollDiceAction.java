package refugeoly;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

public class RollDiceAction extends Action {
    
    @Override
    public void act(Refugee refugee)
    {
        Random rand = new Random();
    
        int  roll = rand.nextInt(6);
        
        System.out.println("The player has rolled a " + roll);
        
        refugee.setPosition(roll);
        
        
    }
    
}
