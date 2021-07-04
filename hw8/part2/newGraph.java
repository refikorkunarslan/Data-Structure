import java.util.*;

class newGraph extends AbstractGraph
{
    private Map<Integer, List<Integer>> adjacencyList;

    @Override
    public int getNumV() {
        return super.getNumV();
    }

    public newGraph(int v, boolean directed)
    {
        super(v,directed);
        adjacencyList = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= v; i++)
            adjacencyList.put(i, new LinkedList<Integer>());
    }

    public void setEdge(int to, int from)
    {
        if (to > adjacencyList.size() || from > adjacencyList.size())
            System.out.println("The vertices does not exists");

        List<Integer> sls = adjacencyList.get(to);
        sls.add(from);
        List<Integer> dls = adjacencyList.get(from);
        dls.add(to);
    }

    public List<Integer> getEdge(int to)
    {
        if (to > adjacencyList.size())
        {
            return null;
        }
        return adjacencyList.get(to);
    }

    public Map<Integer, List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }
}