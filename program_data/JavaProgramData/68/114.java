package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int r = 3;
		int s = 0;
		int q = 0;
		int[] p = new int[100000];
		p[0] = 2;
		for (r = 3;r <= n;r++)
		{
		   for (s = 0;p[s] * p[s] < r;s++)
		   {
				if (r % p[s] == 0)
				{
					break;
				}
		   }
		   if (p[s] * p[s] > r)
		   {
			  p[q + 1] = r;
			  q++;
		   }
		}

		int i;
		int j;
		int k;
		int m;
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 0;p[j] <= i / 2;j++)
			{
				m = i - p[j];
				for (k = 0;p[k] * p[k] < i;k++)
				{
					if (m % p[k] == 0)
					{
						break;
					}
				}
				if (p[k] * p[k] > i)
				{
					System.out.printf("%d=%d+%d\n",i,p[j],m);
					break;
				}
			}
		}
		return 0;
	}

}

