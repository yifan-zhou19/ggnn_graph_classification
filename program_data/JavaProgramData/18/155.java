package <missing>;

public class GlobalMembers
{
	//********************************
	//*  ????????????    *
	//*  ??: ??                  *
	//*  ???12?6?               *
	//********************************
	public static void min(int[] a, int b)
	{
		int w = 0;
		int y = 10000;
		for (w = 0;w < b;w++)
		{
			if (a[w] < y)
			{
				y = a[w]; //?????
			}
		}
			for (w = 0;w < b;w++)
			{
				a[w] = a[w] - y;
			}
	}
	public static int Main()
	{
		int n = 0; //sum??z[1][1]??
		int i = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int p = n; //p????????n???
		for (i = 0;i < p;i++,sum = 0)
		{
			int[][] z = new int[101][101];
			int[] z2 = new int[101];
			int j = 0;
			int k = 0;
			n = p;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					z[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
					do
					{
						for (j = 0;j < n;j++)
						{
							min(z[j], n); //????
						}
								for (j = 0;j < n;j++)
								{
									for (k = 0;k < n;k++)
									{
										z2[k] = z[k][j]; //z2???????
									}
											min(z2, n); //????????min??
									for (k = 0;k < n;k++)
									{
										z[k][j] = z2[k]; //???z2?????z??
									}
								}
									sum += z[1][1];
									for (j = 0;j < n;j++)
									{
										for (k = 1;k < n - 1;k++)
										{
											z[j][k] = z[j][k + 1]; //???????????????
										}
									}
									for (j = 0;j < n;j++)
									{
										for (k = 1;k < n - 1;k++)
										{
											z[k][j] = z[k + 1][j];
										}
									}
									n--;
					} while (n > 1);
					System.out.print(sum);
					System.out.print("\n");
		}
		return 0;
	}
}

