package <missing>;

public class GlobalMembers
{
	public static int cal(int[][] matrix, int n)
	{
		 if (n == 1)
		 {
			 return (0);
		 }
		 int i;
		 int j;
		 int min;
		 int s;
		 for (i = 0;i < n;i++)
		 {
			 min = 32767;
			 for (j = 0;j < n;j++)
			 {
				 if (matrix[i][j] < min)
				 {
					 min = matrix[i][j];
				 }
			 }
			 for (j = 0;j < n;j++)
			 {
				 matrix[i][j] = matrix[i][j] - min;
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 min = 32767;
			 for (j = 0;j < n;j++)
			 {
				 if (matrix[j][i] < min)
				 {
					 min = matrix[j][i];
				 }
			 }
			 for (j = 0;j < n;j++)
			 {
				 matrix[j][i] = matrix[j][i] - min;
			 }
		 }
		 s = matrix[1][1];
		 for (i = 1;i < n - 1;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 matrix[i][j] = matrix[i + 1][j];
			 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = 1;j < n - 1;j++)
			 {
				 matrix[i][j] = matrix[i][j + 1];
			 }
		 }

		 return (s + cal(matrix, n - 1));
	}

	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 int[][] a = new int[120][120];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			System.out.printf("%d\n",cal(a, n));
		 }
		 return (0);
	}
}

