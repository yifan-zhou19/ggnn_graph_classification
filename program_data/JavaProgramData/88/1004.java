import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		str = new Scanner(System.in).nextLine();
		int l = str.length();
		for (p = str.charAt(0);p < str.charAt(0) + l;p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
			}
			else if (*(p + 1) >= '0' && *(p + 1) <= '9')
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
