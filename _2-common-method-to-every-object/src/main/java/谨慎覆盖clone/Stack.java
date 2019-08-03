package 谨慎覆盖clone;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Hashtable;

public class Stack {

    private Object[]elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY=16;

    public Stack(){
        elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++]=e;
    }

    public Object pop(){
        if(size==0){
            throw new EmptyStackException();
        }
        //return elements[--size];//过期引用并没有被回收

        // should do like this
        Object result=elements[--size];
        elements[size]=null;//手动清空引用
        return result;
    }

    private void ensureCapacity(){
        if(elements.length==size){
            elements= Arrays.copyOf(elements,2*size+1);
        }
    }
    @Override
    public Stack clone(){
        try {
            Stack result=(Stack)super.clone();
            //直接clone 得到的elements域将引用与原始Stack实例相同的数组
            result.elements=elements.clone();
            //clone域与final不能兼容：如果elements域是final的，clone方法无法正常工作，因为clone方法被禁止给elements赋新值。
            return result;
//            Hashtable
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}
