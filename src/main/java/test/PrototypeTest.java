package test;

import lombok.Data;

/**
 * 原型模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class PrototypeTest {

  public static void main(String[] args) {
    PrototypeTest prototypeTest = new PrototypeTest();
  }

  {
    Goat goat = new Goat("喜羊羊");
    try {
      Goat clone = goat.clone();
      clone.setName("沸羊羊");
      System.out.println(goat == clone);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }

  @Data
  public class Goat implements Cloneable {

    public Goat() {
      System.out.println("执行构造函数");
    }

    public Goat(String name) {
      this.name = name;
      System.out.println("执行有参构造函数");
    }

    private String name;

    @Override
    protected Goat clone() throws CloneNotSupportedException {
      return (Goat) super.clone();
    }
  }
}
