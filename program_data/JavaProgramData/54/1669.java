package <missing>;

public class GlobalMembers
{
	/**
	 *@file 1.cpp
	 *@author ???
	 *@date 2013-12-03
	 *@description ?????
	 */

	public static int n;
	public static int k;
	public static int ans = 0;
	public static int i = 0;

	public static int fen(int x)
	{


			if (x == 1)
			{
			  return 1;
			}

			else
			{
				if (ans % (n - 1) == 0)
				{
					ans = ans / (n - 1) * n + k;
					return fen(x - 1);
				}
				else
				{
					return 0;
				}

			}

	}


	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			ans = i * n + k;
			if (fen(n) != 0)
			{
				System.out.print(ans);
				System.out.print("\n");
				break;
			}
			i++;
		}
		return 0;
	}

}

