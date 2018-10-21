package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] p = new int[10][3];
	int[] b = new int[100];
	int[] e = new int[100];
	int i;
	int j;
	int l;
	int x;
	double y;
	double[] d = new double[100];
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
		p[i][0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p[i][1] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		p[i][2] = Integer.parseInt(tempVar4);
	}
	}
	l = 0;
	while (l < n * (n - 1) / 2)
	{
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	d[l] = Math.sqrt(1.0 * ((p[i][0] - p[j][0]) * (p[i][0] - p[j][0]) + (p[i][1] - p[j][1]) * (p[i][1] - p[j][1]) + (p[i][2] - p[j][2]) * (p[i][2] - p[j][2])));
		b[l] = i;
	e[l] = j;
	l++;
	}
	}

	}
	for (i = 0;i < n * (n - 1) / 2 - 1;i++)
	{
	for (l = 0;l < n * (n - 1) / 2 - i;l++)
	{
	if (d[l] < d[l + 1])
	{
	y = d[l];
	d[l] = d[l + 1];
	d[l + 1] = y;
	x = b[l];
	b[l] = b[l + 1];
	b[l + 1] = x;
	x = e[l];
	e[l] = e[l + 1];
	e[l + 1] = x;
	}
	}
	}
	for (l = 0;l < n * (n - 1) / 2;l++)
	{
	i = b[l];
	j = e[l];
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",p[(i)][0],(p[(i)][1]),(p[(i)][2]),(p[(j)][0]),(p[(j)][1]),(p[(j)][2]),d[l]);
	}


	return 0;
	}
}

