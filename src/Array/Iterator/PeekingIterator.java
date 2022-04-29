package src.Array.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer> {
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return 0;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return 0;
	}
	
	@Override
	public boolean hasNext() {
	    return false;
	}

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        PeekingIterator peekingIterator = new PeekingIterator((Iterator<Integer>) list);
    }
}