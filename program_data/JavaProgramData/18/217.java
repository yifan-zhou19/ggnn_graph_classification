package <missing>;

public class GlobalMembers
{
	/*          ?????????
	??????      2010.12.07        */

	public static int[][] a = new int[101][101]; //??????
	public static int n;
	public static int[][] b = new int[101][101];
	public static void f()
	{
		int i;
		int j;
		int k;
		int num;
		int ans = 0;
		int min;
		num = n;
		while (num >= 2)
		{
			for (i = 1; i <= num; i++)
			{
				min = a[i][1];
				for (j = 1; j <= num; j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j]; //????????
					}
				}
				for (j = 1; j <= num; j++)
				{
					a[i][j] -= min; //?????
				}
			}
			for (j = 1; j <= num; j++)
			{
				min = a[1][j];
				for (i = 1; i <= num; i++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j]; //????????
					}
				}
				for (i = 1; i <= num; i++)
				{
					a[i][j] -= min;
				}
			}
			ans += a[2][2]; //??
			b[1][1] = a[1][1];
			for (i = 2; i <= num - 1; i++)
			{
				b[i][1] = a[i + 1][1];
			}
			for (i = 2; i <= num - 1; i++)
			{
				b[1][i] = a[1][i + 1];
			}
			for (i = 2; i <= num - 1; i++)
			{
				for (j = 2; j <= num - 1; j++)
				{
					b[i][j] = a[i + 1][j + 1]; //?b??a????????????
				}
			}
			for (i = 1; i <= num - 1; i++)
			{
				for (j = 1; j <= num - 1; j++)
				{
					a[i][j] = b[i][j]; //?a??
				}
			}
			num--; //????1
		}
			System.out.print(ans);
			System.out.print("\n");
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			f();
		}
		return 0;
	}
}

