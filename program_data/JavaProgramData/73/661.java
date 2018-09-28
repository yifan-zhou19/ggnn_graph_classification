package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int g;
		int h;
		int max;
		int flag = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < 5;i++)
		{
			max = a[i][0];
			g = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					g = j;
				}
			}


			h = 1;
			for (k = 0;k < 5;k++)
			{
				if (a[k][g] < max)
				{
					h = 0;
					break;
				}
			}
			if (h == 1)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(g + 1);
				System.out.print(' ');
				System.out.print(a[i][g]);
				flag = 1;
			}
		}

		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

