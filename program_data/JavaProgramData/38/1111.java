package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[1000];
		double a = 0;
		double b = 0;
		double s;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			a = 0;
			b = 0;
			for (j = 0;j < m;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[j] = Double.parseDouble(tempVar3);
			}
			a += x[j];
			}
			for (j = 0;j < m;j++)
			{
				b += Math.pow((x[j] - a / m),2);
			}
			s = Math.pow((b / m),0.5);
			System.out.printf("%.5lf\n", s);
		}

	}
}

