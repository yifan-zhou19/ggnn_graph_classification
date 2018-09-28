import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		String q;
		a = new Scanner(System.in).nextLine();
		while (*p != '\0')
		{
			q = p;
			if (*p == ' ' && *(p + 1) == ' ')
			{
				for (; * p != '\0'; p++)
				{
					*p = (p + 1);
				}
				p = q;
			}
			else
			{
				p++;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}
