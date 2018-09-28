package <missing>;

public class GlobalMembers
{
	public static double dis(double x1,double y1,double x2,double y2)
	{
		   return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] x = new double[100];
		double[] y = new double[100];
		double ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ans = 0.0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
		  for (j = i + 1;j <= n;j++)
		  {
							  if (dis(x[i], y[i], x[j], y[j]) > ans)
							  {
								  ans = dis(x[i], y[i], x[j], y[j]);
							  }
		  }
		}
		System.out.printf("%.4lf",ans);
		return 0;
	}

}

