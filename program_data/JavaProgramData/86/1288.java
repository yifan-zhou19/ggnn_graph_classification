package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] sum = new int[n];
		for (int i = 0;i < n;i++)
		{
			int m = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				sum[i] = 60;
				continue;
			}
			int[] a = new int[m];
			for (int j = 0;j < m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int j = 0;j < m;j++)
			{
				if (a[j] + 3 * j <= 60 && a[j] + 3 * (j + 1) >= 60)
				{
					sum[i] = a[j];
					break;
				}
				else if (a[j] + 3 * j <= 60 && a[j] + 3 * (j + 1) < 60 && j == m - 1)
				{
					sum[i] = 60 - 3 * (j + 1);
					break;
				}
				else if (a[j] + 3 * j > 60)
				{
					sum[i] = 60 - 3 * j;
					break;
				}

			}
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

