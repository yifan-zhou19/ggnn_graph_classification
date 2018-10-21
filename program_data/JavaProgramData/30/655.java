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
		int x;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			b = (i % 10);
			a = ((i - b) / 10);
			if (b == 0)
			{
				b = 1;
			}
			b = b % 7;
			a = a % 7;
			if (i < 10)
			{
				a = 1;
			}
			c = i % 7;
			if (a * b * c == 0)
			{
				continue;
			}
			sum += i * i;
		}
		System.out.printf("%d\n",sum);
		return 0;
	}

}

