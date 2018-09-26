package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t = 0;
	double x;
	double[] a = new double[1000];
	double[] b = new double[1000];
	double[][] c = new double[1000][1000];
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
		a[i] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Double.parseDouble(tempVar3);
	}
	}
	x = 0;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
		c[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
	if (x < c[i][j])
	{
	x = c[i][j];
	}
		}
	}



	System.out.printf("%.4f",(float)x);
	System.in.read();
	System.in.read();
	System.in.read();

	}
}

