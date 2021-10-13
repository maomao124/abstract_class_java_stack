import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Project name(项目名称)：抽象类 java堆栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): run
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/13
 * Time(创建时间)： 10:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class run
{
    private Stack s = new Stack();
    private char str;
    private long startTime;

    public run()
    {
        startTime = System.nanoTime();
        menu();
    }

    public void menu()
    {
        System.out.println("1.进栈\t\t2.出栈\t\t3.显示所有栈元素\t\t4.退出");
        System.out.print("请输入序号：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            str = (char) br.read();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        if (str == '1')
        {
            put_stack();
            this.menu();

        }
        else if (str == '2')
        {
            get_stack();
            this.menu();
        }
        else if (str == '3')
        {
            s.display();
            this.menu();
        }
        else if (str == '4')
        {
            exit_run();
        }
        else
        {
            System.out.println("输入不正确，自动退出！！！");
            exit_run();
        }
    }

    private void put_stack()
    {
        String str1;
        System.out.print("请输入要进栈的字符串：");
        Scanner input = new Scanner(System.in);
        str1 = input.nextLine();
        s.put(str1);
    }

    private void get_stack()
    {
        String str;
        str = s.get();
        if (str == null)
        {
            System.out.println("栈空");
        }
        else
        {
            System.out.print("出栈元素：");
            System.out.println(str);
        }
    }

    private void exit_run()
    {
        System.out.println("感谢使用！");
        System.out.println();

        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
        System.exit(1);
    }
}
