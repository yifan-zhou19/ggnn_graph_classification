package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int j;
		int n;
		int i;
		double[] x = new double[1000];
		double a = 0;
		double b = 0;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				a = a + x[i];
			}
			a = a / n;
			for (i = 0;i < n;i++)
			{
				b = b + (x[i] - a) * (x[i] - a);
			}
			b = b / n;
			s[j] = Math.sqrt(b);
			a = 0;
			b = 0;
		}
			   for (j = 0;j < k;j++)
			   {
				System.out.printf("%.5lf\n",s[j]);
			   }



	}


}

