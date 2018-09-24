package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a = new int[10001];
		n = m / 2;
		for (i = 2;i <= m;i++)
		{
			   a[i] = 0;
		}
		for (i = 2;i <= n;i++)
		{
		 if (a[i] == 0)
		 {
			for (j = i + i;j <= m;j = j + i)
			{
				a[j] = 1;
			}
		 }
		}
		for (i = 2;i <= n;i++)
		{
			if ((a[i] == 0) && (a[m - i] == 0))
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
		return 0;
	}
}

