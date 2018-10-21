package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int sum = 0;
		int i = 0;
		for (i;i < 100;i++)
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
			if (a[i] == 0)
			{
				break;
			}
			d[i] = d[i] + 12;
		}
		for (i = 0;a[i] != 0;i++)
		{
		while (a[i] != d[i] || b[i] != e[i] || c[i] != f[i])
		{
		if (c[i] == 60)
		{
			c[i] = 0;
			b[i]++;
		}
		else
		{
			c[i]++;
			sum++;
		}
		if (b[i] == 60)
		{
			b[i] = 0;
			a[i]++;
		}
		}
	System.out.printf("%d\n",sum);
	sum = 0;
		}
	return 0;
	}
}

