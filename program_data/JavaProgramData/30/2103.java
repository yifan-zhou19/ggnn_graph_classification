package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int sum;
		sum = 0;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a = i % 10;
			if (i % 7 == 0)
			{
				continue;
			}
			else if (a == 7)
			{
				continue;
			}
			else if (i == 70 + a)
			{
				continue;
			}
			sum = sum + i * i;
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

