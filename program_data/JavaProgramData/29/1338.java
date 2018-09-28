package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] n = new int[1000];
	  int m;
	  int k;
	  int i;
	  int a = 2;
	  int b = 1;
	  int c;
	  double[] sum = new double[1000];
	  double y = 0;
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
			  n[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (i = 0;i < m;i++)
	  {
		  y = 0;
		a = 2,b = 1;
			for (k = 0;k < n[i];k++)
			{
			 y += 1.0 * a / b;
			 c = a;
			 a = a + b;
			 b = c;
			}
		 sum[i] = y;
	  }
	  for (i = 0;i < m;i++)
	  {
		  System.out.printf("%.3lf\n",sum[i]);
	  }
	  return 0;
	}


}

