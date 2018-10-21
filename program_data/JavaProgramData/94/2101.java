package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[100];
		int[] c = new int[100];
		int k;
		int j;
		int n;
		int i;
		int x;
		int m;
		int o;
		int q;
		int v;
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
		k = 0;
		for (j = 0;j < n;j++)
		{
			if (a[j] % 2 != 0)
			{
				b[k] = a[j];
				k = k + 1;
			}
		}
		for (m = 0;m < k;m++)
		{
			x = 0;
			for (q = 0;q < k;q++)
			{
				if (b[q] < b[m])
				{
				x = x + 1;
				}
			}
			c[x] = b[m];
		}
		System.out.printf("%d",c[0]);
		for (v = 1;v < k;v++)
		{
			System.out.printf(",%d",c[v]);
		}
		return 0;
	}
}

