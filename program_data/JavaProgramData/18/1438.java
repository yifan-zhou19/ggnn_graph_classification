package <missing>;

public class GlobalMembers
{
	public static int sm1(int line, int sum1, int[][] array1)
	{
		int min = array1[line][0];
		for (int i = 0;i < sum1;i++)
		{
			if (min > array1[line][i])
			{
				min = array1[line][i];
			}
		}
		return min;
	}
	public static int sm2(int row, int sum2, int[][] array2)
	{
		int min = array2[0][row];
		for (int i = 0;i < sum2;i++)
		{
			if (min > array2[i][row])
			{
				min = array2[i][row];
			}
		}
		return min;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int step = 0;step < n;step++)
		{
			int[][] jz = new int[100][100];
			int he = 0;
			 for (int i = 0;i < n;i++)
			 {
				 for (int j = 0;j < n;j++)
				 {
				   jz[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 }
			 }
			   for (int Count = 0;Count < n - 1;Count++)
			   {
				   for (int i = 0;i < n - Count;i++)
				   {
					   int minl = sm1(i, n - Count, jz);
					  for (int j = 0;j < n - Count;j++)
					  {
					   jz[i][j] -= minl;
					  }
				   }
				  for (int j = 0;j < n - Count;j++)
				  {
					  int minr = sm2(j, n - Count, jz);
					  for (int i = 0;i < n - Count;i++)
					  {
					   jz[i][j] -= minr;
					  }
				  }
				   he += jz[1][1];
				   for (int i = 2;i < n - Count;i++)
				   {
					   for (int j = 2;j < n - Count;j++)
					   {
						   jz[i - 1][j - 1] = jz[i][j];
					   }
				   }
				   for (int i = 2;i < n - Count;i++)
				   {
					   jz[i - 1][0] = jz[i][0];
				   }
				   for (int j = 2;j < n - Count;j++)
				   {
					   jz[0][j - 1] = jz[0][j];
				   }
			   }
			   System.out.print(he);
			   System.out.print("\n");
			   System.out.print("\n");
		}
		return 0;
	}

}

