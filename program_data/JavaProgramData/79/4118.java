package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] houzi = new int[301];
		int k;
		int i;
		int number;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			number = n;
			k = 0;
			i = 0;
			for (int j = 1; j <= n; j++)
			{
				houzi[j] = 0;
			}
			while (number > 0)
			{
				k++;
				i++;
				while (houzi[i] == 1)
				{
					i++;
				}
				if (i > n)
				{
					i = 0;
					k--;
					continue;
				}
				if ((k == m) && (houzi[i] == 0))
				{
					houzi[i] = 1;
					number--;
					k = 0;
					if (number == 0)
					{
						System.out.print(i);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

