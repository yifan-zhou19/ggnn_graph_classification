package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int p;
		int m;
		int k;
		int[] a = new int[50000];
		int q = 0;
		int r;
		int j;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (k = 3;k <= n;k++)
		{
			m = Math.sqrt(k) + 1;
			p = 0;
			for (i = 2;i < m;i++)
			{
				if (k % i == 0)
				{
				p = p + 1;
				}
			}
			if (p == 0)
			{
				a[q] = k;
				q = q + 1;

			}
		}
	for (w = 6;w <= n;w = w + 2)
	{

			System.out.printf("%d=",w);
			for (i = 0;i < q;i++)
			{
				r = w - a[i];
				m = Math.sqrt(r) + 1;
				p = 0;
				for (j = 2;j < m;j++)
				{
					if (r % j == 0)
					{
					p = p + 1;
					}
				}
				if (p == 0)
				{
				System.out.printf("%d+%d\n",a[i],r);
				break;
				}
			}

	}

	}
}

