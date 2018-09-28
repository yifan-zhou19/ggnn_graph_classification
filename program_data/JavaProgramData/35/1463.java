package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int a;
		int s;
		int t;
		int p;
		int k;
		int r;
		int[][] an = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					an[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		s = -1;
		t = -1;

		for (i = 0;i < m;i++)
		{
			a = i;
			k = an[a][0];
			for (j = 0;j < n;j++)
			{
				if (an[a][j] > k)
				{
					k = an[a][j];
				}

			}

			for (j = 0;j < n;j++)
			{
				p = -1;
				if (an[a][j] == k)
				{
					p = k;
					for (r = 0;r < m;r++)
					{

						if (an[r][j] < p)
						{
							p = an[r][j];
						}

					}
					if (p == an[a][j])
					{
						s = a;
						t = j;
						System.out.printf("%d+%d\n",s,t);
					}
				}
			}

		}
		if (s == -1)
		{
			System.out.print("No");
		}
		return 0;
	}

}

