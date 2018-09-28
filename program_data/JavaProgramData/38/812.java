package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[100];
	double[][] b = new double[100][2000];
	double[] s = new double[100];
	double[] p = new double[100];
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
		a[i] = Integer.parseInt(tempVar2);
	}
	s[i] = 0;
	for (j = 0;j < a[i];j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i][j] = Double.parseDouble(tempVar3);
	}
	s[i] += b[i][j];
	}
	s[i] = s[i] / a[i];
	}
	for (i = 0;i < n;i++)
	{
	p[i] = 0;
	for (j = 0;j < a[i];j++)
	{
	p[i] += (b[i][j] - s[i]) * (b[i][j] - s[i]);
	}
	p[i] = Math.sqrt(p[i] / a[i]);
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%.5lf\n",p[i]);
	}
	return 0;
	}
}

