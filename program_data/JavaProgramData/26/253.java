import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		int q = 1;
		a = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{

			if (*p != ' ')
			{
				q = 1;
			}
			if (q == 1)
			{
				System.out.print(p);
			}

			if (*p == ' ')
			{
				q = 0;
			}

		}
		return 0;
	}

}
