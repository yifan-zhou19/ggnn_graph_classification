import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		a = new Scanner(System.in).nextLine();
		int n = a.length();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		int i = 1;
		while (i <= n)
		{
			if (*p != ' ')
			{
			System.out.print(p);
			p++;
			i++;
			}
			else
			{
				System.out.print(' ');
				while (*p == ' ')
				{
					p++;
					i++;
				}
			}
		}

		return 0;
	}

}
