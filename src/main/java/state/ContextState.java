package state;

import lombok.Getter;

/**
 * 上下文管理对象
 *
 * @author ZhaoWeiLong
 * @date 2021/5/18
 */
public class ContextState {

  public static final ConcreateStateA CONCREATE_STATE_A = new ConcreateStateA();

  public static final ConcreateStateB CONCREATE_STATE_B = new ConcreateStateB();

  @Getter private State currentState;

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
    this.currentState.setContextState(this);
  }

  public void handler1() {
    this.currentState.handler1();
  }

  public void handler2() {
    this.currentState.handler2();
  }
}
