package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[] a = new double[n + 1];
		  double[] b = new double[n + 1];
		  double max = 0.0;
		  for (i = 0;i < n;i++)
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
		  for (i = 0;i < n;i++)
		  {
			  for (j = i + 1;j < n;j++)
			  {
				  if ((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) > max)
				  {
				  max = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]);
				  }
			  }
		  }
		  System.out.printf("%.4f\n",Math.sqrt(max));

	}
}

