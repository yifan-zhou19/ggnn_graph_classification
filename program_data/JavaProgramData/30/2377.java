package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int sum3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			sum2 = sum2 + i * i;
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
			{
				sum1 = sum1 + i * i;
			}
		}

		sum3 = sum2 - sum1;
		System.out.printf("%d\n",sum3);
		return 0;
	}

}

