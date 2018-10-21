package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int x = 0;
		int n;
		int i;
		int j;
		int k;
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
			b[i] = 0;
		}
		for (j = 0;j <= n - 1;j++)
		{
			for (k = 0;k <= n - 1;k++)
			{
				if (a[j] >= a[k])
				{
					x++;
				}
			}
			x--;
			b[x] = a[j];
			x = 0;
		}
		System.out.printf("%d\n%d\n",b[n - 1],b[n - 2]);
	}
}

