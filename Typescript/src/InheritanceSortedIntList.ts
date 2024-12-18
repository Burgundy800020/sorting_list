import { AbstractIntList } from './AbstractIntList.js'
import { SortedIntList } from './hidden/SortedIntListLibrary.js'

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

class InheritanceSortedIntList extends SortedIntList{
  private count : number = 0;
  
  constructor(){
    super();
    this.count = 0;
  }

  public add (num: number): boolean{
    this.count++;
    return super.add(num);
  }
  
  public getTotalAdded() : number{
    return this.count;
  }

}

export { InheritanceSortedIntList }
