package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double[] s = new double[100];
		double[] x = new double[100];
		double zh;
		double pfh;
		 for (i = 0;i < 100;i++)
		 {
			s[i] = a[i] = 0;
		 }
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
				m = Integer.parseInt(tempVar2);
			}
			zh = 0;
			pfh = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				zh += x[j];
			}
			a[i] = zh / m;
			for (j = 0;j < m;j++)
			{
				pfh += (x[j] - a[i]) * (x[j] - a[i]);
			}
			s[i] = (double)Math.sqrt(pfh / m);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}







}

