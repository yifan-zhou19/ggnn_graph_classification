package <missing>;

public class GlobalMembers
{
	/*
	 * huiwenzilie.cpp
	 *
	 *  Created on: 2010-12-19
	 *      Author: lz
	 */

	public static int Main()
	{
		String c = new String(new char[600]);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int p;
		int q;
		int i;
		int j;
		int zilen;
		int len = c.length();
		for (zilen = 2;zilen <= len;zilen++) //???????
		{
			for (i = 0;i <= len - zilen;i++) //???????????
			{
				p = i; //????????
				q = i + zilen - 1; //????????
				while (p < q) //???????
				{
					if (c.charAt(p) == c.charAt(q))
					{
						p++;
						q--;
					}
					else
					{
						break;
					}
				}
				if (p >= q)
				{
					for (j = i;j < i + zilen;j++)
					{
						System.out.print(c.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

