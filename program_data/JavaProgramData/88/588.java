import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[33]);
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	p = a.charAt(0);
	int flag = 0;
	a = new Scanner(System.in).nextLine();
	while (true)
	{
	if (*p <= '9' && *p >= '0')
	{
	flag = 0;
	System.out.print(p);
	p++;
	}
	else if (flag == 0)
	{
	System.out.print("\n");
	flag = 1;
	p++;
	}
	else
	{
		p++;
	}
	}
	}
}
