public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
{
  public void add(int index, T element)
  {
    if (element == null)
    {
      throw new IllegalArgumentException("null cannot be added");
    }
    else
    {
      super.add(this.whichIndex(element), element);
    }
  }
  public boolean add(T element)
  {
    if (element == null)
    {
      throw new IllegalArgumentException("null cannot be added");
    }
    else
    {
      this.add(this.whichIndex(element), element);
      return true;
    }
  }
  public T set(int index, T element)
  {
    //[5,7,9]
    //set(1,10)
    //[5,9]
    if (element == null)
    {
      throw new IllegalArgumentException("null cannot be added");
    }
    else
    {
      T thisWasRemoved = this.get(index);
      this.remove(index);
      this.add(this.whichIndex(element), element);
      return thisWasRemoved;
    }
  }
  private int whichIndex(T element)
  {
    if (this.size() == 0)
    {
      return 0;
    }
    else
    {
      int thisIndex = 0;
      for (int i = 0; i < this.size(); i++)
      {
        if (this.get(i).compareTo(element) >= 0)
        {
          return thisIndex;
        }
        else
        {
          thisIndex += 1;
        }
      }
      return thisIndex;
    }
  }
}