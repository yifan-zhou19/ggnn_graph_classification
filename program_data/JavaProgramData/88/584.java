import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[35]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		for (p = a;p < (a + a.length());p++)
		{
			if ((48 <= *p) && (*p <= 57))
			{
				System.out.print(p);
			}
		else
		{
			if ((48 <= *(p + 1)) && (*(p + 1) <= 57))
			{
				System.out.print("\n");
			}
		else
		{
			continue;
		}
		}
		}
		return 0;
	}

}
