package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] word = new char[50][30];
		int[] len = new int[50];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(word[i]).length();
		}

		for (i = 0;i < n;i++)
		{
			if (word[i][len[i] - 1] == 'r' || word[i][len[i] - 1] == 'y')
			{
				a = 2;
			}
			if (word[i][len[i] - 1] == 'g')
			{
				a = 3;
			}
			for (j = 0;j < len[i] - a - 1;j++)
			{
				System.out.printf("%c",word[i][j]);
			}
			System.out.printf("%c\n",word[i][len[i] - a - 1]);
		}

		return 0;
	}

}

