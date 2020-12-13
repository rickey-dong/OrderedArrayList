public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
{
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