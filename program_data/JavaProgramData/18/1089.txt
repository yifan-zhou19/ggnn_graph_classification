package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int j;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][n];
		int[] minh = new int[n];
		int[] minl = new int[n];
		for (k = 0; k < n; k++)
		{
			for (i = 0; i < n; i++)
			{ //????
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int t = 1; //t????????
			sum = 0;
			while (t < n)
			{
				for (i = 0; i < n; i++)
				{ //minh?minl??????????
					minh[i] = 10000;
					minl[i] = 10000;
				}
				for (i = 0; i < n; i++)
				{ //??????
					for (j = 0; j < n; j++)
					{
						if (a[i][j] != 10000 && minh[i] > a[i][j])
						{
							minh[i] = a[i][j];
						}
					}
				}
				for (i = 0; i < n; i++)
				{ //??????????
					for (j = 0; j < n; j++)
					{
						if (a[i][j] != 10000)
						{
							a[i][j] = a[i][j] - minh[i];
						}
					}
				}
				for (i = 0; i < n; i++)
				{ //??????
					for (j = 0; j < n; j++)
					{
						if (a[i][j] != 10000 && minl[j] > a[i][j])
						{
							minl[j] = a[i][j];
						}
					}
				}
				for (i = 0; i < n; i++)
				{ //??????????
					for (j = 0; j < n; j++)
					{
						if (a[i][j] != 10000)
						{
							a[i][j] = a[i][j] - minl[j];
						}
					}
				}

				sum = sum + a[t][t];
				for (i = 0; i < n; i++)
				{
					for (j = 0; j < n; j++)
					{
						if (i == t || j == t) //???t???t?
						{
							a[i][j] = 10000;
						}
					}
				}

				t++;

			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}
}

