package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int h;
		int k;
		int q;
		int flag = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (h = 0;h < 5;h++)
		{
			int da = a[h][0];
			int n2 = 0;
			 for (k = 0;k < 5;k++)
			 {
				 if (da < a[h][k])
				 {
					 n2 = k;
					 da = a[h][k];
				 }
			 }
				int xiao = a[0][n2];
				int n1 = 0;
			  for (q = 0;q < 5;q++)
			  {
				  if (xiao > a[q][n2])
				  {
					  n1 = q;
					  xiao = a[q][n2];
				  }
			  }

			  if (h - n1 == 0)
			  {
				  System.out.print(n1 + 1);
				  System.out.print(" ");
				  System.out.print(n2 + 1);
				  System.out.print(" ");
				  System.out.print(a[n1][n2]);
				  System.out.print("\n");
				  flag++;
			  }
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
	 return 0;
	}
}

