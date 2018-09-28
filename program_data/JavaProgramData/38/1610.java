package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		double[] x = new double[1000];
		double[] b = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double sum = 0.0000000000;
		double ave;
		double p = 0.0000000000000;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = (int)(s);
			s = 0;
			sum = 0.0000000;
					  ave = 0.00000;
					  r = 0.00000;
					  p = 0.000000;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < s;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			ave = sum / (double)(s);
			for (j = 0;j < s;j++)
			{
				p = p + (double)(Math.pow(Math.abs((x[j] - ave)),2.00));
			}
			r = p / (double)(s);
			b[i] = (double)(Math.sqrt(r));
			for (j = 0;j < s;j++)
			{
				x[j] = 0.0000;
			}




		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",b[i]);
		}
		return 0;
	}

}

