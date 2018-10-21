import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 90.cpp
	 *
	 *  Created on: 2011-12-25
	 *  ???????
	 */

	public static int Main()
	{
		String x = new String(new char[501]);
		x = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j;
		int k;
		int p;
		int begin;
		int end;
		p = x.length();
		for (n = 2;n <= 500;n++)
		{
			for (i = 0,j = n - 1;j < p;i++,j++)
			{
				begin = i;
				end = j;
				while (begin < end)
				{
					if (x.charAt(begin) != x.charAt(end))
					{
						break;
					}
					else
					{
						begin = begin + 1;
						end = end - 1;
					}
				}
				if (begin > end)
				{
					for (k = i;k <= j;k++)
					{
						System.out.print(x.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
