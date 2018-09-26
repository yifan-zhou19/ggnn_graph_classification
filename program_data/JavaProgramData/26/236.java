import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ?????? ?? 1000062708
	public static int Main()
	{
		String a = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int f = 0;
		a = new Scanner(System.in).nextLine();
		for (p = a; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				System.out.print(p);
				f = 0;
			}
			else if (f == 0)
			{
				System.out.print(' ');
				f = 1;
			}
		}
		return 0;
	}
}
