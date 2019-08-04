package 复合优先继承;

import java.util.*;

public class InstrumentedSet<E>extends ForwardingSet<E> {
    private int addCount=0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E>c){
        addCount+=c.size();
        return super.addAll(c);
    }
    public int getAddCount(){
        return addCount;
    }

    //测试
    public static  void main(String []args){
        Set<String>sets=new HashSet<>();


        InstrumentedSet instrumentedHashSet=new InstrumentedSet(sets);


        instrumentedHashSet.add("123");
        //这个地方返回的值是6 而不是想象的3
        System.out.println(instrumentedHashSet.addCount);
    }
}
