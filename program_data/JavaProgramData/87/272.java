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
	double[] m = new double[100];
	int i = 0;
	int k = 0;

	for (i = 0;i > -1;i++)
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
	if (a[i] == 0)
	{
		break;
	}
	}

	for (k = 0;k < i;k++)
	{
	m[k] = ((d[k] + 12 - a[k] - 1) * 60 * 60) + (e[k] + 60 - 1 - b[k]) * 60 + f[k] + 60 - c[k];

	}

	for (k = 0;k < i;k++)
	{
	   System.out.printf("%.0lf\n",m[k]);
	}

	return 0;
	}


}

