package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] p = new int[100];
		int q = 0;
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
			b[i] = a[i];
		}
		for (j = 0;j <= n - 1;j++)
		{
			for (k = 0;k <= j - 1;k++)
			{
				if (a[j] == b[k])
				{
					a[j] = -1;
				}
				else
				{
					continue;
				}
			}
			if (a[j] != -1)
			{
				p[q] = j;
				q++;
			}
		}
		for (m = 0;m <= n - 1;m++)
		{
			if (a[m] != -1 && m != p[q - 1])
			{
				System.out.printf("%d,",a[m]);
			}
			if (a[m] != -1 && m == p[q - 1])
			{
				System.out.printf("%d\n",a[m]);
			}
			if (a[m] == -1)
			{
				continue;
			}
		}
	}
}

