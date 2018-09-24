package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			c = i % 10;
			d = i / 10;
			if (i % 7 == 0)
			{
				continue;
			}
			if (d == 7)
			{
				continue;
			}
			if (c == 7)
			{
				continue;
			}
			sum += i * i;
		}
			System.out.printf("%d",sum);
		return 0;
	}
}

