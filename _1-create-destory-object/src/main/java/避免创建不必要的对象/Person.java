package 避免创建不必要的对象;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    private final Date birthDate=null;//其他的方法初始化这个值


    // never do this
    //这个方法每次被调用的时候就会创建一个Calendar对象，一个TimeZone对象，两个Date实例。这是不必要的。
    public boolean isBabyBoomer(){
        Calendar gmtCal=Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart=gmtCal.getTime();

        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEnd=gmtCal.getTime();
        return birthDate.compareTo(boomStart)>=0&&birthDate.compareTo(boomEnd)<=0;
    }


    private static final  Date BOOM_START=null;
    private static final Date BOOM_END=null;

    //利用静态初始化器 避免isBabyBoomer被调用的时候创建重复对象
    static {
        Calendar gmtCal=Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date BOOM_START=gmtCal.getTime();

        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date BOOM_END=gmtCal.getTime();
    }

    public boolean isBabyBoomer2(){
        return birthDate.compareTo(BOOM_START)>=0&&birthDate.compareTo(BOOM_END)<=0;
    }
}
