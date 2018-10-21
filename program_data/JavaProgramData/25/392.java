package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][300];
	public static void cheng(int t)
	{
		int i;
		for (i = 1;i < 200;i++)
		{
			a[t][i] = a[t][i] + a[t - 1][i] * 2;
			if (a[t][i] > 9)
			{
				a[t][i] = a[t][i] - 10;
				a[t][i + 1]++;
			}
			if (a[t][i + 1] > 9)
			{
				a[t][i + 1] = a[t][i + 1] - 10;
				a[t][i + 2]++;
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][1] = 1;
		int i;
		int start;
		for (i = 1;i <= n;i++)
		{
			cheng(i);
		}
		for (i = 200;i > 0;i--)
		{
			if (a[n][i] != 0)
			{
				start = i;
				break;
			}
		}
		for (i = start;i > 0;i--)
		{
			System.out.print(a[n][i]);
		}
		return 0;
	}
}

