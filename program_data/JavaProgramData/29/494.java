package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int a;
	int b;
	int e;
	double s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a = 1;
		b = 2;
		for (int j = 1;j <= n;j++)
		{
			s = s + 1.0 * b / a;
			e = a;
			a = b;
			b = e + a;
		}
		System.out.printf("%.3lf\n",s);
		s = 0;
	}
	return 0;
	}
}

