package App_main.model;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StackedArrayTest {

    @Test
    public void sizeOfStackMustBeTwo() {
        StackedArray<String> stack = new StackedArray<>();
        stack.push("1");
        stack.push("2");
        assertEquals(stack.size(), 2);
    }

    @Test
    public void popTwoAsLastElementAndSizeDecreasedToOne() {
        StackedArray<String> stack = new StackedArray<>();
        stack.push("1");
        stack.push("2");
        assertEquals(stack.pop(), "2");
        assertEquals(stack.size(), 1);
    }

    @Test
    public void peekMustReturnSameAsPop() {
        StackedArray<String> stack = new StackedArray<>();
        stack.push("1");
        stack.push("2");
        assertEquals(stack.peek(), stack.pop());
    }

    @Test
    public void newStackMustBeEmpty() {
        StackedArray<String> stack = new StackedArray<>();
        assertEquals(stack.empty(), true);
    }

    @Test
    public void emptyStackMustThrowExceptionWhenPopEmpty(){
        StackedArray<String> stack = new StackedArray<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }
}