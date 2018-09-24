package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[100];
	  int[] b = new int[100];
	  int[] x = new int[20];
	  int[] y = new int[20];
	  int[] z = new int[20];
	  double[] h = new double[100];
	  double q;
	  int i;
	  int j;
	  int k;
	  int n;
	  int t;
	  int p;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= n;i++)
	  {
		   x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  t = 0;
	  for (i = 1;i < n;i++)
	  {
		   for (j = i;j <= n;j++)
		   {
				if (i != j)
				{
						t++;
					  a[t] = i;
					  b[t] = j;
					  h[t] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				}
		   }
	  }
	  for (i = 1;i <= t;i++)
	  {
		   for (j = 1;j < t;j++)
		   {
					if (h[j] < h[j + 1])
					{
						  q = h[j];
					   h[j] = h[j + 1];
					   h[j + 1] = q;
					   p = a[j];
					   a[j] = a[j + 1];
					   a[j + 1] = p;
					   p = b[j];
					   b[j] = b[j + 1];
					   b[j + 1] = p;
					}

		   }
	  }
	  for (i = 1;i <= t;i++)
	  {
			   System.out.print("(");
			   System.out.print(x[a[i]]);
			   System.out.print(",");
			   System.out.print(y[a[i]]);
			   System.out.print(",");
			   System.out.print(z[a[i]]);
			   System.out.print(")-(");
			   System.out.print(x[b[i]]);
			   System.out.print(",");
			   System.out.print(y[b[i]]);
			   System.out.print(",");
			   System.out.print(z[b[i]]);
			   System.out.print(")=");
			 System.out.printf("%.2f",h[i]);
			 System.out.print("\n");
	  }
	  return 0;
	}

}

