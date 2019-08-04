package 列表优于数组;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndArray {

    //运行是才会报错
    void testArray(){
        Object[]objects=new Long[1];
        objects[0]="i dont fit it";
    }

    //编译的时候报错
    void testArrayList(){
//        List<Object>list=new ArrayList<>(Long);//错误类型
//        list.add("i dont fit it");
    }

}
