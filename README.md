### Dubbo与Zookeeper、SpringMVC整合使用
<http://blog.csdn.net/congcong68/article/details/41113239>
1. 在Linux上安装Zookeeper
`zkSever.sh start`
2. 配置dubbo-admin的管理页面
    + 在Linux的tomcat部署，先把dubbo-admin-2.4.1放在tomcat的webapps/ROOT下，然后进行解压：
      `#jar -xvf dubbo-admin-2.4.1.war`
    + 到webapps/ROOT/WEB-INF下，有一个dubbo.properties文件，里面指向Zookeeper ，使用的是Zookeeper 的注册中心
    + 启动tomcat服务，用户名和密码都是：root,并访问服务，显示登陆页面，说明dubbo-admin部署成功
    <pre>
    cat WEB-INF/dubbo.properties
    dubbo.registry.address=zookeeper://127.0.0.1:2181
    dubbo.admin.root.password=root
    dubbo.admin.guest.password=guest
    </pre>
    + SpringMVC与Dubbo的整合，使用的Maven的管理项目



---
+ Spring MVC集成slf4j-logback
<http://blog.csdn.net/sadfishsc/article/details/47160213>
+ Java 调试技能之 dubbo 调试 — telnet:<https://mp.weixin.qq.com/s/fdg5mkUktBPIzVPSTlgP-A>

---
基于dubbo框架下的RPC通讯协议性能测试
<http://www.mamicode.com/info-detail-494195.html>
Dubbo RPC服务框架支持丰富的传输协议、序列化方式等通讯相关的配置和扩展。dubbo执行一次RPC请求的过程大致如下：消费者（Consumer）向注册中心（Registry）执行RPC请求，注册中心分配服务URL并路由到具体服务提供方（Provider），消费者和服务提供方建立网络连接，服务提供方在本地创建连接池对象并提供远程服务，对于长连接类型协议（如dubbo协议）将保持连接，减少握手认证，调用过程中可以避免频繁建立和断开连接导致的性能开销，保持长连接需要有心跳包的发送，所以对于非频繁调用的服务保持连接同样会有消耗。更多关于dubbo详细介绍请参照官方文档（http://alibaba.github.io/dubbo-doc-static/Home-zh.htm）。
　　1、支持常见的传输协议：RMI、Dubbo、Hessain、WebService、Http等，其中Dubbo和RMI协议基于TCP实现，Hessian和WebService基于HTTP实现。
　　2、传输框架：Netty、Mina、以及基于servlet等方式。
　　3、序列化方式：Hessian2、dubbo、JSON（fastjson 实现）、JAVA、SOAP 等。

---

+ <http://shiyanjun.cn/archives/341.html>

+ <https://github.com/alibaba/dubbo> 
+ <http://alibaba.github.io/dubbo-doc-static/Home-zh.htm> 
+ <http://alibaba.github.io/dubbo-doc-static/User+Guide-zh.htm> 
+ <http://alibaba.github.io/dubbo-doc-static/Developer+Guide-zh.htm> 
+ <http://alibaba.github.io/dubbo-doc-static/Administrator+Guide-zh.htm> 
+ <http://alibaba.github.io/dubbo-doc-static/FAQ-zh.htm> 

