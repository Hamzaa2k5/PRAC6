import java.util.LinkedList;

public class DSAGraph {
    private LinkedList<DSAGraphNode> nodes;

    public DSAGraph() {
        nodes = new LinkedList<>();
    }

    public void addNode(String data) {
        DSAGraphNode newNode = new DSAGraphNode(data);
        nodes.add(newNode);
    }

    public void addEdge(String sourceData, String destData) {
        DSAGraphNode sourceNode = findNode(sourceData);
        DSAGraphNode destNode = findNode(destData);

        if (sourceNode != null && destNode != null) {
            sourceNode.addNeighbor(destNode);
            destNode.addNeighbor(sourceNode);
        }
    }

    public void display() {
        for (DSAGraphNode node : nodes) {
            System.out.print(node.getData() + ": ");
            node.displayNeighbors();
            System.out.println();
        }
    }

    private DSAGraphNode findNode(String data) {
        for (DSAGraphNode node : nodes) {
            if (node.getData().equals(data)) {
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DSAGraph graph = new DSAGraph();

        // Adding nodes
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Adding edges
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        graph.addEdge("D", "A");

        // Display the graph
        System.out.println("Initial Graph:");
        graph.display();

        // Add more nodes and edges
        graph.addNode("E");
        graph.addEdge("A", "E");

        // Display the updated graph
        System.out.println("\nUpdated Graph:");
        graph.display();
    }
}
