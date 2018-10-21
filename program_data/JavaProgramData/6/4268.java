package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int x = 1;x <= k;x++)
		{
			int m;
			int n;
			int[][] A = new int[100][100];
			int sum = 0;
			int a;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j <= n;j++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += a;
			}
			for (int i = 2;i <= m - 1;i++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += a;
				for (int j = 2;j <= n - 1;j++)
				{
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += a;
			}
			if (n != 1)
			{
				for (int j = 1;j <= n;j++)
				{
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					sum += a;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

