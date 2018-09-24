package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: Sun
	 */
	public static int Main()
	{
		int n; //n????b??????k?????
		int i;
		int j;
		int b;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = n + k; //b????
		while (i < n - 1)
		{
			j = b; //??b????????
			for (i = 0;i < n;i++)
			{
				if ((n * j) % (n - 1) != 0)
				{
					break; //????????????
				}
				else
				{
					j = n * j / (n - 1) + k;
				}
			} //????
			if (i == n - 1)
			{ //?????
				System.out.print(j);
				System.out.print("\n");
				break;
			}
			b = b + n; //???????b??n
		}
		return 0;

	}

}

