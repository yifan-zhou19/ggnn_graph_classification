package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int g;
		int k;
		int[] a = new int[50];
		int[] b = new int[50];
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int w;
		int q;
		double[] s = new double[50];
		double e;
		k = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  x[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  y[i] = Integer.parseInt(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  z[i] = Integer.parseInt(tempVar4);
						  }

		}
		for (i = 0;i < n - 1;i++)
		{
			  for (j = i + 1;j < n;j++)
			  {
								k++;
								s[k] = Math.sqrt(Math.pow((x[i] - x[j]),2) + Math.pow((y[i] - y[j]),2) + Math.pow((z[i] - z[j]),2));
								a[k] = i;
								b[k] = j;
			  }

		}

		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			  for (k = 0;k < n * (n - 1) / 2 - i;k++)
			  {
					  if (s[k] < s[k + 1])
					  {
						  e = s[k];
						  s[k] = s[k + 1];
						  s[k + 1] = e;
						  g = a[k];
						  a[k] = a[k + 1];
						  a[k + 1] = g;
						  g = b[k];
						  b[k] = b[k + 1];
						  b[k + 1] = g;
					  }
			  }
		}

		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			q = a[k];
			w = b[k];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[q],y[q],z[q],x[w],y[w],z[w],s[k]);
		}






	return 0;
	}

}

