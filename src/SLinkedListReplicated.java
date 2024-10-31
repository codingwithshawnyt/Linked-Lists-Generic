/*
 * SLinkedListReplicated.java
 * Shawn Ray
 * Period 4
 * November 30, 2023
 * This file tests SLinkedList.java
 */

public class SLinkedListReplicated  {
 
    public static void main(String s[]) 
    {
        // Integer type
        SLinkedList<Integer> list1 = new SLinkedList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(1, 7);
        System.out.println("List 1 after adding elements and inserting 7 at index 1: " + list1.toString());
        System.out.println("Element at index 2 in List 1: " + list1.get(2));
        System.out.println("Index of 10 in List 1: " + list1.indexOf(10));
        list1.remove(1);
        System.out.println("List 1 after removing element at index 1: " + list1.toString());
        System.out.println("Size of List 1: " + list1.size());
        list1.clear();
        System.out.println("List 1 after clearing: " + list1.toString());
        list1.add(15);
        list1.add(5);
        list1.add(10);
        System.out.println("List 1 before sorting: " + list1.toString());
        list1.sort();
        System.out.println("List 1 after sorting: " + list1.toString());

        // String type
        SLinkedList<String> list2 = new SLinkedList<>();
        list2.add("Hello");
        list2.add("World");
        list2.add("!");
        list2.add(1, "Beautiful");
        System.out.println("List 2 after adding elements and inserting 'Beautiful' at index 1: " + list2.toString());
        System.out.println("Element at index 2 in List 2: " + list2.get(2));
        System.out.println("Index of 'World' in List 2: " + list2.indexOf("World"));
        list2.remove(1);
        System.out.println("List 2 after removing element at index 1: " + list2.toString());
        System.out.println("Size of List 2: " + list2.size());
        list2.clear();
        System.out.println("List 2 after clearing: " + list2.toString());
        list2.add("World");
        list2.add("Hello");
        list2.add("!");
        System.out.println("List 2 before sorting: " + list2.toString());
        list2.sort();
        System.out.println("List 2 after sorting: " + list2.toString());

        // Character type
        SLinkedList<Character> list3 = new SLinkedList<>();
        list3.add('a');
        list3.add('b');
        list3.add('c');
        list3.add(1, 'd');
        System.out.println("List 3 after adding elements and inserting 'd' at index 1: " + list3.toString());
        System.out.println("Element at index 2 in List 3: " + list3.get(2));
        System.out.println("Index of 'b' in List 3: " + list3.indexOf('b'));
        list3.remove(1);
        System.out.println("List 3 after removing element at index 1: " + list3.toString());
        System.out.println("Size of List 3: " + list3.size());
        list3.clear();
        System.out.println("List 3 after clearing: " + list3.toString());
        list3.add('c');
        list3.add('a');
        list3.add('b');
        System.out.println("List 3 before sorting: " + list3.toString());
        list3.sort();
        System.out.println("List 3 after sorting: " + list3.toString());
    }
}
