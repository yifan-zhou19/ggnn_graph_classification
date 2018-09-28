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
	int[] g = new int[100];
	int[] h = new int[100];
	int i;
	int n;
	int[] t = new int[100];
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c[0] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		d[0] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		e[0] = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		f[0] = Integer.parseInt(tempVar6);
	}
	i = 0;
	n = 1;
	while (i >= 0)
	{
		if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
		{
			k = 0;
		}
		else
		{
			k = 1;
		}

		if (k == 1)
		{
			i++;
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		a[i] = Integer.parseInt(tempVar7);
	}
	String tempVar8 = ConsoleInput.scanfRead(" ");
	if (tempVar8 != null)
	{
		b[i] = Integer.parseInt(tempVar8);
	}
	String tempVar9 = ConsoleInput.scanfRead(" ");
	if (tempVar9 != null)
	{
		c[i] = Integer.parseInt(tempVar9);
	}
	String tempVar10 = ConsoleInput.scanfRead(" ");
	if (tempVar10 != null)
	{
		d[i] = Integer.parseInt(tempVar10);
	}
	String tempVar11 = ConsoleInput.scanfRead(" ");
	if (tempVar11 != null)
	{
		e[i] = Integer.parseInt(tempVar11);
	}
	String tempVar12 = ConsoleInput.scanfRead(" ");
	if (tempVar12 != null)
	{
		f[i] = Integer.parseInt(tempVar12);
	}
	n++;
		}
		if (k == 0)
		{
			break;
		}
	}
	for (i = 0;i < n - 1;i++)
	{
	g[i] = 3600 * a[i] + 60 * b[i] + c[i];
	h[i] = 3600 * d[i] + 60 * e[i] + f[i];
	t[i] = h[i] - g[i];
	t[i] = t[i] + 43200;
	System.out.printf("%d\n",t[i]);
	}



	return 0;
	}
}

