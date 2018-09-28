package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	double[] x = new double[100];
	double[] y = new double[100];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i] = Double.parseDouble(tempVar3);
		}
	}
	int j;
	int k;
	j = k = 0;
	double dx;
	double dy;
	double dis;
	double mdis;
	dx = x[0] - x[1];
	dy = y[0] - y[1];
	dis = Math.sqrt(dx * dx + dy * dy);
	mdis = dis;
	do
	{
		dx = x[j] - x[k];
		dy = y[j] - y[k];
		dis = Math.sqrt(dx * dx + dy * dy);
		if (dis > mdis)
		{
			mdis = dis;
		}
		if (k < n - 1)
		{
			k++;
		}
		else if ((k = n - 1) != 0 && (j < n - 1))
		{
				k = 0;
				j++;
		}
		else if ((k = n - 1) != 0 && (j = n - 1) != 0)
		{
			break;
		}
	}while (j < n);
	System.out.printf("%.4f\n",mdis);
	return 0;
	}

}

