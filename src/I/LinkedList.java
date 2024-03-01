package I;

public class LinkedList<Object> extends java.util.LinkedList<Object> {

    public LinkedList()
    {
        super();
    }

    public void insert(Object e)
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
