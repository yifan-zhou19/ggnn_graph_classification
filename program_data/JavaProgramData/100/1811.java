package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		String str = new String(new char[301]);
		int i;
		int len;
		int no = 1;
		int[] counter = new int[80];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}

		len = str.length();

	   for (i = 0; i < len; i++)
	   {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				counter[ch - 'A']++;
				no = 0;
			}
	   }

		for (ch = 'A'; ch <= 'Z'; ch++)
		{
			if (counter[ch - 'A'] > 0)
			{
				System.out.printf("%c=%d\n", ch,counter[ch - 'A']);
			}
		}
	for (i = 0;i < 79;i++)
	{
		counter[i] = 0;
	}
	for (i = 0; i < len; i++)
	{
			ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z')
			{
				counter[ch - 'a']++;
				no = 0;
			}
	}

		for (ch = 'a'; ch <= 'z'; ch++)
		{
			if (counter[ch - 'a'] > 0)
			{
				System.out.printf("%c=%d\n", ch, counter[ch - 'a']);
			}
		}

		if (no != 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

