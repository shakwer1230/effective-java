package 通过私有构造器强化不可实列化的能力;

/**
 * 企图通过使用抽象类来强制该类不可被实列化，这是行不通的
 * 可以让该类包含私有构造器，编译器才不会生产缺省的构造器，这样才不被实例化
 */
public class Utility {
    private Utility()  {
        throw new AssertionError("该类不可被实例化");
    }
}
