public class main {

    public static void main(String[] args) {
       HeapStructure<Integer> hs=new HeapStructure<Integer>();
       HeapStructure<Integer> ke=new HeapStructure<Integer>();
        System.out.println("-------------ADD--------------- ");
        hs.add(5);
        hs.add(6);
        hs.add(3);
        hs.add(2);
        hs.add(63);
        hs.add(576);
        hs.add(55);

        for(int i=0; i<hs.size();i++)
        {
            System.out.println(hs.getTheData().get(i));
        }

        System.out.println("-------------SEARCHFOR------------------ ");
        System.out.println("index : "+ hs.searchFor(63));
        System.out.println("index : "+ hs.searchFor(1));
        System.out.println("index : "+ hs.searchFor(99));
        System.out.println("index : "+ hs.searchFor(575));
        System.out.println("index : "+ hs.searchFor(576));
        System.out.println("-----------MERGE------------- ");
        ke.add(8);
        ke.add(81);
        ke.add(34);
        ke.add(54);
        ke.add(3);
        ke.add(67);
        HeapStructure<Integer> res=new HeapStructure<Integer>();
        res.mergeHeaps(res.getTheData(),hs.getTheData(),ke.getTheData());
        for(int i=0; i<res.size();i++)
        {
            System.out.println(res.getTheData().get(i));
        }
        System.out.println("-----------REMOVE LARGEST------------- ");

         res.removeThLargest(2);
        res.removeThLargest(1);
        res.removeThLargest(4);
        for(int i=0; i<res.size();i++)
        {
            System.out.println(res.getTheData().get(i));
        }







    }
}