package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] hui = new int[100][100];
		int row;
		int col;
		int n;
		int m;
		int i;
		int rowa;
		int cola;
		int T;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rowa = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			cola = Integer.parseInt(tempVar2);
		}
		if (rowa < cola)
		{
			T = rowa;
		}
		else
		{
			T = cola;
		}
		row = rowa - 1;
		col = cola - 1;
		for (n = 0;n < rowa;n++)
		{
			for (m = 0;m < cola;m++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					hui[n][m] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < Math.floor(T * 0.5 + 0.5);)
		{
			for (n = i,m = i;n < row - i + 1;)
			{
					if (m < col - i)
					{
					System.out.printf("%d\n",hui[n][m]);
					m++;
					}
				else
				{
					System.out.printf("%d\n",hui[n][m]);
					n++;
				}
			}
			i++;
			if (m > col / 2 && n > row / 2)
			{
				for (n = row - i + 1,m = col - i;n > i - 1;)
				{
					if (m > i - 1)
					{
						System.out.printf("%d\n",hui[n][m]);
						m--;
					}
					else
					{
						System.out.printf("%d\n",hui[n][m]);
						n--;
					}
				}
			}
		}

		return 0;
	}



}

