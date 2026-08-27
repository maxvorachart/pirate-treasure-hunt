import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println("Pirate Treasure Hunt"); //initial setup
        
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        
        System.out.println("Welcome, " + name + ".");
        
        System.out.println("You went sailing, your ship crashed, and now you find yourself at an unfamiliar island...");
        
        int num = choice(); //choice branches
        
        if (num == 1)
        {
            System.out.println("You found a cave.");
            num = choice();
            
            if (num == 1)
            {
                System.out.println("You found the hidden treasure!");
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You fell into a volcanoe and died.");
                System.out.println("You lose...");
                
                num = choice();
                if (num == 1)
                {
                    System.out.println("You remain dead...");
                }
                else
                {
                    System.out.println("You somehow survived and became king of the island!"); //secret ending
                }
            }
        }
        else
        {
            System.out.println("You found the jungle.");
            num = choice();
            
            if (num == 1)
            {
                System.out.println("You got lost and starve to death.");
                System.out.println("You lose.");
            }
            else
            {
                System.out.println("You found resources to build a raft home.");
                System.out.println("You survived!");
            }
        }
    }
    
    private static int choice() //method to get choices that are verified
    {
        System.out.println("Ahead of you are two paths:");
        System.out.println("1: Move right, 2: Move left");
        
        while (true)
        {
            Scanner input = new Scanner(System.in);
            
            if(input.hasNextInt())
            {
                int num = input.nextInt();
                if (num == 1 || num == 2)
                {
                    return num;
                }
            }
            input.next();
        }
    }
}
