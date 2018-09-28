package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] x = new double[100];
		double s;
		double a;
		double y1;
		double y2;
		double y;
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			s = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				s = s + x[j];
			}
			a = s / n;
			y1 = 0;
			for (j = 0;j < n;j++)
			{
				y1 = y1 + (x[j] - a) * (x[j] - a);
			}
			y2 = y1 / n;
			y = Math.sqrt(y2);
			System.out.printf("%.5f\n",y);
		}
	}
}

