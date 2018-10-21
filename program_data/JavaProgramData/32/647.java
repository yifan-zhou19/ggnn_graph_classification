package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int b;
		int a;
		int i;
		int x = 0;
		int y;
		int z = 1;
		int m;
		int n;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		char[][] j_shu = new char[65][101];
		char[][] b_shu = new char[65][101];
		char[][] shu = new char[65][101];
		for (i = 0;i < a;i++)
		{
			j = 0;
			while (true)
			{
				if ((y = System.in.read()) != '\n')
				{
					j_shu[i][j++] = y;
				}
				else
				{
					if (j > 0)
					{
						j_shu[i][j] = '\0';
						break;
					}
				}
			}
			b = 0;
			while (true)
			{
				if ((y = System.in.read()) != '\n')
				{
					b_shu[i][b++] = y;
				}
				else
				{
					if (b > 0)
					{
						b_shu[i][b] = '\0';
						break;
					}
				}
			}
			m = String.valueOf(j_shu[i]).length();
			n = String.valueOf(b_shu[i]).length();
			b_shu[i][m] = '\0';
			for (s = m - 1,t = n - 1;t >= 0;s--,t--)
			{
				if (j_shu[i][s] < b_shu[i][t])
				{
					j_shu[i][s] = j_shu[i][s] + 10;
					j_shu[i][s - 1] = j_shu[i][s - 1] - 1;
				}
				shu[i][s] = j_shu[i][s] - b_shu[i][t];
			}
			for (;s >= 0;s--)
			{
				if (j_shu[i][s] < 0)
				{
					j_shu[i][s] = j_shu[i][s] + 10;
					j_shu[i][s - 1] = j_shu[i][s - 1] - 1;
				}
				shu[i][s] = j_shu[i][s] - 48;
				//printf("%d",shu[i][s]);
			}
		}
		for (i = 0;i < a;i++)
		{
			m = String.valueOf(j_shu[i]).length();
			for (s = 0,t = 0;s < m;s++)
			{
				if (shu[i][s] == 0 && t == 0)
				{
					continue;
				}
				else
				{
					if (shu[i][s] == 0)
					{
						System.out.print("0");
					}
					else
					{
						t++;
						System.out.printf("%d",shu[i][s]);
					}
				}
			}
			if (t == 0)
			{
				System.out.print("0");
			}
			System.out.printf("\n",m);
		}
	}
}

