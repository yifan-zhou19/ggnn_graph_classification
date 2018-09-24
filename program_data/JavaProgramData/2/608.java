package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int b;
		int[][] book = new int[1000][27];
		int[] writer = new int[26];
		int max = 0;
		char w;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= m; i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			book[i][26] = b;
			System.in.read();
			while ((w = System.in.read()) != '\n')
			{
				writer[w - 'A']++;
				book[i][w - 'A'] = 1;
			}
		}
		for (int i = 1; i < 26; i++)
		{
			if (writer[max] < writer[i])
			{
				max = i;
			}
		}
		System.out.print((char)(max + 'A'));
		System.out.print("\n");
		System.out.print(writer[max]);
		System.out.print("\n");
		for (int i = 1; i <= m; i++)
		{
			if (book[i][max] != 0)
			{
				System.out.print(book[i][26]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

