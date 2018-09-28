package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double max;
		double[] x = new double[100];
		double[] y = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (p = i + 1;p < n;p++)
			{
				if (i == 0 && p == 1)
				{
					max = Math.sqrt(Math.pow((x[i] - x[p]),2) + Math.pow((y[i] - y[p]),2));
				}
				else if (Math.sqrt(Math.pow((x[i] - x[p]),2) + Math.pow((y[i] - y[p]),2)) > max)
				{
					max = Math.sqrt(Math.pow((x[i] - x[p]),2) + Math.pow((y[i] - y[p]),2));
				}
			}
		}
		System.out.printf("%.4lf",max);
	}


}

