package 消除非受检警告;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 受检警告
 * @SuppressWarnings("unchecked") 可以在任何粒度下使用，但是应该在尽可能小的范围中使用@SuppressWarnings("unchecked")
 * 永远不要在类上面使用@SuppressWarnings("unchecked") 注解 这么做会掩盖重要的警告
 */
@SuppressWarnings("unchecked")
public class Venery {
    @SuppressWarnings("unchecked")
    Set<Lark>exaltation=new HashSet<>();
//    ArrayList<>
}

class Lark{}