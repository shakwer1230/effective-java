package 私有构造器或者枚举类型强化Singleton属性.lazysingleton;

/**
 * 懒汉模式
 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问。
 * 事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效
 * 但是以上懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例，
 */
public class LazySingleton {
    private LazySingleton(){}//防止实列化

    private static LazySingleton lazySingleton=null;

    public LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
