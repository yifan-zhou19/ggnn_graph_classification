package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] p = new int[1229];
		int i;
		int j;
		int a;
		int x = 0;
		int k;
		int l;
		for (i = 3;i < 10000;i++)
		{
			a = Math.sqrt(i);
			for (j = 2;j <= a + 1;j++)
			{
				if (i % j == 0)
				{
					break;
				}
				if (j == a + 1)
				{
					p[x] = i;
					x = x + 1;
				}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;p[k] <= m / 2;k++)
		{
			for (l = k;p[k] + p[l] <= m;l++)
			{
				if (p[k] + p[l] == m)
				{
					System.out.printf("%d %d\n",p[k],p[l]);
				}
			}
		}
		return 0;
	}
}

