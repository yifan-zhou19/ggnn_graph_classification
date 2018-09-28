package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			if (i % 7 == 0 || (i >= 17 && (i - 7) % 10 == 0) || (i >= 70 && i <= 79))
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

