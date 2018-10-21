package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int[] wordnum = new int[26];
		char inword;
		String word = new String(new char[26]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < t; i++)
		{
			for (k = 0; k < 26; k++)
			{
				wordnum[k] = 0;
			}
			inword = System.in.read();
			j = k = 0;
			while (inword != '\n')
			{
				for (k = 0; k < j; k++)
				{
					if (inword == word.charAt(k))
					{
						break;
					}
				}
				if (k == j)
				{
					word = tangible.StringFunctions.changeCharacter(word, k, inword);
					wordnum[k]++;
					j++;
				}
				else
				{
					wordnum[k]++;
				}
				inword = System.in.read();
			}
			for (k = 0; k < j; k++)
			{
				if (wordnum[k] == 1)
				{
					System.out.print(word.charAt(k));
					System.out.print("\n");
					break;
				}
			}
			if (k == j)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

