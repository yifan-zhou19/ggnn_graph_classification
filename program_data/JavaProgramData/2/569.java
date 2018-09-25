package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] book = new int[1000];
		int m;
		int i;
		int j;
		int k;
		int length;
		int max = 0;
		int[] name = new int[500];
		char[][] writer = new char[1000][26];
		char name1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			writer[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (k = 'A'; k <= 'Z'; k++)
		{
			for (i = 0; i < m; i++)
			{
				length = String.valueOf(writer[i]).length();
				for (j = 0; j < length; j++)
				{
					if (writer[i][j] == k)
					{
						name[k]++;
					}
				}
			}
			if (name[k] > max)
			{
				max = name[k];
				name1 = k;
			}
		}
		System.out.print(name1);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0; i <= m; i++)
		{
			length = String.valueOf(writer[i]).length();
			for (j = 0; j <= length; j++)
			{
				if (writer[i][j] == name1)
				{
					System.out.print(book[i]);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

