import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 11_3
	 * author  ??
	 * date    2010-12-09
	 * description
	           ???????????
	*/



	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;
		while (*p != '\0')
		{
			while ((*p > '9' || *p < '0') && *p != '\0')
			{
				p++;
			}
			if (*p == '\0')
			{
				break;
			}
			while (*p <= '9' && *p >= '0')
			{
				System.out.print(p);
				p++;
			}
			System.out.print("\n");
		}
		return 0;
	}

}
