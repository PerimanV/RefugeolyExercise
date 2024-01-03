/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class RemoveLivesAction extends Action {
    int LivesToRemove;
    
    public RemoveLivesAction(int LivesToRemove)
    {
        this.LivesToRemove = LivesToRemove;
    }
    
    @Override
    public void act(Refugee refugee)
    {
        refugee.removeLives(LivesToRemove);
    }
}
