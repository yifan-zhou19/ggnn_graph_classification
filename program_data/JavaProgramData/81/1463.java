package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void swap(int data[5][5], int n, int m);

		int[][] data = new int[5][5];
		int n;
		int m;

		int i;
		int j;

		for (i = 0; i <= 4; i++)
		{
			  for (j = 0; j <= 4; j++)
			  {
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						data[i][j] = Integer.parseInt(tempVar);
					}
			  }
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		swap(data, n, m);

			return 0;
	}

	public static void swap(int[][] data, int n, int m)
	{
		 int i;
		 int j;

		 if (n < 0 || n > 4 || m < 0 || m > 4)
		 {
			  System.out.print("error");
		 }
		 else
		 {
			 for (i = 0; i <= 4; i++)
			 {
				   for (j = 0; j <= 4; j++)
				   {
						 if (i == m)
						 {
							  System.out.printf("%d", data[n][j]);
						 }
						 if (i == n)
						 {
							  System.out.printf("%d", data[m][j]);
						 }
						 if (i != m && i != n)
						 {
							  System.out.printf("%d", data[i][j]);
						 }
						 if (j != 4)
						 {
							  System.out.print(" ");
						 }
				   }
				   System.out.print("\n");
			 }
		 }
	}



}

