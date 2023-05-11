import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
class Fixtures
{
    public ArrayList<Integer> fixtures1(int k,Collection<Integer> collection)
    {
        ArrayList<Integer> passwords = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (Integer num : collection)
            passwords.add(num);
        System.out.println("\nPlease Enter Total numbers of Subround");
        int q= in.nextInt();
        System.out.println("\n");
        for (int i = 1; i <=q; i++)
        {
            Collections.shuffle(passwords);
            passwords.removeAll(Arrays.asList(null,""));
            System.out.println("Subround"+i);
            int g=0;
            for(int h=0;h<k-1;h=h+2){
                g++;
                System.out.println("Room"+g+" "+passwords.get(h)+" VS "+passwords.get(h+1)+"\n");
            }
        }
        return(passwords);
    }
}
