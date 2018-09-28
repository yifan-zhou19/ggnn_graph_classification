package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int s;
		int i;
		int j;
		int flag2 = 0;
		int[][] x = new int[6][6];
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] p = x;
		int xx;
		int yy;
		for (k = 0; k < 5; k++)
		{
			for (s = 0; s < 5; s++)
			{
				int flag = 1;
				for (i = 0; i < 5; i++)
				{
					if (*(p[k] + i) > *(p[k] + s) || *(p[i] + s) < *(p[k] + s))
					{
						flag = 0;
					}
				}
				if (flag != 0)
				{
					flag2 = 1;
					xx = k;
					yy = s;
				}
			}
		}
		if (flag2 != 0)
		{
			System.out.print(xx + 1);
			System.out.print(" ");
			System.out.print(yy + 1);
			System.out.print(" ");
			System.out.print((p[xx] + yy));
			System.out.print("\n");
		}
		else
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;

	}
}

