package <missing>;

public class GlobalMembers
{
	/*
	 * YueSeFuProblem.cpp
	 *
	 *  Created on: 2010-11-14
	 *      Author: user
	 */



	public static int Main()
	{
		while (true)
		{
			int n;
			int m;
			int i;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0 && m == 0)
			{
				break;
			}
			int[] f = new int[n + 1];
			for (i = 1; i < n; i++)
			{
				f[i] = i + 1;
			}
			f[n] = 1;

			int t = 1;

			while (true)
			{
				if (m == 1)
				{
					System.out.print(n);
					System.out.print("\n");
					break;
				}
				else
				{
					for (i = 1; i < m - 1; i++)
					{
						t = f[t];
					}
					f[t] = f[f[t]];
					t = f[t];
					if (f[t] == t)
					{
						System.out.print(t);
						System.out.print("\n");
						break;
					}
				}
			}
		}

		return 0;
	}


}

