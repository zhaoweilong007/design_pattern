package responsibility;

/**
 * 处理器
 * @author ZhaoWeiLong
 * @date 2021/4/19
 */
public abstract class handler {
  handler nextHandler;
  Integer level;

  public handler(Integer level) {
    this.level = level;
  }

  public handler getNextHandler() {
    return nextHandler;
  }

  public void setNextHandler(handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void HandlerRequest(Request request) {
    if (request.getLevel() == level) {
      this.handler(request);
    } else {
      if (nextHandler != null) {
        nextHandler.HandlerRequest(request);
      } else {
        throw new RuntimeException("没有对应的handler处理。。。。");
      }
    }
  }

  public abstract void handler(Request request);
}
