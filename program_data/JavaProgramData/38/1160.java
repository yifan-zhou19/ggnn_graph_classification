package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		double[] aa = new double[1000];
		double x;
		double a;
		double y;
		double[] bb = new double[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
		  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  a = 0;
		  for (j = 1;j <= m;j++)
		  {
		   aa[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   a = a + aa[j];
		  }
		   a = a / m;
		   y = 0;
		   for (j = 1;j <= m;j++)
		   {
			 y = y + (aa[j] - a) * (aa[j] - a);
		   }
			 y = y / m;
			 y = Math.sqrt(y);
			bb[i] = y;
		}
			for (i = 1;i <= n;i++)
			{
			 System.out.printf("%.5lf\n", bb[i]);
			}

			return 0;
	}
}

