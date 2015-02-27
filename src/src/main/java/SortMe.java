/**
 * Created by joel on 2/27/15.
 */

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