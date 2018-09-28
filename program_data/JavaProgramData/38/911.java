package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{


	int i;
	int k;
	int n;
	int j;
	double x;
	double sumx = 0;
	double a;
	double sum = 0;
	double b;
	double d;
	double[] g = new double[100];
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
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Double.parseDouble(tempVar3);
			}
			g[j] = x;
			sumx += x;
			a = sumx / n;
		}
		for (j = 0;j < n;j++)
		{
			sum += (g[j] - a) * (g[j] - a);
		}
		b = sum / n;
		d = Math.sqrt(b);
		System.out.printf("%.5lf\n",d);
		sumx = 0;
		sum = 0;
		b = 0;
		d = 0;
	}
	}
}

