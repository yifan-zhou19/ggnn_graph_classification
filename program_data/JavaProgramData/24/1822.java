package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[N * 31]);
		int len;
		int[] wordlen = new int[N];
		int max_wordlen;
		int min_wordlen;
		int max = 0;
		int min = 0;
		int[] point = new int[N];
		int t = 1;
		int i;
		sentence = new Scanner(System.in).nextLine();
		len = sentence.length();
		sentence = tangible.StringFunctions.changeCharacter(sentence, len, ' ');
		sentence = tangible.StringFunctions.changeCharacter(sentence, len + 1, '\0');
		len = len + 1;
		point[0] = 0;
		for (i = 0;i < len;i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				point[t] = i;
				point[t + 1] = i + 1;
				wordlen[(t - 1) / 2] = point[t] - point[t - 1];
				t = t + 2;
			}
			else if (sentence.charAt(i) == ',')
			{
				point[t] = i;
				point[t + 1] = i + 2;
				wordlen[(t - 1) / 2] = point[t] - point[t - 1];
				t = t + 2;
				i++;
			}
		}
		max_wordlen = wordlen[0];
		min_wordlen = wordlen[0];
		for (i = 0;i <= (t - 3) / 2;i++)
		{
			if (max_wordlen < wordlen[i])
			{
				max_wordlen = wordlen[i];
				max = i;
			}
			if (min_wordlen > wordlen[i])
			{
				min_wordlen = wordlen[i];
				min = i;
			}
		}
		for (i = point[max * 2];i < point[max * 2 + 1];i++)
		{
			System.out.printf("%c",sentence.charAt(i));
		}
		System.out.print("\n");
		for (i = point[min * 2];i < point[min * 2 + 1];i++)
		{
			System.out.printf("%c",sentence.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

