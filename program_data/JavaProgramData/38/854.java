package <missing>;

public class GlobalMembers
{
	public static int[] u = new int[100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		double b;
		double c = 0;
		double d = 0;
		double sum = 0;
		double num = 0;
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
				u[i] = Integer.parseInt(tempVar2);
			}
			double[] p = new double[1000];
				for (j = 0;j < u[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[j] = Double.parseDouble(tempVar3);
					}
					sum += p[j];
				}
					num = sum / u[i];
					for (j = 0;j < u[i];j++)
					{
					b = Math.pow(p[j] - num,2);
					c += b / u[i];
					}
					d = Math.sqrt(c);
				System.out.printf("%.5lf\n",d);
				sum = 0;
				num = 0;
				d = 0;
				c = 0;
		}
		return 0;
	}
}

