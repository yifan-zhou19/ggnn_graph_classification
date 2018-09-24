package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[101]);
		char[][] word = new char[2][32];
		words = new Scanner(System.in).nextLine();
		int i;
		int n = 0;
		int k = 0;
		int m = 0;
		String p;
		String q;
		for (i = 0;words.charAt(i) != 0;i++)
		{
			if (words.charAt(i) == ' ')
			{
				words = tangible.StringFunctions.changeCharacter(words, i, '\0');
				word[n] = (words.Substring(k));
				k = i + 1;
				n++;
			}
		}
		word[n] = (words.Substring(k));
		n++;
		q = word[0];
		for (p = word[1]; p != '\0';p++)
		{

			if (p == q)
			{
				System.out.printf("%d",m);
				break;
			}
			m++;
		}

		return 0;
	}

}

