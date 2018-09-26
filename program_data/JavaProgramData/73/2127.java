package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[6][6];
		int[] maxLine = new int[6];
		int[] minRow = new int[6];
		int i;
		int j;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}


			for (i = 1;i <= 5;i++)
			{

			for (j = 1;j <= 5;j++)
			{
				if (num[i][j] >= num[i][1] != 0 && num[i][j] >= num[i][2] != 0 && num[i][j] >= num[i][3] != 0 && num[i][j] >= num[i][4] != 0 && num[i][j] >= num[i][5])
				{
					maxLine[i] = j;
				}
			}
			} //???????????????????maxLine??

			for (j = 1;j <= 5;j++)
			{
				for (i = 1;i <= 5;i++)
				{
					if (num[i][j] <= num[1][j] != 0 && num[i][j] <= num[2][j] != 0 && num[i][j] <= num[3][j] != 0 && num[i][j] <= num[4][j] != 0 && num[i][j] <= num[5][j])
					{
						minRow[j] = i;
					}
				}
			} //????????minRow??

			int counter = 0; //???counter????????
			for (i = 1;i <= 5;i++)
			{
				if (i == minRow[maxLine[i]])
				{
					counter++;
					System.out.print(i);
					System.out.print(" ");
					System.out.print(maxLine[i]);
					System.out.print(" ");
					System.out.print(num[i][maxLine[i]]);
					System.out.print("\n");
				}
			}
			if (counter == 0)
			{
				System.out.print("not found");
			}
		return 0;
	}

}

