package <missing>;

public class GlobalMembers
{
	public static int f(String word, int len)
	{
		int i;
		for (i = 0;i <= len / 2;i++)
		{
			if (!word[i].equals(word[len - 1 - i]))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		String str = new String(new char[500]);
		char[][] word = new char[1000][500];
		int i;
		int j;
		int[] len = new int[1000];
		int lenth;
		int m;
		int log;
		str = new Scanner(System.in).nextLine();
		log = 0;
		lenth = str.length();
		for (i = 2;i <= lenth;i++)
		{
			for (j = 0;j <= lenth - i;j++)
			{
				for (m = 0;m < i;m++)
				{
					word[log][m] = str.charAt(m + j);
					word[log][m + 1] = '\0';
				}
				log++;
				len[log - 1] = String.valueOf(word[log - 1]).length();
			}
		}
		for (i = 0;i < log;i++)
		{
			if (f(word[i], len[i]) != 0)
			{
				System.out.printf("%s\n",word[i]);
			}
		}
		return 0;
	}


}
