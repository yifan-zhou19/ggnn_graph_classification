package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int[][] t = new int[100][100];
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
				t[i][j] = 1;
			}
		}
		i = 0;
		j = -1;
		a = 0;
		for (n = 0;a < row * col;n++)
		{
			if (n % 4 == 0)
			{
				for (j = j + 1;j < col && t[i][j] == 1;j++)
				{
					System.out.printf("%d\n",array[i][j]);
					a++;
					t[i][j] = 0;
				}
				j--;
			}
			else if (n % 4 == 1)
			{
				for (i = i + 1;i < row && t[i][j] == 1;i++)
				{
					System.out.printf("%d\n",array[i][j]);
					a++;
					t[i][j] = 0;
				}
				i--;
			}
			else if (n % 4 == 2)
			{
				for (j = j - 1;j >= 0 && t[i][j] == 1;j--)
				{
					System.out.printf("%d\n",array[i][j]);
					a++;
					t[i][j] = 0;
				}
				j++;
			}
			else if (n % 4 == 3)
			{
				for (i = i - 1;i >= 0 && t[i][j] == 1;i--)
				{
					System.out.printf("%d\n",array[i][j]);
					a++;
					t[i][j] = 0;
				}
				i++;
			}
		}
		return 0;
	}

}

