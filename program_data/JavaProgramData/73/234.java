package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:????
	 ***??:2012?11?5?
	 *************************/
	public static int Main()
	{
		int[][] matrix = new int[6][6];
		int[][] point = new int[6][6];
		int i;
		int j;
		int k;
		int min;
		int max;
		int max_row = 0;
		int min_col = 0;
		int point_ok = 0;
		for (i = 1; i <= 5; i++)
		{
			for (j = 1; j <= 5; j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= 5; i++) //??????????
		{
			max = matrix[i][1]; //?max???
			max_row = 1;
			for (j = 2; j <= 5; j++)
			{
				if (matrix[i][j] > max) //?????????????????
				{
					max_row = j; //???????????
					max = matrix[i][j]; //????????
				}
			}
			point[i][max_row]++; //?point???????i,max_row?????,????????"????"??
		}
		for (j = 1; j <= 5; j++) //??????????,??
		{
			min = matrix[1][j];
			min_col = 1;
			for (i = 2; i <= 5; i++)
			{
				if (matrix[i][j] < min)
				{
					min_col = i;
					min = matrix[i][j];
				}
			}
			point[min_col][j]++;
		}
		for (i = 1; i <= 5; i++)
		{
			for (j = 1; j <= 5; j++) //????????point
			{
				if (point[i][j] == 2) //??????2????????????
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");
					System.out.print(matrix[i][j]);
					System.out.print("\n");
					point_ok++; //????
				}
			}
		}
		if (point_ok == 0) //?????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

