package <missing>;

public class GlobalMembers
{
	public static int seven(int x)
	{
		if (x % 7 == 0)
		{
			return 1;
		}
		if (x % 10 == 7)
		{
			return 1;
		}
		if (x - x % 10 == 70)
		{
			return 1;
		}
		return 0;
	}
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
		for (i = 1;i <= n;i++)
		{
			if (seven(i) == 0)
			{
				sum += i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

