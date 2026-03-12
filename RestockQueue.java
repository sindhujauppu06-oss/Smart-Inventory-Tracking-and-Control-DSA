public class RestockQueue {

    String queue[]=new String[100];
    int front=0;
    int rear=-1;

    public void enqueue(String item){

        queue[++rear]=item;

        System.out.println("Restock request added.");
    }

    public void dequeue(){

        if(front>rear){
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Restocking item: "+queue[front++]);
    }
}