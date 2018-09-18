package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] book = new int[1000];
		char[][] author = new char[1000][10];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			author[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int[] num = new int[26];
		for (i = 0;i < n;i++)
		{
			int length;
			length = String.valueOf(author[i]).length();
			for (j = 0;j < length;j++)
			{
				num[author[i][j] - 'A']++;
			}
		}
		int max = 0;
		char maxi;
		for (i = 0;i < 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				maxi = 'A' + i;
			}
		}
		System.out.print(maxi);
		System.out.print("\n");
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			int length;
			length = String.valueOf(author[i]).length();
			for (j = 0;j < length;j++)
			{
				if (author[i][j] == maxi)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			int length;
			length = String.valueOf(author[i]).length();
			for (j = 0;j < length;j++)
			{
				if (author[i][j] == maxi)
				{
					System.out.print(book[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

