/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public abstract class GoToAction extends Action {
    private Square square;
    
    public GoToAction(Square square)
    {
        this.square = square;
        
    }
    
    
    public void movePlayer(Refugee refugee)
    {
        refugee.SetSquare(square);
    }
    
    
}
