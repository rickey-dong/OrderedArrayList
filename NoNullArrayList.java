import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>
{
  public T set(int index, T element)
  {
    if (element == null)
    {
      throw new IllegalArgumentException("null cannot be added");
    }
    else
    {
      return super.set(index, element);
    }
  }
  public void add(int index, T element)
  {
    if (element == null)
    {
      throw new IllegalArgumentException("null cannot be added");
    }
    else
    {
      super.add(index, element);
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
      return super.add(element);
    }
  }
}
