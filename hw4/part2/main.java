import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class main {

    public static void main(String[] args) {
    BSTHeapTree<Integer> BST=new BSTHeapTree<Integer>();
        BST.occount= new ArrayList<Integer>();
        Random rand = new Random();
        int upperbound = 5000;
        int int_random;
        for(int i=0;i<3000;i++)
        {
            int_random = rand.nextInt(upperbound);
            BST.add(int_random);
            BST.arr.add(int_random);

        }



        Collections.sort(BST.arr);
        Object o = BST.arr.get(0);
        int n = 1;
        for (int i = 1; i < 3000; i++) {
            Object t = BST.arr.get(i);

            if (o.equals(t)) {
                n++;
            } else {

                n = 1;
                o = t;
            }
            BST.occount.add(n-1);


       }


            // System.out.println(BST.oneLinePreorder());

        for(int i=10;i<110;i++)
        {
            if(BST.find(i) !=0)
            {
                System.out.println("find "+i+" "+" occurence "+ BST.find(i));

            }

        }
        for(int i=0;i<100;i++)
        {
            int_random = rand.nextInt(3000);
            BST.remove(int_random);

        }




    }
}