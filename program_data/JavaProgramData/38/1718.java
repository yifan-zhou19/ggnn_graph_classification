package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int[] n = new int[100];
		double[] x = new double[1000];
		double a = 0;
		double h = 0;
		double s = 0;
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
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				a += x[j];
			}
			a = a / (n[i] * 1.0);
			for (j = 0;j < n[i];j++)
			{
				h += (x[j] - a) * (x[j] - a);
			}
			h = h / (n[i] * 1.0);
			s = Math.sqrt(h);
			System.out.printf("%.5f\n",s);
			a = 0,h = 0,s = 0;
		}
	}
}

