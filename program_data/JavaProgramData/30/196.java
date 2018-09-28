package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				sum = sum + 0;
			}
			else if (i % 10 == 7)
			{
				sum = sum + 0;
			}
			else if ((i - i % 10) / 10 == 7)
			{
				sum = sum + 0;
			}
			else
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

