public class Main {

    public static void main(String[] args) {

        System.out.println("------------------Check AVL tree---------------------");
        BinarySearchTree<Integer> bb =new BinarySearchTree<Integer>();
        bb.add(1);
        bb.add(2);
        bb.add(3);
        bb.add(4);
        bb.add(5);

      bb.checkAVL(bb.root);
      if(bb.flag==1)
      {
          System.out.println("Not AVL tree");
      }
      else
      {
          System.out.println("AVL tree");
      }
        BinarySearchTree<Integer> tt =new BinarySearchTree<Integer>();
        tt.add(10);
        tt.add(20);
        tt.add(5);
        tt.add(25);
        tt.add(15);
        tt.add(1);
        tt.checkAVL(tt.root);
        if(tt.flag==1)
        {
            System.out.println("Not AVL tree");
        }
        else
        {
            System.out.println("AVL tree");
        }

        BinarySearchTree<Integer> ta =new BinarySearchTree<Integer>();
        ta.add(10);
        ta.add(20);
        ta.add(5);
        ta.add(25);
        ta.add(15);
        ta.add(1);
        ta.add(30);
        ta.add(40);
        ta.checkAVL(ta.root);
        if(ta.flag==1)
        {
            System.out.println("Not AVL tree");
        }
        else
        {
            System.out.println("AVL tree");
        }

        System.out.println("------------------Check RB tree---------------------");


        BinarySearchTree<Integer> was =new BinarySearchTree<Integer>();
        was.add(6);
        was.root.red=false;
        was.add(8);
        was.root.right.red=true;
        was.add(10);
        was.root.right.right.red=false;
        was.checkRBT(was.root);
        if(was.flag1==1)
        {
            System.out.println("Not RB tree");
        }
        else
        {
            System.out.println("RB tree");
        }

        BinarySearchTree<Integer> wa =new BinarySearchTree<Integer>();
        wa.add(6);
        wa.root.red=true;
        wa.checkRBT(wa.root);

        if(wa.flag1==1)
        {
            System.out.println("Not RB tree");
        }
        else
        {
            System.out.println("RB tree");
        }
        BinarySearchTree<Integer> w =new BinarySearchTree<Integer>();
        w.add(10);
        w.root.red=false;
        w.add(5);
        w.root.left.red=false;
        w.add(60);
        w.root.right.red=true;
        w.add(8);
        w.root.left.right.red=true;
        w.add(40);
        w.root.right.left.red=false;
        w.add(70);
        w.root.right.right.red=false;
        w.add(33);
        w.root.right.left.left.red=true;

        w.checkRBT(w.root);

        if(w.flag1==1)
        {
            System.out.println("Not RB tree");
        }
        else
        {
            System.out.println("RB tree");
        }

        BinarySearchTree<Integer> aa =new BinarySearchTree<Integer>();
        aa.add(10);
        aa.root.red=false;
        aa.add(5);
        aa.root.left.red=false;
        aa.add(60);
        aa.root.right.red=true;
        aa.add(8);
        aa.root.left.right.red=true;
        aa.add(40);
        aa.root.right.left.red=false;
        aa.add(70);
        aa.root.right.right.red=false;
        aa.add(33);
        aa.root.right.left.left.red=true;
        aa.add(44);
        aa.root.right.left.left.red=false;

        aa.checkRBT(aa.root);

        if(aa.flag1==1)
        {
            System.out.println("Not RB tree");
        }
        else
        {
            System.out.println("RB tree");
        }






    }
}
