import java.util.*;
import java.lang.*;
import java.io.*;


class immediate
{
    /**
     *
     * @param graph grapt
     * @param V vertex
     * @param k immediate vertex
     * @return
     */
    double floydWarshall(double graph[][],int V,int k)
    {
        double dist[][] = new double[V][V];
        double ww[][] = new double[V][V];
        int i, j;

        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
            {
                dist[i][j] = graph[i][j];
                 ww[i][j] = graph[i][j];
            }

        double count=0;
        int u=0,v=0;
        for(;k<V;k++)
        {
            for (i = 0; i < V; i++)
            {

                for (j = 0; j < V; j++)
                {

                    if (dist[i][k] + dist[k][j] < dist[i][j])
                    {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        count = dist[i][k] + dist[k][j]+count;
                        u=i;
                        v=j;



                    }
                }
            }
        }
        double a;

        System.out.println("fair importance value :");
        a=  (count/dist[u][v])/k;
      return a;

    }




}