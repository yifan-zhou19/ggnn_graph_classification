package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[2][50];
		int i;
		int j;
		int[] len = new int[2];
		int result = 1;
		int wzy = 0;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word[1] = tempVar2.charAt(0);
		}
		len[0] = String.valueOf(word[0]).length();
		len[1] = String.valueOf(word[1]).length();


		for (i = 0;i <= len[1] - len[0];i++)
		{
			if (word[1][i] == word[0][0])
			{
				for (j = i + 1;j < i + len[0];j++)
				{
					if (word[1][j] != word[0][j - i])
					{
						result = 0;
						break;
					}
				}
				if (result != 0)
				{
					System.out.printf("%d",i);
					wzy = 1;
				}
				result = 1;
			}
			if (wzy == 1)
			{
				break;
			}
		}

		return 0;
	}
}

