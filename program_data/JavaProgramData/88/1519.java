import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;
		do
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
				p++;
			}
			else
			{
				p++;
				if (*p >= '0' && *p <= '9')
				{
					System.out.print("\n");
				}
			}
		} while (*p != '\0');
		System.out.print("\n");
		return 0;
	}
}
