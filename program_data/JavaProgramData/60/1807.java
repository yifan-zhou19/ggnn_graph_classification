package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 2;i <= n - 2;i++)
		{
			p = 0;

			for (j = 2;j < i / 2;j++)
			{
				if (i % j == 0)
				{
				p++;
				}
			}
			q = 0;
			for (k = 2;k <= (i / 2) + 1;k++)
			{
				if ((i + 2) % k == 0)
				{
				q++;
				}
			}
			if (p < 1 && q < 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				m++;
			}
		}
		if (m == 0)
		{
		System.out.print("empty\n");
		}

	}
}

