import java.util.*;

public class AVLSkip<E extends Comparable<E>>  {

    private AVLTree<E> avl=null;
    private SkipList<E> skip=null;


    public AVLTree<E> getAvl() {
        return avl;
    }

    public SkipList<E> getSkip() {
        return skip;
    }

    public void setAvl(AVLTree<E> avl) {
        this.avl = avl;
    }

    public void setSkip(SkipList<E> skip) {
        this.skip = skip;
    }
    public AVLSkip()
    {
        avl=new AVLTree<E>();
        skip=new SkipList<E>();
    }




}