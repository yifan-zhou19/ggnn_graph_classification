package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m = 0;
		int[] x = new int[99999];
		int[] y = new int[99999];
		int j;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++,i++)
		{
			for (k = 3;k < i;k++)
			{
				for (j = 2;j <= Math.sqrt(k);j++)
				{
					if (k % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(k))
				{
				   for (h = 2;h <= Math.sqrt(i - k);h++)
				   {
					if ((i - k) % h == 0)
					{
						break;
					}
				   }
				   if (h > Math.sqrt(i - k))
				   {
					   x[m] = k;
					   y[m] = i;
						 m++;
						break;
				   }
				}
			}
		}
		for (j = 0;j < m;j++)
		{
		System.out.printf("%d=%d+%d\n",y[j],x[j],y[j] - x[j]);
		}
		return 0;
	}
}

