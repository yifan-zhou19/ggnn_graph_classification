package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int k;
		int n;
		int f;
		int m = 0;
		int o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = n;j <= 100;j++)
		{
			a[j] = 0;
		}

		for (k = 0;k <= 100;k++)
		{
			if (m < a[k])
			{
				m = a[k];
			}
		}
		for (f = 0;f <= 100;f++)
		{
			if ((o < a[f]) && (a[f] != m))
			{
				o = a[f];
			}
		}
		System.out.printf("%d\n%d\n",m,o);
		return 0;
	}

}

