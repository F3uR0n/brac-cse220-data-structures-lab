public class GraphNode {
    public int vertex;
    public int weight;
    public GraphNode next;

    public GraphNode(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
        this.next = null;
    }
}