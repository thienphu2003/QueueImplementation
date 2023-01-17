public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.dequeue();
        myQueue.displayQueue();

    }
}
