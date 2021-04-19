package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 代理类
 * @author ZhaoWeiLong
 * @date 2021/4/19
 */
public class ProxyInternet implements Internet {

  private List<String> bannedSites =
      new ArrayList<String>() {
        {
          add("bilibili.com");
          add("youtube.com");
          add("weibo.com");
          add("qq.com");
        }
      };

  private Internet internet;

  public ProxyInternet(Internet internet) {
    this.internet = internet;
  }

  @Override
  public void connectTO(String serverHost) throws Exception {

    if (!bannedSites.contains(serverHost)) throw new RuntimeException("host被拦截");

    System.out.println("proxy before....");
    internet.connectTO(serverHost);
    System.out.println("proxy after。。。。");
  }
}
