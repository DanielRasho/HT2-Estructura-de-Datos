package App_main.model;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class  VectorStack <E> implements Stack<E> {

    private ArrayList<E> data = new ArrayList<>();

    @Override
    public void push(E item) {
        this.data.add(item);
    }

    @Override
    public E pop() throws EmptyStackException {
        if(this.empty())
            throw new EmptyStackException();
        else{
            E item = this.data.get(lastIndex());
            this.data.remove(lastIndex());
            return item;
        }
    }

    @Override
    public E peek() throws EmptyStackException {
        if(this.empty())
            throw new EmptyStackException();
        else
            return this.data.get(this.lastIndex());
    }

    @Override
    public boolean empty() {
        return data.size() == 0;
    }

    @Override
    public int size() {
        return this.data.size();
    }

    private int lastIndex(){
        return this.data.size() - 1;
    }
}
