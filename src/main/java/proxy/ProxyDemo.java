package proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式： 静态代码 动态代理 CGLIB 代理
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class ProxyDemo {
  public static void main(String[] args) {

    System.out.println("静态代理");
    RealInternet realInternet = new RealInternet();
    // 使用静态代理，需要定义接口，实现接口，定义代理类
    ProxyInternet proxyInternet = new ProxyInternet(realInternet);
    try {
      proxyInternet.connectTO("bilibili.com");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("动态代理");
    // 使用动态代理，定义实现类，实现InvocationHandler
    Internet proxyInstance =
        (Internet)
            Proxy.newProxyInstance(
                realInternet.getClass().getClassLoader(),
                realInternet.getClass().getInterfaces(),
                new InternetHandler(realInternet));
    try {
      proxyInstance.connectTO("baidu.com");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
