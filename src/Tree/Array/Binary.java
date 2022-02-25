package Tree.Array;

import sun.awt.X11.XSizeHints;

import java.util.ArrayList;

public class Binary {
    public static void main(String[] args) {
        String array[] = {"A","B","C","D","E","F","G"};
        System.out.print("PreOrder :- ");
        new Binary().preOrder(array,0);
        System.out.println();
        System.out.print("InOrder :- ");
        new Binary().inOrder(array,0);
        System.out.println();
        System.out.print("PostOrder :- ");
        new Binary().postOrder(array,0);
    }

    void preOrder(String hello[],int root) {
        //Base case
        if (hello.length <= root) {
            return;
        }
        //print root
        System.out.print(hello[root] + " ");
        //print left
        preOrder(hello,root * 2 + 1);
        //print right
        preOrder(hello,root * 2 + 2);
    }

    void inOrder(String hello[],int root) {
        //Base case
        if (hello.length <= root) {
            return;
        }
        //print left
        inOrder(hello,root * 2 + 1);
        //print root
        System.out.print(hello[root] + " ");
        //print right
        inOrder(hello,root * 2 + 2);
    }

    void postOrder(String hello[],int root) {
        //Base case
        if (hello.length <= root) {
            return;
        }
        //print left
        postOrder(hello,root * 2 + 1);
        //print right
        postOrder(hello,root * 2 + 2);
        //print root
        System.out.print(hello[root] + " ");
    }



}
