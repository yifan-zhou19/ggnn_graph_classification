import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String q = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r = null;
		int count;
		str = new Scanner(System.in).nextLine();
		int a = str.length();
		p = str;
		while (*p != '\0')
		{
			count = 0;
			if (*p == ' ')
			{
				for (r = p; * r == ' '; r++)
				{
					count++;
				}
				for (;r < str.Substring(4) * a; r++)
				{
					*(r - count + 1) = *r;
				}
			}
			p++;
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
