package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[102][102];
		int i;
		int j;
		int k;
		int[] p = a;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (j = 0;j < col;j++)
		{
			i = 0;
			k = j;
			while (k >= 0 && i < row)
			{
				  System.out.print((p[i] + k));
				  System.out.print("\n");
				  i++;
				  k--;
			}
		}
		for (i = 1;i < row;i++)
		{
						  j = col - 1;
						  k = i;
						  while (k < row && j >= 0)
						  {
								System.out.print((p[k] + j));
								if (i != row - 1 || j != col - 1)
								{
									System.out.print("\n");
								}
								k++;
								j--;
						  }
		}
		return 0;
	}

}

