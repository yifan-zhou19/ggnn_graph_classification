package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			a = i;
			for (j = 2;j <= i;j++)
			{
				b = a % j;
				if (b == 0)
				{
					break;
				}
				else
				{
					continue;
				}
			}
			c = i + 2;

			for (k = 2;k <= c;k++)
			{
				b = c % k;
				if (b == 0)
				{
					break;
				}
				else
				{
					continue;
				}
			}

			if (j == a && k == c)
			{
			System.out.printf("%d %d\n",a,c);
			}
		}
			 if (n < 5)
			 {
			System.out.print("empty\n");
			 }

		return 0;
	}
}

