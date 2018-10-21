package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[2][256];
		String chan = new String(new char[256]);
		int i;
		int j;
		int[] len = new int[2];
		int result = 1;
		int wzy = 0;
		int weizhi;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word[1] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			chan = tempVar3.charAt(0);
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
					weizhi = i;
					wzy = 1;
				}
				result = 1;
			}
			if (wzy == 1)
			{
				break;
			}
		}

		if (wzy == 1)
		{
			for (i = weizhi;i < weizhi + len[0];i++)
			{
				word[1][i] = chan.charAt(i - weizhi);
			}
		}

		for (i = 0;i < len[1];i++)
		{
			System.out.printf("%c",word[1][i]);
		}

		return 0;
	}
}

