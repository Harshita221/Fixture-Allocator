import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
class Nextround
{
    public ArrayList<Integer> next_round(int k,Collection<Integer> collection)
    {
        ArrayList<Integer> passwords = new ArrayList<Integer>();
        for (Integer num : collection)
            passwords.add(num);
        ArrayList<Integer> round = new ArrayList<Integer>();
        ArrayList<Integer> round_2 = new ArrayList<Integer>();
        ArrayList<Integer> round_3 = new ArrayList<Integer>();
        int i=0;
        int j=0;
        Scanner input = new Scanner(System.in);
        for(int m=k;m>0;m--)
        {
            System.out.println("\n Enter the Score of Team"+passwords.get(i));
            int in = input.nextInt();
            round.add(in);
            i++;
        }
        ArrayList<Integer> round_1 = new ArrayList<Integer>(round);
        Collections.sort(round_1);
        Collections.reverse(round_1);
        int q=0;
        for(int l=0;l<k;l++)
        {
            q++;
            for(int m=0;m<k;m++)
            {
                int w=m+1;
                if(round_1.get(l)==round.get(m))
                {
                    System.out.println("Rank "+q+" Team "+passwords.get(m));
                    round_2.add(passwords.get(m));


                }
            }
        }
        System.out.println("\nEnter the number of teams which should go into next round");
        int ab = input.nextInt();
        System.out.println("\nTeams going into next round are:");

        for(int ib=0;ib<ab;ib++)
        {
            System.out.println("\nTeam "+round_2.get(ib));
            round_3.add(round_2.get(ib));

        }
        return(round_3);
    }

