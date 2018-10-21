package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int count;
		while (true)
		{
			int[] flag = new int[400];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0 && m == 0)
			{
				break;
			}
			count = 0;
			i = 1;
			j = 1;
			while (true)
			{
				if (flag[j] == 0)
				{
					if (i == m)
					{
						flag[j] = -1;
						i = 1;
						count++;
					}
					else
					{
						i++;
					}
				}
				if (count == n)
				{
					System.out.print(j);
					System.out.print("\n");
					break;
				}
				if (j == n)
				{
					j = 1;
				}
				else
				{
					j++;
				}
			}
		}
		return 0;
	}

}

