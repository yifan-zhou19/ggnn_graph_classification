package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] book = new int[1002];
		int i;
		int[] cnt = new int[26];
		int l;
		int j;
		int n = 0;
		char[][] name = new char[1002][27];
		char a;
		char max;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			name[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = String.valueOf(name[i]).length();
			for (j = 0; j < l; j++)
			{
				a = name[i][j];
				cnt[a - 'A']++;
			}
		}
		for (i = 0; i < 26; i++)
		{
				if (cnt[i] > n)
				{
					n = cnt[i];
					max = i + 'A';
				}
		}
			System.out.print(max);
			System.out.print("\n");
			System.out.print(n);
			System.out.print("\n");
			for (i = 0; i < m; i++)
			{
				l = String.valueOf(name[i]).length();
				for (j = 0; j < l; j++)
				{
					if (name[i][j] == max)
					{
						System.out.print(book[i]);
						System.out.print("\n");
						break;
					}
				}
			}
		return 0;
	}
}

