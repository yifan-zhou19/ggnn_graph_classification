package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int k;
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		do
		{
		for (j = 1;j <= n;j++)
		{
			a[j] = j;
		}
			k = 1;
			for (i = 1;i <= n - 1;i++)
			{
				k = k + m - 1;
				while (k > (n - i + 1))
				{
				k = k - n + i - 1;
				}
				if (k == (n - i + 1))
				{
					a[k] = a[k + 1];
				}
				else
				{
				for (h = k;h <= n - i;h++)
				{
				a[h] = a[h + 1];
				}
				}
			}
		System.out.printf("%d\n",a[1]);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		} while (n != 0);
		return 0;
	}
}

