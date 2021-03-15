package demo;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 代理模式： 静态代码 动态代理 CGLIB 代理
 *
 * @author ZhaoWeiLong
 * @date 2021/1/8
 */
public class ProxyDemo {

  private List<String> bannedSites =
      new ArrayList<String>() {
        {
          add("bilibili.com");
          add("youtube.com");
          add("weibo.com");
          add("qq.com");
        }
      };
  // 静态代理开始

  // 定义接口
  public interface Internet {
    void connectTO(String serverHost) throws Exception;
  }

  // 定义实现类
  public class RealInternet implements Internet {

    @Override
    public void connectTO(String serverHost) throws Exception {
      System.out.println("connect To :" + serverHost);
    }
  }

  // 代理类
  public class ProxyInternet implements Internet {
    Internet internet;

    public ProxyInternet(Internet internet) {
      this.internet = internet;
    }

    @Override
    public void connectTO(String serverHost) throws Exception {
      // 调价限制功能
      if (bannedSites.contains(serverHost.toLowerCase())) {
        throw new Exception("access denied：" + serverHost);
      }
      System.out.println("before execute。。。");
      internet.connectTO(serverHost);
      System.out.println("after execute。。。");
    }
  }

  {
    System.out.println("动态代理");
    // 使用静态代理
    ProxyInternet proxyInternet = new ProxyInternet(new RealInternet());
    try {
      proxyInternet.connectTO("baidu.com");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("静态代理");
    // 使用动态代理
    ProxyFactory factory = new ProxyFactory(new RealInternet());
    Internet proxyInstance = (Internet) factory.getProxyInstance();
    try {
      proxyInstance.connectTO("baidu.com");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public class ProxyFactory {
    public ProxyFactory(Object target) {
      this.target = target;
    }

    private Object target;

    public Object getProxyInstance() {
      return Proxy.newProxyInstance(
          target.getClass().getClassLoader(),
          target.getClass().getInterfaces(),
          (proxy, method, args) -> {
            if (bannedSites.contains(args[0].toString().toLowerCase())) {
              throw new Exception("access denied：" + args[0]);
            }
            return method.invoke(target, args);
          });
    }
  }

  public static void main(String[] args) {
    new ProxyDemo();
  }
}
