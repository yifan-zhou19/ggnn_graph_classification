package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int w;
		int x;
		int y;
		int z;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		for (k = 0;k < m - 1;k++)
		{
			for (l = 0;l < m - 1 - k;l++)
			{
				if (a[l] > a[l + 1])
				{
					c = a[l];
					a[l] = a[l + 1];
					a[l + 1] = c;
				}
			}
		}
		for (w = 0;w < n - 1;w++)
		{
			for (x = 0;x < n - 1 - w;x++)
			{
				if (b[x] > b[x + 1])
				{
					d = b[x];
					b[x] = b[x + 1];
					b[x + 1] = d;
				}
			}
		}
		for (y = 0;y < m - 1;y++)
		{
			System.out.printf("%d ",a[y]);
		}
		System.out.printf("%d",a[m - 1]);
		for (z = 0;z < n;z++)
		{
			System.out.printf(" %d",b[z]);
		}
		return 0;
	}








}

