/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public abstract class SkipTurnsAction extends Action {
    
    int turns;
    
    public SkipTurnsAction(int turns)
    {
        this.turns = turns;
    }
 
    
    void skipTurns(Refugee refugee)
    {
        refugee.addSkipTurns(turns);
    }
}
