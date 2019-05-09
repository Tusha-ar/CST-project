import java.util.*;
class test1{
  public static void main(String[] args) {
    Test<Integer> t1 = new Test<Integer>(99);
    t1.print();
    Test<String> t2 = new Test<String> ("Unknown");
    t2.print();
  }
}
class Test<T>
{
  T a;
  Test (T v)
  {
    this.a = v;
  }
  void print()
  {
    System.out.println(a);
  }
}
