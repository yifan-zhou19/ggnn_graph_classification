package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] point = new int[6][6];
		int i;
		int j;
		int biaoji = 0;
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				point[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int max = 0;
		int c;
		int b;
		for (i = 1;i < 6;i++)
		{
			max = 0; //???max
			for (j = 1;j < 6;j++)
			{
				if (point[i][j] > max)
				{
					max = point[i][j]; //???????
					b = i; //????
					c = j; //????
				}
			}
			int count = 0;
			int a;
			for (a = 1;a < 6;a++)
			{
				if (max < point[a][c]) //?????????????????
				{
					count = count + 1;
				}
			}
			if (count == 4)
			{
				System.out.print(b);
				System.out.print(" ");
				System.out.print(c);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
				biaoji = 1; //????????1
			}
		}
		if (biaoji == 0) //?????????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
	return 0;
	}

}

