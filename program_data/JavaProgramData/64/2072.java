package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   int r;
	   int c;
	   float[][] a = new float[10][3];
	   float[][] b = new float[11][11];
	   float sum;
	   float max;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		 for (j = 0;j < 3;j++)
		 {
			 a[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		 }
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		   for (k = i + 1;k < n;k++)
		   {
			sum = 0F;
			for (j = 0;j < 3;j++)
			{
			  sum = sum + (a[i][j] - a[k][j]) * (a[i][j] - a[k][j]);
			}
			b[i][k] = Math.sqrt(sum);
		   }
	   }
	   for (j = 0;j < (n - 1) * n / 2;j++)
	   {
		 max = 0F;
		 for (i = 0;i < n - 1;i++)
		 {
			 for (k = i + 1;k < n;k++)
			 {
				 if (b[i][k] > max)
				 {
					   max = b[i][k];
						   r = i;
				   c = k;
				 }
			 }
		 }
		 b[r][c] = 0F;
		 System.out.print('(');
		 System.out.print(a[r][0]);
		 System.out.print(',');
		 System.out.print(a[r][1]);
		 System.out.print(',');
		 System.out.print(a[r][2]);
		 System.out.print(')');
		 System.out.print('-');
		 System.out.print('(');
		 System.out.print(a[c][0]);
		 System.out.print(',');
		 System.out.print(a[c][1]);
		 System.out.print(',');
		 System.out.print(a[c][2]);
		 System.out.print(')');
		 System.out.print('=');
		 System.out.printf("%.2f\n",max);
	   }
	   return 0;
	}
}

