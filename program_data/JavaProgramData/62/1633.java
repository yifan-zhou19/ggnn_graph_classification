import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = a;
		for (i = 1;i <= n;i++)
		{
			if ((*p == ' ') && (*(p + 1) == ' '))
			{
				p = p + 1;
				continue;
			}
			System.out.print(p);
			p = p + 1;
		}
		return 0;
	}
}
