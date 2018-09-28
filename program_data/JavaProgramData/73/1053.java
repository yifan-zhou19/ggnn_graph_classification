package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] k = new int[5][5];
		int[] m = new int[5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				k[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (k[i][j] > k[i][m[i]])
				{
					m[i] = j;
				}
			}
		}
		int flag = 0;
		int mark = 0;
		for (i = 0;i < 5;i++)
		{
			flag = 0;
			for (j = 0;j < 5;j++)
			{
				if (k[i][m[i]] <= k[j][m[i]])
				{
					;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				mark = 1;
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(m[i] + 1);
				System.out.print(' ');
				System.out.print(k[i][m[i]]);
				System.out.print("\n");
			}
		}
		if (mark == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

