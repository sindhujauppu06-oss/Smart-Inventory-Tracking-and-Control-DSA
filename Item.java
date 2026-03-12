import java.time.LocalDate;

public class Item {

    int id;
    String name;
    int quantity;
    LocalDate lastUpdated;

    public Item(int id,String name,int quantity){

        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.lastUpdated=LocalDate.now();
    }

    public void display(){

        System.out.println(id+"  "+name+"  "+quantity+"  "+lastUpdated);
    }
}