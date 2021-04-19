package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理哦
 * @author ZhaoWeiLong
 * @date 2021/4/19
 **/
public class InternetHandler implements InvocationHandler {

  private Object target;

  public InternetHandler(Object obj){
    this.target = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("proxy before ....");
    Object invoke = method.invoke(target, args);
    System.out.println("proxy after .....");
    return invoke;
  }
}
