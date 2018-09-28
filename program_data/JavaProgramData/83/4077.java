package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		int sum;
		int n;
	double GPA;
	double[] c = new double[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	sum = 0;
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	sum = sum + a[i];
	}
	for (j = 0;j <= n - 1;j++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[j] = Integer.parseInt(tempVar3);
		}
	if (b[j] > 89)
	{
		c[j] = 4.0;
	}
	else if (b[j] > 84)
	{
		c[j] = 3.7;
	}
	else if (b[j] > 81)
	{
		c[j] = 3.3;
	}
	else if (b[j] > 77)
	{
		c[j] = 3.0;
	}
	else if (b[j] > 74)
	{
		c[j] = 2.7;
	}
	else if (b[j] > 71)
	{
		c[j] = 2.3;
	}
	else if (b[j] > 67)
	{
		c[j] = 2.0;
	}
	else if (b[j] > 63)
	{
		c[j] = 1.5;
	}
	else if (b[j] > 59)
	{
		c[j] = 1.0;
	}
	else
	{
		c[j] = 0;
	}
	}
	GPA = 0;
	for (i = 0;i <= n - 1;i++)
	{
	GPA = GPA + c[i] * a[i];
	}


	GPA = GPA / sum;


	System.out.printf("%.2lf",GPA);
	return 0;
	}

}

