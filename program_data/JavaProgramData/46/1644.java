package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = x;
		if (x > y)
		{
			m = y;
		}
		m = (m + 1) / 2;
		int[][] max = new int[x][y];
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				max[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (n = 0;n < m;n++)
		{
			i = n;
			for (j = n;j < y - n;j++)
			{
				if (k == x * y)
				{
				   break;
				}
				 System.out.print(max[i][j]);
				 System.out.print("\n");
				 k++;
			}
			i = y - n;
			j--;
			for (i = n + 1;i < x - n;i++)
			{
			   if (k == x * y)
			   {
				   break;
			   }
				 System.out.print(max[i][j]);
				 System.out.print("\n");
				 k++;
			}
			i--;
			for (j--;j > n - 1;j--)
			{
				 if (k == x * y)
				 {
				   break;
				 }
				 System.out.print(max[i][j]);
				 System.out.print("\n");
				 k++;
			}
			j++;
			for (i--;i > n;i--)
			{
				 if (k == x * y)
				 {
				   break;
				 }
				 System.out.print(max[i][j]);
				 System.out.print("\n");
				 k++;
			}


		}
		return 0;
	}

}

