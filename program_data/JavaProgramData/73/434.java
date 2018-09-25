package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int hang1;
		int hang2;
		int lie;
		int i;
		int j;
		int k;
		int max;
		int min;
		int flag = 1;
		for (i = 1 ; i <= 5 ; i++)
		{
			for (j = 1 ; j <= 5 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1 ; i <= 5 ; i++)
		{
			max = a[i][1];
			hang1 = i;
			lie = 1;
			for (j = 1 ; j <= 5 ; j++)
			{
				if (a[i][j] >= max)
				{
					max = a[i][j];
					lie = j;
				}
			}
			min = a[hang1][lie];
			for (k = 1 ; k <= 5 ; k++)
			{
				if (a[k][lie] <= min)
				{
					min = a[k][lie];
					hang2 = k;
				}
			}
			if (hang1 == hang2)
			{
				System.out.print(hang1);
				System.out.print(' ');
				System.out.print(lie);
				System.out.print(' ');
				System.out.print(a[hang1][lie]);
				System.out.print("\n");
				flag = 0;
				break;
			}
			else if (hang1 != hang2)
			{
				continue;
			}
		}
		if (flag != 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

