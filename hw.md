CS2010 Tutorial 6

A0108165J

TONG Haowen Joel

## Question 1

    setA: [Jill, Ann]
    setB: [Bill, Bob, Jill, Ann]
    setAcopy: [Jill, Ann]


## Question 2 Part A

It did not work as `StringBuffer` did not implement a `compare()` or `compareTo()` function.  Furthermore, no compaator was specified.

## Question 2 Part B

```java
import java.util.*;
import java.lang.StringBuffer;

public class SortMe {
  public static void main(String args[]) {
    SortedSet<StringBuffer> s = new TreeSet<StringBuffer>(new Comparator<StringBuffer>() {
      @Override
      public int compare(StringBuffer stringBuffer, StringBuffer t1) {
        return stringBuffer.toString().compareTo(t1.toString());
      }
    });
    s.add(new StringBuffer("Red"));
    s.add(new StringBuffer("White"));
    s.add(new StringBuffer("Blue"));
    System.out.println(s.first());
  }
}
```
