import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String a = new String(new char[32]);

		a = new Scanner(System.in).nextLine();

		for (p = a; * p != '\0';p++)
		{
			if (*p > 57 || *p < 48)
			{
				System.out.print("\n");
				p++;
				while ((*p > 57 || *p < 48) && *p != '\0')
				{
					p++;
				}
				p--;
			}
			else
			{
				System.out.print(p);
			}
		}

		return 0;
	}

}
