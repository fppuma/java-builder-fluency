package org.example.builder.yellow;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      Person p = new Person();
      p.name = this.name;
      p.age = this.age;
      return p;
    }
  }
}
