package org.jetuml.rendering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.jetuml.diagram.Edge;
import org.jetuml.diagram.Node;

public class EdgeGroup implements List<Edge> {
    private List<Edge> aEdges;

    public EdgeGroup() {
        this.aEdges = new ArrayList<>();
    }
    
    public boolean shareStartNode()
    {
    	Node aNode = this.aEdges.get(0).start();
    	for (Edge aEdge: this.aEdges)
    	{
    		if (!aNode.equals(aEdge.start()))
    		{
    			return false;
    		}
    	}
    	return true;
    }

    @Override
    public int size() {
        return aEdges.size();
    }

    @Override
    public boolean isEmpty() {
        return aEdges.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return aEdges.contains(o);
    }

    @Override
    public Iterator<Edge> iterator() {
        return aEdges.iterator();
    }

    @Override
    public boolean add(Edge edge) {
        return aEdges.add(edge);
    }

    @Override
    public boolean remove(Object o) {
        return aEdges.remove(o);
    }

    @Override
    public void clear() {
        aEdges.clear();
    }

    @Override
    public Edge get(int index) {
        return aEdges.get(index);
    }

    @Override
    public Edge set(int index, Edge element) {
        return aEdges.set(index, element);
    }

    @Override
    public void add(int index, Edge element) {
        aEdges.add(index, element);
    }

    @Override
    public Edge remove(int index) {
        return aEdges.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return aEdges.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return aEdges.lastIndexOf(o);
    }

    @Override
    public ListIterator<Edge> listIterator() {
        return aEdges.listIterator();
    }

    @Override
    public ListIterator<Edge> listIterator(int index) {
        return aEdges.listIterator(index);
    }

    @Override
    public List<Edge> subList(int fromIndex, int toIndex) {
        return aEdges.subList(fromIndex, toIndex);
    }

    @Override
    public Object[] toArray() {
        return aEdges.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return aEdges.toArray(a);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return aEdges.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Edge> c) {
        return aEdges.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Edge> c) {
        return aEdges.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return aEdges.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return aEdges.retainAll(c);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EdgeGroup{");
        for (int i = 0; i < aEdges.size(); i++) {
            sb.append(aEdges.get(i));
            if (i < aEdges.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

