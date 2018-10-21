package <missing>;

public class GlobalMembers
{
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
		  double[] a = new double[n];
		  double[] b = new double[n];
		  double max;
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Double.parseDouble(tempVar3);
		  }
		  }
		  max = Math.sqrt((a[1] - a[0]) * (a[1] - a[0]) + (b[1] - b[0]) * (b[1] - b[0]));
		  for (i = 1;i < n - 1;i++)
		  {
			for (j = i + 1;j < n;j++)
			{
				if (Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i])) > max)
				{
			max = Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]));
				}
			}
		  }
		  System.out.printf("%.4lf\n",max);
	}


}

