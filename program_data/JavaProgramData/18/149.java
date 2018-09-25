package <missing>;

public class GlobalMembers
{
	public static void guiling(int[][] a, int n)
	{
		int i;
		int j;
		int min;
		for (i = 0; i < n; i++)
		{
			min = a[i][0];
			for (j = 0; j < n; j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j]; //???????????
				}
			}
			for (j = 0; j < n; j++)
			{
				a[i][j] -= min; //?????????
			}
		}
		for (i = 0; i < n; i++)
		{
			min = a[0][i];
			for (j = 0; j < n; j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i]; //???????????
				}
			}
			for (j = 0; j < n; j++)
			{
				a[j][i] -= min; //?????????
			}
		}
	}
	public static void xiaojian(int[][] a, int n)
	{
		int i;
		int j;
		int k;
		for (i = 0; i < n; i++)
		{
			for (j = 2; j < n; j++)
			{
				a[i][j - 1] = a[i][j]; //??n-2?????????????????
			}
		}
		for (i = 2; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i - 1][j] = a[i][j]; //??n-2?????????????????
			}
		}
	}
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int k;
		int i;
		int j;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			sum = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int t = 0; t < n - 1; t++) //??????n-1?????
			{
				guiling(a, n - t); //????????????????????????????1
				sum += a[1][1]; //????????a[1][1]??????
				xiaojian(a, n - t); //????????????
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

