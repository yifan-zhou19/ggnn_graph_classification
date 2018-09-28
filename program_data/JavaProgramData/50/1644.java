package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		int i;
		int j;
		int day = 0;
		int m;
		int jan = 0;
		int first = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w <= 5)
		{
			m = 6 - w;
		}
		else
		{
			m = 13 - w;
		}
		if ((13 - m) % 7 == 0)
		{
			System.out.print("1");
			jan = 1;
		}
		for (i = 1;i < 12;i++)
		{
			day += 14 + month[i - 1];
			if ((day - m - 1) % 7 == 0)
			{
				if (first != 0)
				{
					if (jan != 0)
					{
						System.out.printf("\n%d",i + 1);
						first = 0;
					}
					else
					{
					System.out.printf("%d",i + 1);
					first = 0;
					}
				}
				else
				{
					System.out.printf("\n%d",i + 1);
				}
			}
		}
		return 0;
	}
}

