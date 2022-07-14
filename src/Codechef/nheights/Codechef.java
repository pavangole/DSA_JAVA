package Codechef.nheights;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Codechef {

    static void similarheight(HashMap<Integer,Integer> map, int lenght) {
        if (map.size() == lenght) {
            if (lenght % 2 == 0) {
                System.out.println(lenght/2);
                return;
            }
            else {
                System.out.println((lenght/2 )+ 1);
                return;
            }
            
        }
        if (!map.containsKey(1)) {
            System.out.println(0);
            return;
        }
        HashMap<Integer,Integer> temp = map;
        int count = 0;
        while(temp.values().contains(1))  {
            count++;
            temp.values().remove(1);
        }
        
        if (count == 1) {
            if (map.get(Collections.max(map.keySet())) == 1) {
                System.out.println(2);
                return;
            }
            

        }
        else {
            System.out.println((count + 1 )/ 2);
        }
        
        


        
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nutest = input.nextInt();
        int nuitems[] = new int[nutest];

        ArrayList<HashMap<Integer, Integer>> map = new ArrayList<HashMap<Integer, Integer>>();
        for (int i = 0; i < nutest; i++) {
            int items = input.nextInt();
            nuitems[i] = items;
            HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
            for (int j = 0; j < items; j++) {
                int key = input.nextInt();
                if (temp.containsKey(key)) {
                    temp.put(key, temp.get(key) + 1);
                } else {
                    temp.put(key, 1);
                }
                
            }
            map.add(temp);
        }
        input.close();

        for (int i = 0; i < nutest; i++) {
            similarheight(map.get(i), nuitems[i]);
        }
    }
}
