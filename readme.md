#管理系统后台工程

## based on(Spring Boot 项目开发脚手架)

- ms-common： 项目的公共类,包含如Model、Constant、DAO以及自定义Util等
- ms-service： 项目的服务模块，包含主要的Service、过滤类、定时任务等

### 技术选型
- 核心框架：Spring Boot 2.0.0.RELEASE +
- 持久层框架：MyBatis 3.4 + MyBatis-Plus 2.0+
- 缓存框架：Redis 2.9+
- 数据库连接池：Alibaba Druid 1.1.4+
- 日志管理：SLF4J、Log4j2
- 消息队列：Kafka xxx
- 数据库：mysql xxx
- 会话管理：spring redis session
- 定时任务： ntes-cron 1.7.0
- 日志动态调整组件：logMaster 2.0.1
- 日志分析组件：ElasticSearch   LogStash     Kibana

### 重要版本记录
- 2018-04-15
    - 首次提交工程代码
    