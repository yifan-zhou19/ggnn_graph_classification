package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int k = 0;
	int w;
	int[] x = new int[10];
	int[] y = new int[10];
	int[] z = new int[10];
	float[] d = new float[45];
	float[][] dis = new float[10][10];
	float p = 0F;
	float q = 0F;
	float m = 0F;
	float o = 0F;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (j = 0;j < n - 1;j++)
	{
	for (i = j + 1;i < n;i++)
	{
	o = (x[j] - x[i]) * (x[j] - x[i]);
	p = (y[j] - y[i]) * (y[j] - y[i]);
	q = (z[j] - z[i]) * (z[j] - z[i]);
	d[k] = Math.sqrt(o + p + q);
	k++;
	}
	}
	for (w = 1;w < n * (n - 1) / 2;w++)
	{
	for (k = 0;k < (n * (n - 1)) / 2 - w;k++)
	{
	if (d[k] > d[k + 1])
	{
	m = d[k + 1];
	d[k + 1] = d[k];
	d[k] = m;
	}
	}
	}
	for (k = n * (n - 1) / 2 - 1;k >= 0;k--)
	{
	if (d[k] != d[k - 1])
	{
	for (j = 0;j < n - 1;j++)
	{
	for (i = j + 1;i < n;i++)
	{
	o = (x[j] - x[i]) * (x[j] - x[i]);
	p = (y[j] - y[i]) * (y[j] - y[i]);
	q = (z[j] - z[i]) * (z[j] - z[i]);
	if (d[k] == Math.sqrt(o + p + q))
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f",x[j],y[j],z[j],x[i],y[i],z[i],d[k]);
	System.out.print("\n");
	}
	}
	}
	}
	}
	return 0;
	}
}

