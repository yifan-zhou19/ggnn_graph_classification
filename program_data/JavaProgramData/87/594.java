package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[99];
		int[] b = new int[99];
		int[] c = new int[99];
		int[] d = new int[99];
		int[] e = new int[99];
		int[] f = new int[99];
		int i;
		int[] z = new int[99];
		for (i = 0;a[i] != 0;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f[i] = Integer.parseInt(tempVar6);
			}
		}
			for (i = 0;a[i] != 0;i++)
			{
				if (f[i] > c[i])
				{
				   e[i] = e[i] - 1;
				   f[i] = f[i] + 60;
				}

				if (b[i] < e[i])
				{
					d[i] = d[i] - 1;
				   e[i] = e[i] + 60;
				}
				d[i] = d[i] + 12;
				d[i] = d[i] - a[i];
				z[i] = d[i] * 3600;
				e[i] = e[i] - b[i];
				z[i] = z[i] + e[i] * 60;
				z[i] = z[i] + f[i] - c[i];

			}
			for (i = 0;a[i] != 0;i++)
			{
				 System.out.printf("%d\n",z[i]);
			}
	return 0;
	}

}

