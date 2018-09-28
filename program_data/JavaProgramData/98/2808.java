package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String word = new String(new char[41]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int curLen;
		curLen = 0;
		int afterLen;
		int wordLen;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			wordLen = word.length();
			if (curLen == 0)
			{
				afterLen = curLen + wordLen;
				if (afterLen <= 80)
				{
					System.out.printf("%s", word);
					curLen = afterLen;
				}
				else
				{
					System.out.printf("\n%s", word);
					curLen = wordLen;
				}
			}
			else
			{
				afterLen = 1 + curLen + wordLen;
				if (afterLen <= 80)
				{
					System.out.printf(" %s", word);
					curLen = afterLen;
				}
				else
				{
					System.out.printf("\n%s", word);
					curLen = wordLen;
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}

