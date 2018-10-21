package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (j = 0;j < m;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	double a = 1;
	double b = 2;
	double s = 0;
	for (i = 0;i < n;i++)
	{
	  s += b / a;
	  b = a + b;
	  a = b - a;
	}
	System.out.printf("%.3lf\n",s);
	}
	return 0;
	}

}

