import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		str = new Scanner(System.in).nextLine();
		a = str.length();
		for (q = b,p = str;p < str.Substring(a);p++,q++)
		{
			if (*p == ' ' && *(p + 1) == ' ')
			{
				*q = 1;
			}
		}
		for (q = b,p = str;p < str.Substring(a);p++,q++)
		{
			if (*q != 1)
			{
				System.out.print(p);
			}
		}

		return 0;
	}



}
