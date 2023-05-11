import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
class Powermatching
{
    public ArrayList<Integer> power(Collection<Integer> collection)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> round = new ArrayList<Integer>();
        ArrayList<Integer> round_2 = new ArrayList<Integer>();
        ArrayList<Integer> round_3 = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
        for (Integer num : collection)
            arr.add(num);
        System.out.println("Fixtures of SemiFinals\n");
        System.out.println("Room 1\n"+"Team "+arr.get(0)+" Vs "+"Team "+arr.get(3));
        System.out.println("\nRoom 2\n"+"Team "+arr.get(1)+" Vs "+"Team "+arr.get(2));
        System.out.println("Enter the score of"+arr.get(0));
        int a0= in.nextInt();
        System.out.println("\nEnter the score of"+arr.get(3));
        int a3= in.nextInt();
        System.out.println("\nEnter the score of"+arr.get(1));
        int a1= in.nextInt();
        System.out.println("\nEnter the score of"+arr.get(2));
        int a2= in.nextInt();
        round.add(a0);
        round.add(a1);
        round.add(a2);
        round.add(a3);
        ArrayList<Integer> round_1 = new ArrayList<Integer>(round);
        Collections.sort(round_1);
        Collections.reverse(round_1);
        int q=0;
        System.out.println("Please enter different scores to each team");
        for(int l=0;l<4;l++)
        {
            q++;
            for(int m=0;m<4;m++)
            {
                int w=m+1;
                if(round_1.get(l)==round.get(m))
                {
                    System.out.println("Rank "+q+" Team "+arr.get(m));
                    round_2.add(arr.get(m));
                }
            }
        }
        System.out.println("\nTeams going into Finals are:");
        for(int ib=0;ib<2;ib++)
        {
            System.out.println("\nTeam "+round_2.get(ib));
            round_3.add(round_2.get(ib));
        }
        return(round_3);
    }
}
