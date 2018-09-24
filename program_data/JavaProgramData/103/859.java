package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = " ";
		int n;
		int i = 0;
		int j;
		int p = 1;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		while (i < n)
		{
			if (s.charAt(i + 1) == s.charAt(i) || s.charAt(i + 1) == s.charAt(i) - 32 || s.charAt(i + 1) == s.charAt(i) + 32)
			{
				p++;
				i++;
			}
			else
			{
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
				}


				System.out.printf("(%c,%d)",s.charAt(i),p);
				i++;
				p = 1;
			}
		}
		return 0;
	}



}

