package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int m;
		  double[] a = new double[1000];
		  double x;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
				double sum = 0;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				for (j = 0;j < m;j++)
				{
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   a[j] = Double.parseDouble(tempVar3);
				   }
				   sum = sum + a[j];
				}
				x = sum / m;
				sum = 0;
				for (j = 0;j < m;j++)
				{
					 sum = (a[j] - x) * (a[j] - x) + sum;
				}
				sum = Math.sqrt(sum / m);
				System.out.printf("%.5f\n",sum);
		  }
		  System.in.read();
		  System.in.read();
	}

}

