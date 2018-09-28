package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int y;
		int max;
		int flag;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = a[i][0];
			y = 1;
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					 y = j + 1;
				}
			}
			flag = 1;
			for (int k = 0; k < 5; k++)
			{
				if (a[k][y - 1] < max)
				{
				flag = 0;
				continue;
				}
			}
			if (flag == 1)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(y);
				System.out.print(" ");
				System.out.print(max);
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;

	}

}

