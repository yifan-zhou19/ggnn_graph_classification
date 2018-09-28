package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6]; //???????????,?????????
		int[][] b = new int[6][6];
		int[][] c = new int[6][6];
		int i = 1;
		int j = 1;
		int temp1 = 0;
		int temp2 = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c[i][j] = b[i][j] = a[i][j];
			}
		}

		for (i = 1;i <= 5;i++) //???????????????????
		{
			for (j = 1;j <= 4;j++)
			{
				if (a[i][j] > a[i][j + 1])
				{
					temp1 = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = temp1;
				}
			}
		} //???,???a[i][j]?,?????????????a[i][5]????

		for (j = 1;j <= 5;j++) //???????????????????
		{
			for (i = 1;i <= 4;i++)
			{
				if (b[i][j] < b[i + 1][j])
				{
					temp2 = b[i][j];
					b[i][j] = b[i + 1][j];
					b[i + 1][j] = temp2;
				}
			}
		} //???,???b[i][j]?,?????????????b[5][j]????


		int flag = 0;
		for (i = 1;i <= 5;i++) //?c[i][j]??????????
		{
			for (j = 1;j <= 5;j++)
			{
				if (c[i][j] == a[i][5] && c[i][j] == b[5][j]) //?????c[i][j]
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");
					System.out.print(c[i][j]);
					System.out.print("\n");
					flag++;
				}
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

