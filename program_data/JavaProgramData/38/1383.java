package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	int j;
	double[] s = new double[100];
	int num;
	double A = 0;
	double a;
	double[] b = new double[1000];
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
			num = Integer.parseInt(tempVar2);
		}
		A = 0;
		for (j = 0;j < num;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[j] = Double.parseDouble(tempVar3);
		}
		A += b[j];
		}
		a = A / num;
		s[i] = 0;
		for (j = 0;j < num;j++)
		{
		s[i] += (b[j] - a) * (b[j] - a);
		}
		s[i] = (s[i] / num);
		s[i] = Math.sqrt(s[i]);

	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%.5lf\n",s[i]);
	}
		return 0;

	}
}

