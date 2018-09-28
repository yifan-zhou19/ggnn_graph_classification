package <missing>;

public class GlobalMembers
{
	public static final int maxn = 1005;

	public static int[] tj = new int[maxn];
	public static int[] qw = new int[maxn];

	public static int Main()
	{
		int n;
		int i;
		int res;
		int max1;
		int max2;
		int min1;
		int min2;
		int cnt;
		while (~scanf("%d", n) && n != 0)
		{
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tj[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qw[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(tj, tj + n);
			sort(qw, qw + n);

			res = 0;
			max1 = max2 = n - 1;
			min1 = min2 = 0;
			cnt = 0;
			while ((cnt++) < n)
			{
				if (tj[max1] > qw[max2])
				{
					res += 200;
					max1--;
					max2--;
				}
				else if (tj[max1] < qw[max2])
				{
					res -= 200;
					min1++;
					max2--;
				}
				else
				{
					if (tj[min1] > qw[min2])
					{
						res += 200;
						min1++;
						min2++;
					}
					else
					{
						if (tj[min1] < qw[max2])
						{
							res -= 200;
						}
						min1++;
						max2--;
					}
				}
			}
			System.out.printf("%d\n", res);
		}
		return 0;
	}

}

