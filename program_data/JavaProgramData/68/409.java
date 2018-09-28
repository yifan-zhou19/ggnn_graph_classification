package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int I;
		int i;
		int n;
		int j;
		int k;
		int s;
		int a;
		int x;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= a;n = n + 2)
		{
			x = 0;
			s = n / 2;
			for (i = 3;i <= s;i = i + 2)
			{
				p = Math.sqrt(i);
				for (j = 2;j <= p;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				I = n - i;
				q = Math.sqrt(I);
				for (k = 2;k <= q;k++)
				{
					if (I % k == 0)
					{
						break;
					}
				}
				if ((j >= p + 1) && (k >= q + 1))
				{
					  System.out.printf("%d=%d+%d\n",n,i,I);
					  break;
				}

			}
		}
	}
}

