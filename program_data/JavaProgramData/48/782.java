package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
		 int j;
		 int t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 int[][] a = new int[9][9];

		 int[][] b = new int[9][9];
		 for (i = 0;i < 9;i++)
		 {
			for (j = 0;j < 9;j++)

			{
				   a[i][j] = 0;
				   b[i][j] = 0;
			}
		 }

			   a[4][4] = m;
			   b[4][4] = m;
		 for (t = 0;t < n;t++)
		 {
		 for (i = 0;i < 9;i++)
		 {
			for (j = 0;j < 9;j++)
			{
			a[i][j] = 0;
			}
		 }
		  for (i = 0;i < 9;i++)
		  {
			for (j = 0;j < 9;j++)
			{
							if (b[i][j] != 0)
							{
								  a[i][j] = a[i][j] + 2 * b[i][j];
								a[i + 1][j] = a[i + 1][j] + b[i][j];
								a[i - 1][j] = a[i - 1][j] + b[i][j];
								a[i + 1][j + 1] = a[i + 1][j + 1] + b[i][j];
								a[i - 1][j + 1] = a[i - 1][j + 1] + b[i][j];
								a[i][j + 1] = a[i][j + 1] + b[i][j];
								a[i - 1][j - 1] = a[i - 1][j - 1] + b[i][j];
								a[i][j - 1] = a[i][j - 1] + b[i][j];
								a[i + 1][j - 1] = a[i + 1][j - 1] + b[i][j];
							}
			}
		  }
		   for (i = 0;i < 9;i++)
		   {
			for (j = 0;j < 9;j++)
			{
			b[i][j] = a[i][j];
			}
		   }
		 }
		  for (i = 0;i < 9;i++)
		  {
			for (j = 0;j < 9;j++)
			{
			if (j == 8)
			{
				 System.out.printf("%d",a[i][j]);
			 System.out.print("\n");
			}
			 else
			 {
			System.out.printf("%d ",a[i][j]);
			 }

			}
		  }

	}

}

