package Day5.NonLinearDataStructures.Graphs.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList){
        List<Integer> bfs =  new ArrayList<>();
        boolean[] visited = new boolean[V + 1]; // visited array (0-based)
        Queue<Integer> q = new LinkedList<>();
        //start BFS from node 1
        visited[1] = true;
        q.add(1);
        while((!q.isEmpty())){
            int node = q.poll();
            bfs.add(node);
            //traverse all it's neighbors
            for(int neighbor : adjList.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return bfs;
    }
}
public class BFSGraph{
    public static void main(String[] args){
        int V = 5; //Number of nodes

    }
    public static void addEdge(List<List<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printBFS(List<Integer> ans){
        for(int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
