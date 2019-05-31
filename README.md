# pinball
弹球小游戏--后端测试用例

###### 我的运行环境：
1. eclipse oxygen
2. jdk 1.8
3. tomcat 9 （是一个服务器，要单独配置，配置到eclipse中）
4. mysql 5.7

###### 建个数据库pinballdb，表pb_test

```
create database pinballdb;
use pinballdb;
create table pb_test(testId int,testName varchar(16));
```


### 体验项目
1. 本地建一个文件夹，将项目 git clone 到本地后
2. 打开eclipse，将项目导入eclipse
3. 选择File -> Import -> General -> Existing Projects into workspace
4. 为了避免乱码，将项目编码方式改为utf-8
5. 在项目上右键，Properties -> Resources, 在Text file encoding框里，选择Other UTF-8
6. 数据库密码改成你们的
7. java Resources->config->db.properties 里面的username=你的用户名，password=你的密码
8. 运行项目
9. 项目上右键，run as —— run on server
10. 控制台打印出一堆红色的日志，就代表成功了，就可以插入和查询试试了，然后去数据库看看数据正不正确


---

#### 安装mysql
提供一个简易教程，或者你们可以去网上搜搜
1. [下载地址](https://dev.mysql.com/downloads/mysql/)   （建议下载5.7版本）
2. 或者直接下载跟我一样的  [mysql 5.7](http://pan.dlut.edu.cn/share?id=p7n6a2sfgk4a)
3. 下载之后解压到本地
4. 配置环境变量：将bin目录加入系统环境变量
5. 创建文件夹data；
6. 在mysql压缩目录下创建文件my.ini:加入以下内容
```
[mysql]
default-character-set=utf8
[mysqld]
port = 3306
basedir=D:/...   ...是你的mysql解压路径
datadir=D:/.../data   
character-set-server=utf8
default-storage-engine=INNODB
```
7. 管理员身份运行cmd:依次输入以下命令
```
mysqld -install
mysqld --initialize
net start mysql
```
8. 看到服务成功启动之类的话
9. mysql -uroot -p   然后输入密码，登录就算安装成功了
> ：第一次使用临时密码的登录，临时密码在data文件夹下，.err后缀名的文件中，一般是最后一行

10. 第一次登录之后修改密码：
```
set password for root@localhost=password('你的密码');
```

