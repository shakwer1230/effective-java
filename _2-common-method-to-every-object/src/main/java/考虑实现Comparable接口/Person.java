package 考虑实现Comparable接口;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }


    boolean equals(Person person){
        if(person==null)return false;
        if(this.age==person.getAge()&&this.name.equals(person.getName()))return true;
        return false;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

      static  class AscAgeComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge()-o2.getAge();
        }
    }

      static class DescAgeComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getAge()-o1.getAge();
        }
    }
}
