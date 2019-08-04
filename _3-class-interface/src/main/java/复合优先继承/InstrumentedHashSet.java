package 复合优先继承;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 *  不适当的继承
 *  相当脆弱
 * @param <E>
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount=0;
    public InstrumentedHashSet(){

    }

    public InstrumentedHashSet(int initCap,float loadFactor){
        super(initCap,loadFactor);
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection< ? extends E> c){
        addCount+=c.size();
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }

    //测试
    public static  void main(String []args){
        InstrumentedHashSet instrumentedHashSet=new InstrumentedHashSet();
        instrumentedHashSet.addAll(Arrays.asList("shape","circle","trangle"));

        //这个地方返回的值是6 而不是想象的3
        System.out.println(instrumentedHashSet.addCount);
    }
}
