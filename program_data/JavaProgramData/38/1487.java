package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  int i;
	  for (i = 0;i < k;i++)
	  {
		  int n;
		  double[] c = new double[100];
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  int j;
		  for (j = 0;j < n;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[j] = Double.parseDouble(tempVar3);
			}
		  }
		  double aver;
		  double sum = 0;
		  for (j = 0;j < n;j++)
		  {
			sum = sum + c[j];
		  }
		  aver = sum / n;
		  double[] x = new double[100];
		  for (j = 0;j < n;j++)
		  {
			x[j] = (c[j] - aver) * (c[j] - aver);
		  }
		  double SUM = 0;
		  double AVER;
		  for (j = 0;j < n;j++)
		  {
			SUM = SUM + x[j];
		  }
		  AVER = SUM / n;
		  double average;
		  average = Math.sqrt(AVER);
		  System.out.printf("%.5f\n",average);
	  }
	}
}

