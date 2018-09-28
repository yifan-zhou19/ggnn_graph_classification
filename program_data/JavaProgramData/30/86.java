package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int sum1 = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 7)
		{
			for (i = 1;i <= n;i++)
			{
				sum = sum + i * i;
			}
		}
		if (n >= 7)
		{
			for (i = 7;i <= n;i++)
			{
				sum = sum + i * i;
			}
			for (i = 7;i <= n;i++)
			{
				t = i / 10;
				if (i % 10 == 7 || i % 7 == 0 || t == 7)
				{
					sum1 = sum1 + i * i;
				}
			}
			sum = sum - sum1 + 91;
		}
		System.out.printf("%d",sum);
	}

}

