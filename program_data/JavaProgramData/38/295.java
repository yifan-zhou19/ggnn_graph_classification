package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			int m;
			double[] x = new double[100];
			double y1 = 0;
			double y2 = 0;
			double x0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				y1 = y1 + x[j];
			}
			x0 = y1 / m;
			for (int i = 0;i < m;i++)
			{
				y2 = y2 + Math.pow((x[i] - x0),2);
			}
			S = Math.sqrt(y2 / m);
			System.out.printf("%.5f\n",S);
		}
	}
}

