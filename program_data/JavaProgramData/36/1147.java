package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String w1 = new String(new char[100]);
		String w2 = new String(new char[100]);
		char letter;
		int[] count1 = new int[52];
		int[] count2 = new int[52];
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}

		for (letter = 'A';letter <= 'Z';letter++)
		{
			for (i = 0,count1[letter - 'A'] = 0;i < w1.length();i++)
			{
				if (letter == w1.charAt(i))
				{
		count1[letter - 'A']++;
				}
			}
		}
		for (letter = 'a';letter <= 'z';letter++)
		{
			for (i = 0,count1[letter - 'a' + 26] = 0;i < w1.length();i++)
			{
				if (letter == w1.charAt(i))
				{
		count1[letter - 'a' + 26]++;
				}
			}
		}

		for (letter = 'A';letter <= 'Z';letter++)
		{
			for (i = 0,count2[letter - 'A'] = 0;i < w2.length();i++)
			{
				if (letter == w2.charAt(i))
				{
		count2[letter - 'A']++;
				}
			}
		}
		for (letter = 'a';letter <= 'z';letter++)
		{
			for (i = 0,count2[letter - 'a' + 26] = 0;i < w2.length();i++)
			{
				if (letter == w2.charAt(i))
				{
		count2[letter - 'a' + 26]++;
				}
			}
		}

		for (i = 0;i <= 51;i++)
		{
			if (count1[i] != count2[i])
			{
		System.out.print("NO");
		break;
			}
		}

		if (i == 52)
		{
			System.out.print("YES");
		}
	}
}

