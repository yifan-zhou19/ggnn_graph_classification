package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] x = new int[10];
	int[] y = new int[10];
	int[] z = new int[10];
	int[] xx1 = new int[50];
	int[] yy1 = new int[50];
	int[] zz1 = new int[50];
	int[] xx2 = new int[50];
	int[] yy2 = new int[50];
	int[] zz2 = new int[50];
	int i;
	int t;
	int k = 0;
	int e;
	double[][] j = new double[10][10];
	double[] jj = new double[50];
	double f;
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
		x[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		z[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (t = 0;t < n;t++)
	{
	j[i][t] = Math.sqrt((x[i] - x[t]) * (x[i] - x[t]) + (y[i] - y[t]) * (y[i] - y[t]) + (z[i] - z[t]) * (z[i] - z[t]));
	}
	}
	for (i = 0;i < n;i++)
	{
	for (t = i + 1;t < n;t++)
	{
	jj[k] = j[i][t];
	xx1[k] = x[i];
	xx2[k] = x[t];
	yy1[k] = y[i];
	yy2[k] = y[t];
	zz1[k] = z[i];
	zz2[k] = z[t];
	k++;
	}
	}
	for (i = 1;i <= k + 1;i++)
	{
	for (t = 0;t < k - 1;t++)
	{
	if (jj[t] < jj[t + 1])
	{
	f = jj[t + 1];
	jj[t + 1] = jj[t];
	jj[t] = f;
	e = xx1[t + 1];
	xx1[t + 1] = xx1[t];
	xx1[t] = e;
	e = yy1[t + 1];
	yy1[t + 1] = yy1[t];
	yy1[t] = e;
	e = zz1[t + 1];
	zz1[t + 1] = zz1[t];
	zz1[t] = e;
	e = xx2[t + 1];
	xx2[t + 1] = xx2[t];
	xx2[t] = e;
	e = yy2[t + 1];
	yy2[t + 1] = yy2[t];
	yy2[t] = e;
	e = zz2[t + 1];
	zz2[t + 1] = zz2[t];
	zz2[t] = e;
	}
	}
	}
	for (i = 0;i < k;i++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",xx1[i],yy1[i],zz1[i],xx2[i],yy2[i],zz2[i],jj[i]);
	}
	return 0;
	}
}

