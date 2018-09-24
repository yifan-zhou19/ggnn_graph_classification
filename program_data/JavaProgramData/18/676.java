package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] ma = new int[120][120];
		int i;
		int j;
		int[] sum = new int[120];
		int time;
		int t;
		int n;
		int[] min = new int[120];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t <= n - 1;t++)
		{

			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					ma[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
					//??

					sum[t] = 0;
			for (time = n - 1;time >= 1;time--)
			{
					for (i = 0;i <= time;i++)
					{
						min[i] = ma[i][0];
						for (j = 0;j <= time;j++)
						{
							if (min[i] > ma[i][j])
							{
								min[i] = ma[i][j];
							}
						}
						for (j = 0;j <= time;j++)
						{
								ma[i][j] = ma[i][j] - min[i];
						}
					}
					for (j = 0;j <= time;j++)
					{
						min[j] = ma[0][j];
						for (i = 0;i <= time;i++)
						{
							if (min[j] > ma[i][j])
							{
								min[j] = ma[i][j];
							}
						}
						for (i = 0;i <= time;i++)
						{
							ma[i][j] = ma[i][j] - min[j];
						}
					}


			 sum[t] = sum[t] + ma[1][1];
			 if (time >= 2)
			 {
			 for (i = 1;i <= time-1;i++)
			 {
				 for (j = 0;j <= time;j++)
				 {
					 ma[i][j] = ma[i + 1][j];
				 }
			 }
			for (j = 1;j <= time-1;j++)
			{
				for (i = 0;i <= time;i++)
				{
					ma[i][j] = ma[i][j + 1];
				}
			}
			 }

			}


		}

		for (i = 0;i <= n - 2;i++)
		{
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		System.out.print(sum[n - 1]);


	return 0;


	}

}

