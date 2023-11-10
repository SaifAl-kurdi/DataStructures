package Queue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDoubleLinkedList q= new QueueDoubleLinkedList();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		q.enqueue(90);

		System.out.println(q.isEmpty());
		System.out.println(q.front());
		System.out.println(q.rear());
		
		q.dequeue();
		q.dequeue();
		q.dequeue();		
		q.dequeue();
		q.dequeue();
		
		System.out.println(q.isEmpty());
		System.out.println(q.front());
		System.out.println(q.rear());
	}

}
