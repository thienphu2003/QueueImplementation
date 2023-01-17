public class MyQueue {
    private Node front;
    private Node rear;
    public MyQueue()
    {
        this.front=null;
        this.rear=null;
    }
    private class Node
    {
        private int data;
        private Node link;
        public Node(int data)
        {
            this.data=data;
            this.link=null;
        }
    }
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(rear==null)
        {
            this.front=this.rear=newNode;
            return;
        }
        this.rear.link=newNode;
        this.rear=newNode;
        this.rear.link=front;

    }
    public Node dequeue() {
        if(front==null)
        {
            return null;
        }else if(front==rear)
        {
            front=rear=null;
        }
        Node temp = front;
        front=front.link;
        rear.link=front;
        return temp;
    }
    public void displayQueue()
    {
        Node temp = this.front;
        while(temp.link!=front)
        {
            System.out.println(temp.data);
            temp=temp.link;
            if(temp.link==front)
            {
                System.out.println(temp.data);
            }
        }
    }
}
