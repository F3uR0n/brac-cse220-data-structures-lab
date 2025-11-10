public class GraphMatrix {
    public int vertex;
    public Integer[][] graphArray;

    public GraphMatrix(int ver){
        vertex = ver;
        graphArray = new Integer[ver][ver];
        for (int i = 0; i < ver; i++) {
            for (int j = 0; j < ver; j++) {
                graphArray[i][j] = 0;
            }
        }
    }
    
    public void addEdge(int x, int y, Boolean state){
        if(!state){
            graphArray[y][x] = graphArray[x][y] = 1;
        }
        else{
            graphArray[x][y] = 1;
        }
    }
    
    public void addEdge(int x, int y, int weight, Boolean state){
        if(!state){
            graphArray[y][x] = graphArray[x][y] = weight;
        }
        else{
            graphArray[x][y] = weight;
        }
    }

    private int graphTraverseWeighted(int x, int y){
        if(y>=vertex) return 0;
        int count =0;
        if(graphArray[x][y] != 0){
            count =  graphArray[x][y];
        }
        return count + graphTraverseWeighted(x, y+1);
    }

    public int findMaxWeightedDegree(){
        Integer max = Integer.MIN_VALUE;
        for(int i=0; i<vertex; i++){
            int degree = graphTraverseWeighted(i, 0);
            if(max<degree){
                max = degree;
            }
        }
        return max;
    }

    private int graphTraverse(int x, int y){
        if(y>=vertex) return 0;
        int count =0;
        if(graphArray[x][y] != 0){
            count =  1;
        }
        return count + graphTraverse(x, y+1);
    }

    public int findMaxDegree(){
        Integer max = Integer.MIN_VALUE;
        for(int i=0; i<vertex; i++){
            int degree = graphTraverse(i, 0);
            if(max<degree){
                max = degree;
            }
        }
        return max;
    }

    public void converterDirection(){
        for(int i = 0; i<vertex; i++){
            for(int j = 0; j<vertex; j++){
                if(graphArray[i][j]!=0 && graphArray[j][i]==0){
                    graphArray[j][i] = graphArray[i][j];
                }
            }
        }
    }
}