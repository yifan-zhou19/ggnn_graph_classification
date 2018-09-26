package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int x;
		int m;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (m = 2;m <= n;m++)
			{
				d = Math.sqrt(m);
				for (x = 2;x <= d;x++)
				{
					if (m % x == 0)
					{
						break;
					}
				}
				if (x > d)
				{
					a = i - m;
					e = Math.sqrt(a);
					for (b = 2;b <= e;b++)
					{
						if (a % b == 0)
						{
							break;
						}
					}
					if (b > e)
					{
						System.out.printf("%d=%d+%d\n",i,m,a);
						break;
					}
				}

			}
		}
	}
}

