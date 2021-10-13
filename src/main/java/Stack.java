/**
 * Project name(项目名称)：抽象类 java堆栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): Stack
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 22:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Stack extends Access
{
    private LinkList bottom = new LinkList();
    private LinkList top = bottom;

    @Override
    void put(String s)
    {
        top.next = new LinkList();
        top.next.data = s;
        top.next.back = top;
        top = top.next;
    }

    @Override
    String get()
    {
        if (top != bottom)
        {
            String ch = top.data;
            top.back.next = null;
            top = top.back;
            return ch;
        }
        else
        {
            return null;    //'\0'
        }
    }

    @Override
    void display()
    {
        LinkList p = top;
        System.out.println("----------------栈顶------------------");
        while (p != bottom)
        {
            System.out.println("--->" + p.data);
            p = p.back;
        }
        System.out.println("----------------栈底------------------");
    }
}
