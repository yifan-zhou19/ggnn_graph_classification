package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word1 = new String(new char[50]);
		String word2 = new String(new char[50]);
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
		int n;
		int m;
		n = word1.length();
		m = word2.length();
		int i;
		int j;
		int loc = 0;
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (word2.charAt(i + j) != word1.charAt(j))
				{
					break;
				}
			}
			if (j == n)
			{
				loc = i + 1;
			}
			if (loc != 0)
			{
				break;
			}
		}
		System.out.printf("%d",loc - 1);
		return 0;
	}

}

