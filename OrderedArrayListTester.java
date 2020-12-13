public class OrderedArrayListTester
{
  public static void main(String[] args)
  {
    OrderedArrayList<Integer> ourList = new OrderedArrayList<Integer>(15);
    System.out.println(ourList + " should be []");
    System.out.println(ourList.add(6) + " should be true");
    System.out.println(ourList + " should be [6]");
    System.out.println(ourList.add(4) + " should be true");
    System.out.println(ourList + " should be [4, 6]");
    try
    {
      System.out.println(ourList.add(null));
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e);
      System.out.println("that was add(element) error");
    }
    ourList.add(23, 5);
    System.out.println(ourList + " should be [4, 5, 6]");
    ourList.add(0, 8);
    System.out.println(ourList + " should be [4, 5, 6, 8]");
    try
    {
      ourList.add(1, null);
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e);
      System.out.println("that was add(index, element) error");
    }
    System.out.println(ourList.set(2, 3) + " should be 6");
    System.out.println(ourList + " should be [3, 4, 5, 8]");
    System.out.println(ourList.set(1, 7) + " should be 4");
    System.out.println(ourList + " should be [3, 5, 7, 8]");
    try
    {
      ourList.set(3, null);
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e);
      System.out.println("that was set(index, element) error");
    }
    System.out.println(ourList + " should be [3, 5, 7, 8]");
  }
}