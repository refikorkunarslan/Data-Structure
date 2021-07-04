import java.io.File;
import java.util.*;
public class Main {

    public static void main(String[] args){
        Graph g=null;
        try {
            File myObj = new File("./part1/graph.txt");
            Scanner scan = new Scanner(myObj);
			 g = AbstractGraph.createGraph(scan,false, "List");
            int numV = g.getNumV();
            int[] pred = new int[numV];
            double[] dist = new double[numV];
            double[] dis = new double[numV];
            double[] tim = new double[numV];
            double[] q = new double[numV];

            dijkstrasAlgorithm(g,0, pred, dist,dis,tim,q,"addition");
            for(int i = 0; i < pred.length; i++){
                System.out.println(i + ":\t" + pred[i] + "\t" + dist[i]+ "\t" + dis[i]+ "\t" + tim[i]+ "\t" + q[i]);
            }
            System.out.print("\n");
		//	System.out.println(g.toString());
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("\n");
        Graph gr=null;
        try {
            File myObj = new File("./part1/graph.txt");
            Scanner scan = new Scanner(myObj);
            gr = AbstractGraph.createGraph(scan,false, "List");
            int numV = g.getNumV();
            int[] pred = new int[numV];
            double[] dist = new double[numV];
            double[] dis = new double[numV];
            double[] tim = new double[numV];
            double[] q = new double[numV];

            dijkstrasAlgorithm(g,0, pred, dist,dis,tim,q,"multiplication");
            for(int i = 0; i < pred.length; i++){
                System.out.println(i + ":\t" + pred[i] + "\t" + dist[i]+ "\t" + dis[i]+ "\t" + tim[i]+ "\t" + q[i]);
            }
            System.out.print("\n");
            //System.out.println(g.toString());
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("\n");
        Graph gra=null;
        try {
            File myObj = new File("./part1/graph.txt");
            Scanner scan = new Scanner(myObj);
            gra = AbstractGraph.createGraph(scan,false, "List");
            int numV = g.getNumV();
            int[] pred = new int[numV];
            double[] dist = new double[numV];
            double[] dis = new double[numV];
            double[] tim = new double[numV];
            double[] q = new double[numV];

            dijkstrasAlgorithm(g,0, pred, dist,dis,tim,q,"*");
            for(int i = 0; i < pred.length; i++){
                System.out.println(i + ":\t" + pred[i] + "\t" + dist[i]+ "\t" + dis[i]+ "\t" + tim[i]+ "\t" + q[i]);
            }
            System.out.print("\n");
            //System.out.println(g.toString());
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void dijkstrasAlgorithm(Graph graph,
                                          int start,
                                          int[] pred,
                                          double[] dist,double[] dis,double[] tim,double[] q,String str){
        System.out.println(str);
        int numV = graph.getNumV();
        HashSet<Integer> vMinusS = new HashSet<Integer>(numV);
        //Initialize V - S
        for(int i = 0; i < numV; i++){
            if(i != start)
                vMinusS.add(i);
        }
        // Initialize pred and dist
        for(int v : vMinusS){
            pred[v] = start;
            dist[v] = graph.getEdge(start, v).getWeight();
            dis[v] = graph.getEdge(start, v).getWeight();
            tim[v] = graph.getEdge(start, v).getWeight();
            q[v] = graph.getEdge(start, v).getWeight();
        }
        //Main loop
        while(vMinusS.size() != 0){
            //Find the value u in V - S with the smallest dist[u]
            double minDist = Double.POSITIVE_INFINITY;
            double minDis = Double.POSITIVE_INFINITY;
            double minTime = Double.POSITIVE_INFINITY;
            double minQua = Double.POSITIVE_INFINITY;
            int u = -1;
            for(int v : vMinusS){
                if(dist[v] < minDist){
                    minDist = dist[v];
                    u = v;
                }
                if(dis[v] < minDis){
                    minDist = dis[v];
                    u = v;
                }
                if(tim[v] < minTime){
                    minTime = tim[v];
                    u = v;
                }
                if(q[v] < minQua){
                    minQua= q[v];
                    u = v;
                }
            }
            // Remove u from vMinusS
            vMinusS.remove(u);
            //Update the distances

            Iterator<Edge> edgeIter = graph.edgeIterator(u);
            while(edgeIter.hasNext()){
                Edge edge = edgeIter.next();
                int v = edge.getDest();
                if(vMinusS.contains(v)){
                    double weight = edge.getWeight();
                    if(str.equals("addition"))
                    {
                        if(dist[u] + weight < dist[v]){

                            dist[v] = dist[u] + weight;
                            pred[v] = u;
                        }

                        double distance = edge.getDistance();
                        if(dis[u] + distance < dis[v]){
                            dis[v] = dis[u] + weight;
                            pred[v] = u;
                        }

                        double time = edge.getTime();
                        if(tim[u] + time < tim[v]){
                            tim[v] = tim[u] + time;
                            pred[v] = u;
                        }

                        double qua = edge.getTime();
                        if(q[u] + qua < q[v]){
                            q[v] = q[u] + qua;
                            pred[v] = u;
                        }

                    }
                    if(str.equals("multiplication"))
                    {
                        if(dist[u] * weight < dist[v]){

                            dist[v] = dist[u] * weight;
                            pred[v] = u;
                        }

                        double distance = edge.getDistance();
                        if(dis[u] * distance < dis[v]){
                            dis[v] = dis[u] * weight;
                            pred[v] = u;
                        }

                        double time = edge.getTime();
                        if(tim[u] * time < tim[v]){
                            tim[v] = tim[u] *time;
                            pred[v] = u;
                        }

                        double qua = edge.getTime();
                        if(q[u] * qua < q[v]){
                            q[v] = q[u] *qua;
                            pred[v] = u;
                        }

                    }
                    if(str.equals("*"))
                    {
                        if((dist[u] + weight-(dist[u]*weight)) < dist[v]){

                            dist[v] = (dist[u] + weight-(dist[u]*weight));
                            pred[v] = u;
                        }

                        double distance = edge.getDistance();
                        if((dis[u] + distance-(dis[u]*distance)) < dis[v]){
                            dis[v] = (dis[u] + distance-(dis[u]*distance));
                            pred[v] = u;
                        }

                        double time = edge.getTime();
                        if((tim[u] + time-(tim[u]*time)) < tim[v]){
                            tim[v] = (tim[u] + time-(tim[u]*time));
                            pred[v] = u;
                        }

                        double qua = edge.getTime();
                        if((q[u] + qua-(q[u]*time)) < q[v]){
                            q[v] = (q[u] + qua-(q[u]*time));
                            pred[v] = u;
                        }

                    }



                }
            }


        }
    }

}
