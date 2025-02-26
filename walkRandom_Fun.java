import java.util.*;
public class walkRandom_Fun {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int ran = (int)(Math.random() * 4 + 1);
    double Squared_distance = 0;
    int x = 0;
    int y = 0;
    
    System.out.print("Enter walk number: ");
    int walk_num = input.nextInt();

    System.out.println("(" + x + "," + y + ")");
    for(int i = 1; i <= walk_num; i++)
    {
        ran = (int)(Math.random() * 4 + 1);
        if(ran == 1)
        {
            x++;
            System.out.println("(" + x + "," + y + ")");
        }

        else if(ran == 2)
        {
            x--;
            System.out.println("(" + x + "," + y + ")");
        }

        else if(ran == 3)
        {
            y++;
            System.out.println("(" + x + "," + y + ")");
        }

        else if(ran == 4)
        {
            y--;
            System.out.println("(" + x + "," + y + ")");
        }

    }

    Squared_distance = ((x * x) + (y * y));
    System.out.println("Squared distance = " + Squared_distance);


    }
}
