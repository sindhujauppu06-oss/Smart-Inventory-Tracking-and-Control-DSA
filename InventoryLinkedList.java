public class InventoryLinkedList {

    Node head;


    // Insert item into linked list
    public void insert(Item item){

        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }


    // Display items in sorted order (by ID)
    public void display(){

        if(head == null){
            System.out.println("Inventory Empty");
            return;
        }

        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        Item arr[] = new Item[count];

        temp = head;
        int i = 0;

        while(temp != null){
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }

        SortAlgorithms.bubbleSort(arr,count);

        for(i = 0; i < count; i++){
            arr[i].display();
        }
    }


    // Delete item
    public void delete(int id){

        Node temp = head;
        Node prev = null;

        while(temp != null){

            if(temp.data.id == id){

                if(prev == null){
                    head = temp.next;
                }
                else{
                    prev.next = temp.next;
                }

                System.out.println("Item deleted.");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        System.out.println("Item not found.");
    }


    // Update stock quantity
    public void updateStock(int id, int newQty){

        Node temp = head;

        while(temp != null){

            if(temp.data.id == id){

                temp.data.quantity = newQty;

                System.out.println("Stock updated successfully.");
                temp.data.display();

                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }
}