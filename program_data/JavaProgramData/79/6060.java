package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[300];
		int[] n = new int[300];
		int[] a = new int[300];
		int i = 0;
		int j = 0;
		int k = 0;
		int r = 0;
		int t = 0;
		int q = 0;
		for (k = 0;k < 300;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			if (n[k] == 0)
			{
				k = 300;
			}
			else
			{
				r = r + 1;
			}
		}
		for (k = 0;k < r;k++)
		{
			t = 0;
			q = 0;
			for (i = 1;i <= n[k] + 1;i++)
			{
				a[i] = i;
			}

			for (i = 1;i <= n[k] + 1;i++)
			{
				if (i == n[k] + 1)
				{
					i = 1;
				}
				if (a[i] != 0)
				{
					t = t + 1;
				}
				if (t == m[k])
				{
					a[i] = 0;
					t = 0;
					q = q + 1;
				}
				if (q == n[k] - 1)
				{
					i = n[k] + 2;
					q = 0;
				}
			}
			for (j = 1;j <= n[k];j++)
			{
				if (a[j] != 0)
				{
				   System.out.printf("%d\n",a[j]);
				}
			}
		}
		return 0;
	}
}

