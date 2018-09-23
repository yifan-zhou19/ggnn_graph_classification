package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[20010];
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			int j;
			for (j = i + 1; j < n; j++)
			{
				if (num[j] == num[i] && num[j] != 0)
				{
					num[j] = 0;
					m--;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (num[i] != 0)
			{
				m--;
				if (m > 0)
				{
					System.out.print(num[i]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(num[i]);
					System.out.print("\n");
				}

			}
		}
		return 0;
	}


}

