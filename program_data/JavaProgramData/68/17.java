package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		int m;
		int h;
		int p;
		int f;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j < i - 1;j++)
			{
				m = 0;
				f = Math.sqrt(j);
				for (k = 2;k <= f;k++)
				{
					if (j % k == 0)
					{
						m += 1;
					}
				}
				if (m == 0)
				{
					a = j;
				}
				h = 0;
				u = Math.sqrt(i - a);
				 for (p = 2;p <= u;p++)
				 {
					if ((i - a) % p == 0)
					{
						h += 1;
					}
				 }
				if (h == 0)
				{
					b = i - a;
					System.out.printf("%d=%d+%d\n",i,a,b);
					break;
				}
			}
		}
		return 0;
	}
}

