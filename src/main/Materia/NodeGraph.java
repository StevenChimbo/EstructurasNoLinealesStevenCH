package main.Materia;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {

    protected int value;
    protected List<NodeGraph> neighbors;

    public NodeGraph(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    public int getValue() {
        return this.value;
    }

    public List<NodeGraph> getNeighbors() {
        return this.neighbors;
    }

    public void addNeighbors(NodeGraph neighbors) {
        this.neighbors.add(neighbors);
    }
}
