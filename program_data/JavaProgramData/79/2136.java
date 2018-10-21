package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] zs = new int[300];
		int[] js = new int[300];
		int i;
		int n;
		int m;
		int j;
		int p;
		int x;
		int y;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		zs[0] = n;
		js[0] = m;
		i = 1;
		while ((n != 0) || (m != 0))
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			zs[i] = n;
			js[i] = m;
			i++;
		}
		for (j = 0;j < i - 1;j++)
		{
			int[] a = new int[300];
			int[] b = new int[300];
			for (k = 0;k < zs[j];k++)
			{
				a[k] = k + 1;
			}
			y = zs[j];
			for (k = 0;k < zs[j] - 1;k++)
			{
				p = js[j] % y;
				for (x = 0;x < y - 1;x++)
				{
					if (x < y - p)
					{
						b[x] = a[p + x];
					}
					else
					{
						b[x] = a[x - y + p];
					}
				}
				for (x = 0;x < y - 1;x++)
				{
					a[x] = b[x];
				}
				y--;
			}
			System.out.printf("%d\n",a[0]);
		}
		return 0;
	}
}

