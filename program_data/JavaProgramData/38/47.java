package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int k;
	 int[] n = new int[100];
	 int i;
	 int j;
	 double[][] x = new double[100][100];
	 double sum;
	 double ave;
	 double s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < k;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n[i] = Integer.parseInt(tempVar2);
	  }
	  for (j = 0;j < n[i];j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   x[i][j] = Double.parseDouble(tempVar3);
	   }
	  }
	 }
	 for (i = 0;i < k;i++)
	 {
	  sum = 0;
	  s = 0;
	  for (j = 0;j < n[i];j++)
	  {
	   sum += x[i][j];
	  }
	  ave = sum / n[i];
	  for (j = 0;j < n[i];j++)
	  {
	   s += (x[i][j] - ave) * (x[i][j] - ave);
	  }
	  s = Math.sqrt(s / n[i]);
	  System.out.printf("%.5lf\n",s);
	 }

	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

