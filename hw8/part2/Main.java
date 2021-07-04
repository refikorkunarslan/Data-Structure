import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String args[])
    {
        Graph g = null;
        try {
            Scanner scan = new Scanner(new File("./part2/graph.txt"));
            g = AbstractGraph.createGraph(scan, true, "List");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }


        int[] parents = BreadthFirstSearch.breadthFirstSearch(g, 0);
        System.out.println("BFS :");
        for(int i = 0; i < parents.length; i++){
            System.out.println(i + " " + parents[i]);
        }
        Graph gr = null;
        int n = 0;
        try {
            Scanner scan = new Scanner(new File("./part2/graph.txt"));
            gr = AbstractGraph.createGraph(scan, true, "List");
            n = gr.getNumV();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        DepthFirstSearch dfs = new DepthFirstSearch(gr);
        int[] dOrder = dfs.getDiscoveryOrder();
        int[] fOrder = dfs.getFinishOrder();
        System.out.println("Discovery and finish order:");
        for(int i = 0; i < n; i++){
            System.out.println(dOrder[i] + " " + fOrder[i]);
        }

        System.out.println("----1000 vertex-----");
        pp(1000);
        System.out.println("----2000 vertex----");
        pp(2000);
        System.out.println("----5000 vertex----");
        pp(5000);
        System.out.println("----10000 vertex----");
        pp(10000);


    }
    public static void pp(int a)
    {
        int i=0;
        final long startTime = System.nanoTime();
        while(i<10)
        {

            int e = a;
            try
            {
                int minV = (int) Math.ceil((1 + Math.sqrt(1 + 8 * e)) / 2);
                int maxV = e + 1;

                Random random = new Random();
                int v = Math.abs(random.nextInt(maxV - minV) + minV);

                newGraph reg = new newGraph(v,false);
                int count = 1, to, from;
                while (count <= e)
                {
                    to = Math.abs(random.nextInt(v + 1 - 1) + 1);
                    from = Math.abs(random.nextInt(v + 1 - 1) + 1);

                    reg.setEdge(to, from);
                    count++;
                }


                int[] parents = breadthFirstSearch(reg, 0);
                DepthFirstSearch dfs = new DepthFirstSearch(reg);
                int[] dOrder = dfs.getDiscoveryOrder();
                int[] fOrder = dfs.getFinishOrder();
            }
            catch (Exception E)
            {

            }
            i++;


        }
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);
    }
    public static int[] breadthFirstSearch(newGraph graph, int start){

        Queue<Integer> theQueue = new LinkedList<Integer>();
        
        //Declare array parent and initialize its elements to -1
        int[] parent = new int[graph.getNumV()];
        for(int i = 0; i < graph.getNumV(); i++){
            parent[i] = -1;
        }
        int count=0;
        //Declare array identified and initialize its elements to false
        boolean[] identified = new boolean[graph.getNumV()];
        /* Mark the start vertex as identified and insert it into the queue */
        identified[start] = true;
        theQueue.offer(start);

        /* Perform breadth-first search until done */
        while(!theQueue.isEmpty()){
            /* Take a vertex, current, out of the queue. Begin visiting current */

            int current = theQueue.remove();
            /* Examine each vertex, neighbor, adjacent to current. */

            for (Map.Entry<Integer, List<Integer>> integerListEntry : graph.getAdjacencyList().entrySet()) {
                count++;

                Map.Entry<Integer, List<Integer>> edge = integerListEntry;
                int neighbor = edge.getValue().get(edge.getKey());
                //If neighbor has not been identified
                if (!identified[neighbor]) {
                    //Mark it identified
                    identified[neighbor] = true;
                    //Place it into the queue
                    theQueue.offer(neighbor);
                    /* Insert the edge (current, neighbor) into the tree */
                    parent[neighbor] = current;
                }

            }

            //Finished visiting current
        }

        return parent;
    }





}
