import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[100]);
		char flag = 0;
		a = new Scanner(System.in).nextLine();
		p = a;
		int l;
		l = a.length();
		for (p = a;p < a.Substring(l);p++)
		{
			if (*p == ' ' && flag == 0)
			{
				System.out.print(p);
			}
			if (*p != ' ')
			{
				System.out.print(p);
				flag = 0;
			}
			else
			{
				flag++;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
