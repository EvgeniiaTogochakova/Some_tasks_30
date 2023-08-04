// Реализовать разворот односвязного списка.
public class SinglyLinkedList {
    private Node head;
    private class Node{
        private int value;
        private Node next;
    }

    public void reverseUsingRecursion(Node head){
        recursion(null, head);
    }
    private Node recursion(Node previousNode, Node currentNode){
        if (currentNode == null){
            head = previousNode;
            return head;
        }
        Node nextNode = currentNode.next;
        currentNode.next = previousNode;
        return recursion(currentNode, nextNode);
    }


    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(100);
        list.push(200);
        list.push(300);
        list.push(400);
        list.push(500);
        list.push(600);
        list.push(700);
        System.out.print("Это исходный односвязный список: ");
        list.print();
        System.out.println();
        System.out.print("Разворачиваем его рекурсивно: ");
        list.reverseUsingRecursion(list.head);
        list.print();

    }
}
