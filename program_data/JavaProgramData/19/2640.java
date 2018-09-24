package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] words = new char[100][100];
		int i;
		int k = 0;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
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
		for (i = 0;i < n - 1;i++)
		{
			if (strcmp(words[i],a) == 0)
			{
			System.out.printf("%s ",b);
			}
			else
			{
			System.out.printf("%s ",words[i]);
			}
		}
		if (strcmp(words[n - 1],a) == 0)
		{
			System.out.printf("%s",b);
		}
			else
			{
			System.out.printf("%s",words[n - 1]);
			}
	}
}

