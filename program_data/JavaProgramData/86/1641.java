package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][60];
		int i;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			int sum = 0;
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][1] == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
			for (t = 1;t <= a[i][1];t++)
			{
				a[i][t + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (t = 1;t <= a[i][1];t++)
			{
				if (a[i][t + 1] + (t - 1) * 3 <= 60 && a[i][t + 1] + t * 3 >= 60)
				{
					sum = a[i][t + 1];
				}
				else if (a[i][t + 1] + t * 3 <= 60)
				{
					sum = 60 - t * 3;
				}
			}
			System.out.print(sum);
			System.out.print("\n");

			}
		}

			return 0;
	}
}

