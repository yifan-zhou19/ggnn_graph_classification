package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s1 = "";
		final String s2 = "";
		final String a = "";
		final String b = "";
		s1 = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int t = 0;
		int lena = a.length();
		int lenb = b.length();
		int n = s1.length();
		for (i = 0;i < n - lena + 1;i++)
		{
			if (i > 0 && s1.charAt(i - 1) != ' ')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, t, s1.charAt(i));
				t += 1;
				continue;
			}
			for (j = 0;j < lena;j++)
			{
				if (s1.charAt(i + j) != a.charAt(j))
				{
					break;
				}
			}
			if (i + j == n || j == lena && s1.charAt(i + j) == ' ')
			{
				for (k = 0;k < lenb;k++)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, t + k, b.charAt(k));
				}
				t += lenb;
				i += lena - 1;
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, t, s1.charAt(i));
				t += 1;
			}
		}
		if (i == n - lena + 1)
		{
			for (k = 0;k < lena - 1;k++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, t + k, s1.charAt(i + k));
			}
		}
		System.out.println(s2);
		return 0;
	}
}

