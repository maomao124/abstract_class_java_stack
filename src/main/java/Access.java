/**
 * Project name(项目名称)：抽象类 java堆栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): Access
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 22:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public abstract class Access
{
    abstract void put(String s);

    abstract String get();

    abstract void display();
}


class LinkList
{
    String data;
    LinkList back;
    LinkList next;
}