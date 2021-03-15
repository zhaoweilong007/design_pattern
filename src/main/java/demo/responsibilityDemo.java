package demo;


/**
 * 责任链模式
 *
 * @author ZhaoWeiLong
 * @date 2021/1/11
 */
public class responsibilityDemo {

  abstract class Handler {
    private Handler nextHandler;
    private int level;

    public Handler(int level) {
      this.level = level;
    }

    public void setNextHandler(Handler handler) {
      this.nextHandler = handler;
    }

    public final void handlerRequest(Request request) {

      if (level == request.level) {
        this.response(request);
      } else {
        if (this.nextHandler != null) {
          this.nextHandler.handlerRequest(request);
        } else {
          System.out.println("===找不到对应的处理器==");
        }
      }
    }

    public abstract void response(Request request);
  }

  public class Request {

    int level;

    public Request(int level) {
      this.level = level;
    }

    public int getLevel() {
      return level;
    }
  }

  class ConCreateHandler1 extends Handler {

    public ConCreateHandler1(int level) {
      super(level);
    }

    @Override
    public void response(Request request) {
      System.out.println("请求交由处理器1执行");
    }
  }

  class ConCreateHandler2 extends Handler {

    public ConCreateHandler2(int level) {
      super(level);
    }

    @Override
    public void response(Request request) {
      System.out.println("请求交由处理器2执行");
    }
  }

  class ConCreateHandler3 extends Handler {

    public ConCreateHandler3(int level) {
      super(level);
    }

    @Override
    public void response(Request request) {
      System.out.println("请求交由处理器3执行");
    }
  }

  {
    ConCreateHandler1 handler1 = new ConCreateHandler1(1);
    ConCreateHandler2 handler2 = new ConCreateHandler2(2);
    ConCreateHandler3 handler3 = new ConCreateHandler3(3);

    handler1.setNextHandler(handler2);
    handler2.setNextHandler(handler3);

    handler1.handlerRequest(new Request(3));

    // 责任链模式其实就是一个灵活版的
    // if…else…语句，它就是将这些判定条件的语句放到了各个处理类中，这样做的优点是比较灵活了，
    // 但同样也带来了风险，比如设置处理类前后关系时，一定要特别仔细，
    // 搞对处理类前后逻辑的条件判断关系，并且注意不要在链中出现循环引用的问题
  }

  public static void main(String[] args) {
    new responsibilityDemo();
  }
}
