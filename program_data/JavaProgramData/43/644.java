package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int t;
		int k;
		int r;
		int n;
		int flag = 1;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		t = 1;
		for (i = 3;i <= m;i = i + 2)
		{
			flag = 1;
			for (j = 3;j <= (int)Math.floor(Math.sqrt((double)i));j++)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				a[t] = i;
				t++;
			}
		}
		n = t - 1;
		for (k = 1;k <= n;k++)
		{
			for (r = k;r <= n;r++)
			{
				if (a[k] + a[r] == m)
				{
					System.out.printf("%d %d\n",a[k],a[r]);
				}
			}
		}

		return 0;
	}
}

