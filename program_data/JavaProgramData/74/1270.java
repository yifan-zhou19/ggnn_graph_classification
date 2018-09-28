package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int l;
		int p;
		int k;
		int t = 0;
		int[] a = new int[100];
		int sum = 0;
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			int k = (int)Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > k)
			{
				l = i;
				t = 0;
				do
				{
					a[t] = l % 10;
					t++;
					l = l / 10;
				} while (l > 0);
				for (p = 0;p < t / 2;p++)
				{
					if (a[p] != a[t - p - 1])
					{
						break;
					}
				}
				if (p >= t / 2)
				{
					b[sum] = i;
					sum++;
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (k = 0;k < sum - 1;k++)
		{
			System.out.printf("%d,",b[k]);
		}
		System.out.printf("%d",b[sum - 1]);
		}
	}



}

