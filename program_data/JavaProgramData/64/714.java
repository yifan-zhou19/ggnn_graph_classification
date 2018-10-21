package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][3];
		int i;
		int j;
		int n;
		int k;
		int[] c = new int[46];
		int[] d = new int[46];
		int f;
		double[] b = new double[46];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		   a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = 1;
		for (i = 1;i < n;i++)
		{
		 for (j = i + 1;j <= n;j++)
		 {
		b[k] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
		   c[k] = i;
		   d[k] = j;
		   k++;
		 }
		}
	   f = n * (n - 1) / 2;
		  for (i = 1;i < f;i++)
		  {
		  for (j = f - 1;j >= i;j--)
		  {
			if (b[j] < b[j + 1])
			{
			 t = b[j];
			 b[j] = b[j + 1];
			 b[j + 1] = t;
			 t = c[j];
			 c[j] = c[j + 1];
			 c[j + 1] = t;
			 t = d[j];
			 d[j] = d[j + 1];
			 d[j + 1] = t;
			}
		  }
		  }
		 for (i = 1;i < f;i++)
		 {
		 System.out.print('(');
		 System.out.print(a[c[i]][0]);
		 System.out.print(',');
		 System.out.print(a[c[i]][1]);
		 System.out.print(',');
		 System.out.print(a[c[i]][2]);
		 System.out.print(")-(");
		 System.out.print(a[d[i]][0]);
		 System.out.print(',');
		 System.out.print(a[d[i]][1]);
		 System.out.print(',');
		 System.out.print(a[d[i]][2]);
		 System.out.print(")=");
		 System.out.printf("%.2f", b[i]);
		 System.out.printf("%.2f", "\n");
		 }
		 System.out.printf("%.2f", '(');
		 System.out.printf("%.2f", a[c[f]][0]);
		 System.out.printf("%.2f", ',');
		 System.out.printf("%.2f", a[c[f]][1]);
		 System.out.printf("%.2f", ',');
		 System.out.printf("%.2f", a[c[f]][2]);
		 System.out.printf("%.2f", ")-(");
		 System.out.printf("%.2f", a[d[f]][0]);
		 System.out.printf("%.2f", ',');
		 System.out.printf("%.2f", a[d[f]][1]);
		 System.out.printf("%.2f", ',');
		 System.out.printf("%.2f", a[d[f]][2]);
		 System.out.printf("%.2f", ")=");
		 System.out.printf("%.2f", b[f]);
	return 0;
	}

}

