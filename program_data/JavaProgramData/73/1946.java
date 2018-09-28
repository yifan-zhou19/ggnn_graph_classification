package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] flag = {1, 1, 1, 1, 1};
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			int andian = 0;
			int lie = 0;
			for (int p = 0; p < 5; p++)
			{
				andian = a[p][0];
				lie = 0;
				for (int q = 0; q < 5; q++)
				{
					if (andian < a[p][q])
					{
						andian = a[p][q];
						lie = q;
					}
				}
				for (int t = 0; t < 5; t++)
				{
					if (a[t][lie] < andian)
					{
						flag[p] = 0;
						break;
					}
				}
				if (flag[p] == 1)
				{
					System.out.print(p + 1);
					System.out.print(" ");
					System.out.print(lie + 1);
					System.out.print(" ");
					System.out.print(andian);
					System.out.print("\n");
				}
			}
			if (flag[0] == 0 && flag[1] == 0 && flag[2] == 0 && flag[3] == 0 && flag[4] == 0)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
			return 0;
	}



}

