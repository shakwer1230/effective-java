package 覆盖equals方法时总要覆盖hashcode方法;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode,int prefix,int lineNumber){
        rangCheck(areaCode,999,"areaCode");
        rangCheck(prefix,999,"prefix");
        rangCheck(lineNumber,9999,"lineNumber");
        this.areaCode=(short)areaCode;
        this.prefix=(short) prefix;
        this.lineNumber=(short)lineNumber;
    }

    private static void rangCheck(int arg,int max,String name){
        if(arg<0||arg>max)
            throw new IllegalArgumentException(name+":"+arg);
    }
    @Override
    public boolean equals(Object o){
        if(o ==this)return true;
        if(!(o instanceof PhoneNumber))return false;
        PhoneNumber phoneNumber=(PhoneNumber)o;
        return phoneNumber.lineNumber==this.lineNumber
                &&phoneNumber.prefix==this.prefix
                &&phoneNumber.areaCode==this.areaCode;
    }


    @Override
    public int hashCode(){
        int result=17;
        result=31*result+areaCode;
        result=31*result+prefix;
        result=31*result+lineNumber;
        return result;
    }

    public static void main(String[]args){
        Map<PhoneNumber,String>map=new HashMap<>();

        PhoneNumber pn=new PhoneNumber(707,867,5309);
        map.put(pn,"Jenny");

        System.out.println(map.get(pn));
        System.out.println(map.get(new PhoneNumber(707,867,5309)));
    }
}
