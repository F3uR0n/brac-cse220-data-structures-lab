public class Tester{
    public static void main(String[] args) {

        //Adjacency List
        GraphList graphL = new GraphList(7);
        graphL.addEdge(0, 1, false);
        graphL.addEdge(0, 2, false);
        graphL.addEdge(0, 3, false);
        graphL.addEdge(0, 4, false);
        graphL.addEdge(0, 5, false);
        graphL.addEdge(1, 2, false);
        graphL.addEdge(1, 3, false);
        graphL.addEdge(1, 4, false);
        graphL.addEdge(1, 5, false);
        graphL.addEdge(2, 5, false);
        graphL.addEdge(2, 6, false);
        graphL.addEdge(2, 4, false);
        graphL.addEdge(3, 4, false);
        graphL.addEdge(3, 5, false);
        graphL.addEdge(3, 6, false);
        graphL.addEdge(4, 6, false);

        //Adjacency Matrix
        GraphMatrix graphM = new GraphMatrix(7);
        graphM.addEdge(0, 1, false);
        graphM.addEdge(0, 2, false);
        graphM.addEdge(0, 3, false);
        graphM.addEdge(0, 4, false);
        graphM.addEdge(0, 5, false);
        graphM.addEdge(1, 2, false);
        graphM.addEdge(1, 3, false);
        graphM.addEdge(1, 4, false);
        graphM.addEdge(1, 5, false);
        graphM.addEdge(2, 5, false);
        graphM.addEdge(2, 6, false);
        graphM.addEdge(2, 4, false);
        graphM.addEdge(3, 4, false);
        graphM.addEdge(3, 5, false);
        graphM.addEdge(3, 6, false);
        graphM.addEdge(4, 6, false);

        //Task 1
        System.out.println("Task 1");
        System.out.println("Max Degree: " + graphL.findMaxDegree());
        System.out.println("Max Degree: " + graphM.findMaxDegree());

        //Adjacency List
        GraphList graphWeightList = new GraphList(7);
        graphWeightList.addEdge(0, 1, 4, false);
        graphWeightList.addEdge(0, 2, 2, false);
        graphWeightList.addEdge(0, 3, 5, false);
        graphWeightList.addEdge(0, 4, 3, false);
        graphWeightList.addEdge(0, 5, 7, false);
        graphWeightList.addEdge(1, 2, 6, false);
        graphWeightList.addEdge(1, 3, 4, false);
        graphWeightList.addEdge(1, 4, 2, false);
        graphWeightList.addEdge(1, 5, 5, false);
        graphWeightList.addEdge(2, 5, 3, false);
        graphWeightList.addEdge(2, 6, 6, false);
        graphWeightList.addEdge(2, 4, 4, false);
        graphWeightList.addEdge(3, 4, 7, false);
        graphWeightList.addEdge(3, 5, 2, false);
        graphWeightList.addEdge(3, 6, 1, false);
        graphWeightList.addEdge(4, 6, 8, false);

        //Adjacency Matrix
        GraphMatrix graphWeightMatrix = new GraphMatrix(7);
        graphWeightMatrix.addEdge(0, 1, 4, false);
        graphWeightMatrix.addEdge(0, 2, 2, false);
        graphWeightMatrix.addEdge(0, 3, 5, false);
        graphWeightMatrix.addEdge(0, 4, 3, false);
        graphWeightMatrix.addEdge(0, 5, 7, false);
        graphWeightMatrix.addEdge(1, 2, 6, false);
        graphWeightMatrix.addEdge(1, 3, 4, false);
        graphWeightMatrix.addEdge(1, 4, 2, false);
        graphWeightMatrix.addEdge(1, 5, 5, false);
        graphWeightMatrix.addEdge(2, 5, 3, false);
        graphWeightMatrix.addEdge(2, 6, 6, false);
        graphWeightMatrix.addEdge(2, 4, 4, false);
        graphWeightMatrix.addEdge(3, 4, 7, false);
        graphWeightMatrix.addEdge(3, 5, 2, false);
        graphWeightMatrix.addEdge(3, 6, 1, false);
        graphWeightMatrix.addEdge(4, 6, 8, false);

        //Task 2
        System.out.println("Task 2");
        System.out.println("Max Weighted Vertex: " + graphWeightList.findMaxWeightedDegree());
        System.out.println("Max Weighted Vertex: " + graphWeightMatrix.findMaxWeightedDegree());

        //Adjacency List
        GraphList graphWeightListD = new GraphList(7);
        graphWeightListD.addEdge(0, 1, 4, true);
        graphWeightListD.addEdge(0, 2, 2, true);
        graphWeightListD.addEdge(0, 3, 5, true);
        graphWeightListD.addEdge(0, 4, 3, true);
        graphWeightListD.addEdge(0, 5, 7, true);
        graphWeightListD.addEdge(1, 2, 6, true);
        graphWeightListD.addEdge(1, 3, 4, true);
        graphWeightListD.addEdge(1, 4, 2, true);
        graphWeightListD.addEdge(1, 5, 5, true);
        graphWeightListD.addEdge(2, 5, 3, true);
        graphWeightListD.addEdge(2, 6, 6, true);
        graphWeightListD.addEdge(2, 4, 4, true);
        graphWeightListD.addEdge(3, 4, 7, true);
        graphWeightListD.addEdge(3, 5, 2, true);
        graphWeightListD.addEdge(3, 6, 1, true);
        graphWeightListD.addEdge(4, 6, 8, true);

        //Adjacency Matrix
        GraphMatrix graphWeightMatrixD = new GraphMatrix(7);
        graphWeightMatrixD.addEdge(0, 1, 4, true);
        graphWeightMatrixD.addEdge(0, 2, 2, true);
        graphWeightMatrixD.addEdge(0, 3, 5, true);
        graphWeightMatrixD.addEdge(0, 4, 3, true);
        graphWeightMatrixD.addEdge(0, 5, 7, true);
        graphWeightMatrixD.addEdge(1, 2, 6, true);
        graphWeightMatrixD.addEdge(1, 3, 4, true);
        graphWeightMatrixD.addEdge(1, 4, 2, true);
        graphWeightMatrixD.addEdge(1, 5, 5, true);
        graphWeightMatrixD.addEdge(2, 5, 3, true);
        graphWeightMatrixD.addEdge(2, 6, 6, true);
        graphWeightMatrixD.addEdge(2, 4, 4, true);
        graphWeightMatrixD.addEdge(3, 4, 7, true);
        graphWeightMatrixD.addEdge(3, 5, 2, true);
        graphWeightMatrixD.addEdge(3, 6, 1, true);
        graphWeightMatrixD.addEdge(4, 6, 8, true);

        //Task 3
        System.out.println("Task 3");
        System.out.println("Max Degree: " + graphWeightListD.findMaxDegree());
        System.out.println("Max Degree: " + graphWeightMatrixD.findMaxDegree());
        System.out.println("Max Weighted Vertex: " + graphWeightListD.findMaxWeightedDegree());
        System.out.println("Max Weighted Vertex: " + graphWeightMatrixD.findMaxWeightedDegree());

        //Task 4
        graphWeightListD.converterDirection();
        graphWeightMatrixD.converterDirection();
        System.out.println("Task 4");
        System.out.println("Max Degree: " + graphWeightListD.findMaxDegree());
        System.out.println("Max Degree: " + graphWeightMatrixD.findMaxDegree());
        System.out.println("Max Weighted Vertex: " + graphWeightListD.findMaxWeightedDegree());
        System.out.println("Max Weighted Vertex: " + graphWeightMatrixD.findMaxWeightedDegree());

    }
}