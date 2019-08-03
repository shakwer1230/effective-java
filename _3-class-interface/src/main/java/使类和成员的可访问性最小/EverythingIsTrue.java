package 使类和成员的可访问性最小;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 修改公有的static final域
 * 非基本类型都可以修改
 */
public class EverythingIsTrue {
    static void setFinalStatic(Field field, Object newValue) throws Exception{
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, newValue);

    }
    static void setFinalStaticField( Field field, Object newValue) throws Exception {
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field,  field.getModifiers() & ~Modifier.FINAL);
        field.set( null , newValue);

    }
    static void setFinalStaticString( Field field, Object newValue) throws Exception {
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field,  field.getModifiers() & ~Modifier.FINAL);
        field.set( null , newValue);
    }
    public static void main(String args[]) throws Exception{
        setFinalStatic(Boolean.class.getField("FALSE"), true);
        System.out.format("Everything is %s \n", Boolean.FALSE); // "Everything is true"

        System.out.println(FinalEntry.count);
        setFinalStaticField(FinalEntry.class.getField("count"),11);
        System.out.println(FinalEntry.count);
    }


}

