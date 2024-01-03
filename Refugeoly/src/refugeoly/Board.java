package refugeoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class Board {
    
    private ArrayList<Square> squares = new ArrayList<Square>();
    
    public void addSquare(Square square)
    {
        squares.add(square);
    }
    
    public Square getSquare(int num)
    {
        return squares.get(num);
    }
    
    
}
