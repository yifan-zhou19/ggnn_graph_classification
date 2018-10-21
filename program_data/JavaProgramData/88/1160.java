import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String p = c;
		c = new Scanner(System.in).nextLine();
		for (p = c;p < c + c.length();p++)
		{
			if (*p == '0')
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else if (*p > '0' && *p <= '9')
			{
				System.out.print(Integer.parseInt(p));
				System.out.print("\n");
				while (n == 0)
				{
					if (*(p.Substring(1)) >= '0' && *(p.Substring(1)) <= '9')
					{
						p = p.Substring(1);
					}
					else
					{
						n = 1;
					}
				}
			}
			n = 0;
		}
		return 0;
	}
}
