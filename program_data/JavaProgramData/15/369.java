package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		int b;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[1000][1000];
		int s;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < (n / 2);i++)
		{
			for (j = 0;j < (n / 2);j++)
			{
				if (a[i][j] == 0)
				{
					m = i;
					b = j;
				break;
				}
			}
			if (a[i][j] == 0)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0 && i > m && j > b)
				{
					p = i;
					q = j;
				}
			}
		}
		s = (p - m + 1) * (q - b + 1) - (2 * (p + q - m - b));
		System.out.printf("%d\n", s);
	}
}

