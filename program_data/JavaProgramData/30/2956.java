package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum1 = 0;
		int sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				sum1 += (i * i);
			}
			else
			{
				if ((i % 10) == 7)
				{
					sum1 += (i * i);
				}
				else
				{
					if ((i / 10) == 7)
					{
						sum1 += (i * i);
					}
				}
			}
		}
		for (int i = 1;i <= n;i++)
		{
			sum2 += i * i;
		}
		System.out.printf("%d\n",sum2 - sum1);
		return 0;
	}
}

