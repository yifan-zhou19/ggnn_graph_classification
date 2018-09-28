package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] j = new int[500];
		int i;
		int n;
		int m = 0;
		int y;
		int h;
		int q = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(a[i]) = Integer.parseInt(tempVar2);
				}
			}

			for (i = 0;i < n;i++)
			{
				if (a[i] % 2 == 1)
				{
					q = q + 1;
					j[m] = a[i];
				m++;
				}
				else
				{
					continue;
				}
			}
	for (m = 0;m < q - 1;m++)
	{
	y = m;
	for (k = m;k < q;k++)
	{
		if (j[k] < j[y])
		{
			y = k;
		}
	}
	h = j[m];
	j[m] = j[y];
	j[y] = h;
	}
	for (m = 0;m < q - 1;m++)
	{
	System.out.printf("%d,",j[m]);
	}
	System.out.printf("%d",j[q - 1]);
	return 0;
	}
}

