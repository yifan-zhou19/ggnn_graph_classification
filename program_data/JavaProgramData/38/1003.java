package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
		double sum;
		double a;
		double s;
		double S;
		double[] sz = new double[100];
		double[] p = sz;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			s = 0;
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
					p + j = tempVar3;
				}
				sum = sum + p[j];
			}
			a = sum / n;
			for (j = 0;j < n;j++)
			{
				s = s + (p[j] - a) * (p[j] - a);
			}
			S = Math.sqrt(s / n);
			System.out.printf("%.5lf\n",S);
		}
	}

}

