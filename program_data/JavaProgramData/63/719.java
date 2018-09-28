package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] squarea = new int[x1][y1];
		int i;
		int j;
		int k;
		for (i = 0;i < x1;i++)
		{
					   for (j = 0;j < y1;j++)
					   {
						   squarea[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					   }
		} //??????????
		int x2;
		int y2;
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] squareb = new int[x2][y2];
		 for (i = 0;i < x2;i++)
		 {
					   for (j = 0;j < y2;j++)
					   {
						   squareb[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					   }
		 } //??????????
		int[][] result = new int[x1][y2];
		for (i = 0;i < x1;i++)
		{
						 for (j = 0;j < y2;j++)
						 {
										  result[i][j] = 0; //???
										  for (k = 0;k < y1;k++)
										  {
											  result[i][j] += squarea[i][k] * squareb[k][j];
										  } //??
						 }
		}
		for (i = 0;i < x1;i++) //????
		{
						 System.out.print(result[i][0]);
						 for (j = 1;j < y2;j++)
						 {
							 System.out.print(" ");
							 System.out.print(result[i][j]);
						 } //???????
						 System.out.print("\n");
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

