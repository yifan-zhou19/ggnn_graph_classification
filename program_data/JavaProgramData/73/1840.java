package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i; //i,j,k?????t????x,y?????????m???
		int j;
		int k;
		int t;
		int x;
		int y;
		int m = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			x = 0;
			y = 0;
			t = a[i][0];
			for (j = 0;j < 4;j++)
			{ //???????
				if (t < a[i][j + 1])
				{
					t = a[i][j + 1];
					y = j + 1;
				}
			}
		 for (k = 0;k < 5;k++)
		 { //???????????????
				if (t > a[k][y])
				{
					break;
				}
		 }
			if (k == 5)
			{ //???????????
				x = i;
				System.out.print(x + 1);
				System.out.print(' ');
				System.out.print(y + 1);
				System.out.print(' ');
				System.out.print(t);
				System.out.print("\n");
				m = 1;
			}
		}
		if (m == 0) //???????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

