package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int temp;
		int[][] author = new int[27][500];
		String str = new String(new char[1000]);
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= num;i++)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int j = 0;j < str.length();j++)
			{
				author[str.charAt(j) - 'A' + 1][0]++;
				author[str.charAt(j) - 'A' + 1][author[str.charAt(j) - 'A' + 1][0]] = temp;
			}
		}
		int temp_num = 0;
		int temp_author;
		for (int i = 1;i <= 26;i++)
		{
			if (author[i][0] > temp_num)
			{
				temp_num = author[i][0];
				temp_author = i;
			}
		}
		System.out.print((char)(temp_author + 'A' - 1));
		System.out.print("\n");
		System.out.print(temp_num);
		System.out.print("\n");
		for (int i = 1;i <= temp_num;i++)
		{
			System.out.print(author[temp_author][i]);
			System.out.print("\n");
		}

		return 0;
	}
}

