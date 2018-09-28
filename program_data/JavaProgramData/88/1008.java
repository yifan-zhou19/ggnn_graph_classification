import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10000]);

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = a;
		for (p = a;p <= a + a.length();)
		{
			if (*p >= '0' && *p <= '9')
			{
				p++;
			}
			else
			{
				for (;q < p;q++)
				{
					System.out.print(q);
				}
				System.out.print("\n");
				while (p <= a + a.length() && (*p < '0' || *p>'9'))
				{
					p++;
				}
				q = p;
			}
		}
		return 0;
	}

}
