import java.util.*;

public class Node {
    private int id;
    private Node successor;
    private Node predecessor;
    private Map<String, String> fileStorage = new HashMap<>();

    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Node getSuccessor() {
        return successor;
    }

    public void setSuccessor(Node successor) {
        this.successor = successor;
    }

    public Node getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    public void storeFile(String fileName, String fileContent) {
        fileStorage.put(fileName, fileContent);
        System.out.println("Node " + id + " stored file: " + fileName);
    }

    public String retrieveFile(String fileName) {
        return fileStorage.get(fileName);
    }

    public boolean hasFile(String fileName) {
        return fileStorage.containsKey(fileName);
    }
}
