import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String ju = new String(new char[100]);
		ju = new Scanner(System.in).nextLine();
		p = ju;
		q = ju;
		while (*p != 0)
		{
			if (*p == ' ')
			{
				if (*(p - 1) == ' ' || *(p - 1) == 0)
				{
					*p = 0;
				}
			}
			p++;
		}
		for (i = 0; i < p - q; i++)
		{
			if (ju.charAt(i) != 0)
			{
				System.out.print(ju.charAt(i));
			}
		}
		return 0;
	}

}
