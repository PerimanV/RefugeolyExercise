/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class Square {
    
    private int number;
    private String text,description;
    private Table board;
    
    public Square (int number,String text,String description,Table board)
    {
        this.number = number;
        this.text = text;
        this.description = description;
        this.board = board;
        
        
    }
    
    ArrayList<Action> actions = new ArrayList<Action>();
    
    
    
}
