package <missing>;

public class GlobalMembers
{
	public static int Day(int m)
	{
		int sum = 0;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < m - 1; i++)
		{
			sum += month[i];
		}
		return sum + 12;
	}
		/*******************************************
		* ?????
		* ???????????13???1?1????
		*******************************************/
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= 12; i++)
		{
			if ((Day(i) + w) % 7 == 5)
			{
				System.out.printf("%d\n", i);
			}
		}

		return 0;
	}
}

