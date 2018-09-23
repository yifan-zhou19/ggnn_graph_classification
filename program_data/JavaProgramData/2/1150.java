package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n = 0;
		int[] book = new int[1000];
		int[] num = new int[26];
		char[][] name = new char[1000][10];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			name[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (char z = 'A';z <= 'Z';z++)
		{
			for (int i = 1;i <= m;i++)
			{
				for (int j = 0;j < 10;j++)
				{
					if (name[i][j] == z)
					{
						num[z - 'A']++;
					}
				}
			}
		}
		int max = 0;
		int k = 0;
		for (int i = 0;i < 26;i++)
		{
			if (max < num[i])
			{
				max = num[i];
				k = i;
			}
		}
		System.out.print((char)('A' + k));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int i = 1;i <= m;i++)
		{
				for (int j = 0;j < 10;j++)
				{
					if (name[i][j] == 'A' + k)
					{
						System.out.print(book[i]);
						System.out.print("\n");
					}
				}
		}
		return 0;
	}
}

