package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int sum = 0;
		int m;
		int l;
		int p;
		int q;
		int a = 0;
		int b = 0;
		int[][] sz = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i][k] = Integer.parseInt(tempVar2);
		}
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			for (k = 1;k < n - 1;k++)
			{
				if (sz[i][k] == 0 && a == 0)
				{

					m = i;
					l = k;
					a = 1;
				}
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
			for (k = n - 1;k >= 0;k--)
			{
				if (sz[i][k] == 0 && b == 0)
				{

					p = i;
					q = k;
					b = 1;

				}
			}
		}
		sum = (p - m - 1) * (q - l - 1);
		System.out.printf("%d",sum);

		return 0;
	}
}

