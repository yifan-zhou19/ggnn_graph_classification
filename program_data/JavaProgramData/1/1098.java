package <missing>;

public class GlobalMembers
{
	/*
	 *???: ????.cpp
	 *??????
	 *????: 2012-11-12
	 *??: ????????????
	 */


	public static int count(int num, int m)
	{
	//???????????????????a1????????????
		if (num % m != 0)
		{
			return 0;
		}

		if (num == m)
		{
			return 1;
		}
		else
		{
			int counter = 0;
			for (int i = m; i <= num / m; i++)
			{
					counter += count(num / m, i);
			}
			return counter;
		}
	}

	public static int Main()
	{
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			int counter = 0;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 2; i <= num; i++)
			{
				counter += count(num, i); //a1???2???m???
			}
			System.out.print(counter);
			System.out.print("\n");
		}
		return 0;
	}
}

