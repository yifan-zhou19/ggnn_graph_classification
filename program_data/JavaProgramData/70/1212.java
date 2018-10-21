package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int i;
		  int j;
		  double s;
		  double m;
		  double x;
		  double y;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[] a = new double[(n + 1)];
		  double[] b = new double[(n + 1)];
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
		  for (m = 0,i = 1;i <= n - 1;i++)
		  {
			 for (j = i + 1;j <= n;j++)
			 {
				  x = a[j] - a[i];
				  y = b[j] - b[i];
				  s = x * x + y * y;
				  if (s >= m)
				  {
					  m = s;
				  }
			 }
		  }
		  double dis = Math.sqrt(m);
		  System.out.printf("%.4f",dis);
	}
}

