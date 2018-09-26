package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = n * (n - 1) / 2;
	double[][] a = new double[n][2];
	double[] dis = new double[m];
	int i;
	int j;
	int k;
	k = 0;
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < 2;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Double.parseDouble(tempVar2);
	}
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	double x1;
	double x2;
	x1 = Math.abs(a[j][0] - a[i][0]);
	x2 = Math.abs(a[j][1] - a[i][1]);
	x1 = Math.pow(x1,2);
	x2 = Math.pow(x2,2);
	dis[k] = Math.sqrt(x1 + x2);
	k++;
	}
	}
	double max;
	max = dis[0];
	for (k = 0;k < m;k++)
	{
	if (dis[k] > max)
	{
	max = dis[k];
	}
	}
	System.out.printf("%.4f",max);
	}




}

