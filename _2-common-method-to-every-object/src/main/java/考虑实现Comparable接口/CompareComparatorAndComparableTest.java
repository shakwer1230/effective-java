package 考虑实现Comparable接口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareComparatorAndComparableTest {
    public static void main(String[] args) {
        // 新建ArrayList(动态数组)
        ArrayList<Person> list = new ArrayList<>();
        // 添加对象到ArrayList中
        list.add(new Person("ccc", 20));
        list.add(new Person("AAA", 30));
        list.add(new Person("bbb", 10));
        list.add(new Person("ddd", 40));


        // 打印list的原始序列
        System.out.printf("Original  sort, list:%s\n", list);
        System.out.println("未完待续");

        // 对list进行排序
        // 这里会根据“Person实现的Comparable<String>接口”进行排序，即会根据“name”进行排序
        Collections.sort(list);
        System.out.printf("Name      sort, list:%s\n", list);

        // 通过“比较器(AscAgeComparator)”，对list进行排序
        // AscAgeComparator的排序方式是：根据“age”的升序排序
        Collections.sort(list, new Person.AscAgeComparator());
        System.out.printf("Asc(age)  sort, list:%s\n", list);


        // 通过“比较器(DescAgeComparator)”，对list进行排序
        // DescAgeComparator的排序方式是：根据“age”的降序排序
        Collections.sort(list, new Person.DescAgeComparator());
        System.out.printf("Desc(age) sort, list:%s\n", list);

        // 判断两个person是否相等
        testEquals();


    }

    /**
     * @desc 测试两个Person比较是否相等。
     *   由于Person实现了equals()函数：若两person的age、name都相等，则认为这两个person相等。
     *   所以，这里的p1和p2相等。
     *
     *   TODO：若去掉Person中的equals()函数，则p1不等于p2
     */
    private static void testEquals() {
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        if (p1.equals(p2)) {
            System.out.printf("%s EQUAL %s\n", p1, p2);
        } else {
            System.out.printf("%s NOT EQUAL %s\n", p1, p2);
        }
    }
}
