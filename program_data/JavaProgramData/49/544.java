import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * huiwenxulie.cpp
	 *
	 *  Created on: 2011-12-21
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String p = new String(new char[501]);
		p = new Scanner(System.in).nextLine();
		int n = p.length();
		for (int k = 2;k <= n;k++)
		{
			int i = 0;
		int j;
			for (;i <= n - k;i++)
			{
				j = i + k - 1;
				int c = i;
				int d = j;
				while (i < j)
				{
					if (p.charAt(i) == p.charAt(j))
					{
						i++;
						j--;
					}
					else
					{
						break;
					}
					if (i >= j)
					{
						for (int s = c;s <= d;s++)
						{
							System.out.print(p.charAt(s));
						}
						System.out.print("\n");
					}

				}
				i = c;
			}
		}
		return 0;
	}

}
