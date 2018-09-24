package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a % 7 == 0)
		{
			return 0;
		}
		else if (a > 10 && a % 10 != 0 && (a % 10) % 7 == 0)
		{
			return 0;
		}
		else if (a >= 70 && a <= 79)
		{
			return 0;
		}
		else
		{
			return 1;
		}
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
			if (f(i) != 0)
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

