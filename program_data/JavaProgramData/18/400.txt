package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   int n;
	   int num;
	   int[] minx = new int[101];
	   int[] miny = new int[101];
	   int[][] a = new int[101][101];
	   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   final int number = num;
	   while (num > 0)
	   {
		int sum = 0;
	   for (i = 0;i < number;i++)
	   {
	   for (j = 0;j < number;j++)
	   {
	   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   }
	   n = number;
	   while (n > 1)
	   {
	   for (i = 0;i < n;i++)
	   {
			 minx[i] = 1000;
			 miny[i] = 1000;
	   }
		for (i = 0;i < n;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			 if (a[i][j] < minx[i])
			 {
				 minx[i] = a[i][j];
			 }
		 }
		}
		 for (i = 0;i < n;i++)
		 {
		  for (k = 0;k < n;k++)
		  {
		 a[i][k] = a[i][k] - minx[i];
		  }
		 }
		 for (j = 0;j < n;j++)
		 {
			 for (i = 0;i < n;i++)
			 {
			 if (a[i][j] < miny[j])
			 {
				 miny[j] = a[i][j];
			 }
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
		 for (k = 0;k < n;k++)
		 {
		 a[k][i] = a[k][i] - miny[i];
		 }
		 }
		 sum += a[1][1];
		 for (i = 1;i < n - 1;i++)
		 {
		 for (j = 0;j < n;j++)
		 {
		 a[i][j] = a[i + 1][j];
		 }
		 }
		 for (j = 1;j < n - 1;j++)
		 {
		 for (i = 0;i < n - 1;i++)
		 {
		 a[i][j] = a[i][j + 1];
		 }
		 }
		 n--;
	   }
	   System.out.print(sum);
	   System.out.print("\n");
	   num--;
	   }
	   return 0;
	}

}

