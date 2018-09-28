package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m;
	double[] a = new double[2000];
	double x = 0;
	double sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
	   for (j = 1;j <= m;j++)
	   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Double.parseDouble(tempVar3);
			}
		  x = x + a[j];
	   }
	 for (j = 1;j <= m;j++)
	 {
	 sum = sum + (a[j] - x / m) * (a[j] - x / m);
	 }
	 sum = Math.sqrt(sum / m);
	 System.out.printf("%.5f\n",sum);
	 sum = 0;
	 x = 0;
	for (j = 1;j <= m;j++)
	{
	a[j] = 0;
	}
	}
	}
}

