package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n;i++)
		{
				if (i % 7 == 0)
				{
					continue;
				}
				else if (i > 69 && i < 80)
				{
					continue;
				}
				else if ((i - 7) % 10 == 0)
				{
					continue;
				}
				else
				{
			sum += i * i;
				}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

