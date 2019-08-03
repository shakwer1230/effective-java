package 消除过期对象的引用;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    static Map wMap=new WeakHashMap();

//    public static void  init(){
//        wMap.put("1","ding");
//        wMap.put("2","job");
//    }

    static {
        wMap.put("1","ding");
        wMap.put("2","job");
    }
    public static void testHashMap(){
        System.out.println("first get:"+wMap.get("1"));
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("next get:"+wMap.get("1"));
    }

    public static void main(String[]args){
//        WeakHashMapTest.init();
        WeakHashMapTest.testHashMap();
        System.out.println(WeakHashMapTest.wMap.get("2"));;
    }


}
