package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] >= a[j] != 0 && b[j] > b[i])
				{
					b[i] = b[j];
				}
			}
			b[i]++;
			if (i == 0)
			{
				break;
			}
		}
		k = 0;
		c = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > c)
			{
				k = i;
				c = b[i];
			}
		}
		System.out.printf("%d",b[k]);
	}
}

