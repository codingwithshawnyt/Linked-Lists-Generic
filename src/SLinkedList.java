//Shawn Ray
//Period 4
//SLinkedList.java
//The purpose of this code is to create a Linked List that can
//handle any data type that is supported by the Comparable interface.

// Import the NoSuchElementException class, which is used to indicate that there are no more elements in an enumeration
import java.util.NoSuchElementException;

// Define a generic class SLinkedList that can handle any type T that implements the Comparable interface
public class SLinkedList<T extends Comparable<T>> {
    // Declare a private variable 'front' of type sNode<T> that will be the first node in the linked list
    private sNode<T> front;

    // Default constructor that initializes 'front' to null
    public SLinkedList() {
        front = null;
    }

    // Constructor that takes a value of type T and initializes 'front' to a new node containing this value
    public SLinkedList(T value) {
        front = new sNode<>(value);
    }

    // Method to add a new node with a given value to the end of the list
    public void add(T value) {
        // If the list is empty, create a new node and assign it to 'front'
        if (front == null) {
            front = new sNode<>(value);
        } else {
            // If the list is not empty, traverse the list to find the last node
            sNode<T> current = front;
            while (current.next != null) {
                current = current.next;
            }
            // Add a new node with the given value after the last node
            current.next = new sNode<>(value);
        }
    }

    // Method to add a new node with a given value at a specific index in the list
    public void add(int index, T value) {
        // If the index is invalid, throw an exception
        if (index < 0 || (index > 0 && front == null)) {
            throw new NoSuchElementException("Invalid index.");
        }
        // If the index is 0, add the new node at the front of the list
        if (index == 0) {
            front = new sNode<>(value, front);
        } else {
            // If the index is not 0, find the node at the given index - 1
            sNode<T> current = front;
            for (int i = 0; i < index - 1; i++) {
                // If the next node is null, throw an exception
                if (current.next == null) {
                    throw new NoSuchElementException("Invalid index.");
                }
                // Move to the next node
                current = current.next;
            }
            // Add a new node with the given value after the node at the given index - 1
            current.next = new sNode<>(value, current.next);
        }
    }

    // Method to get the value of the node at a specific index in the list
    public T get(int index) {
        // If the list is empty, throw an exception
        if (front == null) {
            throw new NoSuchElementException("List is empty.");
        }
        // Find the node at the given index
        sNode<T> current = front;
        for (int i = 0; i < index; i++) {
            // If the next node is null, throw an exception
            if (current.next == null) {
                throw new NoSuchElementException("Invalid index.");
            }
            // Move to the next node
            current = current.next;
        }
        // Return the value of the node at the given index
        return current.data;
    }

    // Method to find the index of the first node with a given value in the list
    public int indexOf(T value) {
        // Initialize the index to 0
        int index = 0;
        // Start from the first node
        sNode<T> current = front;
        // Traverse the list until the end
        while (current !=  null) {
            // If the value of the current node is equal to the given value, return the index
            if (current.data.equals(value)) {
                return index;
            }
            // Move to the next node and increment the index
            index++;
            current = current.next;
        }
        // If the given value is not found in the list, return -1
        return -1;  
    }

    // Method to remove the node at a specific index in the list and return its value
    public T remove(int index) {
        // If the list is empty, throw an exception
        if (front == null) {
            throw new NoSuchElementException("List is empty.");
        }
        // Declare a variable to store the value of the removed node
        T removed;
        // If the index is 0, remove the first node
        if (index == 0) {
            removed = front.data;
            front = front.next;
        } else {
            // If the index is not 0, find the node at the given index - 1
            sNode<T> current = front;
            for (int i = 0; i < index - 1; i++) {
                // If the next node is null, throw an exception
                if (current.next == null) {
                    throw new NoSuchElementException("Invalid index.");
                }
                // Move to the next node
                current = current.next;
            }
            // If the next node is null, throw an exception
            if (current.next == null) {
                throw new NoSuchElementException("Invalid index.");
            }
            // Store the value of the next node
            removed = current.next.data;
            // Remove the next node by skipping it in the list
            current.next = current.next.next;
        }
        // Return the value of the removed node
        return removed;
    }

    // Method to get the size of the list
    public int size() {
        // Initialize the count to 0
        int count = 0;
        // Start from the first node
        sNode<T> current = front;
        // Traverse the list until the end
        while (current != null) {
            // Increment the count for each node
            count++;
            // Move to the next node
            current = current.next;
        }
        // Return the count
        return count;
    }

    // Method to convert the list to a string
    public String toString() {
        // If the list is empty, return "[]"
        if (front == null) {
            return "[]";
        } else {
            // If the list is not empty, start the string with the value of the first node
            String result = "[" + front.data;
            // Start from the second node
            sNode<T> current = front.next;
            // Traverse the list until the end
            while (current != null) {
                // Add the value of each node to the string
                result += ", " + current.data;
                // Move to the next node
                current = current.next;
            }
            // Close the string and return it
            result += "]";
            return result;
        }
    }

    // Method to remove all nodes from the list
    public void clear() {
        front = null;
    }

    // Method to sort the list in ascending order
    public void sort() {
        // Start from the first node
        sNode<T> current = front;
        // Traverse the list until the end
        while (current != null) {
            // Assume the current node is the smallest
            sNode<T> min = current;
            // Start from the next node
            sNode<T> other = current.next;
            // Traverse the rest of the list
            while (other != null) {
                // If a smaller node is found, update 'min'
                if (other.data.compareTo(min.data) < 0) {
                    min = other;
                }
                // Move to the next node
                other = other.next;
            }
            // Swap the data of the current node and the smallest node
            T temp = current.data;
            current.data = min.data;
            min.data = temp;
            // Move to the next node
            current = current.next;
        }
    }
}
