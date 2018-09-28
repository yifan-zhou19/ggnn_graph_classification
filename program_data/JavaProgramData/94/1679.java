package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int v;
		int t;
		int[] a = new int[500];
		int[] b = new int[500];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				j = j + 1;
			}
			else
			{
				continue;
			}
		}
		for (v = 0;v < j;v++)
		{
			for (k = v + 1;k < j;k++)
			{
				if (b[v] > b[k])
				{
					t = b[v];
					b[v] = b[k];
					b[k] = t;
				}
			}
		}
		for (v = 0;v < j;v++)
		{
			System.out.printf("%d",b[v]);
			if (v < j - 1)
			{
				System.out.print(",");
			}
		}
		return 0;
	}
}

