import java.util.*;

public class Graphs {
    int nodeCount;
    ArrayList<String> nodes;
    ArrayList<ArrayList<Integer>> graph;

    public Graphs() {
        nodeCount = 0;
        nodes = new ArrayList<>();
        graph = new ArrayList<>();
    }

    // Add Vertex
    public void addNode(String v) {
        if (nodes.contains(v)) {
            System.out.println(v + " is already present.");
            return;
        }

        nodes.add(v);
        nodeCount++;

        // Add a new column to existing rows
        for (ArrayList<Integer> row : graph) {
            row.add(0);
        }

        // Add a new row
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nodeCount; i++) {
            temp.add(0);
        }

        graph.add(temp);

        System.out.println("Vertex " + v + " added.");
    }

    // Unweighted Undirected Edge
    public void addEdge(String v1, String v2) {
        if (!nodes.contains(v1)) {
            System.out.println(v1 + " is not present.");
            return;
        }

        if (!nodes.contains(v2)) {
            System.out.println(v2 + " is not present.");
            return;
        }

        int index1 = nodes.indexOf(v1);
        int index2 = nodes.indexOf(v2);

        graph.get(index1).set(index2, 1);
        graph.get(index2).set(index1, 1);

        System.out.println("Edge added between " + v1 + " and " + v2);
    }

    // Weighted Undirected Edge
    public void addEdgeUndirected(String w1, String w2, int w) {
        if (!nodes.contains(w1) || !nodes.contains(w2)) {
            System.out.println("One or both vertices not present.");
            return;
        }

        int i = nodes.indexOf(w1);
        int j = nodes.indexOf(w2);

        graph.get(i).set(j, w);
        graph.get(j).set(i, w);

        System.out.println("Weighted Undirected Edge Added.");
    }

    // Weighted Directed Edge
    public void addEdgeDirected(String ver1, String ver2, int wgt) {
        if (!nodes.contains(ver1) || !nodes.contains(ver2)) {
            System.out.println("One or both vertices not present.");
            return;
        }

        int i = nodes.indexOf(ver1);
        int j = nodes.indexOf(ver2);

        graph.get(i).set(j, wgt);

        System.out.println("Weighted Directed Edge Added.");
    }

    // Delete Vertex
    public void delete(String vertex) {
        if (!nodes.contains(vertex)) {
            System.out.println("Vertex not found.");
            return;
        }

        int index = nodes.indexOf(vertex);

        // Remove row
        graph.remove(index);

        // Remove column
        for (ArrayList<Integer> row : graph) {
            row.remove(index);
        }

        nodes.remove(index);
        nodeCount--;

        System.out.println("Vertex " + vertex + " deleted.");
    }

    // Print Graph
    public void printGraph() {
        if (nodeCount == 0) {
            System.out.println("Graph is empty.");
            return;
        }

        System.out.print("   ");
        for (String node : nodes) {
            System.out.print(node + " ");
        }
        System.out.println();

        for (int i = 0; i < nodeCount; i++) {
            System.out.print(nodes.get(i) + "  ");

            for (int j = 0; j < nodeCount; j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graphs g = new Graphs();

        while (true) {
            System.out.println("\n===== GRAPH MENU =====");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge (Unweighted Undirected)");
            System.out.println("3. Add Edge (Weighted Undirected)");
            System.out.println("4. Add Edge (Weighted Directed)");
            System.out.println("5. Print Graph");
            System.out.println("6. Delete Vertex");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter vertex: ");
                    String v = sc.next();
                    g.addNode(v);
                    break;

                case 2:
                    System.out.print("Enter vertex 1: ");
                    String v1 = sc.next();

                    System.out.print("Enter vertex 2: ");
                    String v2 = sc.next();

                    g.addEdge(v1, v2);
                    break;

                case 3:
                    System.out.print("Enter vertex 1: ");
                    String w1 = sc.next();

                    System.out.print("Enter vertex 2: ");
                    String w2 = sc.next();

                    System.out.print("Enter weight: ");
                    int w = sc.nextInt();

                    g.addEdgeUndirected(w1, w2, w);
                    break;

                case 4:
                    System.out.print("Enter source vertex: ");
                    String ver1 = sc.next();

                    System.out.print("Enter destination vertex: ");
                    String ver2 = sc.next();

                    System.out.print("Enter weight: ");
                    int wgt = sc.nextInt();

                    g.addEdgeDirected(ver1, ver2, wgt);
                    break;

                case 5:
                    g.printGraph();
                    break;

                case 6:
                    System.out.print("Enter vertex to delete: ");
                    String del = sc.next();

                    g.delete(del);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
