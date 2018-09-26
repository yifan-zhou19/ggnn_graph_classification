import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char c;
		str = new Scanner(System.in).nextLine();
		c = str.charAt(0);
		for (p = str; * p != 0; p++)
		{
			if (*(p + 1) != 0)
			{
				*p += *(p + 1);
			}
			else
			{
				*p += c;
			}
		}
		for (p = str; * p != 0; p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}
