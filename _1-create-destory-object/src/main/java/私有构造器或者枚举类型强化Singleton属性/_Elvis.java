package 私有构造器或者枚举类型强化Singleton属性;

/**
 * 公有成员是个静态工厂方法
 * 但客户端可以通过AccsessibleObject.setAccessible方法，通过反射机制调用私有构造器,要抵御这种风险，可以改造构造器，在要求创建第二个实例的时候抛出异常
 */
public class _Elvis {
    private   static final _Elvis INSTANCE=new _Elvis();

    private _Elvis(){}

    public static  _Elvis getInstance(){return INSTANCE;}

    public void leaveTheBuilding(){}
}
