import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;

		int f;

		str = new Scanner(System.in).nextLine();

		p = str;

		q = str;

		for (; * p != '\0' ; p++)
		{
			if (*p == ' ')
			{
				*q = ' ';
				f = 1;
			}
			else
			{
				if (f == 1)
				{
					q++;
					f = 0;
				}

				*(q++) = *p;
			}
		}

		*q = '\0';

		q = str;

		System.out.print(q);
		System.out.print("\n");

		return 0;
	}
}
