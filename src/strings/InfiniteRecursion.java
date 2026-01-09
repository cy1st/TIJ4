//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}
package strings;

import java.util.*;

public class InfiniteRecursion {
    public String toString() {
//    return " InfiniteRecursion address: " + this + "\n";//此处使用this会产生递归调用toString()方法导致栈溢出
        return "InfiniteRecursion" + super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
} /// :~
