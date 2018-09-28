package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[300];
		int t;
		int x;
		int m = 0;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 100)
		{
			for (i = 0;i < n;i = i + 1)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			}
			for (i = 0;i < n;i = i + 1)
			{
				if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
				{
					m = m + 1;
					if (i == n - 1)
					{
						c[j] = m;
					}
				}
				else
				{
					c[j] = m;
					m = 0;
					j = j + 1;
				}

			}
			x = c[0];
			for (t = 0;t < j + 1;t++)
			{
				if (x < c[t])
				{
					x = c[t];
				}
			}
			System.out.printf("%d\n",x);
		}
		return 0;
	}
}

