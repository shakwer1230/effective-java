package 私有构造器或者枚举类型强化Singleton属性.lazysingleton;

//静态内部类 延迟加载 解决懒汉模式的线程不安全
public class StaticInnerClassLazySingleton {
    private StaticInnerClassLazySingleton(){}//防止实列化



    private  static  class  classHolder{
        private static StaticInnerClassLazySingleton lazySingleton=new StaticInnerClassLazySingleton();
    }

    public StaticInnerClassLazySingleton getInstance(){
        return  classHolder.lazySingleton;
    }
}
