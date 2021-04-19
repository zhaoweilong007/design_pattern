package decorator;

/**
 *
 * @author ZhaoWeiLong
 * @date 2021/4/19
 */
public abstract class Pancake {

  protected String desc = "普通煎饼";

  public String getDesc() {
    return this.desc;
  }

  public abstract Double cost();
}
