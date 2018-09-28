package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] tj = new int[NUM];
		int[] qw = new int[NUM];
		int n;

		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0; i < n; i++)
			{
				tj[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				qw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tj, tj + n);
			sort(qw, qw + n);

			int sum = 0;
			int tjl = 0;
			int tjr = n - 1;
			int qwl = 0;
			int qwr = n - 1;
			while (tjl <= tjr)
			{
				while (tjl <= tjr != 0 && tj[tjl] > qw[qwl])
				{
					sum += 200;
					tjl++;
					qwl++;
				}
				while (tjl <= tjr != 0 && tj[tjr] > qw[qwr])
				{
					sum += 200;
					tjr--;
					qwr--;
				}

				if (tjl <= tjr)
				{
					if (tj[tjl] < qw[qwr])
					{
						sum -= 200;
					}
					tjl++;
					qwr--;
				}
			}

			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

