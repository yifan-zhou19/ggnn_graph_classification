import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int i;
		int j;
		int k;
		c = new Scanner(System.in).nextLine();
		k = c.length() - 1;
		for (i = c.length() - 1;i >= 0;--i)
		{
			if (c.charAt(i) == ' ')
			{
				for (j = i + 1;j <= k;++j)
				{
					System.out.print(c.charAt(j));
				}
				k = i - 1;
				System.out.print(" ");
			}
		}
		for (i = 0;i <= k;++i)
		{
			if (c.charAt(i) == ' ')
			{
				break;
			}
			else
			{
				System.out.print(c.charAt(i));
			}
		}


		return 0;
	}

}
