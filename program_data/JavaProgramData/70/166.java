package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int num;
		int i;
		int a;
		int b;
		int na = 1;
		 double[] x = new double[50];
		 double[] y = new double[50];
		 double[] z = new double[400];
		 double dis = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x[i] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  y[i] = Double.parseDouble(tempVar3);
		  }
		}

		for (a = 1;a <= num;a++)
		{
			for (b = a + 1;b <= num;b++)
			{
			  z[na] = (x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]);
			  if (z[na] > dis)
			  {
				  dis = z[na];
			  }
			  na++;
			}
		}
		System.out.printf("%.4lf\n",Math.sqrt(dis));
	}

}

