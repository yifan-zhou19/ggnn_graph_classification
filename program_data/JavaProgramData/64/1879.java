package <missing>;

public class GlobalMembers
{
	public static double[][] s = new double[10][10];
	public static int[] c = new int[2];
	public static int min(int n)
	{
		int i;
		int j;
	double m = -1;
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	if (s[i][j] > m)
	{
		c[0] = i;
		c[1] = j;
		m = s[i][j];
	}
	}
	}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int ll;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] x = new int[n];
	int[] y = new int[n];
	int[] z = new int[n];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		z[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
		s[i][j] = 1.0 * (x[i] - x[j]) * (x[i] - x[j]) + 1.0 * (y[i] - y[j]) * (y[i] - y[j]) + 1.0 * (z[i] - z[j]) * (z[i] - z[j]);
	s[i][j] = Math.sqrt(s[i][j]);
	}
	}
	for (i = 0;i < (n - 1) * n / 2;i++)
	{
		min(n);
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[c[0]],y[c[0]],z[c[0]],x[c[1]],y[c[1]],z[c[1]],s[c[0]][c[1]]);
	s[c[0]][c[1]] = -1;
	}
	return 0;
	}

}

