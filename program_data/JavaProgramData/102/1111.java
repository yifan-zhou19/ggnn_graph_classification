package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int x = 0;
		int y = 0;
		int k = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		char[][] a = new char[m][10];
		double[] b = new double[m];
		double g;
		double h;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
		   if (a[i][0] == 'm')
		   {
			   k++;
		   }
		   if (a[i][0] == 'f')
		   {
			   n++;
		   }
		}
		double[] c = new double[k];
		double[] d = new double[n];
		for (j = 0;j < k;j++)
		{
		   for (i = x;i < m;i++)
		   {
			  if (a[i][0] == 'm')
			  {
				c[j] = b[i];
				x = i + 1;
				break;
			  }
		   }
		}
		for (j = 0;j < n;j++)
		{
		   for (i = y;i < m;i++)
		   {
			  if (a[i][0] == 'f')
			  {
				d[j] = b[i];
				y = i + 1;
				break;
			  }
		   }
		}
		for (i = 1;i < k;i++)
		{
		   for (j = 0;j < k - i;j++)
		   {
			  if (c[j] > c[j + 1])
			  {
				g = c[j];
				c[j] = c[j + 1];
				c[j + 1] = g;
			  }
		   }
		}
		for (i = 1;i < n;i++)
		{
		   for (j = 0;j < n - i;j++)
		   {
			  if (d[j] < d[j + 1])
			  {
				h = d[j];
				d[j] = d[j + 1];
				d[j + 1] = h;
			  }
		   }
		}
		System.out.printf("%.2lf",c[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(" %.2lf",c[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf(" %.2lf",d[i]);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

