
import java.util.*;
import java.util.Scanner;

class SolutionList{
public static void main (String[] args){
int num;
int nodeVal;
Scanner scan = new Scanner(System.in);
System.out.println("How many nodes you want to enter?");
num = scan.nextInt();
LinkedLists l1 = new LinkedLists();
for (int i = 1 ; i<=num ; ++i)
{System.out.println("Enter " + i + " Node Value :");
nodeVal= scan.nextInt();
l1.insertion(nodeVal);
}
System.out.println("Here is the final Linked List");
l1.display();
}
}

class LinkedLists{
private class Node{
int data ;
Node next;

Node(int data , Node next){
this.data = data ;
this.next = next ;
}
}

Node head;
Node tail;

LinkedLists(){
this.head = null;
this.tail = null;
}

void insertion(int val){
Node temp = new Node(val , head);
this.head = temp;
this.tail = head;
}

void display(){
Node temp = head;
while(temp!=null){
System.out.println(temp.data);
temp = temp.next;
}
}
}