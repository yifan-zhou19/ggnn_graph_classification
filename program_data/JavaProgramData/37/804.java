package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[10][100000];
		char min;
		int t;
		int i;
		int j;
		int k;
		int sign = 0;
		int[] num = new int[26];
		int[] time = new int[26];
		int temp;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			sign = 0;
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (k = 0;k < 26;k++)
			{
				num[k] = 0;
				time[k] = 0;
			}
			for (j = 0;;j++)
			{
				if (str[i][j] == '\0')
				{
					break;
				}
				for (k = 0;k < 26;k++)
				{
					if (str[i][j] == 97 + k)
					{
						num[k]++;
						time[k] = j;
					}
				}

			}
			for (k = 0;k < 26;k++)
			{
				if (num[k] == 1)
				{
					temp = time[k];
					sign = 1;
					break;
				}

			}
			if (sign == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				for (k = 0;k < 26;k++)
				{
					if (num[k] == 1)
					{
						if (time[k] <= temp)
						{
							temp = time[k];
							min = 97 + k;
						}
					}
				}
				System.out.print(min);
				System.out.print("\n");
			}

		}
		return 0;
	}
}

