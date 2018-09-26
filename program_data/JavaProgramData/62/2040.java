import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		int flag = 1;
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		for (p = a; * p != '\0'; p++)
		{
			if (flag != 0)
			{
				System.out.print(p);
			}
			if (*p == ' ')
			{
				flag = 0;
			}
			if (*(p + 1) != ' ')
			{
					flag = 1;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
