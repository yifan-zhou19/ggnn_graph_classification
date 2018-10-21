package <missing>;

public class GlobalMembers
{
	public static double[] x = new double[1000];
	public static double[] y = new double[1000];
	public static double[][] s = new double[1000][1000];
	public static double[] m = new double[1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x[j] = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   y[j] = Double.parseDouble(tempVar3);
		   }
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 1;i <= n;i++)
			{
				s[j][i] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
			}
		}
		for (j = 1;j <= n;j++)
		{
			 s[j][j] = 0;
			for (i = 1;i <= n;i++)
			{
			   if (s[j][i] > s[j][i - 1])
			   {
				  m[j] = s[j][i];
			   }
				else
				{
					s[j][i] = s[j][i - 1];
					m[j] = s[j][i];
				}
			}
		}
		double d = m[1];
		for (j = 2;j <= n;j++)
		{
			   if (m[j] > m[j - 1])
			   {
				 d = m[j];
			   }
				else
				{
					m[j] = m[j - 1];
					d = m[j];
				}
		}
		  System.out.printf("%.4f\n", d);
		return 0;
	}

}

