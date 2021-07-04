public class Main {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        HashtableChain hc=new HashtableChain();
        hc.put(1,2);
        hc.put(2,32);
        hc.put(3,22);
        hc.put(44,21);
        hc.put(53,23);
        hc.put(62,24);
        hc.remove(44);
        hc.remove(53);
        hc.remove(2);
        final long duration = System.nanoTime() - startTime;
        System.out.println(" HashtableChain run time  " +duration);



        final long start = System.nanoTime();
        HashtableChainWithTreeset hct=new HashtableChainWithTreeset();
        hc.put(1,2);
        hc.put(2,32);
        hc.put(3,22);
        hc.put(44,21);
        hc.put(53,23);
        hc.put(62,24);
        hc.remove(44);
        hc.remove(53);
        hc.remove(2);
        final long dur = System.nanoTime() - start;
        System.out.println(" HashtableChainWithTreeset run time "+ dur);


        final long startTim = System.nanoTime();
           CoalescedHashing a =new CoalescedHashing();
        a.put(1,2);
        a.put(2,32);
        a.put(3,22);
        a.put(47,21);
        a.put(53,23);
        a.put(62,24);
        a.remove(47);

        final long duratio = System.nanoTime() - startTim;
        System.out.println("CoalescedHashing run time "+ duratio);
        int i=0;
        while(i<a.table.length)
        {
            if(a.table[i]==null)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(a.table[i].getValue());

            }
            i++;
        }
        System.out.println("Enter key '3' :"+a.table[3].getValue());
        System.out.println("Enter key '53' :"+a.table[3].getNext().getValue());
        System.out.println("Enter key '53' :"+a.table[4].getValue());


    }
}
