package homework.HashFunctions;

import java.util.Objects;
import java.util.stream.Stream;

public class HashFunctions {
  public static int hashString(String input) {
    int res = 0;
    if (Objects.isNull(input)) return res;
    for (char ch : input.toCharArray()) {
      res += ch;
    }
    return res; // Please implement
  }

  public static int hashInt(int input) {
    if (input == 0) return input;
    int res = 1;
    for (char num : Integer.toString(Math.abs(input)).toCharArray()) {
      int dig = Integer.parseInt(Character.toString(num));
      if (dig != 0) res *= dig;
    }
    return input < 0 ? res * -1 : res; // Please implement
  }

  public static int hashStudent(Student student) {
    String age = Integer.toString(student.getAge());
    int res = 1;
    for (int i = 0; i < age.length(); i++) {
      int dig = Integer.parseInt(Character.toString(age.charAt(i)));
      if (dig != 0) res *= dig ^ i;
    }
    res = student.getAge() < 0 ? res * -1 : res;

    for (int i = 0; i < student.getName().length(); i++) {
      res += student.getName().charAt(i) ^ i;
    }

    return res; // Please implement
  }

  static class Student {
    private final int age;
    private final String name;

    public Student(int age, String name) {
      this.age = age;
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public String getName() {
      return name;
    }

    @Override
    public String toString() {
      return "St{age=" + age + ", name='" + name + '\'' + '}';
    }
  }

  public static void main(String[] args) {
    Stream.of(
            new Student(55, "Alex"),
            new Student(4, "Ivan"),
            new Student(8, "Lia"),
            new Student(78, "Linus"),
            new Student(78, "Lisun"),
            new Student(87, "Linus"),
            new Student(24, "Anna"),
            new Student(42, "Anna"),
            new Student(34, "Maya"))
        .map(st -> String.format("%30s hash=[%12d]", st, hashStudent(st)))
        .forEach(System.out::println);
  }
}
