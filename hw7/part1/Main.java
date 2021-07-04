public class Main {

    public static void main(String[] args) {
            AVLSkip<Integer> gev=new AVLSkip<Integer>();
            gev.getSkip().insert(12);
            gev.getSkip().insert(13);
            gev.getSkip().insert(14);
             gev.getSkip().insert(15);
            gev.getSkip().insert(16);

            gev.getSkip().delete(12);
            gev.getSkip().delete(16);

            gev.getSkip().descendingIterator();

            gev.getAvl().insert(15);
            gev.getAvl().insert(19);
            gev.getAvl().insert(6);
            gev.getAvl().insert(11);
            gev.getAvl().iterator();



        }
}
