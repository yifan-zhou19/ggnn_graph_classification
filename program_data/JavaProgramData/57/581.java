package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void cut(char word1[32]);
		char[][] word = new char[50][32];
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[k] = tempVar2.charAt(0);
			}
			cut(word[k]);
			System.out.printf("%s\n",word[k]);
		}
	}
	public static void cut(String word1)
	{
		final String word2 = "0";
		final String word3 = "0";
		final String word4 = "0";
		final String word5 = "0";
		int m;
		m = word1.length();
		word3 = word1.substring(0, m - 2);
		word4 = word3;
		word5 = word3;
		if (strcmp(strcat(word3,"er"),word1) == 0 || strcmp(strcat(word4,"ly"),word1) == 0)
		{
			word2 = word5;
		}
		else
		{
			word2 = word1.substring(0, m - 3);
		}
		word1 = word2;
	}
}

