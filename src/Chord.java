import java.util.*;

public class Chord {
    private List<Node> nodes;

    public Chord() {
        nodes = new ArrayList<>();
    }

    public void addNode(Node newNode) {
        if (nodes.isEmpty()) {
            newNode.setSuccessor(newNode);
            newNode.setPredecessor(newNode);
        } else {
            Node lastNode = nodes.get(nodes.size() - 1);
            lastNode.setSuccessor(newNode);
            newNode.setPredecessor(lastNode);
            newNode.setSuccessor(nodes.get(0));
            nodes.get(0).setPredecessor(newNode);
        }
        nodes.add(newNode);
        System.out.println("Added node with ID: " + newNode.getId());
    }

    public Node findNode(int id) {
        for (Node node : nodes) {
            if (node.getId() == id) {
                return node;
            }
        }
        return null;
    }

    public void transferFile(String fileName, int sourceId, int destinationId) {
        Node sourceNode = findNode(sourceId);
        Node destinationNode = findNode(destinationId);
        if (sourceNode != null && destinationNode != null && sourceNode.hasFile(fileName)) {
            String content = sourceNode.retrieveFile(fileName);
            destinationNode.storeFile(fileName, content);
            System.out.println("File \"" + fileName + "\" transferred from Node " + sourceId + " to Node " + destinationId);
        } else {
            System.out.println("File transfer failed: file or nodes not found.");
        }
    }
}
