package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????????
	 * ??          ???
	 * ????: 2011-11-6
	 * ??????????????????????a[1][1]???
	 */

	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int min;
		int sum = 0;
		int num = 0;
		int[][] a = new int[101][101];
		int[] minr = new int[101];
		int[] minc = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 1,num = 0,sum = 0;k <= n;k++)
		{

			for (i = 1;i <= n;i++) //??? ????
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			num = 0;
			sum = 0;
			while (num < n - 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(minr,0,101 * 4);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(minc,0,101 * 4);
				for (i = 1;i <= n - num;i++) //??????????
				{ //?????
					min = a[i][1];
					for (j = 1;j <= n - num;j++)
					{
						if (a[i][j] < min)
						{
						min = a[i][j];
						}
					}
					minr[i] = min;
				}

				for (i = 1;i <= n - num;i++) //?????
				{
					for (j = 1;j <= n - num;j++)
					{
						a[i][j] = a[i][j] - minr[i];
					}
				}

				for (j = 1;j <= n - num;j++)
				{ //?????
						min = a[1][j];
						for (i = 1;i <= n - num;i++)
						{
							if (a[i][j] < min)
							{
								min = a[i][j];
							}
						}
						minc[j] = min;
				}

			   for (j = 1;j <= n - num;j++) //?????
			   {
						for (i = 1;i <= n - num;i++)
						{
							a[i][j] = a[i][j] - minc[j];
						}
			   }

					sum = sum + a[2][2];
					//??

					//????
					for (i = 1;i <= n - num;i++) //???
					{
						for (j = 2;j <= n - num - 1;j++)
						{
							a[i][j] = a[i][j + 1];
						}
					}

					for (j = 1;j <= n - num - 1;j++)
					{
						for (i = 2;i <= n - num - 1;i++)
						{
							a[i][j] = a[i + 1][j];
						}
					}

					num++; //???????1
			}
		 System.out.print(sum);
		 System.out.print("\n");
		}

		return 0;
	}
}

