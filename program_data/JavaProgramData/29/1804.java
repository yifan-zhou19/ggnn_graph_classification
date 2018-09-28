package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i = i + 1)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
	double sum = 0;
	double a = 1.0;
	double b = 1.0;
	double c;
	for (j = 1;j <= n;j = j + 1)
	{
		c = a;
		a = a + b;
		b = c;
		sum = sum + a * 1.0 / b;
	}
	System.out.printf("%.3f",sum);
	System.out.print("\n");
	}
	return 0;
	}
}

