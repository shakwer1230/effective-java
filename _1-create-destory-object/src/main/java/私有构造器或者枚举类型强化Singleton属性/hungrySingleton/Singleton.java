package 私有构造器或者枚举类型强化Singleton属性.hungrySingleton;

//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
public class Singleton {
    private Singleton() {}
    private static final Singleton single = new Singleton();

    //静态工厂方法
    public static Singleton getInstance() {
        return single;
    }
}
