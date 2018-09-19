package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] sum = new int[27];
		int max = 0;
		int author;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[1000][4];
		char[][] name = new char[1000][27];
		for (int i = 0;i < m;i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			name[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < String.valueOf(name[i]).length();j++)
			{
				sum[name[i][j] - 'A']++;
			}
		}
		for (int i = 0;i < 26;i++)
		{
			if (max < sum[i])
			{
				max = sum[i];
				author = i;
			}
		}
		System.out.print((char)('A' + author));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < String.valueOf(name[i]).length();j++)
			{
				if (name[i][j] - 'A' == author)
				{
					System.out.print(str[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

