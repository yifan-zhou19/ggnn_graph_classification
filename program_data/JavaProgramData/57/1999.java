package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int len;
		String word = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			if (strcmp(word.charAt(len - 2), "er") == 0 || strcmp(word.charAt(len - 2), "ly") == 0)
			{
				len -= 2;
			}
			else if (strcmp(word.charAt(len - 3), "ing") == 0)
			{
				len -= 3;
			}
			for (j = 0; j < len; j++)
			{
				System.out.printf("%c", word.charAt(j));
			}
			System.out.print("\n");
		}

		return 0;
	}
}

