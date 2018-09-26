import java.util.*;

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void num(char * p)
	{
		if (*p == 0)
		{
			return;
		}
		if ((*p >= '0') && (*p <= '9'))
		{
			for (;(*p >= '0') && (*p <= '9') && (*p != 0);p++)
			{
				System.out.print(p);
			}
			System.out.print("\n");
			num(p);
		}
		else
		{
			num(p.Substring(1));
		}
	}
	public static int Main()
	{
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		num(c);
	}
}
