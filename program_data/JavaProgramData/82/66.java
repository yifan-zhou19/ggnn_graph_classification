package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int cnt = 0;
		int max = 0;
		int[][] a = new int[101][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (a[i][0] <= 140 && a[i][0] >= 90 && a[i][1] <= 90 && a[i][1] >= 60)
			{
				cnt++;
			}
			else
			{
				cnt = 0;
			}
			if (max < cnt)
			{
				max = cnt;
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

