package 用函数对象表示策略;

import java.io.Serializable;
import java.util.Comparator;

public class Host {
    private static class StrLenCmp implements Comparator<String>, Serializable{

        public  static  final  StrLenCmp INSTANCE=new StrLenCmp();
        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
        public static final Comparator<String> STRING_LENGTH_COMPARATOR=new StrLenCmp();
    }
}
