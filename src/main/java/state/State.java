package state;

import lombok.Setter;

/**
 * 定义一个抽象的状态类
 * @author ZhaoWeiLong
 * @date 2021/5/18
 **/
public abstract class State {

  @Setter
  ContextState contextState;

  public abstract void handler1();
  public abstract void handler2();
}
