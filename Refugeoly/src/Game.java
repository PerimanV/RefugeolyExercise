
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Game {
    
    public void play()
    {
        Board board1 = new Board();
        ReceiverEntity mafia = new ReceiverEntity("mafia",10000);
        GiverEntity NGOBank = new GiverEntity("NGOBank",10000);

//    Square square1 = new Square(1,"Food for the journey. Pay 100$.","This is key once leaving a country in conflict. The journey is always difficult to predict. Outsourcing food is fundamental once a refugee starts a journey.",board1);
//    Square square2 = new Square(2,"Car. You get a free lift. Roll dice.","NGO volunteers or simply samaritans often help refugees by taken them to countries borders for free in their personal cars.",board1); 
//    Square square3 = new Square(3,"Communication gear. Mobile phone and sim card. Pay $300 to the Mafia Bank.","Phone contact is an essential kit for the journey. Refugees required to be able to contact family or the ma a via phone during the journey to safety. Often the Mafia obligates refugees to buy their phones through them, to controls their numbers and communications.",board1);
//    Square square4 = new Square(4,"Army Control. You go back to war box (0).","Often refugees find sudden Army Controls during their journey. The military stop them and in most of the cases divert them back to their countries of origin.",board1);
//    Square square5 = new Square(5,"Border 1. Go back to war box (0).","There are country borders in every country that the refugees have to go through. Refugees are often stuck in these ones till they have their documents checked or pay money for visas to corrupt army forces in order to carry on the journey.",board1);
//    Square square6 = new Square(6,"Mafia. Pay 1000$.","Specialised in Refugees, Mafias have spread dramatically in the last few years. These ones have an enormous power in countries like Turkey and Libya. It is almost impossible to reach Europe without paying the Mafia.",board1);
//    Square square7 = new Square(7,"Live Vest. You have an extra life if you land in the sea (Box 10). ","Once the refugees have reached the coast they must buy a life vest before they get on a boat. The Mafia sales these items, sometimes they don’t float.",board1);
//    Square square8 = new Square(8,"GPS Location. Stay for a turn. ","Before boarding the boats, the Mafia concentrates the refugees in specific places. The Mafia move them in groups towards the departure points.",board1);
//    Square square9 = new Square(9,"Boat. Pay 3000$ to the Mafia Bank. Roll dice.","The average price for crossing the Mediterranean is around 3000$. Sometimes refugee families get a discount.",board1); 
//    Square square10 = new Square(10,"Dead at Sea. You are dead and out of the game.","Over 3000 people died and around 4000 have disappeared in the Mediterranean only in 2017.",board1);
//    Square square11 = new Square(11,"You get sick. Stay one turn. ", "The travelling conditions on the Mafia boats are terrible, lack of drinking water, enough fuel just to reach the coast, the extremely dangerous hygiene conditions and of course the uncertainty, It is very probable to arrived to the coast sick.",board1);
//    


        // Provide the path to your file
        String filePath = "./refugeoly-squares.txt";

        // Create an ArrayList to store Square objects
        ArrayList<Square> squares = new ArrayList<>();

            Scanner scanner;

        try{
        scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {
                // Read the number
                int number = Integer.parseInt(scanner.nextLine().trim());

                // Read the text
                String text = scanner.nextLine().trim();

                // Read the description
                String description = scanner.nextLine().trim();

                // Create a new Square object and add it to the list
                squares.add(new Square(number, text, description, board1)); 
                scanner.nextLine();
            }
            scanner.close();
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("Error there was no file ");
        }
        catch(NumberFormatException | NoSuchElementException e2)
        {
            System.out.println("End of file");
        }
        
       
        PayMoneyAction act1 = new PayMoneyAction(100,false,mafia);
        
        Square sq1 = squares.get(1);
        sq1.addAction(act1);
        
        System.out.println("How many players will be playing?");
        Scanner ans = new Scanner(System.in);
        
        if(ans == 1)
        {
            
        }
        
        
        // add more actions 
        
        //add more squares
        
    }

}







