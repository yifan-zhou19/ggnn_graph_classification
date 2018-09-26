package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int zx;
		int zd;
		int t;
		int k = 1;
		int[] a = new int[asd];
		int[] b = new int[asd];
		int[] z = new int[zxc];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,zx = a[0];i < n;i++)
		{
			if (a[i] < zx)
			{
				zx = a[i];
			}
		}
		for (i = 0,zd = b[0];i < n;i++)
		{
			if (zd < b[i])
			{
				zd = b[i];
			}
		}
		for (i = 0;i <= zd;i++)
		{
			z[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= zd;j++)
			{
				if (j >= a[i] != 0 && j < b[i])
				{
					z[j] = 0;
				}
			}
		}
		z[zd] = 0;

		for (i = zx;i <= zd;i++)
		{
			if (z[i] == 1)
			{
				k = k * 0;
			}
			else
			{
				k = k * 1;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",zx,zd);
		}
		return 0;
	}


}

