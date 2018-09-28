package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else if ((i - 7) % 10 == 0)
			{
				continue;
			}
			else if (i - 70 > 0 && i - 70 < 10)
			{
				continue;
			}
			else
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d", sum);
		return 0;
	}
}

