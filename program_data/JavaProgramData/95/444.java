package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
		String S = new String(new char[80]);
		int i;
		int j;
		int k;
		int b = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
							  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
			}

		}
		S = new Scanner(System.in).nextLine();
		for (j = 0;S.charAt(j) != '\0';j++)
		{
			if (S.charAt(j) >= 65 && S.charAt(j) <= 90)
			{
							  S = tangible.StringFunctions.changeCharacter(S, j, S.charAt(j) + 32);
			}

		}

		for (k = 0;S.charAt(k) != '\0' && s.charAt(k) != '\0';k++)
		{
			if (s.charAt(k) != S.charAt(k))
			{
				b = 1;
			}
			 if (s.charAt(k) > S.charAt(k))
			 {
				System.out.print(">");
				break;
			 }
			  if (s.charAt(k) < S.charAt(k))
			  {
				System.out.print("<");
				break;
			  }

		}
		if (b == 0)
		{
			System.out.print("=");
		}
		  return 0;
	}


}

