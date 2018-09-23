package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int book;
		String writer = new String(new char[26]);
		int[] counter = new int[26];
		int[][] bookbelong = new int[26][999];
		int[] everynum = new int[26];
		int t = 0;
		while (k-- != 0)
		{
			book = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			writer = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int str = writer.length();
			for (int i = 0;i < str;i++)

			{
				int flag = writer.charAt(i) - 'A';
				counter[flag]++;
				bookbelong[flag][everynum[flag]++] = book;
			}
		}
		int max = counter[0];
		int maxnum = 0;
		for (int i = 0;i < 26;i++)
		{
			if (counter[i] > max)
			{
			maxnum = i;
			max = counter[i];
			}
		}
	char writerbest;
	writerbest = 'A' + maxnum;
	System.out.print(writerbest);
	System.out.print("\n");
	System.out.print(everynum[maxnum]);
	System.out.print("\n");
	for (int i = 0;i < everynum[maxnum];i++)
	{
		System.out.print(bookbelong[maxnum][i]);
		System.out.print("\n");
	}






		return 0;
	}


}

