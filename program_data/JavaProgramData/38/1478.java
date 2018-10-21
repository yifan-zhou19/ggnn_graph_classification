package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int n;
	  int i;
	  int j;
	  double[] a = new double[100];
	  double sum = 0;
	  double ave;
	  double m;
	  double w;
	  double g;
	  double s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		   sum = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }
		  for (j = 0;j < k;j++)
		  {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[j] = Double.parseDouble(tempVar3);
			 }
			 sum += a[j];
		  }
		   ave = sum / k;
			w = 0;
		 for (j = 0;j < k;j++)
		 {
			m = Math.pow((a[j] - ave),2);
			w += m;
		 }
		  g = w / k;
		  s = Math.sqrt(g);
		  System.out.printf("%.5lf\n",s);

	  }
		return 0;
	}
}

