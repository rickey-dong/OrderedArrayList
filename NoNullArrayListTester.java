public class NoNullArrayListTester
{
  public static void main(String[] args)
  {
    NoNullArrayList<Integer> myList = new NoNullArrayList<Integer>(15);
    System.out.println(myList);
    myList.add(10);
    myList.add(5);
    System.out.println(myList + " should be [10, 5]");
    System.out.println(myList.add(80) + " should be true");
    try
    {
      System.out.println(myList.add(null));
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e);
      System.out.println("that was add(element) error");
    }
    System.out.println(myList.add(556) + " should be true");
    System.out.println(myList + " should be [10, 5, 80, 556]");
    try
    {
      myList.add(1, null);
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e);
      System.out.println("that was add(index, element) error");
    }
    myList.add(1, 11);
    System.out.println(myList + " should be [10, 11, 5, 80, 556]");
    System.out.println(myList.set(2, 12) + " should be 5");
    System.out.println(myList + " should be [10, 11, 12, 80, 556]");
    try
    {
      myList.set(3, null);
    }
    catch(IllegalArgumentException e)
    {
      System.out.println(e);
      System.out.println("that was set(index, element) error");
    }
  }
}