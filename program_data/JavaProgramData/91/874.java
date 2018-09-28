import java.util.*;

package <missing>;

public class GlobalMembers
{
	/* ???: ???????.cpp
	 * ??? 1200012826 ??
	 * ???2012?12?9?
	 */
	public static int Main()
	{
		String a = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		while (*p != '\0')
		{
			if (*(p + 1) == '\0')
			{
				System.out.print((char)(*p + a.charAt(0)));
			}
			else
			{
				System.out.print((char)(*p + *(p + 1)));
			}
			p++;
		}
		return 0;
	}
}
