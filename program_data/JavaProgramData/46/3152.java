package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[200][200];
		int row;
		int col;
		int i;
		int j;
		int cnt = 0;
		int sum = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		while (cnt < row * col)
		{
				  for (;j <= col - 1 - sum;j++)
				  {
					  cnt++;
					  if (cnt <= row * col)
					  {
					  System.out.print(array[i][j]);
					  System.out.print("\n");
					  }
					  else
					  {
					  break;
					  }
				  }
					  j--;
					  i++;
					  for (;i <= row - 1 - sum;i++)
					  {
						  cnt++;
						  if (cnt <= row * col)
						  {
						  System.out.print(array[i][j]);
						  System.out.print("\n");
						  }
						  else
						  {
						  break;
						  }
					  }
						  i--;
						  j--;
						  for (;j >= sum;j--)
						  {
							  cnt++;
							  if (cnt <= row * col)
							  {
							  System.out.print(array[i][j]);
							  System.out.print("\n");
							  }
							  else
							  {
							  break;
							  }
						  }
							  i--;
							  j++;
							  for (;i > sum;i--)
							  {
								  cnt++;
								  if (cnt <= row * col)
								  {
								  System.out.print(array[i][j]);
								  System.out.print("\n");
								  }
								  else
								  {
								  break;
								  }
							  }
								  i++;
								  j++;
								  sum++;
		}


		return 0;
	}

}

