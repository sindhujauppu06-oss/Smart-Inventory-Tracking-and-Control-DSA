public class HashTable {

    Item table[]=new Item[100];

    int hash(int id){

        return id%100;
    }

    public void insert(Item item){

        int index=hash(item.id);
        table[index]=item;
    }

    public Item search(int id){

        int index=hash(id);
        return table[index];
    }

    public void delete(int id){

        int index=hash(id);
        table[index]=null;
    }
}