package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int m = 0;
		int n = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		double[] a = new double[50];
		double[] c = new double[50];
		double[] d = new double[50];
		double temp;
		char[][] b = new char[50][10];
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
			for (i = 0;i < num;i++)
			{
			if (b[i][0] == 'm')
			{
				c[m] = a[i];
				m++;
			}
			if (b[i][0] == 'f')
			{
				d[n] = a[i];
				n++;
			}
			}
			for (i = 0;i < m;i++)
			{
				for (j = m - 1;j > i;j--)
				{
					if (c[j - 1] > c[j])
					{
						temp = c[j];
					   c[j] = c[j - 1];
					   c[j - 1] = temp;
					}
				}
			}
				for (i = 0;i < n;i++)
				{
				for (j = n - 1;j > i;j--)
				{
					if (d[j - 1] < d[j])
					{
						temp = d[j];
					   d[j] = d[j - 1];
					   d[j - 1] = temp;
					}
				}
				}
			 for (i = 0;i < m;i++)
			 {
				 System.out.printf("%.2lf ",c[i]);
			 }
			  for (i = 0;i < n;i++)
			  {
				  if (i != n - 1)
				  {
				 System.out.printf("%.2lf ",d[i]);
				  }
				  else
				  {
					  System.out.printf("%.2lf",d[i]);
				  }
			  }

		return 0;
	}
}

