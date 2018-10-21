import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[100]);
		String n = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * w;
		r = w = null;
		x = new Scanner(System.in).nextLine();
		for (r = x; * r != '\0';r++)
		{
			if (*r <= '9' && *r >= '0')
			{
				w = n;
				for (; * r <= '9' && *r >= '0';r++)
				{
					*w = r;
					w++;
				}
				*w = '\0';
				System.out.print(n);
				System.out.print("\n");
			}
		}
		return 0;
	}
}
