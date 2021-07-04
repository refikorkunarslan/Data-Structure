
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String [] args){
        printt(10000);
        printt(20000);
        printt(40000);
        printt(80000);



    }
    public static void printt(int a)
    {
        System.out.println("********FOR "+a +"*************");
        Random rand = new Random();
        long startTime = 0;
        long endTime = 0;
        long enddtime =0;
        long time = 0;
        long time1 = 0;

        System.out.println("Binary Search tree: ");
        startTime =  System.nanoTime();
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        for(int k=0;k<10;k++){

            for(int i=0;i<a;i++){
                binarySearchTree.add(rand.nextInt(10000));
            }

        }
        endTime =  System.nanoTime();
        time = endTime - startTime;
        System.out.println(time);
        System.out.println("Insert 100 extra random numbers BST ");
        for(int i=0;i<100;i++){
            binarySearchTree.add(rand.nextInt(10000));
        }
        enddtime =  System.nanoTime();
        time1 = enddtime - startTime;
        System.out.println(time1);
        System.out.println("Average running time :" +time/a);
        System.out.println("-----------------------------");





        System.out.println("Red Black Tree Time: ");
        startTime = System.nanoTime();
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();

        for(int k=0;k<10;k++){

            for(int i=0;i<a;i++){
                redBlackTree.add(rand.nextInt(10000));
            }

        }
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println(time);
        System.out.println("Insert 100 extra random numbers RBT ");
        for(int i=0;i<100;i++){
            redBlackTree.add(rand.nextInt(10000));
        }
        enddtime =  System.nanoTime();
        time1 = enddtime - startTime;
        System.out.println(time1);
        System.out.println("Average running time :" +time/a);
        System.out.println("-----------------------------");


        System.out.println("2-3 Tree Time: ");
        startTime = System.nanoTime();
        TwoThreeTree<Integer> ttt = new TwoThreeTree<>();
        for(int k=0;k<10;k++){

            for(int i=0;i<a;i++){
                ttt.add(rand.nextInt(10000));
            }

        }
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println(time);

        System.out.println("Insert 100 extra random numbers 2-3 Tree ");
        for(int i=0;i<100;i++){
            ttt.add(rand.nextInt(10000));
        }
        enddtime =  System.nanoTime();
        time1 = enddtime - startTime;
        System.out.println(time1);
        System.out.println("Average running time :" +time/a);

        System.out.println("-----------------------------");


        System.out.println("B-Tree Time: ");
        startTime = System.nanoTime();
        BTree<Integer> bTree = new BTree<>(3);

        for(int k=0;k<10;k++){

            for(int i=0;i<a;i++){
                bTree.add(rand.nextInt(10000));
            }

        }
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println(time);

        System.out.println("Insert 100 extra random numbers BTree ");
        for(int i=0;i<100;i++){
            bTree.add(rand.nextInt(10000));
        }
        enddtime =  System.nanoTime();
        time1 = enddtime - startTime;
        System.out.println(time1);
        System.out.println("Average running time :" +time/a);

        System.out.println("-----------------------------");



        System.out.println("Skip List Time: ");
        startTime = System.nanoTime();
        SkipList<Integer> skipList = new SkipList<>();

        for(int k=0;k<10;k++){

            for(int i=0;i<a;i++){
                skipList.add(rand.nextInt(10000));
            }

        }
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println(time);

        System.out.println("Insert 100 extra random numbers Skip-list ");
        for(int i=0;i<100;i++){
            skipList.add(rand.nextInt(10000));
        }
        enddtime =  System.nanoTime();
        time1 = enddtime - startTime;
        System.out.println(time1);
        System.out.println("Average running time :" +time/a);

        System.out.println("-----------------------------");

    }
}
