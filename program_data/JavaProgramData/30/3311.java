package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			b = i / 10;
			if (i % 7 == 0 || b == 7 || i - 10 * b == 7)
			{
				continue;
			}
			sum += i * i;
		}
		System.out.printf("%d", sum);
		return 0;
	}
}

