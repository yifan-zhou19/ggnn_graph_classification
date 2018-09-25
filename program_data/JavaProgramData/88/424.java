import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m = 0;
		int c;
		String a = new String(new char[40]);
		a = new Scanner(System.in).nextLine();
		c = a.length();
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9' && !(a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9'))
			{
				for (j = m;j <= i - 1;j++)
				{
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
					{
						System.out.print(a.charAt(j));
					}
				}
				System.out.print(a.charAt(j));
				System.out.print("\n");
				m = i + 1;
			}
		}
		return 0;
	}

}
