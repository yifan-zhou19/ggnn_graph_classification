package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int x = 0;
	int y = 0;
	int z;
	char[][] a = new char[40][10];
	double[] b = new double[40];
	double[] c = new double[40];
	double[] d = new double[40];
	double m;
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
		a[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	z = strcmp(a[i],"female\0");
	if (z == 0)
	{
	c[x] = b[i];
	x++;
	}
	else
	{
	d[y] = b[i];
	y++;
	}
	}
	for (i = y - 1;i > 0;i--)
	{
	for (j = 0;j < i;j++)
	{
	if (d[j] > d[j + 1])
	{
	m = d[j + 1];
	d[j + 1] = d[j];
	d[j] = m;
	}
	}
	}
	for (i = x - 1;i > 0;i--)
	{
	for (j = 0;j < i;j++)
	{
	if (c[j] > c[j + 1])
	{
	m = c[j + 1];
	c[j + 1] = c[j];
	c[j] = m;
	}
	}
	}
	for (i = 0;i < y;i++)
	{
	System.out.printf("%.2lf ",d[i]);
	}
	for (i = x - 1;i > 0;i--)
	{
	System.out.printf("%.2lf ",c[i]);
	}
	System.out.printf("%.2lf",c[0]);
	return 0;
	}



}

