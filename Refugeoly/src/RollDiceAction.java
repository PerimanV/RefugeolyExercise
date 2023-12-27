/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

public abstract class RollDiceAction extends Action {
    
    
    
    public int rollDice()
    {
        Random rand = new Random();
    
        int  roll = rand.nextInt(6);
        
        return roll;
        
    }
    
}
