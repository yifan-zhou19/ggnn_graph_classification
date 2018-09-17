package <missing>;

public class GlobalMembers
{
	/* ????.cpp
	 *  Created on: 2012-11-21
	 *   Author: ??
	 */
	public static int ans(int a, int i)
	{ //??????
		int sum = 0; //??
		for (int j = i; j <= Math.sqrt(a); j++)
		{ //?i???a??
			if (a % j != 0)
			{
				continue; //??????
			}
			sum++; //??????1
			if (a >= j * j)
			{
				sum += ans(a / j, j); //????????????????????
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n; //???????
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(ans(a, 2) + 1);
			System.out.print("\n");
		}
		return 0;
	}

}

