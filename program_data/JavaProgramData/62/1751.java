import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String c = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		c = new Scanner(System.in).nextLine();
		System.out.print(c.charAt(0));
		for (p = c.Substring(1); * p != '\0'; p++)
		{
			if (*p == ' ' && *(p - 1) == ' ')
			{
				continue;
			}
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}
