package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int flag = 1;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100005]);
		for (i = 1; i <= t; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				flag = 1;
				for (k = 0; a.charAt(k) != '\0'; k++)
				{
					if (j == k)
					{
						continue;
					}
					if (a.charAt(j) == a.charAt(k))
					{
						flag = 0;
						break;
					}

				}
				if (flag != 0)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

