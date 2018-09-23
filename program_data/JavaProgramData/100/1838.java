package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		char ar;
		String str = new String(new char[301]);
		int i;
		int j;
		int len;
		int nu1 = 1;
		int nu2 = 1;
		int[] counter1 = new int[26];
		int[] counter2 = new int[26];
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
				counter1[ch - 'A']++;
				nu1 = 0;
			}
		}
		for (ch = 'A'; ch <= 'Z'; ch++)
		{
			if (counter1[ch - 'A'] > 0)
			{
				System.out.printf("%c=%d\n", ch, counter1[ch - 'A']);
				nu1 = 0;
			}
		}
		for (j = 0; j < len; j++)
		{
			ar = str.charAt(j);
			if (ar >= 'a' && ar <= 'z')
			{
				counter2[ar - 'a']++;
				nu2 = 0;
			}
		}
		for (ar = 'a'; ar <= 'z'; ar++)
		{
			if (counter2[ar - 'a'] > 0)
			{
				System.out.printf("%c=%d\n", ar, counter2[ar - 'a']);
				nu2 = 0;
			}
		}

		if (nu1 != 0)
		{
			if (nu2 != 0)
			{
				  System.out.print("No");
			}
		}
		return 0;
	}

}

