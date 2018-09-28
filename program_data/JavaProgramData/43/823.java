package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int tmp = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3 ; i <= m / 2 ; i++)
		{
			int count1 = 0;
			int count2 = 0;
			for (int k = 2 ; k < i ; k++)
			{
				if (i % k != 0)
				{
					count1++;
				}
			}
			if (count1 < i - 2)
			{
				continue;
			}
			for (int j = 2 ; j < m - i ; j++)
			{
				if ((m - i) % j != 0)
				{
					count2++;
				}
			}
			if (count2 == m - i - 2)
			{
				tmp++;
				if (tmp == 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(m - i);
				}
				else
				{
					System.out.print('\n');
					System.out.print(i);
					System.out.print(" ");
					System.out.print(m - i);
				}
			}
		}
		return 0;
	}

}

