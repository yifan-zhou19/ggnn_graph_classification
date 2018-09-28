import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		p = a;

		while (*p != 0)
		{
			if ('A' <= *p && 'Z' >= *p)
			{
				*p += 32;
			}

			p++;
		}

		p = b;

		while (*p != 0)
		{
			if ('A' <= *p && *p <= 'Z')
			{
				*p += 32;
			}

			p++;
		}

		if (strcmp(a, b) == 0)
		{
			System.out.print('=');
			System.out.print("\n");
		}
		else if (strcmp(a, b) < 0)
		{
			System.out.print('<');
			System.out.print("\n");
		}
		else
		{
			System.out.print('>');
			System.out.print("\n");
		}


	}

}
