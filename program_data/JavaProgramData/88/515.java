import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		c = new Scanner(System.in).nextLine();
		for (p = c;p <= c + c.length() - 1;++p)
		{
			if (*p >= '0' && *p <= '9' && *(p + 1) >= '0' && *(p + 1) <= '9')
			{
				System.out.print(p);
			}
			if (*p >= '0' && *p <= '9' && (*(p + 1) < '0' || *(p + 1)>'9'))
			{
				System.out.print(p);
				System.out.print("\n");
			}
		}
		return 0;
	}

}
