import java.util.LinkedList;

public class DSAGraphNode {
    private String data;
    private LinkedList<DSAGraphNode> neighbors;

    public DSAGraphNode(String data) {
        this.data = data;
        this.neighbors = new LinkedList<>();
    }

    public void addNeighbor(DSAGraphNode neighbor) {
        neighbors.add(neighbor);
    }

    public String getData() {
        return data;
    }

    public void displayNeighbors() {
        for (DSAGraphNode neighbor : neighbors) {
            System.out.print(neighbor.getData() + " ");
        }
    }
}
