package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int g;
		  int n;
		  double ans;
		  double j;
		  double temp;
		  double[] a = new double[1000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (g = 0;g < k;g++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  n = Integer.parseInt(tempVar2);
						  }
						  for (i = 0;i < n;i++)
						  {
							  String tempVar3 = ConsoleInput.scanfRead();
							  if (tempVar3 != null)
							  {
								  a[i] = Double.parseDouble(tempVar3);
							  }
						  }
						  j = 0.0;
						  temp = 0.0;
						  for (i = 0;i < n;i++)
						  {
							  j += 1.0 * a[i] / n;
						  }
						  for (i = 0;i < n;i++)
						  {
							  temp += (a[i] - j) * (a[i] - j) * 1.0;
						  }
						  ans = Math.sqrt(temp / n);
						  System.out.printf("%.5lf\n",ans);
		  }

	}

}

