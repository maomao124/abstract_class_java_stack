import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Project name(项目名称)：抽象类 java堆栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 22:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Test
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.put("se");
        s.put("5154");
        s.put("458");
        s.display();
        System.out.println(s.get());
        System.out.println(s.get());


        Scanner input = new Scanner(System.in);
        char c = '2';

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            c = (char) br.read();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(c);


    }
}
