package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[5000]);
		char[][] words = new char[1000][1000];
		int i;
		int k = 0;
		int n = 0;
		int a;
		int b;
		s = new Scanner(System.in).nextLine();
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				words[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (s.Substring(k));
		n++;
		a = String.valueOf(words[0]).length();
		b = String.valueOf(words[0]).length();

		for (i = 0;i < n;i++)
		{
			if (a > String.valueOf(words[i]).length())
			{
				a = String.valueOf(words[i]).length();
			}
			if (b < String.valueOf(words[i]).length())
			{
				b = String.valueOf(words[i]).length();
			}
		}

		for (i = 0;i < n;i++)
		{
			if (b == String.valueOf(words[i]).length())
			{
				System.out.printf("%s\n",words[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a == String.valueOf(words[i]).length())
			{
				System.out.printf("%s",words[i]);
				break;
			}
		}


		return 0;
	}
}

