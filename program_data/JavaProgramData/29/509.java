package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int j;
	  int t;
	  int o;
	  int p;
	  int e;
	  double[] k = new double[50];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < m;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 t = Integer.parseInt(tempVar2);
		 }
		 o = 2;
		 p = 1;

		 for (j = 0;j < t;j++)
		 {
			 k[i] += 1.0 * o / p;
			 e = p;
			 p = o;
			 o += e;
		 }

	  }
	  for (i = 0;i < m;i++)
	  {
		  if (i == m - 1)
		  {
		  System.out.printf("%.3lf",k[i]);
		  }
		  else
		  {
			  System.out.printf("%.3lf\n",k[i]);
		  }
	  }


	return 0;
	}
}

