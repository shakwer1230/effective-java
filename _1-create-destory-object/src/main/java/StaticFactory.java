/**
 * 一、静态工厂方法替代构造器
 * 与构造器不同 :
 * 优点
 *  1、他们有名称 易懂
 *  2、调用的时候，不必每次创建一个新的对象，可以进行重复利用；避免创建重复对象，单列或不可实列化
 *  3、可以返回原返回类型的任何子类型对象 （考虑用静态工厂方法代替构造器）
 *  4、创建参数化类型的实例的时候，使代码变得更加简洁
 *  缺点
 *  5、类如果不包含公有或受保护的构造器，就不能被子类化
 *  6、静态工厂方法，与其他的静态方法实际上没有任何区别，查明实例化一个类很困难
 *     静态工厂惯用的名称：
 *     valueOf()
 *     of()
 *     getInstance()
 *     newInstance()
 *     getType()
 *     newType()
 * 二、遇到多个构造器参数时要考虑用构造器
 *
 */

public class StaticFactory {
}
