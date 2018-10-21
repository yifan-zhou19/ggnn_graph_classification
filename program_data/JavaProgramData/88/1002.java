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
		for (int i = 0;i < str.length();i++)
		{
			if (*p >= 48 && *p <= 57)
			{
				System.out.print(p);
				if (*(p + 1) < 48 || *(p + 1)>57)
				{
					System.out.print("\n");
				}
			}
			p++;
		}
		return 0;
	}
}
