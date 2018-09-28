import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ******************************
	// *** ????.cpp           ***
	// *** ID:1000012895          ***
	// *** ???                 ***
	// *** 2010/12/10             ***
	// ******************************
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		p = str;
		while (*p != '\0')
		{
			if (*p <= '9' && *p >= '0')
			{
				System.out.print(p);
				if (*(p + 1) > '9' || *(p + 1) < '0')
				{
					System.out.print("\n");
				}
			}
			p++;
		}
		return 0;
	}

}
