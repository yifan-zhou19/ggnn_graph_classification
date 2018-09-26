import java.util.*;

package <missing>;

public class GlobalMembers
{
	// shuchu.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
		String str = new String(new char[101]);

		str = new Scanner(System.in).nextLine();

		int len = str.length();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		String m;

		int i = 0;
		int t = 0;

		for (i = 0;i <= len;i++)
		{
			if (*p == ' ' && *(p + 1) == ' ')
			{
				m = p;

				for (t = i;t < len;t++)
				{
					*p = (p + 1);
					p++;
				}
				len--;
				i--;
				p = m;
				continue;
			}
			p++;
		}

		System.out.print(str);

		return 0;
	}
}
