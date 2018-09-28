package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int[][] visit = new int[100][100];
		int i;
		int j;
		int count = 0;
		int type; //1??????????2??????????3????4???

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		i = 1, j = 1, type = 1; //?(1,1)???,??????
		while (count < m * n) //????????
		{
			System.out.print(a[i][j]);
			System.out.print("\n");
			visit[i][j] = 1;
			count++;
			if (type == 1) //???????????????(i,j)?
			{
				if (j < n && visit[i][j + 1] == 0) //???????
				{
					j++;
				}
				else //??????
				{
					type = 2;
					i++;
				}
				continue;
			}
			if (type == 2)
			{
				if (i < m && visit[i + 1][j] == 0)
				{
					i++;
				}
				else
				{
					type = 3;
					j--;
				}
				continue;
			}
			if (type == 3)
			{
				if (j > 1 && visit[i][j - 1] == 0)
				{
					j--;
				}
				else
				{
					type = 4;
					i--;
				}
				continue;
			}
			if (type == 4)
			{
				if (i > 1 && visit[i - 1][j] == 0)
				{
					i--;
				}
				else
				{
					type = 1;
					j++;
				}
				continue;
			}
		}
		return 0;
	}
}

