package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 0;
		for (i = 1;i <= n;i++)
		{
			a = 0;
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					k = Integer.parseInt(tempVar2);
				}
				if (j < n)
				{
					scanf(" ");
				}
				if (k == 0)
				{
					a = a + 1;
				}
			}
			if (a > 2)
			{
			b = a;
			}
			if (a >= 1)
			{
				c = c + 1;
			}
		}
		d = (b - 2) * (c - 2);
		System.out.printf("%d",d);
		return 0;
	}
}

