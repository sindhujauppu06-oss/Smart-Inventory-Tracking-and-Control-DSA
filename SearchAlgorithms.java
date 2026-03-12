public class SearchAlgorithms {

    public static Item linearSearch(Node head,int id){

        Node temp=head;

        while(temp!=null){

            if(temp.data.id==id){
                return temp.data;
            }

            temp=temp.next;
        }

        return null;
    }
}