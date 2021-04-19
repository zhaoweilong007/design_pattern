package prototype;

/**
 * 原型模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class PrototypeDemo {

  public static void main(String[] args) {
    Goat goat = new Goat("喜羊羊");
    try {
      Goat clone = goat.clone();
      clone.setName("沸羊羊");
      System.out.println(goat == clone);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
