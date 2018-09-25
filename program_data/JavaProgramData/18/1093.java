package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????
		int j;
		int k;
		int n;
		int m;
		int[][] a = new int[101][101];
		int[] mini = new int[101];
		int[] minj = new int[101];
		int[] ans = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ans,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			m = n; //??????
			while (m > 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(mini,21474836,(Integer.SIZE / Byte.SIZE));
				for (i = 1; i <= m; i++)
				{
					for (j = 1; j <= m; j++)
					{
						if (a[i][j] < mini[i])
						{
							mini[i] = a[i][j];
						}
					}
				}
				for (i = 1; i <= m; i++)
				{
					for (j = 1; j <= m; j++)
					{
						a[i][j] = a[i][j] - mini[i]; //???????
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(minj,21474836,(Integer.SIZE / Byte.SIZE));
				for (j = 1; j <= m; j++)
				{
					for (i = 1; i <= m; i++)
					{
						if (a[i][j] < minj[j])
						{
							minj[j] = a[i][j];
						}
					}
				}
				for (j = 1; j <= m; j++)
				{
					for (i = 1; i <= m; i++)
					{
						a[i][j] = a[i][j] - minj[j]; //???????
					}
				}

				ans[k] = ans[k] + a[2][2]; //???????
				for (i = 2; i <= m; i++)
				{
					a[i][1] = a[i + 1][1];
				}
				for (j = 2; j <= m; j++)
				{
					a[1][j] = a[1][j + 1];
				}
				for (i = 2; i <= m; i++)
				{
					for (j = 2; j <= m; j++)
					{
						a[i][j] = a[i + 1][j + 1];
					}
				}
				m--; //???????
			}
			System.out.print(ans[k]);
			System.out.print("\n");
		}
		return 0; //main???????0
	}
}

