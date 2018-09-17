package <missing>;

public class GlobalMembers
{
	/*
	 * e.cpp
	 * ?????
	 * ????: 2010-12-8
	 * ???????
	 */

	public static int find_factor(int a,int b)
	{
		int i;
		int sum = 0;
		if (a == 1)
		{
			return 1;
		}
		for (i = b;i <= a;i++)
		{
			if (a % i == 0)
			{
				sum = sum + find_factor(a / i, i);
			}
		}
		return sum;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(find_factor(a, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

