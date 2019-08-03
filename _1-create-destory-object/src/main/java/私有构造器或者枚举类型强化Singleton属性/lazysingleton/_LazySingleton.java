package 私有构造器或者枚举类型强化Singleton属性.lazysingleton;


//使用关键字synchronized 方法同步 ，懒汉模式线程安全
public class _LazySingleton {
    private _LazySingleton(){}//防止实列化

    private static _LazySingleton lazySingleton=null;

    public synchronized  _LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new _LazySingleton();
        }
        return lazySingleton;
    }
}
