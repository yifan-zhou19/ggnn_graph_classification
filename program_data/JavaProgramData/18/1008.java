package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[120][120];
		int i;
		int N;
		int j;
		int sum;
		int k;
		int ii;
		int jj;
		int all;
		int zhong = 999;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N = n;
		all = N;
	for (jj = 1;jj <= N;jj++)
	{
		n = N;
		sum = 0;
		for (i = 1;i <= N;i++)
		{
				for (j = 1;j <= N;j++)
				{
					*(*(a + i - 1) + j - 1) = ConsoleInput.readToWhiteSpace(true);
				}
		}
		for (k = 1;k <= N - 1;k++)
		{



			for (ii = 0;ii <= n - 1;ii++)
			{
				zhong = 999;

				for (i = 0;i <= n - 1;i++)
				{
					if (*(*(a + ii) + i) <= zhong)
					{
						zhong = (*(a + ii) + i);
					}
				}
				for (i = 0;i <= n - 1;i++)
				{
					*(*(a + ii) + i) -= zhong;
				}
			}
					for (ii = 0;ii <= n - 1;ii++)
					{
				zhong = 999;

				for (i = 0;i <= n - 1;i++)
				{

					if (*(*(a + i) + ii) <= zhong)
					{
						zhong = (*(a + i) + ii);
					}
				}
				for (i = 0;i <= n - 1;i++)
				{
					*(*(a + i) + ii) -= zhong;
				}
					}
					sum += *(*(a + 1) + 1);
				for (i = 1;i <= n - 1;i++)
				{
					for (j = 0;j <= n - 1;j++)
					{
						*(*(a + i) + j) = *(*(a + i + 1) + j);
					}
				}
				for (i = 1;i <= n - 1;i++)
				{
					for (j = 0;j <= n - 1;j++)
					{
						*(*(a + j) + i) = *(*(a + j) + i + 1);
					}
				}
				n--;



		}
		System.out.print(sum);
		System.out.print("\n");
	}

		return 0;
	}








}

