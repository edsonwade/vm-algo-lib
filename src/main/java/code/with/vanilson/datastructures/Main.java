package code.with.vanilson.datastructures;

import code.with.vanilson.datastructures.disjointset.QuickFind;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-02
 */
public class Main {

    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);
        qf.union(0, 1);
        System.out.println("is 0 connected to 1 ? " + qf.connected(0, 1));
        qf.union(0, 2);
        System.out.println("is 0 connected to 2 ? " + qf.connected(0, 2));

        System.out.println("After connecting ");
        qf.union(2, 0);
        System.out.println("is 2 connected to 0 ? " + qf.connected(2, 0));
        qf.union(3, 2);
        System.out.println("is 3 connected to 2 ? " + qf.connected(3, 2));
        qf.union(4, 8);
        System.out.println("is 4 connected to 8 ? " + qf.connected(4, 8));
    }
}