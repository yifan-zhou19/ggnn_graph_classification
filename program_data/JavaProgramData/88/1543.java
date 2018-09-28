import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		int flag = 0;
		p = a;
		for (p = a; p < a.Substring(length); p++)
		{
			if ((*p - '0') >= 0 && (*p - '0') <= 9)
			{
				System.out.print(p);
				flag = 0;
			}
			else if (flag == 0)
			{

				System.out.print("\n");
				flag = 1;
				continue;

			}
		}
		return 0;
	}

}
