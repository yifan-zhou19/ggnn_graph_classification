package <missing>;

public class GlobalMembers
{
	/*
	 *????HW6_05.cpp
	 *??????1100019007?
	 *???2012-11-05
	 *???????
	 */ 

	public static int[][] matrix = new int[5][5];
	public static int[] row = new int[5];
	public static int[] column = new int[5]; //???
	public static int Main()
	{
		int i; //??i,j,max,min
		int j;
		int max;
		int min;
		int flag;
		flag = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			row[i] = 0; //????????
			max = matrix[i][0];
			for (j = 0;j < 5;j++)
			{
				if (matrix[i][j] > max)
				{
					max = matrix[i][j]; //????????
					row[i] = j;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			column[j] = 0; //??????????
			min = matrix[0][j];
			for (i = 0;i < 5;i++)
			{
				if (matrix[i][j] < min)
				{
					min = matrix[i][j]; //????????
					column[j] = i;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (column[row[i]] == i) //????????????????????
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(row[i] + 1);
				System.out.print(" ");
				System.out.print(matrix[i][row[i]]);
				System.out.print("\n");
				flag = 1; //flag??????
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
	  return 0; //????
	}

}

