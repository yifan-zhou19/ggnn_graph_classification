package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int sum = 12;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w == 7)
		{
			System.out.print("1\n");
		}
		for (i = 1;i <= 11;i++)
		{
			sum = sum + days[i];
			if (w >= 1 && w <= 5)
			{
				if (sum % 7 == (5 - w))
				{
				System.out.printf("%d\n",i + 1);
				}
			}
			else
			{
				if (sum % 7 == (12 - w))
				{
				System.out.printf("%d\n",i + 1);
				}
			}
		}
		return 0;
	}

}

