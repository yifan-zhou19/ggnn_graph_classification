package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int flag = 0;
		int i;
		int j;
		int[][] a = new int[200][200];
		int[][] o =
		{
			{0, 1},
			{0, -1},
			{1, 0},
			{-1, 0}
		};
		int l;
		int ans = 0;
		int min;
		double[] b = new double[1000];
		double t;
		double p;
		double q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= n;t++)
		{
		ans = 0;
		for (i = 0; i <= n - 1; i++)
		{
		 for (j = 0; j <= n - 1; j++)
		 {
		 *(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
		 }
		}
		for (k = 1;k <= n - 1;k++)
		{
		 for (i = 0; i <= n - k; i++)
		 {
		   min = *(a + i);

		 for (j = 1; j <= n - k; j++)
		 {
		 if (*(*(a + i) + j) < min)
		 {
		 min = (*(a + i) + j);
		 }
		 }
		  for (j = 0; j <= n - k; j++)
		  {
		  *(*(a + i) + j) = *(*(a + i) + j) - min;
		  }
		 }

		  for (j = 0; j <= n - k; j++)
		  {
		   min = (a + j);
		 for (i = 1; i <= n - k; i++)
		 {
		 if (*(*(a + i) + j) < min)
		 {
		 min = (*(a + i) + j);
		 }
		 }
		  for (i = 0; i <= n - k; i++)
		  {
		  *(*(a + i) + j) = *(*(a + i) + j) - min;
		  }
		  }
		   ans = ans + *(*(a + 1) + 1);
		   for (i = 1; i <= n - k - 1; i++)
		   {
		   for (j = 0;j <= n - k;j++)
		   {
		   *(*(a + i) + j) = *(*(a + i + 1) + j);
		   }
		   }
		   for (j = 1; j <= n - k - 1; j++)
		   {
		   for (i = 0;i <= n - k;i++)
		   {
			*(*(a + i) + j) = *(*(a + i) + j + 1);
		   }
		   }

		}
		   System.out.print(ans);
		   System.out.print("\n");

		}


	}

}

