package com.capg.LinkedList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> queue = new LinkedList<>();

queue.offer(12);
queue.offer(30);
queue.offer(31);
queue.offer(20);

System.out.println(queue);

System.out.println(queue.poll());

System.out.println(queue);

System.out.println(queue.peek());
System.out.println(queue);


	}

}

