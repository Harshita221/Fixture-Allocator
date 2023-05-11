import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
public class App {

        public static void main(String[] args)
        {
            Fixtures round=new Fixtures();
            Nextround round1= new Nextround();
            Powermatching p= new Powermatching();
            ArrayList<Integer> passwords = new ArrayList<Integer>();
            Scanner in = new Scanner(System.in);
            System.out.println(" COMPETITION APP\n ");
            System.out.println("Please Enter Total numbers of teams for the competition\n");
            int k= in.nextInt();
            System.out.println("Please Enter team numbers for the competition\n");
            for(int m=0;m<k;m++)
            {
                Integer input = in.nextInt();
                passwords.add(input);
            }
            ArrayList<Integer>abc=round.fixtures1(k,passwords);
            ArrayList<Integer> arr= round1.next_round(k,abc);
            int a1= arr.size();
            ArrayList<Integer>abc1=round.fixtures1(a1,arr);
            ArrayList<Integer> arr1= round1.next_round(a1,abc1);
            int a2= arr1.size();
            ArrayList<Integer> arr2= p.power(arr1);
            System.out.println("FINAL ROUND");
            System.out.println("\nROOM 1\n" +arr2.get(0) +" Vs " +arr2.get(1));
            System.out.println("\nEnter the score of team: "+arr2.get(0));
            int a3=in.nextInt();
            System.out.println("\nEnter the score of team: "+arr2.get(1));
            int a4=in.nextInt();
            if(a3>a4)
            {
                System.out.println("\n Winner of the competition is Team " +arr2.get(0));
            }
            else
            {
                System.out.println("\n Winner of the competition is Team " +arr2.get(1));

            }
        }
    }

