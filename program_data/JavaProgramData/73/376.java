package <missing>;

public class GlobalMembers
{
	//?????
	//??? 1200017623
	//????????????????????????????????????????



	public static int Main()
	{
		int[][] n = new int[5][5];
		int i;
		int j;
		int k;
		int column;
		int num;
		int flag = 1;
		for (i = 0; i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < 5;i++)
		{
			column = 0;
			num = n[i][0];

			for (j = 0;j < 5;j++)
			{ //????????
				if (n[i][j] > num)
				{
					num = n[i][j];
					column = j;
				}
			}

			flag = 1;

			for (k = 0;k < 5;k++)
			{ //???????????
				if (n[k][column] < num)
				{
					flag = 0;
					break;
				}
			}

			if (flag != 0)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(column + 1);
				System.out.print(' ');
				System.out.print(num);
				System.out.print("\n");
				break; //?????????
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}


}

