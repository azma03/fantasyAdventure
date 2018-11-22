package Runner;
import behaviours.IStrategy;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import enums.Weapon;
import players.Knight;
import players.Player;
import rooms.RoomFactory;

import java.util.Scanner;
import java.lang.reflect.*;


public class Runner {

    public static void main(String[] args) {
        System.out.println("Please enter your name : ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("Which character do you want to be : ");

        Scanner scanner2 = new Scanner(System.in);
        String character = scanner2.nextLine();

        System.out.println("Thanks, but I think you should be a knight");

        Knight player1 = new Knight(name, 100,  Weapon.SWORD);

        RoomFactory roomFactory = new RoomFactory();
        IStrategy room = roomFactory.getStrategy();

        room.interact(player1);

        System.out.println("Your score is " + player1.getScore());
        System.out.println("Your health value is " + player1.getHealthValue());






    }
}
