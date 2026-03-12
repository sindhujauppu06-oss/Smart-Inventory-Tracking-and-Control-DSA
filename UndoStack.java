public class UndoStack {

    String stack[]=new String[100];
    int top=-1;

    public void push(String action){

        if(top==99){
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top]=action;
    }

    public void pop(){

        if(top==-1){
            System.out.println("Nothing to undo.");
            return;
        }

        System.out.println("Undo: "+stack[top--]);
    }
}