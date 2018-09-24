package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
				 for (i = 0;i < row;i++)
				 {
			   for (j = 0;j < col;j++)
			   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array[i][j] = Integer.parseInt(tempVar3);
			}
			   }
				 }

			if (row < col)
			{

			  for (s = 0;s <= row - 1;s++)
			  {
					 for (i = 0;i <= s;i++)
					 {
						 System.out.printf("%d\n",array[i][s - i]);
					 }
			  }
					 for (s = row;s <= col - 1;s++)
					 {
						 for (i = 0;i <= row - 1;i++)
						 {
							 System.out.printf("%d\n",array[i][s - i]);
						 }
					 }

					 for (s = col;s <= row + col - 2;s++)
					 {
					   for (j = col - 1;j >= s - row + 1;j--)
					   {
						   System.out.printf("%d\n",array[s - j][j]);
					   }
					 }
			}
			else if (row > col)
			{
				 for (s = 0;s <= col - 1;s++)
				 {
					 for (i = 0;i <= s;i++)
					 {
						 System.out.printf("%d\n",array[i][s - i]);
					 }
				 }
					 for (s = col;s <= row - 1;s++)
					 {
						 for (j = col - 1;j >= 0;j--)
						 {
							 System.out.printf("%d\n",array[s - j][j]);
						 }
					 }

					 for (s = row;s <= row + col - 2;s++)
					 {
					   for (i = s + 1 - col;i <= row - 1;i++)
					   {
						   System.out.printf("%d\n",array[i][s - i]);
					   }
					 }
			}
			else
			{
				for (s = 0;s <= col - 1;s++)
				{
					 for (i = 0;i <= s;i++)
					 {
						 System.out.printf("%d\n",array[i][s - i]);
					 }
				}
				for (s = row;s <= row + col - 2;s++)
				{
						for (i = s + 1 - col;i <= row - 1;i++)
						{
						   System.out.printf("%d\n",array[i][s - i]);
						}
				}
			}

			return 0;
	}

}

