package <missing>;

public class GlobalMembers
{
	/*
	 * ????juzhenxiaojian.cpp
	 * ??????
	 * ?????2012 11 28
	 * ????????????????
	 */



	public static int[][] juzhen = new int[100][100];

	public static int sum(int n)
	{
		int i;
		int j;
		int t;
		int[] min = new int[n];
		if (n != 1)
		{
		for (i = 0;i < n;i++)
		{
		min[i] = juzhen[i][0];
			for (j = 0;j < n;j++)
			{
				if (juzhen[i][j] < min[i])
				{
					min[i] = juzhen[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				juzhen[i][j] -= min[i]; //???????????
			}
		}
		for (j = 0;j < n;j++)
		{
			min[j] = juzhen[0][j];
				for (i = 0;i < n;i++)
				{
					if (juzhen[i][j] < min[j])
					{
						min[j] = juzhen[i][j];
					}
				}
				for (i = 0;i < n;i++)
				{
					juzhen[i][j] -= min[j]; //?????????????
				}
		}
		t = juzhen[1][1]; //??????juzhen[1][1]
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				juzhen[i][j] = juzhen[i][j + 1];
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 1;i < n - 1;i++)
			{
				juzhen[i][j] = juzhen[i + 1][j]; //??
			}
		}
		return sum(n - 1) + t; //???????1??????
		}
		else
		{
			return 0; //????1????0
		}
	}

	public static int Main()
	{
		int N;
		int I;
		int J;
		int K;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (K = 1;K <= N;K++)
		{
		for (I = 0;I < N;I++)
		{
			for (J = 0;J < N;J++)
			{
				juzhen[I][J] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(sum(N));
		System.out.print("\n");
		}
		return 0;
	}

}

