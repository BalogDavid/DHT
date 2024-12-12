public class Main {
    public static void main(String[] args) {
        Chord chord = new Chord();

        // Creăm noduri
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        chord.addNode(node1);
        chord.addNode(node2);
        chord.addNode(node3);

        // Stocăm și transferăm fișiere
        node1.storeFile("example.txt", "This is a test file.");
        chord.transferFile("example.txt", 1, 3);

        // Recuperăm fișierul
        if (node3.hasFile("example.txt")) {
            System.out.println("File content at Node 3: " + node3.retrieveFile("example.txt"));
        }
    }
}
