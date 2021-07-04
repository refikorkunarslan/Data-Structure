import java.util.*;
import java.io.*;

/**
 * Class to implement the depth-first search algorithm
 * @author Jacob / Koffman & Wolfgang
 *
 */
public class DepthFirstSearch {
    //Data Fields
    /**
     * A reference to the graph being searched
     */
    public int x=0;
    private newGraph graph;
    private Graph graphh;
    /**
     * Array of parents in the depth-first search tree
     */
    private int[] parent;
    /**
     * Flag to indicate whether this vertex has been visited
     */
    private boolean[] visited;
    /**
     * The array that contains each vertex in discovery order
     */
    private int[] discoveryOrder;
    /**
     * The array that contains each vertex in finish order
     */
    private int[] finishOrder;
    /**
     * The index that indicates the discovery order
     */
    private int discoverIndex = 0;
    /**
     * The index that indicates the finish order
     */
    private int finishIndex = 0;

    //Constructors
    /**
     * Construct the depth-first search of a Graph
     * starting at vertex 0 and visiting the start vertices in ascending order
     * @param graph The graph
     */
    public DepthFirstSearch(newGraph graph){
        this.graph = graph;
        int n = graph.getNumV();
        parent = new int[n];
        visited = new boolean[n];
        discoveryOrder = new int[n];
        finishOrder = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = -1; //Declare array parent and initialize its elements to -1
        }

        for(int i = 0; i < n; i++){
            if(!visited[i])
                depthFirstSearch(i,graph);
        }
    }
    public DepthFirstSearch(Graph graphh){
        this.graphh = graphh;
        int n = graphh.getNumV();
        parent = new int[n];
        visited = new boolean[n];
        discoveryOrder = new int[n];
        finishOrder = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = -1; //Declare array parent and initialize its elements to -1
        }

        for(int i = 0; i < n; i++){
            if(!visited[i])
                depthFirstSearch(i,graphh);

        }
        System.out.println("DFS connected componenet : " +x);
    }

    /**
     * Constructs the depth-first search of the specified graph,
     * selecting the start vertices in the specified order.
     * The first vertex visited is order[0]
     * @param graph The graph
     * @param order The array giving the order in which the start vertices should be selected
     */
    public DepthFirstSearch(newGraph graph, int[] order){

        this.graph = graph;
        int n = graph.getNumV();
        parent = new int[n];
        visited = new boolean[n];
        discoveryOrder = new int[n];
        finishOrder = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = -1; //Declare array parent and initialize its elements to -1
        }
        for(int i = 0; i < n; i++){
            if(!visited[order[i]])
                depthFirstSearch(order[i],graph);
        }
    }
    public DepthFirstSearch(Graph graphh, int[] order){

        this.graphh = graphh;
        int n = graphh.getNumV();
        parent = new int[n];
        visited = new boolean[n];
        discoveryOrder = new int[n];
        finishOrder = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = -1; //Declare array parent and initialize its elements to -1
        }
        for(int i = 0; i < n; i++){
            if(!visited[order[i]])
                depthFirstSearch(order[i],graphh);
        }
    }

    /**
     * Recursively depth-first search the graph starting at vertex current
     * @param current The start vertex
     */
    public void depthFirstSearch(int current,newGraph graph) {
        /* Mark the current vertex visited */
        int count=0;

        visited[current] = true;
        discoveryOrder[discoverIndex++] = current;

        /* Examine each vertex adjacent to the current vertex */
        Iterator<Edge> itr = graph.edgeIterator(current);
        while(itr.hasNext()){
            int neighbor = itr.next().getDest();
            /* Process a neighbor that has not been visited */
            if(!visited[neighbor]){
                /* Insert (current, neighbor) into the depth-first search tree */
                parent[neighbor] = current;
                /* Recursively apply the algorithm starting at neighbor */
                depthFirstSearch(neighbor,graph);
            }
        }
        /* Mark current index finished */
        finishOrder[finishIndex++] = current;
    }

    public void depthFirstSearch(int current,Graph graph) {
        /* Mark the current vertex visited */
        int count=0;

        visited[current] = true;
        discoveryOrder[discoverIndex++] = current;

        /* Examine each vertex adjacent to the current vertex */
        Iterator<Edge> itr = graph.edgeIterator(current);
        while(itr.hasNext()){
            count++;
            int neighbor = itr.next().getDest();
            /* Process a neighbor that has not been visited */
            if(!visited[neighbor]){
                /* Insert (current, neighbor) into the depth-first search tree */
                parent[neighbor] = current;
                /* Recursively apply the algorithm starting at neighbor */
                depthFirstSearch(neighbor,graph);
            }
        }
        /* Mark current index finished */
        x=x+count;

        finishOrder[finishIndex++] = current;
    }


    public int[] getDiscoveryOrder() {
        return discoveryOrder;
    }

    public int[] getFinishOrder() {
        return finishOrder;
    }

    public Graph getGraph() {
        return graph;
    }

    public int[] getParent() {
        return parent;
    }

    public boolean[] getVisited() {
        return visited;
    }

    public int getDiscoverIndex() {
        return discoverIndex;
    }

    public int getFinishIndex() {
        return finishIndex;
    }

















}
