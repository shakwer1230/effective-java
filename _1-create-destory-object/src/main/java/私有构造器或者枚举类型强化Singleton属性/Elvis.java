package 私有构造器或者枚举类型强化Singleton属性;

/**
 * jdk 1.5之前实现singleton有两种方法：都要把构造器保持私有，并导出公有的静态成员
 * 私有构造器仅被调用一次，用来实例化静态的final域Elvis.INSTANCE 保证了实例的唯一性；
 * 但客户端可以通过AccsessibleObject.setAccessible方法，通过反射机制调用私有构造器,要抵御这种风险，可以改造构造器，在要求创建第二个实例的时候抛出异常
 */
public class Elvis {
    public  static final Elvis INSTANCE=new Elvis();
    private Elvis(){}
    public void leaveTheBuilding(){}
}
