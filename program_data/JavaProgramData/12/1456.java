package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[15];
		int i;
		int j;
		int k;
		int t;
		int N;
		for (i = 1 ; ; i++)
		{
			num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[0] == -1)
			{
				break;
			}
			N = 0;
			for (j = 1; ; j++)
			{
				num[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num[j] == 0)
				{
					break;
				}
			}
			for (k = 0; k <= j - 1; k++)
			{
				for (t = 0; t <= j - 1; t++)
				{
					if (num[k] == 2 * num[t])
					{
						N++;
					}
				}
			}
			System.out.print(N);
			System.out.print("\n");

		}

		return 0;
	}
}

