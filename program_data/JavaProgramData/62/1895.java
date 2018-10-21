import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String origin = new String(new char[100]);
		String transfer = new String(new char[100]);
		origin = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = origin;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = transfer;
		int n = 0;
		for (int i = 0; i < origin.length(); i++)
		{
			if (*p == ' ' && *(p - 1) == ' ')
			{
				p++;
			}
			else
			{
				*q = p;
				n++;
				q++;
				p++;
			}
		}
		q = transfer;
		for (int i = 1; i <= n; i++)
		{
			System.out.print(q);
			q++;
		}
		System.out.print("\n");
		return 0;
	}
}
