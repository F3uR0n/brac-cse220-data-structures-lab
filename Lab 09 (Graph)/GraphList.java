public class GraphList {
    public int vertex;
    public GraphNode[] graphArray;

    public GraphList(int ver){
        vertex = ver;
        graphArray = new GraphNode[ver];
    }

    public void addEdge(int x, int y, Boolean state){
        if(!state){
            GraphNode curr1 = new GraphNode(x, 1);
            curr1.next = graphArray[y];
            graphArray[y] = curr1;
            GraphNode curr2 = new GraphNode(y, 1);
            curr2.next = graphArray[x];
            graphArray[x] = curr2;
        }
        else{
            GraphNode curr = new GraphNode(y, 1);
            curr.next = graphArray[x];
            graphArray[x] = curr;
        }
    }

    public void addEdge(int x, int y, int weight, Boolean state){
        if(!state){
            GraphNode curr1 = new GraphNode(x, weight);
            curr1.next = graphArray[y];
            graphArray[y] = curr1;
            GraphNode curr2 = new GraphNode(y, weight);
            curr2.next = graphArray[x];
            graphArray[x] = curr2;
        }
        else{
            GraphNode curr = new GraphNode(y, weight);
            curr.next = graphArray[x];
            graphArray[x] = curr;
        }
    }

    private int findMaxWeightedDegreeHelper(GraphNode head){
        if(head == null) return 0;
        return head.weight + findMaxWeightedDegreeHelper(head.next);
    }

    public int findMaxWeightedDegree(){
        Integer max = Integer.MIN_VALUE;
        for(int i=0; i< vertex; i++){
            int x = findMaxWeightedDegreeHelper(graphArray[i]);
            if(max<x){
                max = x;
            }
        }
        return max;
    }

    private int findMaxDegreeHelper(GraphNode head){
        if(head == null) return 0;
        return 1 + findMaxDegreeHelper(head.next);
    }

    public int findMaxDegree(){
        Integer max = Integer.MIN_VALUE;
        for(int i=0; i< vertex; i++){
            int x = findMaxDegreeHelper(graphArray[i]);
            if(max<x){
                max = x;
            }
        }
        return max;
    }

    private boolean existEdge(int x, int y){
        GraphNode curr = graphArray[x];
        while(curr!=null){
            if(curr.vertex==y) return true;
            curr = curr.next;
        }
        return false;
    }

    public void converterDirection(){
        for(int i = 0; i<vertex; i++){
            GraphNode temp = graphArray[i];
            while (temp!=null) {
                int weight = temp.weight;
                int val = temp.vertex;
                if(!existEdge(val, i)){
                    GraphNode curr = new GraphNode(i, weight);
                    curr.next = graphArray[val];
                    graphArray[val] = curr;
                }
                temp = temp.next;
            }
        }
    }
}