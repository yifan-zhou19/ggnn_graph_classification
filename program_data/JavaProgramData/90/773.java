package <missing>;

public class GlobalMembers
{
	//****************************************
	//*????????                     **
	//*?????? 1100012763              **
	//*???2011.11.17                     **
	//****************************************

	public static int[][] ans = new int[101][101];

	public static int jisuan(int apple, int plate)
	{
		int num;
		if (ans[apple][plate] == -1)
		{
			num = jisuan(apple, plate - 1);
			if (apple - plate >= 0)
			{
				num = num + jisuan(apple - plate, plate);
			}
			return num;
		}
		else
		{
			return ans[apple][plate];
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int t;
		int k;
		int apple;
		int plate;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			for (j = 0; j <= 100; j++)
			{
				for (k = 0; k <= 100; k++)
				{
					ans[j][k] = -1;
				}
			}
			for (j = 0; j <= 100; j++)
			{
				ans[j][1] = 1;
				ans[0][j] = 1;
			}
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(jisuan(apple, plate));
			System.out.print("\n");
		}

		return 0;
	}

}

