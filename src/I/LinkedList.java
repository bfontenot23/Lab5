package I;

public class LinkedList<T> extends java.util.LinkedList<T> {

    public LinkedList()
    {
        super();
    }

    public void insert(T e)
    {
        this.add(e);
    }

    public void print()
    {
        System.out.println("----- begins ----");
        for(int i = 0;i<this.size();i++)
        {
            System.out.println("Position:" + i + " Data:" + this.get(i));
        }
        System.out.println("----- ends ----\n");
    }
}
