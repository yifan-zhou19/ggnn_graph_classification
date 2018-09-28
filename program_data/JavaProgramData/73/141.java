package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int c = 0;
		int max = 0;
		int l;
		int h;
		int[][] a = new int[5][5];
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i <= 4; i++)
		{
			c = 0;
			l = 0;
			max = 0;
			for (int j = 0; j <= 4; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					l = j;
				}
			}

			for (int k = 0; k <= 4; k++)
			{
				if (max > a[k][l])
				{
					break;
				}
				c++;
			}
			if (c == 5)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(l + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
				flag = 1;
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

