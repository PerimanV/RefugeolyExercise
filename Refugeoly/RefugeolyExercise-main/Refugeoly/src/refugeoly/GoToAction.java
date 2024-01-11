package refugeoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class GoToAction extends Action {
    private Square square;
    
    public GoToAction(Square square)
    {
        this.square = square;
        
    }
    
    
    @Override
    public void act(Refugee refugee)
    {
        refugee.setSquare(square);
    }
    
    
}
