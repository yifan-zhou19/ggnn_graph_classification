package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[][] c = new double[100][100];
	double[] a = new double[500];
	double[] b = new double[500];
	double max;
	int i;
	int j;
	int n;
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
		  a[i] = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b[i] = Double.parseDouble(tempVar3);
	  }
	}
	  for (i = 1;i <= n;i++)
	  {
		for (j = i + 1;j <= n;j++)
		{
		  c[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
		}
	  }
	 for (i = 1;i <= n;i++)
	 {
	   for (j = i + 1;j <= n;j++)
	   {
		 if (max < c[i][j])
		 {
		 max = c[i][j];
		 }
	   }
	 }
	  System.out.printf("%.4lf",max);
	}


}

