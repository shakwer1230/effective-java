package 私有构造器或者枚举类型强化Singleton属性.lazysingleton;
//双重检查
//使用synchronized块  保证了单例 也避免过多的同步（提升效率）
public class __LazySingleton {
    private __LazySingleton(){}//防止实列化

    private static __LazySingleton lazySingleton=null;

    public __LazySingleton getInstance(){
        if(lazySingleton==null){
            synchronized (__LazySingleton.class){
                lazySingleton=new __LazySingleton();
            }
        }
        return lazySingleton;
    }
}
