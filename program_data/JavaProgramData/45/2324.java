package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1;
		int len2;
		int i;
		int a;
		int count;
		String word1 = new String(new char[51]);
		String word2 = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word2 = tempVar2.charAt(0);
		}
		len1 = word1.length();
		len2 = word2.length();
		for (i = 0;i < len2;i++)
		{
			count = 0;
			if (word1.charAt(0) == word2.charAt(i))
			{
				for (a = 0;a < len1;a++)
				{
					if (word1.charAt(a) == word2.charAt(i + a))
					{
						count++;
					}
				}
			}
			if (count == len1)
			{
				System.out.printf("%d\n",i);
							   return 0;
			}
		}
		return 0;
	}
}

