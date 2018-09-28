package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else
			{
				a = i % 10;
				b = ((i - a) / 10) % 10;
				c = (i - a - 10 * b) / 100;
				if (a == 7 || b == 7 || c == 7)
				{
					continue;
				}
				else
				{
					sum += i * i;
				}
			}
		}
		System.out.printf("%d\n",sum);

	return 0;
	}
}

