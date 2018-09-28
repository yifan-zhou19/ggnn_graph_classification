package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k = 0;
	   int l;
	   double[][] B = new double[10][10];
	   double a;
	   double[] C = new double[91];
	   double[][] A = new double[10][3];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		  A[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  A[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  A[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			 B[i][j] = Math.sqrt((A[i][0] - A[j][0]) * (A[i][0] - A[j][0]) + (A[i][1] - A[j][1]) * (A[i][1] - A[j][1]) + (A[i][2] - A[j][2]) * (A[i][2] - A[j][2]));
			 C[k] = B[i][j];
			 k = k + 1;
		  }
	   }
	   for (i = 0;i < n * (n - 1) / 2;i++)
	   {
		  for (j = 0;j < n * (n - 1) / 2 - 1;j++)
		  {
			if (C[j] < C[j + 1])
			{
			  a = C[j];
			  C[j] = C[j + 1];
			  C[j + 1] = a;
			}
		  }
	   }
	   for (i = 0;i < n * (n - 1) / 2;i++)
	   {
		  for (k = 0;k < n - 1;k++)
		  {
			  for (l = k + 1;l < n;l++)
			  {
				 if (B[k][l] == C[i])
				 {
					   System.out.printf("%f", "(");
					   System.out.printf("%f", A[k][0]);
					   System.out.printf("%f", ",");
					   System.out.printf("%f", A[k][1]);
					   System.out.printf("%f", ",");
					   System.out.printf("%f", A[k][2]);
					   System.out.printf("%f", ")");
					   System.out.printf("%f", "-");
					   System.out.printf("%f", "(");
					   System.out.printf("%f", A[l][0]);
					   System.out.printf("%f", ",");
					   System.out.printf("%f", A[l][1]);
					   System.out.printf("%f", ",");
					   System.out.printf("%f", A[l][2]);
					   System.out.printf("%f", ")");
					   System.out.printf("%f", "=");
						  System.out.printf("%.2f", B[k][l]);
						  System.out.printf("%.2f", "\n");
					   B[k][l] = 0;
				 }
			  }
		  }
	   }
	   return 0;
	}
}

