package <missing>;

public class GlobalMembers
{
	public static int[] qi = new int[1000];
	public static int[] tian = new int[1000];
	public static int[][] state = new int[1001][1001];

	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int match(int x,int y)
	{
		if (x == y)
		{
			return 0;
		}
		else if (x > y)
		{
			return -200;
		}
		else
		{
			return 200;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int tmp1;
		int tmp2;
		int maxi;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}



			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tian[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qi[i] = Integer.parseInt(tempVar2);
				}
			}

			qsort(tian,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(qi,n,(Integer.SIZE / Byte.SIZE),cmp);

			for (i = 0; i <= n ; i++)
			{
				state[0][i] = 0;
			}

			for (i = 1; i <= n; i++)
			{
				for (j = 0; j <= i; j++)
				{
					if (j == 0)
					{
						state[i][j] = state[i - 1][j] + match(qi[i - 1], tian[n - i + j]);
					}
					else if (i == j)
					{
						state[i][j] = state[i - 1][j - 1] + match(qi[i - 1], tian[j - 1]);
					}
					else
					{
						tmp1 = state[i - 1][j - 1] + match(qi[i - 1], tian[j - 1]);
						tmp2 = state[i - 1][j] + match(qi[i - 1], tian[n - i + j]);
						if (tmp1 > tmp2)
						{
							state[i][j] = tmp1;
						}
						else
						{
							state[i][j] = tmp2;
						}

					}
				}
			}

			maxi = state[n][0];


			for (i = 1; i <= n; i++)
			{
				if (state[n][i] > maxi)
				{
					maxi = state[n][i];
				}
			}

			System.out.printf("%d\n",maxi);




		}
		return 0;
	}


}

