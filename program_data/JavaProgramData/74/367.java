package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		c = 0;
		for (i = m;i <= n;i++)
		{
			k = Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j != 0)
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (j > k)
			{
				a = i;
				b = 0;

				while (a > 0)
				{
					b = b * 10 + a % 10;
					a = a / 10;
				}
				if (i == b)
				{
					if (c >= 1)
					{
						System.out.print(",");
					}
					System.out.printf("%d",i);
					c++;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
	}

}

