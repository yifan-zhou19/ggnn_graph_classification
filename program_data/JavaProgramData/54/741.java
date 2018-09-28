package <missing>;

public class GlobalMembers
{
	/*
	 *fenguozi.cpp
	 *????????????
	 *Created on: 2011-11-11
	 *Author:???
	 */
	public static int Main()
	{
		int a;
		int n;
		int i;
		int b;
		int k;
		int t = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = n + k;
		while (t == 1)
		{ //????
			a = b;
			for (i = 1;i <= n - 1;i++)
			{
				if (a % (n - 1) != 0)
				{
					i = n + 1;
				}
				else
				{
					a = a * n / (n - 1) + k;
				}
			}
			if (i == n)
			{
				System.out.print(a);
				t = 2;
			}
			b = b + n;
		}
		return 0;
	}

}

