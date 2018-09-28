package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int i;
	  int j;
	  int n;
	  double[] x = new double[100000];
	  double sum = 0;
	  double aver = 0;
	  double SUM = 0;
	  double AVER = 0;
	  double S = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= k;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 for (j = 0;j < n;j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   x + j = tempVar3;
		   }
		   sum += x[j];
		 }
		 aver = sum / n;
		 for (j = 0;j < n;j++)
		 {
		   SUM += (x[j] - aver) * (x[j] - aver);
		 }
		 AVER = SUM / n;
		 S = Math.sqrt(AVER);
		 System.out.printf("%.5lf\n",S);

		 sum = 0;
		 SUM = 0;

	  }
	  return 0;
	}

}

