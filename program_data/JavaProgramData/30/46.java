package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int sum = 0;
		int j = 1;
		for (j = 1;j <= n;j++)
		{
			if (j % 7 == 0)
			{
				continue;
			}
			if (j % 10 == 7 || (int)j / 10 == 7)
			{
				continue;
			}
			sum += j * j;
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

