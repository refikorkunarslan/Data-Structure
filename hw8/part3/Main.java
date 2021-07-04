import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        immediate imm=new immediate();
        int numV = 0; // The number of vertices.
        Graph graph = null;
        try {
            File myObj = new File("./part3/graph.txt");
            Scanner scan = new Scanner(myObj);
            graph = AbstractGraph.createGraph(scan, false, "Matrix");
            System.out.println(imm.floydWarshall(graph.getEdges(),graph.getNumV(),5));
            numV = graph.getNumV();
        } catch (IOException ex) {
            System.err.println("IO Error while reading graph");
            System.err.println(ex.toString());
            System.exit(1);
        }
    }
}
