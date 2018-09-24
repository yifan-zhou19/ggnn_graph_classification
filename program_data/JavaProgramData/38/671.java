package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int j;
	int[] m = new int[100];
	double[][] b = new double[100][1000];
	double a = 0;
	double s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m[i] = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < m[i];j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i][j] = Double.parseDouble(tempVar3);
	}
	}
	}
	for (i = 0;i < k;i++)
	{
		a = 0;
		s = 0;
	for (j = 0;j < m[i];j++)
	{
	a += b[i][j];
	}
	a = a / m[i];

	for (j = 0;j < m[i];j++)
	{
	s += (b[i][j] - a) * (b[i][j] - a);
	}
	s = Math.sqrt(s / m[i]);
	System.out.printf("%.5lf\n",s);
	}
	return 0;
	}


}

