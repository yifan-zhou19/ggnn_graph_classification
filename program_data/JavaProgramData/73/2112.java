package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int[][] b = new int[6][6];
		int[][] c = new int[6][6];
		int i;
		int j;
		int p = 0;
		for (i = 1;i <= 5;i++)
		{
		  for (j = 1;j <= 5;j++)
		  {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		for (int k = 1;k <= 5;k++)
		{
				for (int l = 1;l <= 5;l++)
				{
						for (int i = 1;i <= 5;i++)
						{
								if (i == l)
								{
									continue;
								}
								if (a[k][l] < a[k][i])
								{
								b[k][l] = b[k][l] + 1;
								}
						}
				}
		}
		for (int l = 1;l <= 5;l++)
		{
				for (int k = 1;k <= 5;k++)
				{
						for (int i = 1;i <= 5;i++)
						{
								if (i == k)
								{
									continue;
								}
								if (a[k][l] > a[i][l])
								{
								c[k][l] = c[k][l] + 1;
								}
						}
				}
		}
		 for (int i = 1;i <= 5;i++)
		 {
			   for (j = 1;j <= 5;j++)
			   {

						if (b[i][j] + c[i][j] == 0)
						{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print(" ");
						System.out.print(a[i][j]);
						System.out.print("\n");
						p = 1;
						}
			   }
		 }
			   if (p == 0)
			   {
			   System.out.print("not found");
			   System.out.print("\n");
			   }
		 return 0;
	}

}

