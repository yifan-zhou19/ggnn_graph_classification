package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[][] dis = new int[10][3];

		float[][] ans = new float[1000][7];

		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 3;j++)
			{
				dis[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
		}

		int num = 0;

		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{

				for (int k = 0;k < 3;k++)
				{
					ans[num][k] = dis[i][k];
				}
				for (int k = 0;k < 3;k++)
				{
					ans[num][k + 3] = dis[j][k];

				}
					ans[num][6] = 0.0F;
				for (int k = 0;k < 3;k++)
				{
					ans[num][6] += (dis[i][k] - dis[j][k]) * (dis[i][k] - dis[j][k]);
				}

				ans[num][6] = Math.sqrt(ans[num][6]);

				num++;
			}
		}

		for (int i = 0;i < num;i++)
		{
			for (int j = num - 1;j > i;j--)
			{
				if (ans[j][6] > ans[j - 1][6])
				{

					for (int k = 0;k < 7;k++)
					{
						float tmp = ans[j][k];
						ans[j][k] = ans[j - 1][k];
						ans[j - 1][k] = tmp;

					}
				}
			}
		}

		for (int i = 0;i < num;i++)
		{
			System.out.print('(');
			System.out.print(ans[i][0]);
			System.out.print(',');
			System.out.print(ans[i][1]);
			System.out.print(',');
			System.out.print(ans[i][2]);
			System.out.print(")-(");
			System.out.print(ans[i][3]);
			System.out.print(',');
			System.out.print(ans[i][4]);
			System.out.print(',');
			System.out.print(ans[i][5]);
			System.out.print(")=");
			System.out.printf("%.2f",ans[i][6]);
			if (i < num - 1)
			{
				System.out.print("\n");
			}
		}


		return 0;



	}
}

