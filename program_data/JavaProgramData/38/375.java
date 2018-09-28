package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double a;
		double b;
		double c;
		double d;
		double s;
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
			a = 0;
		   for (i = 0;i < n;i++)
		   {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
			   a += x[i];
		   }
			b = a / n;
			c = 0;
		   for (i = 0;i < n;i++)
		   {
			   c += Math.pow(x[i] - b,2);
		   }
			d = c / n;
			s = Math.sqrt(d);
		   System.out.printf("%.5f\n",s);

		}
				   return 0;
	}

}

