import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ????1.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
		String num = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String m;
		int i = 0;

		num = new Scanner(System.in).nextLine();

		int len = num.length();

		p = num;
		m = num;

		for (i = 0;i < len;i++)
		{
			if ((*p) - '0' >= 0 && (*p) - '0' <= 9)
			{
				System.out.print(p);
			}
			else
			{
				if (*(p - 1) - '0' >= 0 && *(p - 1) - '0' <= 9)
				{
					System.out.print("\n");
				}
			}
			p++;


		}

		return 0;
	}
}
