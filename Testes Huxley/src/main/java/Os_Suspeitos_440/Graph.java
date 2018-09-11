package Os_Suspeitos_440;

public class Graph {
    int[][] edges;
    int size;
    int[] visited, path;

    public Graph(int size){
        this.edges = new int[size][size];
        this.visited = new int[size];
        this.path = new int[size];
        this.size = size;
    }
    public void addEdge(int origin, int target){
        edges[origin][target] = 1;
    }
    public void dfs(int origin){
        for(int a = 0; a < this.size; a++){
            if(this.edges[origin][a] == 1){
                if(this.visited[a] == 0){
                    this.visited[a] = 1;
                    dfs(a);
                }
            }
        }
    }
    public int countUnvisited(){
        int count = 1;
        for(int a = 1; a < this.size; a++){
            count += this.visited[a];
        }
        return  count;
    }
}
