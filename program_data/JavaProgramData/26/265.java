import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		int flag = 0;
		for (int i = 1 ; i <= length ; i++, p++)
		{
			if (*p != ' ')
			{
				System.out.print(p);
				flag = 0;
			}
			if ((*p == ' ') && (flag == 0))
			{
				System.out.print(p);
				flag = 1;
			}
		}
		return 0;
	}



}
