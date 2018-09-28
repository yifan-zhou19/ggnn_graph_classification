package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int m;
		int n;

		int g;
		int i;
		int j;
		int temp;
		for (g = 0;g < x;g++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (i = 0;i < n;i++)
			{
				temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += temp;
			}

			for (i = 0;i < m - 2;i++)
			{
				for (j = 0;j < n;j++)
				{
					temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || j == n - 1)
					{
						sum += temp;
					}
				}
			}
			if (m != 1)
			{
				for (i = 0;i < n;i++)
				{
					temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					sum += temp;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;

	}
}

