import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventoryLinkedList inventory = new InventoryLinkedList();
        UndoStack undo = new UndoStack();
        RestockQueue queue = new RestockQueue();
        HashTable hash = new HashTable();

        while(true){

            System.out.println("\nSMART INVENTORY TRACKING SYSTEM");
            System.out.println("1 Add Item");
            System.out.println("2 View Inventory");
            System.out.println("3 Search Item");
            System.out.println("4 Delete Item");
            System.out.println("5 Update Stock");
            System.out.println("6 Add Restock Request");
            System.out.println("7 Process Restock");
            System.out.println("8 Undo Last Operation");
            System.out.println("0 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    Item item = new Item(id,name,qty);

                    inventory.insert(item);
                    hash.insert(item);

                    undo.push("Add Item");

                    System.out.println("Item added successfully.");
                    break;


                case 2:

                    inventory.display();
                    break;


                case 3:

                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();

                    Item found = hash.search(sid);

                    if(found != null){
                        System.out.println("Item Found:");
                        found.display();
                    }
                    else{
                        System.out.println("Item not found.");
                    }

                    break;


                case 4:

                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    inventory.delete(did);
                    hash.delete(did);

                    undo.push("Delete Item");
                    break;


                case 5:

                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateStock(uid,newQty);

                    undo.push("Update Stock");
                    break;


                case 6:

                    System.out.print("Enter Item Name: ");
                    queue.enqueue(sc.next());
                    break;


                case 7:

                    queue.dequeue();
                    break;


                case 8:

                    undo.pop();
                    break;


                case 0:

                    System.out.println("Program Ended.");
                    return;


                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}