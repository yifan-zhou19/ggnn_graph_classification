import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[202]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		p = a;
		int l;
		l = a.length();
		int k = 1;
		while (*p != '\0')
		{
			if (k == 1)
			{
				System.out.print(p);
				if (*p == ' ')
				{
				k = 0;
				}
				p++;
			}
			else
			{
				if (*p == ' ')
				{
					p++;
					continue;
				}
				else
				{
					System.out.print(p);
					k = 1;
					p++;
				}
			}
		}

	}
}
