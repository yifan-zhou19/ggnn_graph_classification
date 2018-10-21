package <missing>;

public class GlobalMembers
{
		public static int Main()
		{

			int a;
			int b;
			int n = 0;
			int q;
			int i;
			int k;
			int m;
			int o;
			int[][] sz = new int[100][100];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			o = 0;
			int x = 0;
			m = a * b;
			for (i = 0;i < a;i++)
			{
				for (k = 0;k < b;k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[i][k] = Integer.parseInt(tempVar3);
					}
				}
			}
		if (a % 2 != 0)
		{
				q = a + 1;

		}
			while (true)
			{
				if (b - 2 * n > 0)
				{
				for (k = n;k < b - n;k++)
				{
						System.out.printf("%d\n",sz[n][k]);
				}
				}
				if (b - 2 * n <= 0)
				{
					break;
				}
				n++;
				if (a - 2 * n >= 0)
				{
				for (k = n;k <= a - n;k++)
				{
						System.out.printf("%d\n",sz[k][b - n]);
				}
				}

				if (a - 2 * n < 0)
				{
					break;
				}
				if (b - 2 * n >= 0)
				{
				for (k = b - n - 1;k >= n - 1;k--)
				{
						System.out.printf("%d\n",sz[a - n][k]);
				}
				}

				if (b - 2 * n < 0)

				{
					break;
				}
				if (a - 1 - 2 * n >= 0)
				{
				for (k = a - n - 1;k > n - 1;k--)
				{
						System.out.printf("%d\n",sz[k][n - 1]);
				}
				}
				if (a - 2 * n - 1 < 0)
				{
					break;
				}

			}

			return 0;
		}
}

