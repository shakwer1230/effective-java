package 避免创建不必要的对象;


/**
 * 自动装箱
 */
public class AutoBoxing {
    public static  void main(String[]args){
        test1();
        test2();
        /**
         * sum=2305843005992468481
         * test1共花费时间为：12560
         * sum=2305843005992468481
         * test2共花费时间为：1170
         */

        test3();
        /**
         * sum=2305843005992468481
         * test3共花费时间为：21207
         */

    }

    public static void test1(){
        long start = System.currentTimeMillis();
        Long sum=0L;
        for (long i=0;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        System.out.println("test1共花费时间为："+((System.currentTimeMillis())-start));
    }

    public static void test2(){
        long start = System.currentTimeMillis();
        long sum=0L;
        for (long i=0;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        System.out.println("test2共花费时间为："+((System.currentTimeMillis())-start));
    }


    public static void test3(){
        long start = System.currentTimeMillis();
        Long sum=0L;
        for (Long i=0L;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        System.out.println("test3共花费时间为："+((System.currentTimeMillis())-start));
    }

}
