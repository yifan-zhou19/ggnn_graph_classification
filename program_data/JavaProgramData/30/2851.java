package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int n;
		int sum;
		i = 1;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			a = i % 10;
			b = (i % 100 - a) / 10;
			c = (i % 1000 - b * 10 - a) / 100;
			if ((a == 7) || (b == 7) || (c == 7) || (i % 7 == 0))
			{
			   i++;
			   continue;
			}
			sum = sum + i * i;
			i++;
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

