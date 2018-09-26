package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[22][22];
		int num = 0;
		int[] hang = new int[100];
		int[] lie = new int[100];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
				{
					num++;
					hang[num] = i - 1;
					lie[num] = j - 1;
				}
			}
		}

		for (int i = 1;i < num;i++)
		{
			for (int j = 1;j <= num - i;j++)
			{
				if (hang[j] > hang[j + 1])
				{
					int t1 = hang[j];
					hang[j] = hang[j + 1];
					hang[j + 1] = t1;
					int t2 = lie[j];
					lie[j] = lie[j + 1];
					lie[j + 1] = t2;
				}
			}
		}

		for (int i = 1;i <= num;i++)
		{
			System.out.print(hang[i]);
			System.out.print(" ");
			System.out.print(lie[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

