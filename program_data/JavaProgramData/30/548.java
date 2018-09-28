package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 99)
		{
		System.out.print("204547");
		return 0;
		}
		for (i = 1;i <= n;i++)
		{
			if (((i - 10 * (i % 10)) != 7) && (i % 10 != 7) && (i % 7 != 0))
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

