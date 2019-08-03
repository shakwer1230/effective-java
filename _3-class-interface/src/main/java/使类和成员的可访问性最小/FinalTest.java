package 使类和成员的可访问性最小;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

final  class FinalEntry{
    public  static   final int count=0;
    public static  final  String value="true";
    public static final String[]VALUES={"1"};
}

public class FinalTest {


    public static void main(String[]args) throws Exception{
        System.out.println(Boolean.FALSE);//true
        EverythingIsTrue.setFinalStatic(Boolean.class.getField("FALSE"),"false");
        System.out.println(Boolean.FALSE);//false


        System.out.println(FinalEntry.count);//
        EverythingIsTrue.setFinalStaticField(FinalEntry.class.getField("value"),"false");
        System.out.println(FinalEntry.count);//false


//        Field field=FinalEntry.class.getDeclaredField("count");
//        Field modifiers=field.getClass().getDeclaredField("modifiers");
//        modifiers.setAccessible(true);
//        modifiers.setInt(field,field.getModifiers()&~Modifier.FINAL);
//        field.setInt(FinalEntry.count,10);
//        System.out.println(FinalEntry.count);

    }
}
