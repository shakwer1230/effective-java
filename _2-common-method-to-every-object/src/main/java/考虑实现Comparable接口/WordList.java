package 考虑实现Comparable接口;

import java.util.*;

public class WordList implements Comparable,Comparator{

    public static void main(String[]args){
        Set<String>s=new TreeSet<>();
        Collections.addAll(s,args);
//        Arrays.sort();
        System.out.println(s);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
