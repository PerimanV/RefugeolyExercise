package refugeoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class GiveLivesAction extends Action {
    
    int LivesToGive;
    
    public GiveLivesAction(int LivesToGive)
    {
        this.LivesToGive = LivesToGive;
    }
    
    
    @Override
    public void act(Refugee refugee)
    {
        refugee.addLives(this.LivesToGive);
    }
}
