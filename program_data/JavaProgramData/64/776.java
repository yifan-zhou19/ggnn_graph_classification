package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10][3];
		int i;
		int j;
		int k;
		double[][] b = new double[10][10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
		 for (j = 0;j <= 2;j++)
		 {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		for (i = 0;i <= n - 1;i++)
		{
		 for (j = i + 1;j <= n - 1;j++)
		 {
		  b[i][j] = Math.sqrt(Math.pow((double)(a[i][0] - a[j][0]),2) + Math.pow((double)(a[i][1] - a[j][1]),2) + Math.pow((double)(a[i][2] - a[j][2]),2));
		 }
		}

		 for (k = 1;k <= n * (n - 1) / 2;k++)
		 {
				double r = -1;
				int first;
				int next;
				for (i = 0;i <= n - 1;i++)
				{
					 for (j = i + 1;j <= n - 1;j++)
					 {
					 if (b[i][j] > r)
					 {
					  r = b[i][j];
					  first = i;
					  next = j;
					 }
					 }
				}
			 System.out.print("(");
			 System.out.print(a[first][0]);
			 System.out.print(",");
			 System.out.print(a[first][1]);
			 System.out.print(",");
			 System.out.print(a[first][2]);
			 System.out.print(")-(");
			 System.out.print(a[next][0]);
			 System.out.print(",");
			 System.out.print(a[next][1]);
			 System.out.print(",");
			 System.out.print(a[next][2]);
			 System.out.print(")=");
			 System.out.printf("%.2f", r);
			 System.out.printf("%.2f", "\n");
			b[first][next] = -9999999;
		 }
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 return 0;


	}


}

