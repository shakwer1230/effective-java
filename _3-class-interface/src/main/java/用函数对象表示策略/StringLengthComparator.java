package 用函数对象表示策略;

import java.util.Comparator;

public class StringLengthComparator<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if(o1 instanceof String&&o2 instanceof String){
            return ((String) o1).length()-((String) o2).length();
        }

        return 0;
    }
}
