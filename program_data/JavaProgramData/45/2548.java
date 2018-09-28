package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k1;
		int k2;
		final String word1 = "";
		final String word2 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			word2 = tempVar2.charAt(0);
		}
		k1 = word1.length();
		k2 = word2.length();
		for (i = 0;i <= k2 - k1;i++)
		{
			for (j = i;j <= i + k1 - 1;j++)
			{
				if (word2.charAt(j) != word1.charAt(j - i))
				{
					break;
				}
			}
			if (j == i + k1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}

