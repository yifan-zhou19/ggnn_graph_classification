package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h = 0;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int x;
		int y;
		int[] z = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (k = x;k <= y;k++)
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
					n = Math.log10(k) + 1;
					m = 0;
					l = k;
					for (i = 0;i <= n - 1;i++)
					{
						z[i] = l / Math.pow(10,n - 1 - i);
						l = l - z[i] * Math.pow(10,n - 1 - i);
					}
					for (i = 0;i <= n - 1;i++)
					{
						if (z[i] == z[n - 1 - i])
						{
							m++;
						}
					}
						if (m == n)
						{
							if (h != 0)
							{
								System.out.print(",");
							}
							System.out.printf("%d",k);
							h++;
						}
				}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

