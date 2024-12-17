package edu.cmu.cs.cs214.rec04;

import java.nio.channels.InterruptibleChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends AbstractIntList {
    private int count;
    private List<Integer> data;

    public InheritanceSortedIntList(){
        this.data = new ArrayList<Integer>();
        this.count = 0;
    }

    @Override
    public boolean add(int num){
        count++;
        return data.add(num);
    }

    public int get(int index){
        return data.get(index);
    }

    public boolean remove(int i){
        return data.remove((Integer)i);
    }


    public int size(){
        return data.size();
    }
    

    public int getTotalAdded(){
        return count;
    }

}