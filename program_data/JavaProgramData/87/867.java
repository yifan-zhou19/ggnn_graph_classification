package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50];
		int[] b = new int[50];
		int[] c = new int[50];
		int[] d = new int[50];
		int[] e = new int[50];
		int[] f = new int[50];
		int[] start = new int[50];
		int[] end = new int[50];
		int[] total = new int[50];
		int i;
		int j;
		for (i = 0;i < 50;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e[i] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f[i] = Integer.parseInt(tempVar6);
		}
		}
		for (i = 0;i < 50;i++)
		{
			if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
			{
				break;
			}
		}
		j = i;
		for (i = 0;i < j;i++)
		{
			start[i] = 3600 * a[i] + 60 * b[i] + c[i];
			end[i] = 3600 * (d[i] + 12) + 60 * e[i] + f[i];
			total[i] = end[i] - start[i];
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d\n",total[i]);
		}
		return 0;
	}

}

