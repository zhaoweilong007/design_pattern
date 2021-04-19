package prototype;

/**
 * 山羊类
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class Goat implements Cloneable{

  public Goat(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  @Override
  protected Goat clone() throws CloneNotSupportedException {
    return (Goat) super.clone();
  }
}
